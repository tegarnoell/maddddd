package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stage3benar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3benar);
    }
    public void onBackPressed(){
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(stage3benar.this, stage3unlockedcard.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(stage3benar.this, menu3.class);
        startActivity(intent);
    }
}