package com.reut_hack.feelin;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PainActivity extends AppCompatActivity {

    MyDrawView myDrawView;

    @BindView(R.id.rude_seekbar)
    SeekBar mRudeSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain);
        ButterKnife.bind(this);


        myDrawView = (MyDrawView) findViewById(R.id.draw);
        myDrawView.mPaint.setXfermode(null);


        int seekBarVisibility = mRudeSeekbar.getVisibility();
        mRudeSeekbar.setVisibility(View.VISIBLE);


        mRudeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if(progress>=0 && progress<=3){

                    myDrawView.changeColor(Color.BLACK);
                    //myDrawView.mPaint.setColor(Color.BLACK);
                            //0xF76B1C);
                }
                else if(progress>=4 && progress<=7){
                    myDrawView.changeColor(Color.BLUE);//0xFBDA61);
                }
                else{
                    myDrawView.changeColor(Color.GREEN);//0xC9FB61);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
