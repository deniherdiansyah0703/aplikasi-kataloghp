package com.project.kataloghp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.project.kataloghp.API.APIRequestData;
import com.project.kataloghp.API.RetroServer;
import com.project.kataloghp.Model.ResponseModel;
import com.project.kataloghp.OrderActivity;
import com.project.kataloghp.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahDataActivity extends AppCompatActivity {
    RadioButton radioButtonTerpilih;
    private String nama, alamat, telepon, merk, seri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);
        EditText etNama = findViewById(R.id.et_nama);
        EditText etAlamat = findViewById(R.id.et_alamat);
        EditText etTelepon = findViewById(R.id.et_telepon);
        RadioGroup rgMerk = findViewById(R.id.rg_merk);
        RadioButton rbSamsung = findViewById(R.id.rb_sams);
        RadioButton rbXiaomi = findViewById(R.id.rb_xiaom);
        RadioButton rbApple = findViewById(R.id.rb_apple);
        RadioButton rbVivo = findViewById(R.id.rb_vivo);
        RadioButton rbOppo = findViewById(R.id.rb_oppo);
        RadioButton rbRealme = findViewById(R.id.rb_realme);
        Spinner spSeri = findViewById(R.id.sp_seri);
        Button btnSimpan = findViewById(R.id.btnsimpan);

        ArrayList<String> fList=new ArrayList<>();

        fList.add("Galaxxy S21");
        fList.add("Galaxy S20");
        fList.add("Galaxy A52");
        fList.add("Galaxy M62");
        fList.add("Galaxy NOTE20 Ultra");
        fList.add("Galaxy A34");
        fList.add("Galaxy A72");
        fList.add("Galaxy A12");
        fList.add("Galaxy A22");
        fList.add("Galaxy M32");
        fList.add("Redmi Note 10 Pro");
        fList.add("Redmi 9t");
        fList.add("Mi 11");
        fList.add("Poco X3 Pro");
        fList.add("Redmi Note 9");
        fList.add("Mi 10T Pro");
        fList.add("iPhone 13");
        fList.add("iPhone 13 Mini");
        fList.add("iPhone 12 Pro Max");
        fList.add("iPhone SE (2020)");
        fList.add("iPhone 11 Pro Max");
        fList.add("iPhone XR");
        fList.add("iPhone XS Max");
        fList.add("iPhone 8");
        fList.add("iPhone 7");
        fList.add("iPhone 6s Plus");
        fList.add("Y53s");
        fList.add("Y20s");
        fList.add("Y12s");
        fList.add("Y12i");
        fList.add("V21 5G");
        fList.add("Y30");
        fList.add("Reno 6 Z");
        fList.add("A94");
        fList.add("A54");
        fList.add("F19");
        fList.add("A12");
        fList.add("A15s");
        fList.add("Narzo 30 Pro");
        fList.add("C25");
        fList.add("C11");
        fList.add("C11 (2021)");
        fList.add("8 Pro");
        fList.add("7 5G");
        fList.add("7i");

        spSeri.setAdapter(new ArrayAdapter<>(TambahDataActivity.this, android.R.layout.simple_spinner_dropdown_item,fList));
        spSeri.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // private String nama, alamat, telepon, merk, seri;
                nama = etNama.getText().toString();
                alamat = etAlamat.getText().toString();
                telepon = etTelepon.getText().toString();

                int idTerpilih = rgMerk.getCheckedRadioButtonId();
                radioButtonTerpilih = (RadioButton) findViewById(idTerpilih);
                merk = radioButtonTerpilih.getText().toString();

                seri = String.valueOf(spSeri.getSelectedItem());

                createData();
            }
        });
    }
    private void createData() {

        APIRequestData ardData = RetroServer.konekRetrofit().create(APIRequestData.class);
        Call<ResponseModel> simpanData = ardData.ardCreateData(nama, alamat, telepon, merk, seri);

        simpanData.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                int kode = response.body().getKode();
                String pesan = response.body().getPesan();

                Toast.makeText(TambahDataActivity.this, "Kode : "+kode+" | Pesan : "+pesan, Toast.LENGTH_SHORT).show();
                finish();
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

                Toast.makeText(TambahDataActivity.this, "Gagal Menyimpan Data"+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}