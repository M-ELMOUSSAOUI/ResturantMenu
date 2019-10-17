package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._ShawarmaImagesAdapter;
import com.zizi.mouad.resturantmenu.R;

public class ShawarmaView extends AppCompatActivity {
    ImageView Img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shawarma_view);

        Img1 = findViewById(R.id.shawarmaview);

        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _ShawarmaImagesAdapter img = new _ShawarmaImagesAdapter(this);

        Img1.setImageResource(img.shawarmaImages[pos]);
    }
}
