package com.project.kataloghp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.project.kataloghp.Activity.TambahDataActivity;
import com.project.kataloghp.Activity.UasActivity;

public class Profile extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 0;
    private static final int REQUEST_CODE_PICK_IMAGE = 0;
    private ImageView image_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        image_view = findViewById(R.id.profile_image);

        image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk memilih gambar dari aplikasi galeri atau kamera
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*"); // Set tipe data yang ingin diambil (dalam hal ini, gambar)

// Memanggil aktivitas pemilih gambar dan menunggu hasilnya
                startActivityForResult(Intent.createChooser(intent, "Pilih gambar"), REQUEST_CODE_PICK_IMAGE);
            }
        });

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Profile");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
        getMenuInflater().inflate(R.menu.prof, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.chek){
            startActivity(new Intent(Profile.this, TambahDataActivity.class));
        }
        if (id == R.id.check){
            startActivity(new Intent(Profile.this, UasActivity.class));
        }
        if (id == R.id.logout){
            Toast.makeText(Profile.this, "Logout Berhasil!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Profile.this, MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
