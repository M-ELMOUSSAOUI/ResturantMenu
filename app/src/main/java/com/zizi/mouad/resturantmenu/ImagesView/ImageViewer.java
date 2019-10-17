package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._DrinksImagesAdapter;
import com.zizi.mouad.resturantmenu.R;

public class ImageViewer extends AppCompatActivity {
    private ImageView Img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);

        Img1 = findViewById(R.id.view);
        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _DrinksImagesAdapter img = new _DrinksImagesAdapter(this);

        Img1.setImageResource(img.DrinksImages[pos]);


    }
}
