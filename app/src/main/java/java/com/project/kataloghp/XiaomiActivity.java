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
public class XiaomiActivity extends AppCompatActivity {
    private RecyclerView rvXiaomi;
    private ArrayList<Xiaomi> list = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi);

        rvXiaomi = findViewById(R.id.rv_xiaomi);
        rvXiaomi.setHasFixedSize(true);

        list.addAll(XiaomiData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvXiaomi.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        XiaomiAdapter xiaomiAdapter = new XiaomiAdapter(list);
        rvXiaomi.setAdapter(xiaomiAdapter);
//   Klikked
        xiaomiAdapter.setOnItemClickCallback(new XiaomiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Xiaomi xiaomi) {
                Intent moveIntent = new Intent(XiaomiActivity.this, XiaomiDetail.class);
                moveIntent.putExtra(XiaomiDetail.ITEM_EXTRA, xiaomi);
                startActivity(moveIntent);
            }
        });
    }
}