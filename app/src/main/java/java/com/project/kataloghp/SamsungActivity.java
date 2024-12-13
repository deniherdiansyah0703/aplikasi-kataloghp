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
public class SamsungActivity extends AppCompatActivity {
    private RecyclerView rvSamsung;
    private ArrayList<Samsung> list = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);

        rvSamsung = findViewById(R.id.rv_samsung);
        rvSamsung.setHasFixedSize(true);

        list.addAll(SamsungData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvSamsung.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        SamsungAdapter samsungAdapter = new SamsungAdapter(list);
        rvSamsung.setAdapter(samsungAdapter);
//   Klikked
        samsungAdapter.setOnItemClickCallback(new SamsungAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Samsung samsung) {
                Intent moveIntent = new Intent(SamsungActivity.this, SamsungDetail.class);
                moveIntent.putExtra(SamsungDetail.ITEM_EXTRA, samsung);
                startActivity(moveIntent);
            }
        });
    }
}