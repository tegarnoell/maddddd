package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stage3_12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage312);
    }
    public void onBackPressed(){
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(stage3_12.this, stage3_13.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(stage3_12.this, stage3_11.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}