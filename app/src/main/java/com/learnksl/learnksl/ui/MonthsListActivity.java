package com.learnksl.learnksl.ui;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.learnksl.learnksl.R;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MonthsListActivity extends AppCompatActivity {
    @Bind(R.id.listView) ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

        ButterKnife.bind(this);

<<<<<<< HEAD
=======
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.single_item, months);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String months = ((TextView) view).getText().toString();
                Toast.makeText(MonthsListActivity.this, months, Toast.LENGTH_LONG).show();

                //think of using a customized dialog

                //create custom dialog xml

                //syntax for creating custom dialogs

                mDatabase = FirebaseDatabase.getInstance().getReference("NUMBERS");
                DatabaseReference child1 = mDatabase.child("1");

                // fetch image at this point and display and try saving url to be used with picasso

                DatabaseReference child2 = child1.child("PICTURE");
//                picasso.url(child2)

                //mostly gifs are used so



                final Integer itemPosition = i;
>>>>>>> 611f92fb79b84283e3c05faa6c15033a5172e382

    }

}
