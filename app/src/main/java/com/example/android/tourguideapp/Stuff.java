package com.example.android.tourguideapp;

/**
 * Created by paulcristofari on 19/07/2018.
 */

public class Stuff {

    private int mItemId;
    private int mDetailId;
    private int mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Stuff(int itemId, int detailId) {
        mItemId = itemId;
        mDetailId = detailId;
    }

    public Stuff(int itemId, int detailId, int imageId) {
        mItemId = itemId;
        mDetailId = detailId;
        mImageId = imageId;
    }

    public int getItemId() {
        return mItemId;
    }

    public int getDetailId() {
        return mDetailId;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}
