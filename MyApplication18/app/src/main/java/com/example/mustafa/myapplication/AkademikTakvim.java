package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.webkit.WebView;

import java.util.ArrayList;

public class AkademikTakvim extends AppCompatActivity {

    @BindView(R.id.akademik_takvim_toolabar) Toolbar toolbar;
    @BindView(R.id.akademik_takvim_webview) WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik_takvim);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://docs.google.com/viewer?url="+"https://www.selcuk.edu.tr/dosyalar/2019-2020_Egitim_Ogretim_Yili_Akademik_Takvimi_2_09.08.2019.pdf");


    }



}
