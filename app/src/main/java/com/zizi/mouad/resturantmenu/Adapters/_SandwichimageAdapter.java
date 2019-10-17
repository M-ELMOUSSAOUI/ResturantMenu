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


public class _SandwichimageAdapter extends BaseAdapter {
    Context context;
    public Integer[] SandwishImages =
            {
                    R.drawable.san1, R.drawable.san2, R.drawable.san3,
                    R.drawable.san5, R.drawable.san6, R.drawable.san7,
                    R.drawable.san8
            };

    public _SandwichimageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return SandwishImages.length;
    }

    @Override
    public Object getItem(int i) {
        return SandwishImages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView SanimageView = new ImageView(context);

        Glide.with(context)
                .load(SandwishImages[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(SanimageView );
        SanimageView .setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        SanimageView .setLayoutParams(new GridView.LayoutParams(510,510));

        return SanimageView ;
    }
}
