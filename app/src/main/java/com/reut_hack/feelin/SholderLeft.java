package com.reut_hack.feelin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SholderLeft extends AppCompatActivity {

    MyDrawView myDrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholder_left);


        myDrawView = (MyDrawView)findViewById(R.id.left);
        myDrawView.mPaint.setXfermode(null);

    }
}
