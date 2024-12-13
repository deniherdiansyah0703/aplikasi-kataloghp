package com.project.kataloghp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RealmeDetail extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realme_detail);

        ImageView imgView = findViewById(R.id.imgView);
        TextView tvName = findViewById(R.id.tvName);
        TextView prosesor = findViewById(R.id.prosesor);
        TextView camera = findViewById(R.id.camera);
        TextView ram = findViewById(R.id.ram);
        TextView rom = findViewById(R.id.rom);
//        TextView tvDetail = findViewById(R.id.tvDetail);

        Realme realme = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(realme != null){
            Glide.with(this)
                    .load(realme.getPhoto())
                    .into(imgView);
            tvName.setText(realme.getName());
            prosesor.setText(realme.getProsesor());
            camera.setText(realme.getCamera());
            ram.setText(realme.getRam());
            rom.setText(realme.getRom());
//            tvDetail.setText(realme.getDetail());
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Realme");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}