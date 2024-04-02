package com.example.at2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button saibamaiszoologico,saibamaisiguatemi,saibamaisparque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saibamaiszoologico = (Button)findViewById(R.id.saibamaiszoologico);
        saibamaisiguatemi = (Button)findViewById(R.id.saibamaisiguatemi);
        saibamaisparque = (Button)findViewById(R.id.saibamaisparque);

        saibamaiszoologico.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,zoologicoActivity.class);
            startActivity(intent);
        });
            saibamaisparque.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this,parqueActivity.class);
                startActivity(intent);
            });

                saibamaisiguatemi.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, iguatemiActivity.class);
                    startActivity(intent);
                });


    }
    }
