package com.zizi.mouad.resturantmenu.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.zizi.mouad.resturantmenu.R;


public class _LasticImageAdapter extends BaseAdapter {
    Context context;

    public Integer[] LasticImages =
            {
                    R.drawable.lastic1,R.drawable.lastic2,R.drawable.lastic3,
                    R.drawable.lastic4,R.drawable.lastic5,R.drawable.lastic6,
                    R.drawable.lastic7,R.drawable.lastic8,R.drawable.lastic9,
            };
    public _LasticImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return LasticImages.length;
    }

    @Override
    public Object getItem(int i) {
        return LasticImages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView lasticimageView = new ImageView(context);

        Glide.with(context)
                .load(LasticImages[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(lasticimageView);
        lasticimageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lasticimageView.setLayoutParams(new GridView.LayoutParams(510,510));

        return lasticimageView;

    }
}
