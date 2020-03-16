package com.example.second;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.second.method.Date;

public class BbsActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView tv_control;
    private TextView tv_bbs;
    private String[] mChartstr = {"你吃饭了吗？", "今天天气真好呀。",
            "我中奖啦！", "我们去看电影吧", "晚上干什么好呢？"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);
        tv_control = findViewById(R.id.tv_control);
        tv_bbs = findViewById(R.id.tv_bbs);
        tv_control.setOnClickListener(this);
        tv_bbs.setOnClickListener(this);
        tv_control.setOnLongClickListener(this);
        tv_bbs.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs) {
            int random = (int) (Math.random() * 10) % 5;
            String newstring = String.format("%s\n%s %s", tv_bbs.getText().toString(), Date.getNowTime(), mChartstr[random]);
            tv_bbs.setText(newstring);
        }

    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs) {
            tv_bbs.setText("");
        }
        return false;
    }
}
