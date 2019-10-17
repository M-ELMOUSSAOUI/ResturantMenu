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

public class _Salad_b_ImageAdapter extends BaseAdapter {
    Context context;
    public Integer[] salad_a_Images =
            {
                    R.drawable.salad_a_1,R.drawable.salad_a_2,R.drawable.salad_a_3,
                    R.drawable.salad_a_4,R.drawable.salad_a_5,

            };


    public _Salad_b_ImageAdapter(Context c) {
        context = c;

    }

    @Override
    public int getCount() {
        return salad_a_Images.length;
    }

    @Override
    public Object getItem(int i) {
        return salad_a_Images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView saladaimageView = new ImageView(context);

        Glide.with(context)
                .load(salad_a_Images[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(saladaimageView);
        saladaimageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        saladaimageView.setLayoutParams(new GridView.LayoutParams(510,510));

        return saladaimageView;
    }
}
