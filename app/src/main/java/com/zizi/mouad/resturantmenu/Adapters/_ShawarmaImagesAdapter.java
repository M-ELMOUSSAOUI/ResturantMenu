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

public class _ShawarmaImagesAdapter extends BaseAdapter {

    Context context;
    public Integer[] shawarmaImages =
            {
                    //Import Images here like R.drawabale.(images)

            };

    public _ShawarmaImagesAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return shawarmaImages.length;
    }

    @Override
    public Object getItem(int i) {
        return shawarmaImages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView shawarimageView = new ImageView(context);

        Glide.with(context)
                .load(shawarmaImages[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(shawarimageView );
        shawarimageView .setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        shawarimageView .setLayoutParams(new GridView.LayoutParams(510,510));

        return shawarimageView ;
    }
}
