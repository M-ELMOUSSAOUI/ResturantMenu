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

public class _MakaronitImageAdapter extends BaseAdapter {
    Context context;
    public Integer[] MakaroIMages =
            {
                    R.drawable.mak1,R.drawable.mak2,R.drawable.makaronita
            };

    public _MakaronitImageAdapter(Context c)
    {
        context = c;
    }

    @Override
    public int getCount() {
        return MakaroIMages.length;
    }

    @Override
    public Object getItem(int i) {
        return MakaroIMages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView pastaimageView = new ImageView(context);

        Glide.with(context)
                .load(MakaroIMages[i])
                .diskCacheStrategy( DiskCacheStrategy.NONE )
                .skipMemoryCache( true )
                .into(pastaimageView);
        pastaimageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        pastaimageView.setLayoutParams(new GridView.LayoutParams(510,510));

        return pastaimageView;
    }
}
