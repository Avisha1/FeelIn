package com.reut_hack.feelin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

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
}
