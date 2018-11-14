package com.example.danie.dine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //setting exit button with function
        Button btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        Button btnOneTwo = (Button) findViewById(R.id.btnOneTwo);
        btnOneTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent OneTwoIntent = new Intent(getApplicationContext(),StepTwo.class);
                //passing info to the second activity
                startActivity(OneTwoIntent);
                finish();

            }
        });

        //test

        //testing push from laptop
    }
}
