package com.zizi.mouad.resturantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zizi.mouad.resturantmenu.Adapters._Salad_aImageAdapter;
import com.zizi.mouad.resturantmenu.Adapters._Salad_b_ImageAdapter;
import com.zizi.mouad.resturantmenu.ImagesView.ImageViewer;
import com.zizi.mouad.resturantmenu.ImagesView.Salad2View;
import com.zizi.mouad.resturantmenu.ImagesView.SaladView;

import java.util.Objects;

public class salade extends AppCompatActivity {
    private GridView salad_aGride;
    private GridView salad_bGride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_salade );

        Objects.requireNonNull( getSupportActionBar() ).setTitle( "انت الشيف" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        salad_aGride = findViewById(R.id.gride_salad_a);
        salad_bGride = findViewById(R.id.gride_salad_b);

        salad_aGride.setAdapter(new _Salad_b_ImageAdapter(this));
        salad_bGride.setAdapter(new _Salad_aImageAdapter(this));

        salad_aGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ine =new Intent(getApplicationContext(), SaladView.class);
                ine.putExtra("id",i);
                startActivity(ine);
            }
        });

        salad_bGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ine =new Intent(getApplicationContext(), Salad2View.class);
                ine.putExtra("id",i);
                startActivity(ine);
            }
        });

    }
}
