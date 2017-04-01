package com.example.android.cats.adapter;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.cats.R;
import com.example.android.cats.model.DerpData;
import com.example.android.cats.model.ListItem;
import com.example.android.cats.model.ListItem2;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.cats.R.id.activity_my_cat;
import static com.example.android.cats.R.id.hor_cat;
import static com.example.android.cats.R.id.my_cat_item;

/**
 * Created by ISAAC on 2/16/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{

    private List<ListItem2> listData2;
    private LayoutInflater inflater;


    public MyAdapter(List<ListItem2>listData2, Context c)
    {
        this.inflater=LayoutInflater.from(c);
        this.listData2=listData2;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item2,parent,false);
        return new MyHolder(view);
    }



    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        ListItem2 item2=listData2.get(position);
        holder.title.setText(item2.getTitle2());
        holder.icon.setImageResource(item2.getImageResId2());

    }

    @Override
    public int getItemCount() {
        return listData2.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView icon;
        private TextView subTitle;
        private View container;

        public MyHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.tx1);
            icon=(ImageView)itemView.findViewById(R.id.cat);
            container=itemView.findViewById(my_cat_item);
            subTitle=(TextView)itemView.findViewById(R.id.tx2);


        }

    }
    public void setListData2(ArrayList<ListItem2> exerciseList) {
        this.listData2.clear();
        this.listData2.addAll(exerciseList);
    }
}
