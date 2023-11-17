package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText articulo;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articulo = findViewById(R.id.article);
        boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (boton.getText().equals("AddComent")){
                   articulo.setEnabled(true);
                   boton.setText("Set Text");
               }else if(boton.getText().equals("Set Text")){

                   articulo.setEnabled(false);
                   boton.setText("AddComent");
               }

            }
        });


    }
}