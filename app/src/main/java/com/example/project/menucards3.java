package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menucards3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucards3);
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(menucards3.this, sumitracard.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(menucards3.this, ramacard.class);
        startActivity(intent);
    }

    public void MoveLayout3(View view) {
        Intent intent = new Intent(menucards3.this, kosalyacard.class);
        startActivity(intent);
    }

    public void MoveLayout4(View view) {
        Intent intent = new Intent(menucards3.this, shintacard.class);
        startActivity(intent);
    }

    public void MoveLayout5(View view) {
        Intent intent = new Intent(menucards3.this, laksmanacard.class);
        startActivity(intent);
    }

    public void MoveLayout6(View view) {
        Intent intent = new Intent(menucards3.this, janakacard.class);
        startActivity(intent);
    }
}