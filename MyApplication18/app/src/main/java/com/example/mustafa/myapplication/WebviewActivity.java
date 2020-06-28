package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class WebviewActivity extends AppCompatActivity {

    @BindView(R.id.customwebview)WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ButterKnife.bind(this);

        String gelenUrl=getIntent().getStringExtra("Url");
        Toast.makeText(getBaseContext(),gelenUrl,Toast.LENGTH_SHORT).show();
    }
}
