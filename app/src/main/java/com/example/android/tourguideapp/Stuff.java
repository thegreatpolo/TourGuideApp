package com.example.android.tourguideapp;

/**
 * Created by paulcristofari on 19/07/2018.
 */

public class Stuff {

    private int mItemId;
    private int mDetailId;

    public Stuff(int itemId, int detailId) {
        mItemId = itemId;
        mDetailId = detailId;
    }

    public int getItemId() {
        return mItemId;
    }

    public int getDetailId() {
        return mDetailId;
    }

}
