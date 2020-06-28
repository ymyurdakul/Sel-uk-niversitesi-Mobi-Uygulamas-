package com.example.mustafa.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public  Context context=this;
    @BindView(R.id.btnTanitim)Button btnTanitim;
    @BindView(R.id.btnDuyurular)Button btnDuyurular;
    @BindView(R.id.btnYemekListesi)Button btnYemekListesi;
    @BindView(R.id.btnNotSistemi)Button btnNotSistemi;
    @BindView(R.id.btnAkademikTakvim)Button btnAkademikTakvim;
    @BindView(R.id.btnKonya)Button btnKonya;
    @BindView(R.id.btnHarita)Button btnHarita;
    @BindView(R.id.btnRehber)Button btnRehber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ButterKnife.bind(this);



    }
    @OnClick(R.id.btnRehber)void clickRehber()
    {
        startCustomActivity(Rehber.class);

    }
    @OnClick(R.id.btnTanitim)void clickTanitim()
    {
        startCustomActivity(Tanitim.class);

    }
    @OnClick(R.id.btnYemekListesi)void clickYemekListesi()
    {
        startCustomActivity(Yemekhane.class);
    }
    @OnClick(R.id.btnDuyurular)void  clickDuyurular()
    {
        startCustomActivity(Duyurular.class);
    }
    @OnClick(R.id.btnNotSistemi)void clickNotSistemi()
    {
        startCustomActivity(NotSistemiNavigationPage.class);
    }
    @OnClick(R.id.btnAkademikTakvim)void  clickAkademikTakvim()
    {
        startCustomActivity(AkademikTakvim.class);
    }
    @OnClick(R.id.btnKonya)void  clickKonya()
    {
        startCustomActivity(DenemeSil.class);
    }
    @OnClick(R.id.btnHarita)void  clickHarita()
    {

        startCustomActivity(Harita.class);

    }

   public  void startCustomActivity(Class cls)
   {
       startActivity(new Intent(context,cls));
   }


}
