package com.example.sendmessageviewbinding.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase que guarda un mensaje que manda una persona a otra persona.
 * @author jessi
 * @version 1.0
 */
public class Message implements Serializable, Parcelable {
    public static final String KEY = "Message";

    // Atributos
    private int id;
    private String content;
    private Person sender;
    private Person receiver;

    // Constructor
    public Message(int id, String content, Person sender, Person receiver) {
        this.id = id;   // en la realido no se asigna al contructor, porque nos lo da Firebase o MySQL
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    //region GET y SET de la clase Message

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }
    //endregion

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id && Objects.equals(content, message.content) && Objects.equals(sender, message.sender) && Objects.equals(receiver, message.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, sender, receiver);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(content);
        parcel.writeParcelable(sender, i);
        parcel.writeParcelable(receiver, i);
    }

    protected Message(Parcel in) {
        id = in.readInt();
        content = in.readString();
        sender = in.readParcelable(Person.class.getClassLoader());
        receiver = in.readParcelable(Person.class.getClassLoader());
    }

    public static final Creator<Message> CREATOR = new Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel in) {
            return new Message(in);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };
}
