package com.example.sendmessageviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.sendmessageviewbinding.databinding.ActivityViewBinding;
import com.example.sendmessageviewbinding.data.model.Message;

public class ViewActivity extends AppCompatActivity {
    private ActivityViewBinding binding;
    private Message message;
    public static final String TAG = "ViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. Recoger directamente el Intent y el Bundle
        Bundle bundle = getIntent().getExtras();

        // VERSION 2 con parselable
        message = bundle.getParcelable(Message.KEY);

        initialiceView();
    }

    //region MÉTODOS DE CICLO DE VIDA DE UNA ACTIVIY
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ViewActivity -> onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ViewActivity -> onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ViewActivity -> onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ViewActivity -> onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null; // Lo que creo en onCreate() lo destrullo en onDestroy()
        Log.d(TAG, "ViewActivity -> onDestroy()");

    }
    //endregion

    /**
     * Método que inicializa todas las vistas o widgets de la interfaz o del layout
     */
    private void initialiceView(){
        String userInfo = "La persona "+ message.getSender().getName() + " " + message.getSender().getSurname() + " " +
                "con DNI " + message.getSender().getDni() + " te ha mandado el seguiente mensaje.";

        binding.tvUserInfo.setText(userInfo);
        binding.tvMessage.setText(message.getContent());
    }
}