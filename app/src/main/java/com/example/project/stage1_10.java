package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class stage1_10 extends AppCompatActivity {

    ImageView alengka,kosala,wideha,ayodha;
    Dialog dialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage110);

        alengka = findViewById(R.id.alengka);
        kosala = findViewById(R.id.kosala);
        wideha = findViewById(R.id.wideha);
        ayodha = findViewById(R.id.ayodha);
        dialog = new Dialog(this);

        alengka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        kosala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwinDialog();
            }
        });

        wideha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        ayodha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }

    private void openwinDialog() {
        dialog.setContentView(R.layout.activity_stage1benar);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView lanjut = dialog.findViewById(R.id.lanjut);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stage1_10.this, stage1_11.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }



    private void openDialog() {
        dialog.setContentView(R.layout.activity_stage1salah);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView ngulang = dialog.findViewById(R.id.ngulang);

        ngulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stage1_10.this, Stage1.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }


    public void onBackPressed(){
    }


    public void MoveLayout2(View view) {
        Intent intent = new Intent(stage1_10.this, stage1_9.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}