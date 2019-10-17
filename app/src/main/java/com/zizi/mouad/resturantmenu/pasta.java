package com.zizi.mouad.resturantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zizi.mouad.resturantmenu.Adapters._PastaImageAdapter;
import com.zizi.mouad.resturantmenu.ImagesView.ImageViewer;
import com.zizi.mouad.resturantmenu.ImagesView.PastaView;

import java.util.Objects;

public class pasta extends AppCompatActivity {
    private GridView pastaGride;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pasta );

        Objects.requireNonNull( getSupportActionBar() ).setTitle( "انت الشيف" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        pastaGride = findViewById(R.id.gride_pasta);

        pastaGride.setAdapter(new _PastaImageAdapter(this));

        pastaGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ine =new Intent(getApplicationContext(), PastaView.class);
                ine.putExtra("id",i);
                startActivity(ine);
            }
        });
    }
}
