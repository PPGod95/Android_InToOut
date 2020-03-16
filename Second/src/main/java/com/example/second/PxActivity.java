package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.second.method.methods;

public class PxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_px);
        int dip_10 = methods.d2p(this,10L);
        TextView tv_padding = findViewById(R.id.tv_padding);
        tv_padding.setPadding(dip_10,dip_10,dip_10,dip_10);

    }
}
