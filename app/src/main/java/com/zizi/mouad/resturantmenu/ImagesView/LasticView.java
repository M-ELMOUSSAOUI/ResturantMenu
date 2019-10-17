package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._LasticImageAdapter;
import com.zizi.mouad.resturantmenu.R;

public class LasticView extends AppCompatActivity {
    ImageView Img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastic_view);

        Img1 = findViewById(R.id.lasview);
        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _LasticImageAdapter img = new _LasticImageAdapter(this);

        Img1.setImageResource(img.LasticImages[pos]);
    }

}
