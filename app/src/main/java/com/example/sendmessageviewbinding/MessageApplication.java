package com.example.sendmessageviewbinding;

import android.app.Application;
import android.util.Log;

public class MessageApplication extends Application {
    public static final String TAG = "MessageApplication";
    @Override
    public void onCreate() {
        // Se crea la aplicación
        super.onCreate();
        Log.d(TAG, "MessageApplication -> onCreate()"); // Constante TAG
    }

    @Override
    public void onTerminate() {
        // Se cierra o elimina? la aplicación
        super.onTerminate();
        Log.d(TAG, "MessageApplication -> onTerminate()");
    }
}
