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

public class _DrinksImagesAdapter extends BaseAdapter {
    Context contex;
    public Integer[] DrinksImages =
            {R.drawable.drink_01,R.drawable.drink_02,R.drawable.drink_03,
                    R.drawable.drink_04,R.drawable.drink_05,R.drawable.drink_06,
                    R.drawable.drink_07,R.drawable.drink_08,R.drawable.drink_09,
                    R.drawable.drink_010,R.drawable.drink_011,R.drawable.drink_012,
                    R.drawable.drink_013,R.drawable.drink_014,R.drawable.drink_015,
                    R.drawable.drink_016,R.drawable.drink_017,R.drawable.drink_018,
                    R.drawable.drink_019
            };

    public _DrinksImagesAdapter(Context c)
    {
        contex = c;
    }

    @Override
    public int getCount() {
        return DrinksImages.length;
    }

    @Override
    public Object getItem(int i) {
        return DrinksImages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView drinkimageView = new ImageView(contex);

        Glide.with(contex)
                .load(DrinksImages[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(drinkimageView);
        drinkimageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        drinkimageView.setLayoutParams(new GridView.LayoutParams(510,510));

        return drinkimageView;

    }
}
