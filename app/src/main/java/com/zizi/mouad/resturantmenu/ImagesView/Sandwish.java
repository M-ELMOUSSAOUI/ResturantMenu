package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._SandwichimageAdapter;
import com.zizi.mouad.resturantmenu.R;

public class Sandwish extends AppCompatActivity {

    ImageView Img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwish);

        Img1 = findViewById(R.id.Sanview);

        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _SandwichimageAdapter img = new _SandwichimageAdapter(this);

        Img1.setImageResource(img.SandwishImages[pos]);
    }
}
