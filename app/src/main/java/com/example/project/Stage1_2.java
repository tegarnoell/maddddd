package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class Stage1_2 extends AppCompatActivity {

    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage12);

        final TypeWriter tw = (TypeWriter) findViewById(R.id.tv2);
        tw.setText("");
        tw.setCharacterDelay(100);
        tw.animateText("Prabu Dasarata memiliki 3 permaisuri bernama: Kosalya, Sumitra, dan Kekayi.");

        //code for typewriting
                /*
        final TypeWriter tw = (TypeWriter) findViewById(R.id.tv2);
        ImageView btn = (ImageView) findViewById(R.id.iV2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw.setText("");
                tw.setCharacterDelay(50);
                tw.animateText("Tak lama kemudian ketiga permaisuri tersebut hamil. Lalu Kosalya melahirkan anak lelaki pertama Raja Dasarata yang diberi nama Rama. Kemudian disusul oleh Sumitra yang melahirkan Laksmana dan Satrugna, dan Kekayi yang melahirkan Bharata.");
            }
        }); */
    }

    //code for swipe
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                //swipeleft
                if(x1 < x2){
                    Intent i = new Intent(Stage1_2.this, Stage1.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);

                    //swiperight
                }else if(x1 > x2){
                    Intent i = new Intent(Stage1_2.this, Stage1_3.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                }
                break;
        }
        return false;
    }

    public void onBackPressed(){
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(Stage1_2.this, Stage1_3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(Stage1_2.this, Stage1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }

}