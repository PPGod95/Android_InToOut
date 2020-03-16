package com.example.third;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private TextView tv_sex;
    private RadioGroup rg_sex;
    private TextView tv_marry;
    private RadioGroup rg_marry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        tv_sex = findViewById(R.id.tv_sex);
        rg_sex = findViewById(R.id.rg_sex);
        tv_marry = findViewById(R.id.tv_marry);
        rg_marry = findViewById(R.id.rg_marry);
        rg_sex.setOnCheckedChangeListener(this);
        rg_marry.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rb_male){
            tv_sex.setText("你是男孩");
        }else if(checkedId == R.id.rb_female){
            tv_sex.setText("你是女孩");
        }else if(checkedId == R.id.rb_married){
            tv_marry.setText("你结婚了");
        }else if(checkedId == R.id.rb_unmarried){
            tv_marry.setText("你没结婚");
        }

    }
}
