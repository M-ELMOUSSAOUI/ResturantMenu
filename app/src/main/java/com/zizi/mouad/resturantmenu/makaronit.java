package com.zizi.mouad.resturantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zizi.mouad.resturantmenu.Adapters._MakaronitImageAdapter;
import com.zizi.mouad.resturantmenu.ImagesView.ImageViewer;

import java.util.Objects;

public class makaronit extends AppCompatActivity {
    private GridView makarGride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_makaronit );

        Objects.requireNonNull( getSupportActionBar() ).setTitle( "انت الشيف" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        makarGride = findViewById(R.id.gride_mak);

        makarGride.setAdapter(new _MakaronitImageAdapter(this));

        makarGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ine =new Intent(getApplicationContext(), ImageViewer.class);
                ine.putExtra("id",i);
                startActivity(ine);
            }
        });
    }
}
