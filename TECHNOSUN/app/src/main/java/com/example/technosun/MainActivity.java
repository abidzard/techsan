package com.example.technosun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BTmulai;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTmulai = findViewById(R.id.BTmulai); // Inisialisai ID pada Button
        BTmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Digunakan untuk berpindah activity dari activity_main ke second_page
                Intent it=new Intent (MainActivity.this, MenuActivity.class);
                startActivity(it);
                finish();
            }
        });
    }
}