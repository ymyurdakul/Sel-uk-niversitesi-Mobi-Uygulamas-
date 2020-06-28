package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DenemeSil2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme_sil2);
        String deger=getIntent().getStringExtra(DenemeSil.EXTRA_INPUT_VALUE);
        Toast.makeText(getBaseContext(),deger,Toast.LENGTH_LONG).show();
    }
}
