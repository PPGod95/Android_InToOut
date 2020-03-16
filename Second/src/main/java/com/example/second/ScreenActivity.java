package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.second.method.methods;

public class ScreenActivity extends AppCompatActivity {
    private TextView tv_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        tv_screen = findViewById(R.id.tv_screen);
        showScreen();

    }
    public void showScreen(){
          int width = methods.getScreenwidth(this);
          int height = methods.getScreenHeight(this);
          float density = methods.getScreenDensity(this);
          String info = String.format("当前屏幕的宽度是%dpx，高度是%dpx，像素密度是%f",width,height,density);
          tv_screen.setText(info);
    }
}
