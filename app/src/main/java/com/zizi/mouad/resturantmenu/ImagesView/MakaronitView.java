package com.zizi.mouad.resturantmenu.ImagesView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zizi.mouad.resturantmenu.Adapters._MakaronitImageAdapter;
import com.zizi.mouad.resturantmenu.R;

public class MakaronitView extends AppCompatActivity {
    ImageView Img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makaronit_view);

        Img1 = findViewById(R.id.makview);
        Intent in = getIntent();
        int pos = in.getExtras().getInt("id");
        _MakaronitImageAdapter img = new _MakaronitImageAdapter(this);

        Img1.setImageResource(img.MakaroIMages[pos]);
    }
}
