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

public class Stage1 extends AppCompatActivity {

    float x1,x2,y1,y2;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);


        final TypeWriter tw = (TypeWriter) findViewById(R.id.tv);
        tw.setText("");
        tw.setCharacterDelay(50);
        tw.animateText("Hiduplah seorang raja bernama Prabu Dasarata dari Kerajaan Kosala yang pusat pemerintahannya berada di Ayodhya. Prabu Dasarata memiliki 3 permaisuri");

        /*code for typewriting
        final TypeWriter tw = (TypeWriter) findViewById(R.id.tv);
        ImageView btn = (ImageView) findViewById(R.id.iV1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw.setText("");
                tw.setCharacterDelay(50);
                tw.animateText("Hiduplah seorang raja bernama Prabu Dasarata dari Kerajaan Kosala yang pusat pemerintahannya berada di Ayodhya. Prabu Dasarata memiliki 3 permaisuri bernama: Kosalya, Sumitra, dan Kekayi. Prabu Dasarata tidak kunjung dikaruniai anak dari ketiga permaisurinya, hingga sang raja mengadakan upacara suci agar  segera dikaruniai anak. ");
            }
        }); */

        //dialog awal

        dialog = new Dialog(this);

        dialog.setContentView(R.layout.alertdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
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
                Intent i = new Intent(Stage1.this, menu.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
                //swiperight
            }else if(x1 > x2){
                Intent i = new Intent(Stage1.this, Stage1_2.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
            break;
        }
        return false;
    }

    public void onBackPressed(){
    }

    //swipe right
    public void MoveLayout(View view) {
        Intent intent = new Intent(Stage1.this, Stage1_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }

    //swipe left
    public void MoveLayout2(View view) {
        Intent intent = new Intent(Stage1.this, menu.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}