package com.reut_hack.feelin;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaharavigezer on 05/05/2017.
 */

public class Medicine {
    String name;
    int photoId;
    String paragraph;

    public Medicine(String name, int photoId, String paragraph) {
        this.name = name;
        this.photoId = photoId;
        this.paragraph = paragraph;
    }
}



