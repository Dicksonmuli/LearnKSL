package com.learnksl.learnksl.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

public class MonthsListActivity extends AppCompatActivity {

    //    member variables
    private Integer mPosition;
    String mSource;

    private List<String> dbMonths = new ArrayList<>();

    //Database variable
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
