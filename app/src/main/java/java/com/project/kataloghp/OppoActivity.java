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
public class OppoActivity extends AppCompatActivity {
    private RecyclerView rvOppo;
    private ArrayList<Oppo> list = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo);

        rvOppo = findViewById(R.id.rv_oppo);
        rvOppo.setHasFixedSize(true);

        list.addAll(OppoData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvOppo.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        OppoAdapter oppoAdapter = new OppoAdapter(list);
        rvOppo.setAdapter(oppoAdapter);
//   Klikked
        oppoAdapter.setOnItemClickCallback(new OppoAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Oppo oppo) {
                Intent moveIntent = new Intent(OppoActivity.this, OppoDetail.class);
                moveIntent.putExtra(OppoDetail.ITEM_EXTRA, oppo);
                startActivity(moveIntent);
            }
        });
    }
}