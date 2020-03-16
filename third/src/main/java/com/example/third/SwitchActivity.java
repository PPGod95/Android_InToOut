package com.example.third;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class SwitchActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private Switch sw_status;
    private TextView tv_result1;
    private CheckBox ck_status;
    private  TextView tv_result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        sw_status = findViewById(R.id.sw_status);
        tv_result1 = findViewById(R.id.tv_result1);
        ck_status = findViewById(R.id.ck_status);
        tv_result2 = findViewById(R.id.tv_result2);
        sw_status.setOnCheckedChangeListener(this);
        ck_status.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView.getId() == R.id.sw_status){
            String string1 = String.format("开关状态是%s", isChecked ? "开":"关");
            tv_result1.setText(string1);
        }else if (buttonView.getId() == R.id.ck_status){
            String string2 = String.format("ios开关的状态是%s",isChecked ? "开":"关");
            tv_result2.setText(string2);
        }

    }
}
