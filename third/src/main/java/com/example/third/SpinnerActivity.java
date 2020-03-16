package com.example.third;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initSpinner_drop();       
        initSpinner_dialog();
        initSpinner_icon();

    }
    private String[] starArray = {"水星", "金星", "地球", "火星", "木星", "土星"};
    private int[] iconArray = {R.drawable.shuixing, R.drawable.jinxing, R.drawable.diqiu,
            R.drawable.huoxing, R.drawable.muxing, R.drawable.tuxing};


    private void initSpinner_icon() {
    }





    private void initSpinner_dialog() {
        ArrayAdapter<String> starAdapter_dialog = new ArrayAdapter<>(this,R.layout.item_select,starArray);
        starAdapter_dialog.setDropDownViewResource(R.layout.item_dropdown);
        Spinner sp_dialog = findViewById(R.id.sp_dialog);
        sp_dialog.setAdapter(starAdapter_dialog);
        sp_dialog.setPrompt("请选择行星");
        sp_dialog.setSelection(0);
        sp_dialog.setOnItemSelectedListener(new mySelectedListener());
    }


    private void initSpinner_drop() {
        ArrayAdapter<String> starAdapter_drop = new ArrayAdapter<>(this,R.layout.item_select,starArray);
        starAdapter_drop.setDropDownViewResource(R.layout.item_dropdown);
        Spinner sp_dropdown = findViewById(R.id.sp_dropdown);
        sp_dropdown.setPrompt("请选择行星");
        sp_dropdown.setAdapter(starAdapter_drop);
        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(new mySelectedListener());
    }

    private class mySelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
//        boolean first = true;
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//            if (first){
//                view.setVisibility(View.INVISIBLE) ;
//            }
//            first = false ;
            Toast.makeText(SpinnerActivity.this,"您选择的是"+starArray[position],Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
