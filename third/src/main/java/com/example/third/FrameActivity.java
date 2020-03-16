package com.example.third;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import static android.view.View.*;

public class FrameActivity extends AppCompatActivity implements OnClickListener {
    private FrameLayout fl_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        fl_content = findViewById(R.id.fl_content);
        findViewById(R.id.btn_add_frame).setOnClickListener(this);
    }

    private int myColorArray[] = {Color.BLACK, Color.WHITE, Color.RED, Color.YELLOW, Color.GREEN,
            Color.BLUE, Color.CYAN, Color.MAGENTA, Color.GRAY, Color.DKGRAY};

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_add_frame){
            int random = (int) (Math.random() * 10 % 10);
            View vv = new View(this);
            vv.setBackgroundColor(myColorArray[random]);
            FrameLayout.LayoutParams fl_params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            vv.setLayoutParams(fl_params);
            vv.setOnLongClickListener(new OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    fl_content.removeView(v);
                    return true;
                }
            });
            fl_content.addView(vv);

        }


    }
}
