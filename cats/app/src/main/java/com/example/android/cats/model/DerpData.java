package com.example.android.cats.model;

import com.example.android.cats.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ISAAC on 2/16/2017.
 */

public class DerpData {
   public static final String[] titles={"mango","pinaple","apple","mango","pinaple","apple","mango","pinaple","apple"};
    private static final int[] icons={R.drawable.cat,R.drawable.cat1,R.drawable.cat2,R.drawable.cat3,R.drawable.cat4,R.drawable.cat5,R.drawable.cat6,R.drawable.cat7,R.drawable.cat8};
    public static final String[] subTitle={"Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity",
            "Need someone who has a subscription to one of these sites so I can get stock photos for my website and social media. I don't want the water mark removed, and I will have an expert check out the photos for authenticity"
    };
    public static final String[] catBreed={"Abyssinian","American Bobtail","American Curl","American Shorthair","American Wirehair",};
    public static final String[] catBreedInfo={};

    public static List<ListItem> getListData()
    {
        List<ListItem>data=new ArrayList<>();

    for(int x=0;x<9;x++)
    {
        for(int i=0;i<titles.length&&i<icons.length;i++)
        {
            ListItem item=new ListItem();
            item.setImageResId(icons[i]);
            item.setTitle(titles[i]);
            item.setSubTitle(subTitle[i]);
            data.add(item);
        }
    }

return data;
    }
}
