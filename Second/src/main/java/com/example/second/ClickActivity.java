package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ClickActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private Button btn_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        btn_click = findViewById(R.id.btn_click);
        btn_click.setOnClickListener(this);
        btn_click.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_click){
            Toast.makeText(ClickActivity.this,"您点击了控件", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId() == R.id.btn_click){
            Toast.makeText(ClickActivity.this,"您长按了控件", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
