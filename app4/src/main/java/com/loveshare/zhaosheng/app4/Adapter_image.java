package com.loveshare.zhaosheng.app4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import java.sql.Driver;

/**
 * Created by zhaosheng on 2015/10/28.
 */
public class Adapter_image extends BaseAdapter {

    public Context myContext;
    public  Integer[] imgArray={
        R.drawable.boat,
        R.drawable.giirl,
        R.drawable.iceworld,
        //R.drawable.pic3,
        R.mipmap.beauty
    };
    public  Adapter_image(Context c){
        myContext = c;
    }

    @Override
    public int getCount() {
        return imgArray.length;
    }
     @Override
     public Object getItem(int arg0) {
         return imgArray[arg0];
     }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imView = new ImageView(myContext);
        imView.setImageResource(imgArray[position]);
        imView.setLayoutParams(new Gallery.LayoutParams(320, 480));
        imView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return  imView;
    }
}
