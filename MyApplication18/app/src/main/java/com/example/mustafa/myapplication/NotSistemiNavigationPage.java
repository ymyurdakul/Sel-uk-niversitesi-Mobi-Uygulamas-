package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class NotSistemiNavigationPage extends AppCompatActivity {

    @BindView(R.id.not_bilgi_sistemi_toolbar) Toolbar toolbar;
    @BindView(R.id.btn_not_bilgi_sistemi_personelsayfa) Button btnPersonelSayfa;
    @BindView(R.id.btn_not_bilgi_sistemi_ogrsayfa)Button btnOgrenciSayfa;
    @BindView(R.id.btn_not_bilgi_sistemi_akademisyensayfa)Button btnAkademistenSayfa;
    @BindView(R.id.not_bilgi_sistemi_webview) WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_sistemi_navigation_page);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://obis5.selcuk.edu.tr/");




    }
    @OnClick(R.id.btn_not_bilgi_sistemi_personelsayfa)void clickPersonelSayfa()
    {
        webview.loadUrl("https://ubs.selcuk.edu.tr/");

    }
    @OnClick(R.id.btn_not_bilgi_sistemi_akademisyensayfa) void clickAkademisyenSayfa()
    {
        webview.loadUrl("https://obis5.selcuk.edu.tr/Home/PerIndex");

    }
    @OnClick(R.id.btn_not_bilgi_sistemi_ogrsayfa)void  ogrSayfa()
    {

        webview.loadUrl("https://obis5.selcuk.edu.tr/");
    }

}
