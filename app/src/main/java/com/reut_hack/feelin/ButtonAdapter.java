package com.reut_hack.feelin;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shaharavigezer on 05/05/2017.
 */

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.BtnViewHolder>{

    List<ButtonWithIcon> btns;

    public ButtonAdapter(List<ButtonWithIcon> btns) {
        this.btns = btns;
    }

    @Override
    public BtnViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.btn_card_view, parent, false);
        BtnViewHolder holder = new BtnViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(final BtnViewHolder holder, int i) {
        holder.btn.setText(btns.get(i).text);
        holder.btn.setCompoundDrawablesWithIntrinsicBounds(null, btns.get(i).iconId , null, null);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.btn.setSelected(true);
            }
        });
    }

    @Override
    public int getItemCount() {
        return btns.size();
    }

    public static class BtnViewHolder extends RecyclerView.ViewHolder {
    CardView cv;
    Button btn;

    BtnViewHolder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cv);
        btn = (Button) itemView.findViewById(R.id.btn);
    }
}

}





