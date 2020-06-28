package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toolbar;

public class Yemekhane extends AppCompatActivity {

    @BindView(R.id.btn_yemekhane_yemeklistesi)Button btnYemekListesi;
    @BindView(R.id.btn_yemekhane_rezervasyon)Button btnRezervasyon;
    @BindView(R.id.yemekhane_webview)WebView webview;
    @BindView(R.id.yemekhane_tool_bar) androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekhane);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://yemekhane.selcuk.edu.tr/");
    }
    @OnClick(R.id.btn_yemekhane_rezervasyon)void  click()
    {
        webview.loadUrl("https://yemekhane.selcuk.edu.tr/");
    }
    @OnClick(R.id.btn_yemekhane_yemeklistesi)void  clickYemekListesi(){

        webview.loadUrl("https://www.selcuk.edu.tr/saglik_kultur/birim/web/sayfa/ayrinti/1473/tr");
    }
}
