package com.example.sendmessageviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sendmessageviewbinding.databinding.ActivitySendMessageBinding;
import com.example.sendmessageviewbinding.model.data.Message;
import com.example.sendmessageviewbinding.model.data.Person;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SendMessageActivity extends AppCompatActivity {
    // Es MUY IMPORTANTE poner bien el nombre de esta clase
    // Como estamos en la clase SendMessageActivity nuestro binding es de tipo ActivitySendMessageBinding,
    // para que así pueda detectar bien los widgets
    private ActivitySendMessageBinding binding;
    public static final String TAG = "MessageActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inflate coge el xml y lo pasa a memoria
        binding = ActivitySendMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());  //getRoot es nuestro layout padre
        //OPCIÓN 3: Expresión Lambda para implemtar el evento onClick()
        //binding.fab.setOnClickListener(view -> {
        //    sendMessage();
        //});
        // TODO ¿¿esto da error en el logcat??
        binding.fab.setOnClickListener(view -> sendMessage());

        Log.d(TAG, "SendMessageActivity -> onCreate()");
    }

    // Estre codigo es de https://developer.android.com/guide/topics/ui/menus?hl=es-419#java
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            // Esto en un principio daba error porque las properties de gradle han cambiado,
            // esto: android.nonTransitiveRClass=true debe de ponerse a false y añadir esto: android.nonFinalResIds=false
            case R.id.menu_aboutas: {
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //region MÉTODOS DE CICLO DE VIDA DE UNA ACTIVIY
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SendMessageActivity -> onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SendMessageActivity -> onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SendMessageActivity -> onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SendMessageActivity -> onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null; // Lo que creo en onCreate() lo destrullo en onDestroy()
        Log.d(TAG, "SendMessageActivity -> onDestroy()");

    }
    //endregion

    /**
     * Método que construye el mensaje y lo envia a otra activity
     */
    public void sendMessage() {
        Intent intent = new Intent(this, ViewActivity.class);
        Bundle bundle = new Bundle();
        Person persone = new Person("Jessica", "Castro Ruiz", "1A");
        Person persond = new Person("Adrián", "Almohalla Moreno", "1B");
        Message message = new Message(binding.edMessage.getText().toString(), persone, persond);
        bundle.putParcelable(Message.KEY, message);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * Clase interna o Clase anónima o Clase anidada que implementa una interfaz, esta clase no tiene nombre
     * OPCIÓN 1: Se crea una clase que implementa la interfaz View.OnClickListener
     */
    class SendMessageOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(SendMessageActivity.this, "Se ha pulsado sobre el botón enviar", Toast.LENGTH_LONG).show();
        }
    }
}