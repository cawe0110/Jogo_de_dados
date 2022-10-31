package com.example.jogo_de_dados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rolarDado6(View view){
        String [] lado = {
            "1","2","3","4","5","6"
        };
       int resultado = new Random() .nextInt(lado.length);
       TextView numero = (TextView) findViewById(R.id.resultadoDado6);
       numero.setText(lado[resultado]);
    }
    public void rolarDado20(View view){
        String [] lado = {
                "1","2","3","4","5",
                "6","7","8","9","10",
                "11","12","13","14","15",
                "16","17","18","19","20"
        };
        int resultado = new Random() .nextInt(lado.length);
        TextView numero = (TextView) findViewById(R.id.resultadoDado20);
        numero.setText(lado[resultado]);
    }
}