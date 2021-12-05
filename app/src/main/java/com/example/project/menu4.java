package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
    }

    public void onBackPressed(){
        //super.onBackPressed();
    }


    public void MoveLayout1(View view) {
        Intent intent = new Intent(menu4.this, Stage1.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(menu4.this, stage2.class);
        startActivity(intent);
    }

    public void MoveLayout3(View view) {
        Intent intent = new Intent(menu4.this, stage3.class);
        startActivity(intent);
    }

    public void MoveLayout4(View view) {
        Intent intent = new Intent(menu4.this, menucards4.class);
        startActivity(intent);
    }
}