package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menucards4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucards4);
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(menucards4.this, sumitracard.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(menucards4.this, ramacard.class);
        startActivity(intent);
    }

    public void MoveLayout3(View view) {
        Intent intent = new Intent(menucards4.this, kosalyacard.class);
        startActivity(intent);
    }

    public void MoveLayout4(View view) {
        Intent intent = new Intent(menucards4.this, shintacard.class);
        startActivity(intent);
    }

    public void MoveLayout5(View view) {
        Intent intent = new Intent(menucards4.this, laksmanacard.class);
        startActivity(intent);
    }

    public void MoveLayout6(View view) {
        Intent intent = new Intent(menucards4.this, janakacard.class);
        startActivity(intent);
    }

    public void MoveLayout7(View view) {
        Intent intent = new Intent(menucards4.this, dasaratacard.class);
        startActivity(intent);
    }

    public void MoveLayout8(View view) {
        Intent intent = new Intent(menucards4.this, bharatacard.class);
        startActivity(intent);
    }

    public void MoveLayout9(View view) {
        Intent intent = new Intent(menucards4.this, kekayicard.class);
        startActivity(intent);
    }
}