package com.reut_hack.feelin;

import android.graphics.drawable.Drawable;

/**
 * Created by shaharavigezer on 05/05/2017.
 */

public class ButtonWithIcon {

    String text;
    Drawable iconId;

    public ButtonWithIcon(String text, Drawable iconId) {
        this.text = text;
        this.iconId = iconId;
    }

    public ButtonWithIcon(String text) {
        this.text = text;
        this.iconId = null;
    }
}
