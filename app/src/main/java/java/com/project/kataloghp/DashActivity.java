package com.project.kataloghp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashActivity extends AppCompatActivity {

    private CardView samsung,apple,xiaomi,oppo,vivo,realme;
    private Toast backToast;
    private long backPress;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        samsung = findViewById(R.id.samsung);
        apple = findViewById(R.id.apple);
        xiaomi = findViewById(R.id.xiaomi);
        oppo = findViewById(R.id.oppo);
        vivo = findViewById(R.id.vivo);
        realme = findViewById(R.id.realme);


        //btn
        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SamsungActivity.class);
                startActivity(intent);
            }
        });
       apple.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), AppleActivity.class);
                        startActivity(intent);
                    }
                });
        xiaomi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), XiaomiActivity.class);
                        startActivity(intent);
                    }
                });
        oppo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), OppoActivity.class);
                        startActivity(intent);
                    }
                });
        vivo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), VivoActivity.class);
                        startActivity(intent);
                    }
                });
        realme.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), RealmeActivity.class);
                        startActivity(intent);
                    }
                });


        //nav



    }
    //backkk
    public void onBackPressed(){
        if (backPress + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            finishAffinity();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG);
            backToast.show();
        }
        backPress = System.currentTimeMillis();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dash, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.profile){
          startActivity(new Intent(DashActivity.this, Profile.class));
        }
        return super.onOptionsItemSelected(item);
    }
}



