package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView img_ballDisplay = findViewById(R.id.image_eightBall);
        final int [] ball_Array = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};
        Button btn_Ask = findViewById(R.id.btn_Ask);
        btn_Ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                img_ballDisplay.setImageResource(ball_Array[number]);
                number = randomNumberGenerator.nextInt(5);
            }
        });
    }
}
