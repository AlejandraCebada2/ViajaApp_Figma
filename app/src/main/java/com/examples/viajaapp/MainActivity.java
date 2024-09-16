package com.examples.viajaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar elementos de la interfaz
        EditText searchEditText = findViewById(R.id.searchEditText);
        Button mostViewedButton = findViewById(R.id.mostViewedButton);
        Button nearButton = findViewById(R.id.nearButton);
        Button farButton = findViewById(R.id.farButton);
        ImageView popularDestinationImage = findViewById(R.id.popularDestinationImage);

        // Configurar los botones de navegación
        ImageButton homeButton = findViewById(R.id.homeButton);
        ImageButton calendarButton = findViewById(R.id.calendarButton);
        ImageButton favoritesButton = findViewById(R.id.favoritesButton);

        // Listener para botón "Mas vistos"
        mostViewedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Mostrando los destinos más vistos", Toast.LENGTH_SHORT).show();
                // Acción cuando se presiona "Mas vistos"
            }
        });

        // Listener para botón "Cercano"
        nearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Mostrando los destinos cercanos", Toast.LENGTH_SHORT).show();
                // Acción cuando se presiona "Cercano"
            }
        });

        // Listener para botón "Lejano"
        farButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Mostrando los destinos lejanos", Toast.LENGTH_SHORT).show();
                // Acción cuando se presiona "Lejano"
            }
        });

        // Listener para botón de inicio
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Inicio", Toast.LENGTH_SHORT).show();
                // Acción al hacer clic en el botón de inicio
            }
        });

        // Listener para botón de calendario
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calendario", Toast.LENGTH_SHORT).show();
                // Acción al hacer clic en el botón de calendario
            }
        });

        // Listener para botón de favoritos
        favoritesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Favoritos", Toast.LENGTH_SHORT).show();
                // Acción al hacer clic en el botón de favoritos
            }
        });
    }
}
