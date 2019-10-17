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

public class _TaginImagesAdapter extends BaseAdapter {
    Context context;
    public Integer[] TaginImages =
            {
                    R.drawable.tajin1,R.drawable.tajin2,R.drawable.tajin3,
                    R.drawable.tajin4,
            };

    public _TaginImagesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return TaginImages.length;
    }

    @Override
    public Object getItem(int i) {
        return TaginImages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView taginimageView = new ImageView(context);

        Glide.with(context)
                .load(TaginImages[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(taginimageView );
        taginimageView .setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        taginimageView .setLayoutParams(new GridView.LayoutParams(510,510));

        return taginimageView ;
    }
}
