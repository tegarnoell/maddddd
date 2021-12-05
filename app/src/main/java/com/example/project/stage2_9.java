package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class stage2_9 extends AppCompatActivity {

    ImageView benar,salah;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage29);

        benar = findViewById(R.id.benar);
        salah = findViewById(R.id.salah);
        dialog = new Dialog(this);

        benar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwinDialog();
            }
        });

        salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    private void openwinDialog() {
        dialog.setContentView(R.layout.activity_stage2benar);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView lanjut = dialog.findViewById(R.id.lanjut);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(stage2_9.this, stage2unlockedcard.class);
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
                Intent intent = new Intent(stage2_9.this, stage2.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }

    public void onBackPressed(){
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(stage2_9.this, stage2benar.class);
        startActivity(intent);
    }
    public void MoveLayout2(View view) {
        Intent intent = new Intent(stage2_9.this, stage2salah.class);
        startActivity(intent);
    }
}