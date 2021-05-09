package com.example.tugaselearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		EditText nama,alamat,notelp;
		Button btnSubmit;


		btnSubmit = findViewById(R.id.btnSubmit);
		nama = findViewById(R.id.nama);
		alamat = findViewById(R.id.alamat);
		notelp = findViewById(R.id.notelp);
		btnSubmit.setOnClickListener(v -> {
			Intent sendData = new Intent(MainActivity.this,MainActivity2.class);
			sendData.putExtra("nama",nama.getText().toString());
			sendData.putExtra("alamat",alamat.getText().toString());
			sendData.putExtra("notelp",notelp.getText().toString());
			startActivity(sendData);
		});
    }
}
