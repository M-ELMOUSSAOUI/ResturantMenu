package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._PastaImageAdapter;
import com.zizi.mouad.resturantmenu.R;

public class PastaView extends AppCompatActivity {

    ImageView Imgp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_view);

        Imgp = findViewById(R.id.pastaview);
        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _PastaImageAdapter img = new _PastaImageAdapter(this);

        Imgp.setImageResource(img.pastaImage[pos]);
    }
}
