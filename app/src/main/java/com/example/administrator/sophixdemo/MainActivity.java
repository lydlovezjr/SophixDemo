package com.example.administrator.sophixdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvSophix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvSophix = findViewById(R.id.tv_sophix);
        //tvSophix.setText("Hello");
        tvSophix.setText("Patch Success");
    }
}
