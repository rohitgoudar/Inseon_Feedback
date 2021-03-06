package com.appdeveloperrohitgmail.inseon_feedback;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class Survey_Activity1 extends AppCompatActivity {

    ImageButton next1,back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_1);
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
                        frag1_low f1 =  new frag1_low();
                        fragmentTransaction.replace(R.id.fragment_container,f1).commit();
                        break;
                    case SmileRating.GREAT:
                        FragmentManager fragmentManager1 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                        Frag1_high f2 =  new Frag1_high();
                        fragmentTransaction1.replace(R.id.fragment_container,f2).commit();
                        break;
                }
            }
        });

        next1=(ImageButton)findViewById(R.id.next_Button1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_i = new Intent(Survey_Activity1.this,SurveyActivity_2.class);
                startActivity(next_i);
            }
        });

        back1 = (ImageButton)findViewById(R.id.back_Button1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_i = new Intent(Survey_Activity1.this,Order_Activity1.class);
                startActivity(back_i);
            }
        });
    }
}
