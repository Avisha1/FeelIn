package com.reut_hack.feelin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MoodActivity extends AppCompatActivity {


    @BindView(R.id.btn_mood_activity)
    Button mBtnGoToMed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        ButterKnife.bind(this);



        mBtnGoToMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoodActivity.this, MedsActivity.class);
                startActivity(intent);
            }
        });

    }
}
