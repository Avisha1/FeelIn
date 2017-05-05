package com.reut_hack.feelin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PainSenseActivity extends AppCompatActivity {

    @BindView(R.id.btn_pain_sense)
    Button mBtnGoToMood;

    private List<ButtonWithIcon> btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain_sense);
        ButterKnife.bind(this);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        GridLayoutManager llm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(llm);

        ButtonAdapter adapter = new ButtonAdapter(initializeData());
        rv.setAdapter(adapter);

        mBtnGoToMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PainSenseActivity.this, MoodActivity.class);
                startActivity(intent);
            }
        });
    }

    private List<ButtonWithIcon> initializeData() {
        btns = new ArrayList<>();
        btns.add(new ButtonWithIcon("לוחץ", getResources().getDrawable(R.drawable.ic_feel_press)));
        btns.add(new ButtonWithIcon("שורף", getResources().getDrawable(R.drawable.ic_feel_fire)));
        btns.add(new ButtonWithIcon("כבד", getResources().getDrawable(R.drawable.ic_feel_heavy)));
        btns.add(new ButtonWithIcon("מעקצץ", getResources().getDrawable(R.drawable.ic_feel_ting)));
        btns.add(new ButtonWithIcon("קר", getResources().getDrawable(R.drawable.ic_feel_cold)));
        btns.add(new ButtonWithIcon("דוקר", getResources().getDrawable(R.drawable.ic_feel_stab)));
        btns.add(new ButtonWithIcon("לוחץ", getResources().getDrawable(R.drawable.ic_feel_press)));
        btns.add(new ButtonWithIcon("שורף", getResources().getDrawable(R.drawable.ic_feel_fire)));
        return btns;
    }

}
