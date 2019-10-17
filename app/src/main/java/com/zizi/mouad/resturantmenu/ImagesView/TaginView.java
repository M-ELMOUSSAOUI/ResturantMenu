package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._TaginImagesAdapter;
import com.zizi.mouad.resturantmenu.R;

public class TaginView extends AppCompatActivity {
    ImageView Img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagin_view);


        Img1 = findViewById(R.id.taginview);

        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _TaginImagesAdapter img = new _TaginImagesAdapter(this);

        Img1.setImageResource(img.TaginImages[pos]);
    }
}
