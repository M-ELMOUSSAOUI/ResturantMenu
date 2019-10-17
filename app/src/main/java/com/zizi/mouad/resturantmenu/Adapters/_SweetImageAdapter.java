package com.zizi.mouad.resturantmenu.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.zizi.mouad.resturantmenu.R;

public class _SweetImageAdapter extends BaseAdapter {
    Context context;
    public Integer[] SweetImages =
            {
                    R.drawable.sweet1,R.drawable.sweet2,R.drawable.sweet3,
                    R.drawable.sweet4,R.drawable.sweet5,R.drawable.sweet6,
                    R.drawable.sweet7,R.drawable.sweet8,R.drawable.sweet9,
                    R.drawable.sweet9,R.drawable.sweet10,R.drawable.sweet11,

            };

    public _SweetImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return SweetImages.length;
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
        return null;
    }
}
