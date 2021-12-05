package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class stage1_11 extends AppCompatActivity {

    ImageView dasarata,rama,rahwana,laksmana;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage111);

        dasarata = findViewById(R.id.dasarata);
        rama = findViewById(R.id.rama);
        rahwana = findViewById(R.id.rahwana);
        laksmana = findViewById(R.id.laksmana);
        dialog = new Dialog(this);

        dasarata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        rama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwinDialog();
            }
        });

        rahwana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        laksmana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    private void openwinDialog() {
        dialog.setContentView(R.layout.activity_stage1benarselanjutnya);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView lanjut = dialog.findViewById(R.id.lanjut);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stage1_11.this, stage1unlockedcard.class);
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
                Intent intent = new Intent(stage1_11.this, Stage1.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }


    public void onBackPressed(){
    }
}