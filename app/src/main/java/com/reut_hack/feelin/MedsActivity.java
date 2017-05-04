package com.reut_hack.feelin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MedsActivity extends AppCompatActivity {

    private List<Medicine> meds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        MedsAdapter adapter = new MedsAdapter(initializeData());
        rv.setAdapter(adapter);
    }

    private List<Medicine> initializeData(){
        meds = new ArrayList<>();
        meds.add(new Medicine("אטופן / Etopan", R.drawable.med_etopan_pic, "תרופה נוגדת דלקת לשיכוך כאבים כרוניים או חריפים במערכת השריר והשלד"));
        meds.add(new Medicine("נרוסין / Narocin", R.drawable.med_narocin_pic, "משכך כאבים קלים עד בינוניים לטיפול בדלקות גידים, שרירי השלד ובכאבי וסת"));
        meds.add(new Medicine("אטופן / Etopan", R.drawable.med_etopan_pic, "תרופה נוגדת דלקת לשיכוך כאבים כרוניים או חריפים במערכת השריר והשלד"));
        meds.add(new Medicine("נרוסין / Narocin", R.drawable.med_narocin_pic, "משכך כאבים קלים עד בינוניים לטיפול בדלקות גידים, שרירי השלד ובכאבי וסת"));
        return meds;
    }
}
