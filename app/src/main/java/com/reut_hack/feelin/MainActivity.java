package com.reut_hack.feelin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    static final int GET_COLORED_AREA = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView focus=(ImageView)findViewById(R.id.focus);
        ImageView stomach=(ImageView)findViewById(R.id.stomach);
        ImageView sholderleft=(ImageView)findViewById(R.id.sholdrleft);



        focus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PainActivity.class);
                //startActivityForResult(intent, GET_COLORED_AREA);
                startActivity(intent);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == GET_COLORED_AREA) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {

            }
        }
    }
}
