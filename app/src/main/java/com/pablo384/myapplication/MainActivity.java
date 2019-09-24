package com.pablo384.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //APP 01 SUMAR Y RESTAR CON TECLAS DE VOLUMEN
    TextView miTextv;
    int contador = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //APP 01
        miTextv = (TextView) findViewById(R.id.mitexto);
        miTextv.setText(Integer.toString(contador));

        final EditText entradaRef = (EditText) findViewById(R.id.entrada);

//         APP 00
//        Button miboton = (Button) findViewById(R.id.mibutton);
//        miboton.setText("BTN");
//        miboton.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        EditText entradaRef = (EditText) findViewById(R.id.entrada);
//                        String texto = entradaRef.getText().toString();
//                        miTextv.setText(texto);
//
//                    }
//                }
//        );

        //APP 02 color btn
        Button mibotonAzul = (Button) findViewById(R.id.btn_blue);
        Button mibotonRojo = (Button) findViewById(R.id.btn_red);
        Button mibotonAmarillo = (Button) findViewById(R.id.btn_yellow);
        mibotonAzul.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        entradaRef.setTextColor(Color.BLUE);


                    }
                }
        );
        mibotonRojo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        entradaRef.setTextColor(Color.RED);


                    }
                }
        );
        mibotonAmarillo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        entradaRef.setTextColor(Color.YELLOW);

                    }
                }
        );


    }

    //APP 01 SUMAR Y RESTAR CON TECLAS DE VOLUMEN
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if (keyCode == 24) {
            this.contador += 1;
            this.miTextv.setText(Integer.toString(this.contador));

            return false;
        } else if (keyCode == 25) {
            this.contador -= 1;
            this.miTextv.setText(Integer.toString(this.contador));
            return false;
        } else {
            return super.onKeyUp(keyCode, event);
        }

    }
}
