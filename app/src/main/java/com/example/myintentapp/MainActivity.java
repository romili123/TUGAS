package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindah=findViewById(R.id.btn_pindah);
        btnPindah.setOnClickListener(this);

        Button btnPindahData=findViewById(R.id.btn_pindahData);
        btnPindahData.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_pindah){
            Intent pindahActivity=new Intent(MainActivity.this,PindahActivity.class);
            startActivity(pindahActivity);
        }
        if (view.getId() == R.id.btn_pindahData){
            Intent pindahDataIntent = new Intent(MainActivity.this,PindahDataActivity.class);
            pindahDataIntent.putExtra(PindahDataActivity.EXTRA_NAMA,"Septiyan Adi Nugroho");
            pindahDataIntent.putExtra(PindahDataActivity.EXTRA_ALAMAT,"Slawi kulon");
            startActivity(pindahDataIntent);
        }
        if (view.getId() == R.id.btn_dial_number){
            String phoneNumber = "081545678533";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
            startActivity(dialPhoneIntent);
        }
    }
}
