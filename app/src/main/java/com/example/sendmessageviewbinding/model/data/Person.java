package com.example.sendmessageviewbinding.model.data;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase Person que engloba la información de una persona em nuestra app
 * @author jessi
 * @version 1.0
 */
public class Person implements Parcelable, Serializable {
    public static final String KEY = "Person";  // un objeto rsponsable de su key, Principio de Responsabilidad
    // Campos o atributos
    private String name;
    private String surname;
    private String dni;

    // Constructor
    public Person(String name, String surname, String dni) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }
    //region Métodos GET y SET de la clase Person
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    //endregion

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
    //region hay que implementar el método equals y hasCode, para distingir dos objetos que son iguales(por ejemplo dos personas con el mismo nombre)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // getClass() != o.getClass()) -> con esta estructura evitamos poner if else
        Person person = (Person) o; // DownCasting (persona hereda de object. Un DownCating solo es posible si anteriormente hemos comprobado (la clase?) el if anterior
        return Objects.equals(dni, person.dni);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
    //endregion

    //region Al implementar Parselable, esto lo hemos implmentado para que la clase person sepa como como leer y como escribir
    protected Person(Parcel in) {
        name = in.readString();
        surname = in.readString();
        dni = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(surname);
        parcel.writeString(dni);
    }
    //endregion
}
