package com.reut_hack.feelin;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    static final int GET_COLORED_AREA = 1;

    @BindView(R.id.full_body_image)
    RelativeLayout mLayout;

    @BindView(R.id.btn_main_activity)
    Button mBtnGoToPainSense;

    @BindView(R.id.focus)
    ImageView focus;

    @BindView(R.id.stomach)
    ImageView stomach;

    @BindView(R.id.sholdrleft)
    ImageView sholderleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        focus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PainActivity.class);
                startActivityForResult(intent, GET_COLORED_AREA);
                //startActivity(intent);
            }
        });

        sholderleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SholderLeft.class);
                startActivity(intent);
            }
        });

    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == GET_COLORED_AREA) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                mBtnGoToPainSense.setVisibility(View.VISIBLE);
                mLayout.setBackground(getResources().getDrawable(R.drawable.body_filled));
            }
            else{

            }
        }
    }

    public void goToPainSenseActivity(View view){

        Intent intent=new Intent(MainActivity.this, PainSenseActivity.class);
        startActivity(intent);

        //TODO
        //go to pain sense activity
    }
}
