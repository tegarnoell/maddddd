package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText inputtext;
    ImageView btn_send;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME ="mypref";
    private static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputtext = findViewById(R.id.inputtext);
        btn_send = findViewById(R.id.btn_send);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);


        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_NAME,inputtext.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainActivity.this,menu.class);
                startActivity(intent);
            }
        });

        /*
        final EditText inputtext = findViewById(R.id.inputtext);
        ImageView btn_send = findViewById(R.id.btn_send);

                btn_send.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String Data = inputtext.getText().toString();
                        Intent intent = new Intent(MainActivity.this,menu.class);
                        intent.putExtra("abc",Data);
                        startActivity(intent);
                        finish();
                    }
                }); */


    }

    public void onBackPressed(){}

    public void MoveLayout(View view) {
        Intent intent = new Intent(MainActivity.this, menu.class);
        startActivity(intent);
    }
}