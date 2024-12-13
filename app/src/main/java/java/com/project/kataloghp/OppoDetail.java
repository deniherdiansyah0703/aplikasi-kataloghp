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

public class OppoDetail extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo_detail);

        ImageView imgView = findViewById(R.id.imgView);
        TextView tvName = findViewById(R.id.tvName);
        TextView prosesor = findViewById(R.id.prosesor);
        TextView camera = findViewById(R.id.camera);
        TextView ram = findViewById(R.id.ram);
        TextView rom = findViewById(R.id.rom);
//        TextView tvDetail = findViewById(R.id.tvDetail);

        Oppo oppo = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(oppo != null){
            Glide.with(this)
                    .load(oppo.getPhoto())
                    .into(imgView);
            tvName.setText(oppo.getName());
            prosesor.setText(oppo.getProsesor());
            camera.setText(oppo.getCamera());
            ram.setText(oppo.getRam());
            rom.setText(oppo.getRom());
//            tvDetail.setText(oppo.getDetail());
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Oppo");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}