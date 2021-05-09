package com.example.tugaselearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

		TextView txtnama,txtalamat,txtnotelp;

		txtnama = findViewById(R.id.txtnama);
		txtalamat = findViewById(R.id.txtalamat);
		txtnotelp = findViewById(R.id.txtnotelp);

		Bundle getDataFromAcc = getIntent().getExtras();
		txtnama.setText("NAMA : "+getDataFromAcc.getString("nama"));
		txtalamat.setText("ALAMAT : "+getDataFromAcc.getString("alamat"));
		txtnotelp.setText("NO TELP : "+getDataFromAcc.getString("notelp"));


    }
}
