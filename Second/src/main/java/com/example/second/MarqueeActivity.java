package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MarqueeActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView tv_marquee;
    private boolean switcher = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee);
        tv_marquee = findViewById(R.id.tv_marquee);
        tv_marquee.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_marquee){
            switcher = !switcher;
            if (switcher) {
                tv_marquee.setFocusable(false);
                tv_marquee.setFocusableInTouchMode(false);
            }else{
                tv_marquee.setFocusable(true);
                tv_marquee.setFocusableInTouchMode(true);
                tv_marquee.requestFocus();
            }

        }

    }
}
