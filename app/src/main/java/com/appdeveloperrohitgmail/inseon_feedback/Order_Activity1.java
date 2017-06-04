package com.appdeveloperrohitgmail.inseon_feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order_Activity1 extends AppCompatActivity {

    Button order_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_1);
        order_next = (Button)findViewById(R.id.order_next);
        order_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderIntent = new Intent(Order_Activity1.this,Survey_Activity1.class);
                startActivity(orderIntent);
            }
        });
    }
}
