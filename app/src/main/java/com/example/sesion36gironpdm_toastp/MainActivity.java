package com.example.sesion36gironpdm_toastp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast1, btnToast2, btnToast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast1 = findViewById(R.id.btnToast1);
        btnToast2 = findViewById(R.id.btnToast2);
        btnToast3 = findViewById(R.id.btnToast3);
    }

    //Método para toast1
    public void toastPersonalizado1(View view){
        //Variables de entrada
        Context context = getApplicationContext();
        CharSequence mensaje = "Mensaje Emergente \n\nToast Personalizado \n\nGirón";
        int duration = Toast.LENGTH_LONG;
        //Integración de variables objeto a objeto Toast
        Toast toastPersonalizado1 = Toast.makeText(context, mensaje, duration);
        toastPersonalizado1.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
        toastPersonalizado1.show();
    }

    //Método para toast personalizado 2
    public void toastPersonalizado2(View view){
        //LayoutInflater -> Compilación o ejecución
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2, null);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        //Llamado, invocación a elementos de vista e integración
        toast.setView(layout);
        toast.show();
    }

    //Método para toast personalizado 3
    public void toastPersonalizado3(View view){
        //LayoutInflater -> Compilación o ejecución
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast3, null);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        //Llamado, invocación a elementos de vista e integración
        toast.setView(layout);
        toast.show();
    }

}