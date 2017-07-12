package com.learnksl.learnksl.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.learnksl.learnksl.R;
import com.learnksl.learnksl.adapters.BasicsPagerAdapter;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
    @Bind(R.id.viewPager) ViewPager mViewPager;
    private BasicsPagerAdapter adapterViewPager;
    ArrayList<String> mDbMonths = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ButterKnife.bind(this);

//        pull out our ArrayList<> Parcelable using the unwrap() method
        mDbMonths = Parcels.unwrap(getIntent().getParcelableExtra("months"));
        int startingPosition =getIntent().getIntExtra("position", 0);

//        instructing ViewPager to use adapterViewPager adapter. And set the current item to the position of the item that was just clicked on
        adapterViewPager = new BasicsPagerAdapter(getSupportFragmentManager(), mDbMonths);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}
