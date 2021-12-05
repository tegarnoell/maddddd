package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        ImageView exitalert4 = findViewById(R.id.exitalert4);
        exitalert4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exit();
            }
            public void Exit(){
                finish();
            }
        });
    }

    public void onBackPressed(){
        //super.onBackPressed();
    }


    public void MoveLayout1(View view) {
        Intent intent = new Intent(menu2.this, Stage1.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(menu2.this, stage2.class);
        startActivity(intent);
    }

    public void MoveLayout3(View view) {
        Intent intent = new Intent(menu2.this, menucards2.class);
        startActivity(intent);
    }
}