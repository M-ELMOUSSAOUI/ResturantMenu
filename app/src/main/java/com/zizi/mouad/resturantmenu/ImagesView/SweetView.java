package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._SweetImageAdapter;
import com.zizi.mouad.resturantmenu.R;

public class SweetView extends AppCompatActivity {
    ImageView Img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet_view);

        Img1 = findViewById(R.id.sweetview);

        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _SweetImageAdapter img = new _SweetImageAdapter(this);

        Img1.setImageResource(img.SweetImages[pos]);

    }
}
