package com.example.food;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openReservation();
            }


        });






        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu2();
            }

         
        });



        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu1();
            }
        });


    }
    public void openMenu1() {
        Intent intent = new Intent(this, Menu1.class);
        startActivity(intent);
    }
        public void openMenu2(){
            Intent intent = new Intent(this, Menu2.class);
            startActivity(intent);

    }
    public void openReservation(){
        Intent intent = new Intent(this, Reservation.class);
        startActivity(intent);

    }


}