package com.example.kolyakb.tic_tac_toe;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.kolyakb.tic_tac_toe.R.drawable.cat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   static Button b1_1, b1_2, b1_3, b2_1, b2_2, b2_3, b3_1, b3_2, b3_3;

   static Boolean zero, cross;

   static Boolean boolean1_1, boolean1_2, boolean1_3, boolean2_1, boolean2_2, boolean2_3, boolean3_1, boolean3_2, boolean3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1_1 = findViewById(R.id.b1_1);
        b1_2 = findViewById(R.id.b1_2);
        b1_3 = findViewById(R.id.b1_3);
        b2_1 = findViewById(R.id.b2_1);
        b2_2 = findViewById(R.id.b2_2);
        b2_3 = findViewById(R.id.b2_3);
        b3_1 = findViewById(R.id.b3_1);
        b3_2 = findViewById(R.id.b3_2);
        b3_3 = findViewById(R.id.b3_3);


        b1_1.setOnClickListener(this);
        b1_2.setOnClickListener(this);
        b1_3.setOnClickListener(this);
        b2_1.setOnClickListener(this);
        b2_2.setOnClickListener(this);
        b2_3.setOnClickListener(this);
        b3_1.setOnClickListener(this);
        b3_2.setOnClickListener(this);
        b3_3.setOnClickListener(this);

        zero = true;
        cross = false;

        boolean1_1 = false;
        boolean1_2 = false;
        boolean1_3 = false;
        boolean2_1 = false;
        boolean2_2 = false;
        boolean2_3 = false;
        boolean3_1 = false;
        boolean3_2 = false;
        boolean3_3 = false;

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.b1_1:

                if (!boolean1_1){
                    Tap(view);
                    Select();
                }
                boolean1_1 = true;

                Winner();
                WinnerDog();

                break;

            case R.id.b1_2:

                if (!boolean1_2){
                    Tap(view);
                    Select();
                }
                boolean1_2 = true;
                Winner();
                WinnerDog();

                break;

            case R.id.b1_3:

                if (!boolean1_3){
                    Tap(view);

                    Select();

                }

                boolean1_3 = true;
                Winner();
                WinnerDog();

                break;

            case R.id.b2_1:

                if (!boolean2_1){
                    Tap(view);

                    Select();

                }

                boolean2_1 = true;

                Winner();
                WinnerDog();

                break;

            case R.id.b2_2:

                if (!boolean2_2){
                    Tap(view);

                    Select();

                }

                boolean2_2 = true;

                Winner();
                WinnerDog();


                break;

            case R.id.b2_3:

                if (!boolean2_3){
                    Tap(view);

                    Select();

                }

                boolean2_3 = true;

                Winner();
                WinnerDog();

                break;

            case R.id.b3_1:

                if (!boolean3_1){

                    Tap(view);

                    Select();

                }

                boolean3_1 = true;

                Winner();
                WinnerDog();


                break;

            case R.id.b3_2:

                if (!boolean3_2){
                    Tap(view);

                    Select();

                }

                boolean3_2 = true;

                Winner();
                WinnerDog();

                break;

            case R.id.b3_3:

                if (!boolean3_3){

                    Tap(view);

                    Select();

                }

                boolean3_3 = true;

               Winner();
                WinnerDog();

                break;
        }

    }

    public static void Select(){

        if (zero){
            zero = false;
            cross = true;
        } else  {
            zero = true;
            cross = false;
        }
    }

    public static void Tap(View view){

        if (zero){

            view.setBackgroundResource(cat);
        } else view.setBackgroundResource(R.drawable.dog);

    }

    public static void Winner(){

        if (boolean1_1 && boolean1_2 && boolean1_3 && boolean2_1 && boolean2_2 && boolean2_3 && boolean3_1 && boolean3_2 && boolean3_3){

            b1_1.setBackgroundColor(Color.rgb(255, 238, 230));
            b1_2.setBackgroundColor(Color.rgb(255, 238, 230));
            b1_3.setBackgroundColor(Color.rgb(255, 238, 230));
            b2_1.setBackgroundColor(Color.rgb(255, 238, 230));
            b2_2.setBackgroundColor(Color.rgb(255, 238, 230));
            b2_3.setBackgroundColor(Color.rgb(255, 238, 230));
            b3_1.setBackgroundColor(Color.rgb(255, 238, 230));
            b3_2.setBackgroundColor(Color.rgb(255, 238, 230));
            b3_3.setBackgroundColor(Color.rgb(255, 238, 230));

            boolean1_1 = false;
            boolean1_2 = false;
            boolean1_3 = false;
            boolean2_1 = false;
            boolean2_2 = false;
            boolean2_3 = false;
            boolean3_1 = false;
            boolean3_2 = false;
            boolean3_3 = false;
        }

    }

    public static void WinnerDog(){




        if((b1_1.getBackground().equals(R.drawable.dog) && b1_2.getBackground().equals(R.drawable.dog) && b1_3.getBackground().equals(R.drawable.dog)) ||
                (b3_1.getBackground().equals(R.drawable.dog) && b3_2.getBackground().equals(R.drawable.dog) && b3_3.getBackground().equals(R.drawable.dog))){

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {


                    b1_1.setBackgroundResource(R.drawable.dog);
                    b1_2.setBackgroundResource(R.drawable.dog);
                    b1_3.setBackgroundResource(R.drawable.dog);
                    b2_1.setBackgroundResource(R.drawable.dog);
                    b2_2.setBackgroundResource(R.drawable.dog);
                    b2_3.setBackgroundResource(R.drawable.dog);
                    b3_1.setBackgroundResource(R.drawable.dog);
                    b3_2.setBackgroundResource(R.drawable.dog);
                    b3_3.setBackgroundResource(R.drawable.dog);

                }
            }, 2000);

        }

    }
}
