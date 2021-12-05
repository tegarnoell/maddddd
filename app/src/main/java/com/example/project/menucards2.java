package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menucards2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucards2);
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(menucards2.this, sumitracard.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(menucards2.this, ramacard.class);
        startActivity(intent);
    }

    public void MoveLayout3(View view) {
        Intent intent = new Intent(menucards2.this, kosalyacard.class);
        startActivity(intent);
    }

}