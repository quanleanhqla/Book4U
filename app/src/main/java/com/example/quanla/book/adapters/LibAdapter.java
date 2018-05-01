package com.example.quanla.book.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.quanla.book.fragments.ListReadFragment;
import com.example.quanla.book.fragments.OnReadFragment;
import com.example.quanla.book.fragments.SaveFragment;

/**
 * Created by QuanLA on 11/8/2017.
 */

public class LibAdapter extends FragmentStatePagerAdapter {
    public LibAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new OnReadFragment();
                break;
            case 1:
                fragment = new SaveFragment();
                break;
            case 2:
                fragment = new ListReadFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Đang đọc";
                break;
            case 1:
                title="Lưu trữ";
                break;
            case 2:
                title="Danh sách đọc";
                break;
        }

        return title;
    }
}
