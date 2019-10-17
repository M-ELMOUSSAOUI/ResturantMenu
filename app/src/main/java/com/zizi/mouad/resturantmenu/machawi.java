package com.zizi.mouad.resturantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zizi.mouad.resturantmenu.Adapters._MachawiImageAdapter;
import com.zizi.mouad.resturantmenu.ImagesView.ImageViewer;
import com.zizi.mouad.resturantmenu.ImagesView.MashawiView;

import java.util.Objects;

public class machawi extends AppCompatActivity {
    private GridView MachawiGride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_machawi );

        Objects.requireNonNull( getSupportActionBar() ).setTitle( "انت الشيف" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        MachawiGride = findViewById(R.id.gride_machawi);

        MachawiGride = findViewById(R.id.gride_lastic);
        MachawiGride.setAdapter(new _MachawiImageAdapter(this));

        MachawiGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ine =new Intent(getApplicationContext(), MashawiView.class);
                ine.putExtra("id",i);
                startActivity(ine);
            }
        });

    }
}
