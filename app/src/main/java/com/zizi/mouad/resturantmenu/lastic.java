package com.zizi.mouad.resturantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zizi.mouad.resturantmenu.Adapters._LasticImageAdapter;
import com.zizi.mouad.resturantmenu.ImagesView.ImageViewer;
import com.zizi.mouad.resturantmenu.ImagesView.LasticView;

import java.util.Objects;

public class lastic extends AppCompatActivity {
    private GridView lastickGride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lastic );
        Objects.requireNonNull( getSupportActionBar() ).setTitle( "انت الشيف" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        lastickGride = findViewById(R.id.gride_lastic);
        lastickGride.setAdapter(new _LasticImageAdapter(this));

        lastickGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ine =new Intent(getApplicationContext(), LasticView.class);
                ine.putExtra("id",i);
                startActivity(ine);
            }
        });

    }
}
