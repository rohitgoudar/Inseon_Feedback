package com.appdeveloperrohitgmail.inseon_feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {

    ImageButton start_survey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        start_survey = (ImageButton)findViewById((R.id.startButton));
        start_survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(StartActivity.this,Order_Activity1.class);
                startActivity(startIntent);
            }
        });
    }
}
