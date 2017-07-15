package com.learnksl.learnksl.memory;

import android.widget.Button;

/**
 * Created by dickson on 7/15/17.
 */

public class Card {
    public int x;
    public int y;
    public Button button;

    public Card(Button button, int x,int y) {
        this.x = x;
        this.y=y;
        this.button=button;
    }

}
