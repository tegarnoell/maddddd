package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class stage3_10 extends AppCompatActivity {

    ImageView kekayi,sumitra,kosalya,janaka;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage310);

        kekayi = findViewById(R.id.kekayi);
        sumitra = findViewById(R.id.sumitra);
        kosalya = findViewById(R.id.kosalya);
        janaka = findViewById(R.id.janaka);
        dialog = new Dialog(this);

        kekayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog();
            }
        });

        sumitra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwinDialog();
            }
        });

        kosalya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog();
            }
        });

        janaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog();
            }
        });
    }

    private void openwinDialog() {
        dialog.setContentView(R.layout.activity_stage3benar);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView lanjut = dialog.findViewById(R.id.lanjut);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stage3_10.this, stage3unlockedcard.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }


    private void openDialog() {
        dialog.setContentView(R.layout.activity_stage3salah);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView ngulang = dialog.findViewById(R.id.ngulang);

        ngulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stage3_10.this, stage3.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }

    public void onBackPressed(){
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(stage3_10.this, stage3_11.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(stage3_10.this, stage3_9.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}