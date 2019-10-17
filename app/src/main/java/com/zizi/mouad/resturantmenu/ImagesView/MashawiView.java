package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._MachawiImageAdapter;
import com.zizi.mouad.resturantmenu.R;

public class MashawiView extends AppCompatActivity {
    ImageView Img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mashawi_view);
        Img1 = findViewById(R.id.mashview);
        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _MachawiImageAdapter img = new _MachawiImageAdapter(this);

        Img1.setImageResource(img.MachawiImages[pos]);
    }
}
