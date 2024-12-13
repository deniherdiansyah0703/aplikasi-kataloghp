package com.project.kataloghp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class OrderActivity extends AppCompatActivity {

    EditText nama, alamat, notel, tgl;
    RadioGroup merk;
    RadioButton sams, som, appl, vivo, oppo, real;
    Spinner seri;
    Button btnorder, min, plus;
    TextView add;
    int count = 0;

    DatePickerDialog datePickerDialog;
    SimpleDateFormat dateFormatter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        nama = (EditText) findViewById(R.id.nama);
        alamat = (EditText) findViewById(R.id.alamat);
        notel = (EditText) findViewById(R.id.notel);
        merk = (RadioGroup) findViewById(R.id.merk);
        sams = (RadioButton) findViewById(R.id.sams);
        som = (RadioButton) findViewById(R.id.som);
        appl = (RadioButton) findViewById(R.id.appl);
        vivo = (RadioButton) findViewById(R.id.vivo);
        oppo = (RadioButton) findViewById(R.id.oppo);
        real = (RadioButton) findViewById(R.id.real);
        seri = (Spinner) findViewById(R.id.seri);
        btnorder = (Button) findViewById(R.id.btnorder);
        min = (Button) findViewById(R.id.min);
        plus = (Button) findViewById(R.id.plus);
        add = (TextView) findViewById(R.id.add);

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

        seri.setAdapter(new ArrayAdapter<>(OrderActivity.this, android.R.layout.simple_spinner_dropdown_item,fList));
        seri.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        tgl = (EditText) findViewById(R.id.tgl);
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy");

        tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });




        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnorder = new Intent(getApplicationContext(), CheckoutActivity.class);
                startActivity(btnorder);
                String vNama = nama.getText().toString();
                String vAdd = add.getText().toString();
                String vTgl = tgl.getText().toString();
                String vNotel = notel.getText().toString();
                String vAlamat = alamat.getText().toString();
                String a = "";
                String firtItem = String.valueOf(seri.getSelectedItem());


                if(vNama.trim().equals("")){
                    nama.setError("Nama tidak boleh kosong");
                }
                if(vNotel.trim().equals("")){
                    nama.setError("Nomor Telephone tidak boleh kosong");
                }
                if(vAlamat.trim().equals("")){
                    nama.setError("Alamat tidak boleh kosong");
                }



                if (sams.isChecked()) {
                    a+="Samsung";
                }
                if (som.isChecked()) {
                    a+="Xiaomi";
                }
                if (appl.isChecked()) {
                    a+="Apple";
                }
                if (vivo.isChecked()) {
                    a+="Vivo";
                }
                if (oppo.isChecked()) {
                    a+="Oppo";
                }
                if (real.isChecked()) {
                    a+="Realme";
                }

                Intent kirim = new Intent(getApplicationContext(), CheckoutActivity.class);
                kirim.putExtra("amplopNama", vNama);
                kirim.putExtra("kirimsam", a);
                kirim.putExtra("kirimsom", a);
                kirim.putExtra("kirimap", a);
                kirim.putExtra("kirimviv", a);
                kirim.putExtra("kirimop", a);
                kirim.putExtra("kirimrel", a);
                kirim.putExtra("serii", firtItem);
                kirim.putExtra("tanggal", vTgl);
                kirim.putExtra("nmbh", vAdd);
                kirim.putExtra("hp", vNotel);
                kirim.putExtra("place", vAlamat);
                startActivity(kirim);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = add.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                add.setText(String.valueOf(value));

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = add.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                add.setText(String.valueOf(value));
            }
        });

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Order");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void min(View v) {
        count++;
        add.setText("" + count);
    }

    public void plus(View v) {
        if(count <= 0) count = 0;
        else count--;
        add.setText("" + count);
    }

    private void showDateDialog() {
        Calendar calendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, month, dayOfMonth);
                tgl.setText(dateFormatter.format(newDate.getTime()));
            }
        },calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
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
            Toast.makeText(OrderActivity.this, "Logout Berhasil!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(OrderActivity.this, MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}