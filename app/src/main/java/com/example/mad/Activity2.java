package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity4() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void go2NxtActivity(View view) {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void go2NxtActi6(View view) {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }

    public void openActiviDe(View view) {
        Intent intent = new Intent(this,Activity7.class);
        startActivity(intent);
    }

}


