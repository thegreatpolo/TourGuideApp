package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by paulcristofari on 12/07/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GeneralFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new TourGenoiseFragment();
        } else if (position == 3) {
            return new HikesFragment();
        } else {
            return new PlacesFragment();
        }
    }

    /**
     * Returns total number of pages
     **/
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.general);
        } else if (position == 1) {
            return mContext.getString(R.string.cuisine);
        } else if (position == 2) {
            return mContext.getString(R.string.tour_genoise);
        } else if (position == 3) {
            return mContext.getString(R.string.hikes);
        } else {
            return mContext.getString(R.string.places);
        }
    }
}
