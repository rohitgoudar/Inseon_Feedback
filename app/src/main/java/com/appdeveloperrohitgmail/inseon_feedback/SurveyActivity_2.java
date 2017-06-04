package com.appdeveloperrohitgmail.inseon_feedback;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.hsalf.smilerating.SmileRating;

public class SurveyActivity_2 extends AppCompatActivity {

    ImageButton next2,back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_2);
        final SmileRating smileRating=(SmileRating)findViewById(R.id.smiley_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley) {
                switch (smiley)
                {
                    case SmileRating.BAD:
                    case SmileRating.GOOD:
                    case SmileRating.OKAY:
                    case SmileRating.TERRIBLE:
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        Frag2_low f1 =  new Frag2_low();
                        fragmentTransaction.replace(R.id.fragment_container,f1).commit();
                        break;
                    case SmileRating.GREAT:
                        FragmentManager fragmentManager1 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                        Frag2_high f2 =  new Frag2_high();
                        fragmentTransaction1.replace(R.id.fragment_container,f2).commit();
                        break;
                }
            }
        });

        next2=(ImageButton)findViewById(R.id.next_Button2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_i = new Intent(SurveyActivity_2.this,Survey_Activity1.class);
                startActivity(next_i);
            }
        });

        back2 = (ImageButton)findViewById(R.id.back_Button2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_i = new Intent(SurveyActivity_2.this,Survey_Activity1.class);
                startActivity(back_i);
            }
        });
    }
}
