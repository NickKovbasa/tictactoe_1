package com.example.kolyakb.tic_tac_toe;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import static com.example.kolyakb.tic_tac_toe.R.drawable.cat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   static Button b1_1, b1_2, b1_3, b2_1, b2_2, b2_3, b3_1, b3_2, b3_3;

   static Boolean zero, cross;

   static Boolean boolean1_1, boolean1_2, boolean1_3, boolean2_1, boolean2_2, boolean2_3, boolean3_1, boolean3_2, boolean3_3;

   static Boolean bc1_1, bc1_2, bc1_3, bc2_1, bc2_2, bc2_3, bc3_1, bc3_2, bc3_3;

  static Toast toast;
    static Toast toastCat;
    static Toast toastDog;

    static ImageView imageView;
    static ImageView imageViewCat;
    static ImageView imageViewDog;

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

        bc1_1 = false;
        bc1_2 = false;
        bc1_3 = false;
        bc2_1 = false;
        bc2_2 = false;
        bc2_3 = false;
        bc3_1 = false;
        bc3_2 = false;
        bc3_3 = false;



        imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.cat_and_dog_big);
        imageView.setBackgroundColor(Color.rgb(255,255,255));

        imageViewCat = new ImageView(this);
        imageViewCat.setImageResource(R.drawable.cat);
        imageViewCat.setBackgroundColor(Color.rgb(255,255,255));

        imageViewDog = new ImageView(this);
        imageViewDog.setImageResource(R.drawable.dog);
        imageViewDog.setBackgroundColor(Color.rgb(255,255,255));


        toast = new Toast(getApplicationContext());
        toast.setView(imageView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);

        toastCat = new Toast(getApplicationContext());
        toastCat.setView(imageViewCat);
        toastCat.setDuration(Toast.LENGTH_SHORT);
        toastCat.setGravity(Gravity.CENTER, 0, 0);

        toastDog = new Toast(getApplicationContext());
        toastDog.setView(imageViewDog);
        toastDog.setDuration(Toast.LENGTH_SHORT);
        toastDog.setGravity(Gravity.CENTER, 0, 0);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.b1_1:

                if (!boolean1_1) {
                    Tap(view);
                    Select();

                    if (zero){
                        bc1_1 = true;
                    }

                    boolean1_1 = true;

                    WinnerDog();
                }


                break;

            case R.id.b1_2:

                if (!boolean1_2) {
                    Tap(view);
                    Select();

                    if (zero){
                        bc1_2 = true;
                    }
                    boolean1_2 = true;

                    WinnerDog();
                }

                break;

            case R.id.b1_3:

                if (!boolean1_3) {
                    Tap(view);

                    Select();

                    if (zero){
                        bc1_3 = true;
                    }

                    boolean1_3 = true;

                    WinnerDog();
                }

                break;

            case R.id.b2_1:

                if (!boolean2_1) {
                    Tap(view);

                    Select();

                    if (zero){
                        bc2_1 = true;
                    }

                    boolean2_1 = true;

                    WinnerDog();
                }

                break;

            case R.id.b2_2:

                if (!boolean2_2) {
                    Tap(view);

                    Select();

                    if (zero){
                        bc2_2 = true;
                    }

                    boolean2_2 = true;

                    WinnerDog();
                }


                break;

            case R.id.b2_3:

                if (!boolean2_3) {
                    Tap(view);

                    Select();

                    if (zero){
                        bc2_3 = true;
                    }

                    boolean2_3 = true;

                    WinnerDog();
                }

                break;

            case R.id.b3_1:

                if (!boolean3_1) {

                    Tap(view);

                    Select();

                    if (zero){
                        bc3_1 = true;
                    }

                    boolean3_1 = true;

                    WinnerDog();
                }


                break;

            case R.id.b3_2:

                if (!boolean3_2) {
                    Tap(view);

                    Select();

                    if (zero){
                        bc3_2 = true;
                    }


                boolean3_2 = true;

                WinnerDog();
        }

                break;

            case R.id.b3_3:

                if (!boolean3_3) {

                    Tap(view);

                    Select();

                    if (zero){
                        bc3_3 = true;
                    }

                    boolean3_3 = true;

                    WinnerDog();
                }

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

    public static void Standoff(){

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

            bc1_1 = false;
            bc1_2 = false;
            bc1_3 = false;
            bc2_1 = false;
            bc2_2 = false;
            bc2_3 = false;
            bc3_1 = false;
            bc3_2 = false;
            bc3_3 = false;

            toast.show();

        }

    }

    public static void WinnerDog(){

        if((boolean1_1 && boolean1_2 && boolean1_3 && bc1_1 && bc1_2 && bc1_3) || (boolean2_1 && boolean2_2 && boolean2_3 && bc2_1 && bc2_2 && bc2_3) || (boolean3_1 && boolean3_2 && boolean3_3 && bc3_1 && bc3_2 && bc3_3) ||
                (boolean1_1 && boolean2_2 && boolean3_3 && bc1_1 && bc2_2 && bc3_3) || (boolean1_2 && boolean2_2 && boolean3_2 && bc1_2 && bc2_2 && bc3_2) || (boolean1_3 && boolean2_2 && boolean3_1 && bc1_3 && bc2_2 && bc3_1) ||
                (boolean1_1 && boolean2_1 && boolean3_1 && bc1_1 && bc2_1 && bc3_1) || (boolean1_3 && boolean2_3 && boolean3_3 && bc1_3 && bc2_3 && bc3_3)){

                  toastDog.show();

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

            bc1_1 = false;
            bc1_2 = false;
            bc1_3 = false;
            bc2_1 = false;
            bc2_2 = false;
            bc2_3 = false;
            bc3_1 = false;
            bc3_2 = false;
            bc3_3 = false;


        } else if((boolean1_1 && boolean1_2 && boolean1_3 && !bc1_1 && !bc1_2 && !bc1_3) || (boolean2_1 && boolean2_2 && boolean2_3 && !bc2_1 && !bc2_2 && !bc2_3) || (boolean3_1 && boolean3_2 && boolean3_3 && !bc3_1 && !bc3_2 && !bc3_3) ||
                (boolean1_1 && boolean2_2 && boolean3_3 && !bc1_1 && !bc2_2 && !bc3_3) || (boolean1_2 && boolean2_2 && boolean3_2 && !bc1_2 && !bc2_2 && !bc3_2) || (boolean1_3 && boolean2_2 && boolean3_1 && !bc1_3 && !bc2_2 && !bc3_1) ||
                (boolean1_1 && boolean2_1 && boolean3_1 && !bc1_1 && !bc2_1 && !bc3_1) || (boolean1_3 && boolean2_3 && boolean3_3 && !bc1_3 && !bc2_3 && !bc3_3)){

                toastCat.show();

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

            bc1_1 = false;
            bc1_2 = false;
            bc1_3 = false;
            bc2_1 = false;
            bc2_2 = false;
            bc2_3 = false;
            bc3_1 = false;
            bc3_2 = false;
            bc3_3 = false;

        }

        Standoff();
    }
}
