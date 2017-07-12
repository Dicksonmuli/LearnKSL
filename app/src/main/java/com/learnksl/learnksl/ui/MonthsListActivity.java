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

    //    member variables
    private Integer mPosition;
    String mSource;

    private List<String> mDbMonths = new ArrayList<>();

    //    Emergency calls
    private String[] months = new String[]{"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};


    //Database variable
    private DatabaseReference mDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.single_item, months);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final String months = ((TextView) view).getText().toString();
                Toast.makeText(MonthsListActivity.this, months, Toast.LENGTH_LONG).show();

                mDatabase = FirebaseDatabase.getInstance().getReference().child("NUMBERS").getRoot();

                DatabaseReference child1 = mDatabase.child("1");
                DatabaseReference child2 = child1.child("PICTURE");


                mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                            String description = snapshot.child("PICTURE").getValue(String.class);
                            mDbMonths.add(description);
                        }

                        //intent when item clicked
                        Intent intent = new Intent(getApplicationContext(), BasicsDetailActivity.class);
                        Bundle args = new Bundle();
                        args.putParcelable("months", Parcels.wrap(mDbMonths));
//                        args.putInt("position", mPosition);
                        startActivity(intent);

//                        AlertDialog.Builder monthdialogue = new AlertDialog.Builder(MonthsListActivity.this);
//                        monthdialogue.setMessage(mDbMonths.get(itemPosition));
//                        monthdialogue.show();
//                        monthdialogue.setCancelable(true);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });



            }
        });
    }

}
