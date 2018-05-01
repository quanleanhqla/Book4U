package com.example.quanla.book.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.MotionEvent;

import com.example.quanla.book.fragments.CategoryFragment;
import com.example.quanla.book.fragments.RecommentFragment;

/**
 * Created by QuanLA on 11/7/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new RecommentFragment();
                break;
            case 1:
                fragment = new CategoryFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Gợi ý";
                break;
            case 1:
                title="Thể loại";
                break;
        }

        return title;
    }


}
