package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.second.method.Date;

public class CaptureActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView tv_capture;
    private ImageView iv_capture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        tv_capture = findViewById(R.id.tv_capture);
        iv_capture = findViewById(R.id.iv_capture);
        tv_capture.setDrawingCacheEnabled(true);
        Button btn_chat = findViewById(R.id.btn_chat);
        Button btn_capture = findViewById(R.id.btn_capture);
        btn_chat.setOnClickListener(this);
        btn_chat.setOnLongClickListener(this);
        btn_capture.setOnClickListener(this);

    }

    private String[] mChatStr = {"你吃饭了吗？", "今天天气真好呀。",
            "我中奖啦！", "我们去看电影吧。", "晚上干什么好呢？"};

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_chat){
            int random = (int) (Math.random() * 10) % 5;
            // 下面的DateUtil参见本书附录源码中的DateUtil.java
            String newStr = String.format("%s\n%s %s",
                    tv_capture.getText().toString(), Date.getNowTime(), mChatStr[random]);
            tv_capture.setText(newStr);

        }else if (v.getId() == R.id.btn_capture){
            Bitmap bitmap = tv_capture.getDrawingCache();
            iv_capture.setImageBitmap(bitmap);
            mHandler.postDelayed(mResetCache, 200);
        }

    }
    private android.os.Handler mHandler = new Handler(); // 声明一个任务处理器
    private Runnable mResetCache = new Runnable() {
        @Override
        public void run() {
            // 关闭文本视图tv_capture的绘图缓存
            tv_capture.setDrawingCacheEnabled(false);
            // 开启文本视图tv_capture的绘图缓存
            tv_capture.setDrawingCacheEnabled(true);
        }
    };



    @Override
    public boolean onLongClick(View v) {
        if(v.getId() == R.id.btn_chat){
            tv_capture.setText("");
        }
        return true;
    }
}
