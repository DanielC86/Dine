package com.example.danie.dine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PickDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_date);

        Button btnTwoOne = (Button)findViewById(R.id.btnTwoOne);
        btnTwoOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TwoOneIntent = new Intent(getApplicationContext(),MainActivity.class);
                //passing info to the second activity
                startActivity(TwoOneIntent);
                finish();
            }
        });



        Button btnTwoThree = (Button)findViewById(R.id.btnTwoThree);
        btnTwoThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent TwoThreeIntent = new Intent(getApplicationContext(),SuccessActivity.class);
                //passing info to the third activity
                startActivity(TwoThreeIntent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });
    }
}
