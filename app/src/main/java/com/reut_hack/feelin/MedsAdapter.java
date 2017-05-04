package com.reut_hack.feelin;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shaharavigezer on 05/05/2017.
 */

public class MedsAdapter extends RecyclerView.Adapter<MedsAdapter.MedsViewHolder> {

    List<Medicine> meds;

    public MedsAdapter(List<Medicine> meds) {
        this.meds = meds;
    }

    @Override
    public MedsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.med_card_view, parent, false);
        MedsViewHolder mvh = new MedsViewHolder(v);
        return mvh;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(MedsViewHolder holder, int i) {

        holder.medName.setText(meds.get(i).name);
        holder.medParagraph.setText(meds.get(i).paragraph);
        holder.medPhoto.setImageResource(meds.get(i).photoId);

        /*
        personViewHolder.personName.setText(persons.get(i).name);
    personViewHolder.personAge.setText(persons.get(i).age);
    personViewHolder.personPhoto.setImageResource(persons.get(i).photoId);
         */

    }

    @Override
    public int getItemCount() {
        return meds.size();
    }

    public static class MedsViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView medName;
        TextView medParagraph;
        ImageView medPhoto;

        MedsViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            medName = (TextView) itemView.findViewById(R.id.medName);
            medParagraph = (TextView) itemView.findViewById(R.id.medParagraph);
            medPhoto = (ImageView) itemView.findViewById(R.id.medPhoto);
        }
    }

}


