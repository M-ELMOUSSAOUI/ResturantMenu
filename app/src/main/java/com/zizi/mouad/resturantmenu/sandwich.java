package com.zizi.mouad.resturantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zizi.mouad.resturantmenu.Adapters._SandwichimageAdapter;
import com.zizi.mouad.resturantmenu.ImagesView.ImageViewer;
import com.zizi.mouad.resturantmenu.ImagesView.Sandwish;

import java.util.Objects;

public class sandwich extends AppCompatActivity {
    private GridView SanGride;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sandwich );

        Objects.requireNonNull( getSupportActionBar() ).setTitle( "انت الشيف" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        SanGride = findViewById(R.id.gride_san);

        SanGride.setAdapter(new _SandwichimageAdapter(this));

        SanGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ine =new Intent(getApplicationContext(), Sandwish.class);
                ine.putExtra("id",i);
                startActivity(ine);
            }
        });

    }
}
