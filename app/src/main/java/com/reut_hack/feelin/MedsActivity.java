package com.reut_hack.feelin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MedsActivity extends AppCompatActivity {

    @BindView(R.id.btn_meds_activity)
    Button mBtnGoToDoc;

    private List<Medicine> meds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meds);
        ButterKnife.bind(this);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        MedicineAdapter adapter = new MedicineAdapter(initializeData());
        rv.setAdapter(adapter);

        mBtnGoToDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedsActivity.this, DocActivity.class);
                startActivity(intent);

            }
        });
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
