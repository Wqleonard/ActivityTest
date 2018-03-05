package com.wangqian.activitytest;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.view.View;
import android.widget.Button;


public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity","Task id is"+getTaskId());
        setContentView(R.layout.third_layout);
        Button button3=findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCollector.finishAll();
            }
        });
    }
}
