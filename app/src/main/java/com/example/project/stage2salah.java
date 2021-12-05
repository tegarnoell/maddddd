package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stage2salah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage2salah);
    }

    public void onBackPressed(){
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(stage2salah.this, stage2.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(stage2salah.this, menu2.class);
        startActivity(intent);
    }
}