package com.learnksl.learnksl.ui;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.learnksl.learnksl.R;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    @Bind(R.id.restaurantImageView) ImageView mImageLabel;
    @Bind(R.id.restaurantNameTextView) TextView mNameLabel;

    private ArrayList<String> mDbMonths;
    private int mPosition;
    private String mMonth;


    public static DetailFragment newInstace(ArrayList<String> months, Integer position){
        // wrapping months with parcels for serialization
        DetailFragment detailFragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("months", Parcels.wrap(months));
        args.putInt("position", position);
        detailFragment.setArguments(args);
        return detailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        unwrapping restaurant on onCreate
        mDbMonths = Parcels.unwrap(getArguments().getParcelable("months"));
        mPosition = getArguments().getInt("positon");
        mMonth = mDbMonths.get(mPosition);
//        invoke the menu items
//        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        ButterKnife.bind(this, view);


    }


}
