package com.zizi.mouad.resturantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    protected ImageButton  btn1;
    protected ImageButton  btn2;
    protected ImageButton  btn3;
    protected ImageButton  btn4;
    protected ImageButton  btn5;
    protected ImageButton  btn6;
    protected ImageButton  btn7;
    protected ImageButton  btn8;
    protected ImageButton  btn9;
    protected ImageButton  btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        // linking
        btn1 = findViewById( R.id.button1);
        btn2 = findViewById( R.id.button2);
        btn3 = findViewById( R.id.button3);
        btn4 = findViewById( R.id.button04);
        btn5 = findViewById( R.id.button05);
        btn6 = findViewById( R.id.button6);
        btn7 = findViewById( R.id.button7);
        btn8 = findViewById( R.id.button8);
        btn9 = findViewById( R.id.button9);
        btn10 = findViewById( R.id.button10);

        //Drinks
        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDrinks();
            }
        } );

        //Lastics
        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLastic();
            }
        } );

        //Machawi
        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMachawi();
            }
        } );

        //sanwich
        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySandwish();
            }
        } );
        //Pasta
        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityPasta();
            }
        } );
        //Salad
        btn6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySalad();
            }
        } );
        //sweet
        btn7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySweet();
            }
        } );
        //makaronit
        btn8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMakaronit();
            }
        } );
        //tajin
        btn9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTajin();
            }
        } );
        //Shawarma
        //tajin
        btn10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityShawarma();
            }
        } );

        final ImageView zoom = (ImageView) findViewById( R.id.imageView_01 );
    }

    public  void openActivityDrinks(){
        Intent intent1 = new Intent( this,drinks.class );
        startActivity( intent1 );
    }
    public  void openActivityShawarma(){
        Intent intent1 = new Intent( this,Shawarma.class );
        startActivity( intent1 );
    }
    public  void openActivityLastic(){
        Intent intent1 = new Intent( this,lastic.class );
        startActivity( intent1 );
    }
    public  void openActivityMachawi(){
        Intent intent1 = new Intent( this,machawi.class );
        startActivity( intent1 );
    }
    public  void openActivitySandwish(){
        Intent intent1 = new Intent( this,sandwich.class );
        startActivity( intent1 );
    }
    public  void openActivityPasta(){
        Intent intent1 = new Intent( this,pasta.class );
        startActivity( intent1 );
    }
    public  void openActivitySalad(){
        Intent intent1 = new Intent( this,salade.class );
        startActivity( intent1 );
    }
    public  void openActivityMakaronit(){
        Intent intent1 = new Intent( this,makaronit.class );
        startActivity( intent1 );
    }
    public  void openActivitySweet(){
        Intent intent1 = new Intent( this,sweet.class );
        startActivity( intent1 );
    }
    public  void openActivityTajin(){
        Intent intent1 = new Intent( this,Tajin.class );
        startActivity( intent1 );
    }
}
