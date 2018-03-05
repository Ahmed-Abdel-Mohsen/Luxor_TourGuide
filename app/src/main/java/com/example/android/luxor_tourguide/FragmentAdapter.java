package com.example.android.luxor_tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ahmed on 3/2/2018.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private static final int numOfFragments = 4;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new MonumentFragment();
        } else if (position == 2) {
            return new ResturantFragment();
        } else {
            return new TempleFragment();
        }
    }

    @Override
    public int getCount() {
        return numOfFragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotel);
        } else if (position == 1) {
            return mContext.getString(R.string.monument);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurant);
        } else {
            return mContext.getString(R.string.temple);
        }
    }
}
