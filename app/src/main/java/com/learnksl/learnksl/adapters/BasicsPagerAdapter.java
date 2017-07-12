package com.learnksl.learnksl.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.learnksl.learnksl.ui.DetailFragment;

import java.util.ArrayList;

/**
 * Created by dickson on 7/12/17.
 */

public class BasicsPagerAdapter extends FragmentPagerAdapter{
    private ArrayList<String> mDbMonths;

    public BasicsPagerAdapter(FragmentManager fm, ArrayList<String> months) {
        super(fm);
        mDbMonths = months;
    }
    @Override
    public Fragment getItem(int position) {
        return DetailFragment.newInstance(mDbMonths, position);
    }
    @Override
    public int getCount() {
        return mDbMonths.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mDbMonths.get(position);
    }
}

}
