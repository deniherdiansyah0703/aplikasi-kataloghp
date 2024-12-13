package com.project.kataloghp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
public class VivoActivity extends AppCompatActivity {
    private RecyclerView rvVivo;
    private ArrayList<Vivo> list = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivo);

        rvVivo = findViewById(R.id.rv_vivo);
        rvVivo.setHasFixedSize(true);

        list.addAll(VivoData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvVivo.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        VivoAdapter vivoAdapter = new VivoAdapter(list);
        rvVivo.setAdapter(vivoAdapter);
//   Klikked
        vivoAdapter.setOnItemClickCallback(new VivoAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Vivo vivo) {
                Intent moveIntent = new Intent(VivoActivity.this, VivoDetail.class);
                moveIntent.putExtra(VivoDetail.ITEM_EXTRA, vivo);
                startActivity(moveIntent);
            }
        });
    }
}