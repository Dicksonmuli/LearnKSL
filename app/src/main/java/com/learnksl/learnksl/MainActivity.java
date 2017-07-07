package com.learnksl.learnksl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.learnksl.learnksl.ui.BasicsListActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //binding views
    @Bind(R.id.button1) Button mButton1;

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
