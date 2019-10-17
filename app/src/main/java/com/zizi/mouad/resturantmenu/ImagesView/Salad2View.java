package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._Salad_aImageAdapter;
import com.zizi.mouad.resturantmenu.R;

public class Salad2View extends AppCompatActivity {
    ImageView Img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad2_view);
        Img1 = findViewById(R.id.salad2view);

        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _Salad_aImageAdapter img = new _Salad_aImageAdapter(this);

        Img1.setImageResource(img.salad_b_Images[pos]);
    }
}
