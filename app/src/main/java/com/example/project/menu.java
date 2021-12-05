package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    TextView textView;
    ImageView firstchap;
    Dialog dialog;

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME ="mypref";
    private static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textView = findViewById(R.id.textView);

        /*
        firstchap = findViewById(R.id.firstchap);
        dialog = new Dialog(this);

        firstchap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

         */

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name = sharedPreferences.getString(KEY_NAME,null);

        if(name != null){
            textView.setText(name);
        }


        ImageView exitalert = findViewById(R.id.exitalert);
        exitalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exit();
            }
            public void Exit(){
                finish();
            }
        });


    }

    private void openDialog() {
        dialog.setContentView(R.layout.alertdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView next = dialog.findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, Stage1.class);
                startActivity(intent);
            }
        });

        dialog.show();

    }

    public void onBackPressed(){
        //super.onBackPressed();
    }


    public void MoveLayout1(View view) {
        Intent intent = new Intent(menu.this, Stage1.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(menu.this, Menucards1.class);
        startActivity(intent);
    }




}