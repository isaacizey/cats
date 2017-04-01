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

import java.util.ArrayList;
import java.util.List;

import static com.example.android.cats.R.id.cont_item_root;

/**
 * Created by ISAAC on 2/16/2017.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder>{

    private List<ListItem> listData;
    private LayoutInflater inflater;

    private ItemClickCallback itemClickCallback;
    public interface ItemClickCallback {
        void onItemClick(int p);
        void onSecondaryIconClick(int p);
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback) {
        this.itemClickCallback = itemClickCallback;
    }

    public DerpAdapter(List<ListItem>listData, Context c)
    {
        this.inflater=LayoutInflater.from(c);
        this.listData=listData;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        ListItem item=listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResId());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView title;
        private ImageView icon;
        private TextView subTitle;
        private View container;

        public DerpHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.lbl_item_text);
            icon=(ImageView)itemView.findViewById(R.id.in_item_icon);
            container=itemView.findViewById(cont_item_root);
            subTitle=(TextView)itemView.findViewById(R.id.lbl_item_text2);
            icon.setOnClickListener(this);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.cont_item_root){
                itemClickCallback.onItemClick(getAdapterPosition());
            } else {
                itemClickCallback.onSecondaryIconClick(getAdapterPosition());
            }
        }
    }
    public void setListData(ArrayList<ListItem> exerciseList) {
        this.listData.clear();
        this.listData.addAll(exerciseList);
    }
}
