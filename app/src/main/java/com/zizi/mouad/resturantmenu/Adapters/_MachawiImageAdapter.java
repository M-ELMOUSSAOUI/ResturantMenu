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

public class _MachawiImageAdapter extends BaseAdapter {
    Context context;

    public Integer[] MachawiImages =
            {R.drawable.machawi,
                    R.drawable.machawi2,R.drawable.machawi3,
                    R.drawable.machawi4,R.drawable.machawi5,
                    R.drawable.machawi6,R.drawable.machawi7,
                    R.drawable.machawi8,R.drawable.machawi9,
                    R.drawable.machawi10,R.drawable.machawi11,
                    R.drawable.machawi12,R.drawable.machawi13,
                    R.drawable.machawi14,R.drawable.machawi15,
                    R.drawable.machawi16,R.drawable.machawi17,
                    R.drawable.machawi18
    };


    public _MachawiImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return MachawiImages.length;
    }

    @Override
    public Object getItem(int i) {
        return MachawiImages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView machawiimageView = new ImageView(context);

        Glide.with(context)
                .load(MachawiImages[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(machawiimageView);
        machawiimageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        machawiimageView.setLayoutParams(new GridView.LayoutParams(510,510));

        return machawiimageView;



    }
}
