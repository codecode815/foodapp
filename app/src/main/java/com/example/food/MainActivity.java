package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView theDates;
    private Button btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theDates=(TextView) findViewById(R.id.date);
        btnB=(Button) findViewById(R.id.btnB);

        Intent incomingIntent=getIntent();
        String date= incomingIntent.getStringExtra("date");
        theDates.setText(date);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BreakfastActivity.class);
                startActivity(intent);

            }
        });
    }
}