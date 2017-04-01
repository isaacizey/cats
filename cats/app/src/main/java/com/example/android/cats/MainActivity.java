package com.example.android.cats;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.android.cats.adapter.DerpAdapter;
import com.example.android.cats.model.DerpData;
import com.example.android.cats.model.ListItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private RecyclerView recView;
    private DerpAdapter adapter;
    private ArrayList listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recView=(RecyclerView)findViewById(R.id.rec_list);
        recView.setLayoutManager(new LinearLayoutManager(this));
        listData=(ArrayList)DerpData.getListData();

        adapter=new DerpAdapter(listData,this);
        adapter=new DerpAdapter(DerpData.getListData(),this);
        recView.setAdapter(adapter);




    }
    public void myCat(View view)
    {
Intent intent=new Intent(this,myCat.class);
        startActivity(intent);
    }
}
