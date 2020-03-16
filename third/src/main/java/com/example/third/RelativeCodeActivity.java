package com.example.third;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeCodeActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout rl_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_code);
        rl_content = findViewById(R.id.rl_content);
        findViewById(R.id.btn_add_left).setOnClickListener(this);
        findViewById(R.id.btn_add_above).setOnClickListener(this);
        findViewById(R.id.btn_add_right).setOnClickListener(this);
        findViewById(R.id.btn_add_below).setOnClickListener(this);
        findViewById(R.id.btn_add_center).setOnClickListener(this);
        findViewById(R.id.btn_add_parent_left).setOnClickListener(this);
        findViewById(R.id.btn_add_parent_top).setOnClickListener(this);
        findViewById(R.id.btn_add_parent_right).setOnClickListener(this);
        findViewById(R.id.btn_add_parent_bottom).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_add_left) {
            addNewView(RelativeLayout.LEFT_OF, RelativeLayout.ALIGN_TOP, v.getId());
        }else if (v.getId() == R.id.btn_add_above) {
            addNewView(RelativeLayout.ABOVE, RelativeLayout.ALIGN_LEFT, v.getId());
        } else if (v.getId() == R.id.btn_add_right) {
            addNewView(RelativeLayout.RIGHT_OF, RelativeLayout.ALIGN_BOTTOM, v.getId());
        } else if (v.getId() == R.id.btn_add_below) {
            addNewView(RelativeLayout.BELOW, RelativeLayout.ALIGN_RIGHT, v.getId());
        } else if (v.getId() == R.id.btn_add_center) {
            addNewView(RelativeLayout.CENTER_IN_PARENT, -1, rl_content.getId());
        } else if (v.getId() == R.id.btn_add_parent_left) {
            addNewView(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.CENTER_VERTICAL, rl_content.getId());
        } else if (v.getId() == R.id.btn_add_parent_top) {
            addNewView(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.CENTER_HORIZONTAL, rl_content.getId());
        } else if (v.getId() == R.id.btn_add_parent_right) {
            addNewView(RelativeLayout.ALIGN_PARENT_RIGHT, -1, rl_content.getId());
        } else if (v.getId() == R.id.btn_add_parent_bottom) {
            addNewView(RelativeLayout.ALIGN_PARENT_BOTTOM, -1, rl_content.getId());
        }

    }

    private void addNewView(int first, int second, int id) {
        View v = new View(this);
        v.setBackgroundColor(0xaa66ff66);
        RelativeLayout.LayoutParams rl_params = new RelativeLayout.LayoutParams(100, 100);
        rl_params.addRule(first, id);
        if (second >= 0) {
            rl_params.addRule(second, id);
        }
        v.setLayoutParams(rl_params);
        v.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View v) {
                rl_content.removeView(v);
                return true;
            }
        });
        // 往相对布局中添加该视图
        rl_content.addView(v);

    }
}
