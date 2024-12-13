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
public class AppleActivity extends AppCompatActivity {
    private RecyclerView rvApple;
    private ArrayList<Apple> list = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

        rvApple = findViewById(R.id.rv_apple);
        rvApple.setHasFixedSize(true);

        list.addAll(AppleData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvApple.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        AppleAdapter appleAdapter = new AppleAdapter(list);
        rvApple.setAdapter(appleAdapter);
//   Klikked
        appleAdapter.setOnItemClickCallback(new AppleAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Apple apple) {
                Intent moveIntent = new Intent(AppleActivity.this, AppleDetail.class);
                moveIntent.putExtra(AppleDetail.ITEM_EXTRA, apple);
                startActivity(moveIntent);
            }
        });
    }
}