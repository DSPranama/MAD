package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
    }

    public void go2Cart(View view) {
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }

    public void go2Main(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}