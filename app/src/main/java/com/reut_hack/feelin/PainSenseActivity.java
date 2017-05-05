package com.reut_hack.feelin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PainSenseActivity extends AppCompatActivity {

    private List<ButtonWithIcon> btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain_sense);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        GridLayoutManager llm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(llm);

        ButtonAdapter adapter = new ButtonAdapter(initializeData());
        rv.setAdapter(adapter);

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
