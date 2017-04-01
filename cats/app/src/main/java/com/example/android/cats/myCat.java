package com.example.android.cats;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.cats.R;
import com.example.android.cats.adapter.MyAdapter;
import com.example.android.cats.model.DerpData;
import com.example.android.cats.model.DerpData2;

import java.util.ArrayList;

/**
 * Created by ISAAC on 2/24/2017.
 */

public class myCat extends AppCompatActivity {



    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList listData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cat);
        mRecyclerView = (RecyclerView) findViewById(R.id.hor_cat);

        listData2=(ArrayList) DerpData2.getListData2();
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(listData2,this);
        mRecyclerView.setAdapter(mAdapter);




    }
}
