package com.example.quanla.book;

import android.content.Intent;
import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

import com.example.quanla.book.fragments.HomeFragment;
import com.example.quanla.book.fragments.LibFragment;
import com.example.quanla.book.fragments.PersonalFragment;
import com.example.quanla.book.fragments.SaveFragment;
import com.example.quanla.book.fragments.UploadFragment;

import java.util.ArrayList;
import java.util.List;

import devlight.io.library.ntb.NavigationTabBar;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        search = (ImageView) findViewById(R.id.search);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new LibFragment());
        fragmentList.add(new UploadFragment());
        fragmentList.add(new PersonalFragment());




        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new HomeFragment();
                        break;
                    case 1:
                        fragment = new LibFragment();
                        break;
                    case 2:
                        fragment = new UploadFragment();
                        break;
                    case 3:
                        fragment = new PersonalFragment();
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 4;
            }
        };

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(fragmentPagerAdapter);



        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_home_black_24px),
                        Color.parseColor("#FF8F00")
                ).title("Trang chủ")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_book_black_24px),
                        Color.parseColor("#FF8F00")
                ).title("Thư viện")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_create_black_24px),
                        Color.parseColor("#FF8F00")
                ).title("Sáng tác")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_person_black_24px),
                        Color.parseColor("#FF8F00")
                ).title("Cá nhân")
                        .build()
        );
        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager, 0);
        navigationTabBar.setIsTitled(true);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
            }
        });


    }


}
