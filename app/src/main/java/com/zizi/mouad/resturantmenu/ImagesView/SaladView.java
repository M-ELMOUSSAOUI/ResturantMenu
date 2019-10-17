package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.R;
import com.zizi.mouad.resturantmenu.Adapters._Salad_b_ImageAdapter;

public class SaladView extends AppCompatActivity {
    ImageView Img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad_view);
        Img1 = findViewById(R.id.saladview);

        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _Salad_b_ImageAdapter img = new _Salad_b_ImageAdapter(this);

        Img1.setImageResource(img.salad_a_Images[pos]);
    }
}
