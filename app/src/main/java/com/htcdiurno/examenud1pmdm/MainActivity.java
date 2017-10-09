package com.htcdiurno.examenud1pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double factorial;
    private TextView texto;
    private EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById (R.id.textView);
        texto.setText (String.valueOf (factorial));

        numero=(EditText) findViewById(R.id.editText);
    }

    public void factorial(View view){

        double numero2=Double.parseDouble(numero.getText().toString());

        for (int i = 1; i <= numero2; i++) {
            factorial *= i;
        }

        texto.setText(String.valueOf(factorial));

    }

    protected void onSaveInstanceState(Bundle estado){
        super.onSaveInstanceState(estado);
        estado.putDouble("posicion", factorial);
    }

    protected void onRestoreInstanceState(Bundle estado){
        super.onRestoreInstanceState(estado);
        factorial=estado.getDouble("posicion");
        texto.setText(String.valueOf(factorial));
    }
}