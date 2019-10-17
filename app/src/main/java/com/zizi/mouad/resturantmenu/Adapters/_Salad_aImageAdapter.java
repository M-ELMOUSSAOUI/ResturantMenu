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

public class _Salad_aImageAdapter extends BaseAdapter {
    Context context;
    public Integer[] salad_b_Images =
            {
                    R.drawable.salad_b_1,R.drawable.salad_b_2,R.drawable.salad_b_3,
                    R.drawable.salad_b_4,R.drawable.salad_b_5,R.drawable.salad_b_6,
                    R.drawable.salad_b_7,R.drawable.salad_b_8,R.drawable.salad_b_9,
            };

    public _Salad_aImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView saladbimageView = new ImageView(context);

        Glide.with(context)
                .load(salad_b_Images[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(saladbimageView);
        saladbimageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        saladbimageView.setLayoutParams(new GridView.LayoutParams(510,510));

        return saladbimageView;
    }
}
