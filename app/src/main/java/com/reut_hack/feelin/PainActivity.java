package com.reut_hack.feelin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PainActivity extends AppCompatActivity {

    MyDrawView myDrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain);

        myDrawView = (MyDrawView)findViewById(R.id.draw);
//        myDrawView.setBackgroundColor(Color.WHITE);
        myDrawView.mPaint.setXfermode(null);


}
}
