package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Stage1_4 extends AppCompatActivity {

    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage14);
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
                    Intent i = new Intent(Stage1_4.this, Stage1_3.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);

                    //swiperight
                }else if(x1 > x2){
                    Intent i = new Intent(Stage1_4.this, stage1_5.class);
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
        Intent intent = new Intent(Stage1_4.this, stage1_5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(Stage1_4.this, Stage1_3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }

}