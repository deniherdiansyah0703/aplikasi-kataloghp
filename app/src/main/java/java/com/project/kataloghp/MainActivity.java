package com.project.kataloghp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText lEmail, lPass;
    private Button btnLogin;
    private Button btnReg;
    private String email = "deni@gmail.com";
    private String password = "deni123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lEmail = findViewById(R.id.lEmail);
        lPass = findViewById(R.id.lPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnReg = findViewById(R.id.btnReg);

        //login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lEmail.getText().toString().equalsIgnoreCase(email) && lPass.getText().toString().equalsIgnoreCase(password)) {
                    Intent login = new Intent(MainActivity.this, DashActivity.class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this, "LOGGED!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "FAILED!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegActivity.class);
                startActivity(intent);
            }
        });

    }
}