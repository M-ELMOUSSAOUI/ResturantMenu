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

public class _PastaImageAdapter extends BaseAdapter {
    Context context;
    public Integer[] pastaImage =
            {
                    R.drawable.fat1,R.drawable.fat2,R.drawable.fat3,
                    R.drawable.fat4,R.drawable.fat5,R.drawable.fat6,
            };

    public _PastaImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return pastaImage.length;
    }

    @Override
    public Object getItem(int i) {
        return pastaImage[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView pastaimageView = new ImageView(context);

        Glide.with(context)
                .load(pastaImage[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(pastaimageView);
        pastaimageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        pastaimageView.setLayoutParams(new GridView.LayoutParams(510,510));

        return pastaimageView;
    }
}
