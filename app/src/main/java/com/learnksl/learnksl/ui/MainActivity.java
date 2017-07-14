package com.learnksl.learnksl.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.learnksl.learnksl.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //binding views
    @Bind(R.id.restaurantImageView)
    ImageView mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mButton1.setOnClickListener(this);
    }
    //override onclick method
    @Override
    public void onClick(View view) {
        if (view == mButton1) {
            Intent intent = new Intent(MainActivity.this, BasicsListActivity.class);
            startActivity(intent);
        }
    }

}
