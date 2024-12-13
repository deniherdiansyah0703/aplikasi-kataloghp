package com.project.kataloghp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {

    Button sendwa;
    TextView tv_nama, tv_tgl, tv_seri, tv_merk, tv_alamat, tv_jmlh, tv_notel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        tv_nama = findViewById(R.id.tvNama);
        tv_seri = findViewById(R.id.tvSeri);
        tv_merk = findViewById(R.id.tvMerk);
        tv_tgl = findViewById(R.id.tvTgl);
        tv_alamat = findViewById(R.id.tvAlamat);
        tv_jmlh = findViewById(R.id.tvjmlh);
        tv_notel = findViewById(R.id.tvNotel);
        Button sendwa = findViewById(R.id.sendwa);
        sendwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSupportChat();
            }
        });

        Intent terima = getIntent();
        String terimanama = terima.getStringExtra("amplopNama");
        String terimatgl = terima.getStringExtra("tanggal");
        String terimahp = terima.getStringExtra("hp");
        String terimaser = terima.getStringExtra("serii");
        String terimasom = terima.getStringExtra("kirimsom");
        String terimasam = terima.getStringExtra("kirimsam");
        String terimaap = terima.getStringExtra("kirimap");
        String terimaov = terima.getStringExtra("kirimviv");
        String terimaop= terima.getStringExtra("kirimop");
        String terimarel= terima.getStringExtra("kirimrel");
        String terimajum = terima.getStringExtra("nmbh");
        String terimaalamat = terima.getStringExtra("place");

        tv_nama.setText(terimanama);
        tv_seri.setText(terimaser);
        tv_merk.setText(terimasam);
        tv_merk.setText(terimasom);
        tv_merk.setText(terimaap);
        tv_merk.setText(terimaop);
        tv_merk.setText(terimaov);
        tv_merk.setText(terimarel);
        tv_jmlh.setText("Jumlah" + terimajum);
        tv_notel.setText(terimahp);
        tv_tgl.setText(terimatgl);
        tv_alamat.setText(terimaalamat);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Checkout");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    private void startSupportChat() {
        try {
            String headerReceiver = "";
            String bodyMessageFormal = "";
            String whatsappContain = headerReceiver + bodyMessageFormal;
            String trimtoNumber = "+6287757231783";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://wa.me/" + trimtoNumber + "/?text" + "Assalamualaikum"));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.logout){
            Toast.makeText(CheckoutActivity.this, "Logout Berhasil!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(CheckoutActivity.this, MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}