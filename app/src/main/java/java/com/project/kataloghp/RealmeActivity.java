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
public class RealmeActivity extends AppCompatActivity {
    private RecyclerView rvRealme;
    private ArrayList<Realme> list = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realme);

        rvRealme = findViewById(R.id.rv_realme);
        rvRealme.setHasFixedSize(true);

        list.addAll(RealmeData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvRealme.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        RealmeAdapter realmeAdapter = new RealmeAdapter(list);
        rvRealme.setAdapter(realmeAdapter);
//   Klikked
        realmeAdapter.setOnItemClickCallback(new RealmeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Realme realme) {
                Intent moveIntent = new Intent(RealmeActivity.this, RealmeDetail.class);
                moveIntent.putExtra(RealmeDetail.ITEM_EXTRA, realme);
                startActivity(moveIntent);
            }
        });
    }
}