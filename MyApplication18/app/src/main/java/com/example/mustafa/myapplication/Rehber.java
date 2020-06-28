package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toolbar;


import java.util.ArrayList;

public class Rehber extends AppCompatActivity {

   @BindView(R.id.recyc_rehber)RecyclerView recyclerView;
   @BindView(R.id.rehber_toolbar)
   androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehber);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getBaseContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        ArrayList<PhonePerson>contacts=new ArrayList<>();

        contacts.add(new PhonePerson("Ahmet Veli Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Veli Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Ahmet  Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Hacı Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("KAzım Yurdakul","Akademik Birim","03322323132"));
        contacts.add(new PhonePerson("Veli Ermiş","Rektörlük","05531213565"));
        contacts.add(new PhonePerson("Ahmet Veli Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Veli Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Ahmet  Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Murat Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Begüm Yurdakul","Akademik Birim","03322323132"));
        contacts.add(new PhonePerson("Hila Ermiş","Rektörlük","05531213565"));   contacts.add(new PhonePerson("Ahmet Veli Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Veli Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Ahmet  Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Deli Kaya","Öğrenci İşleri","03322323132"));
        contacts.add(new PhonePerson("Begüm Yurdakul","Akademik Birim","03322323132"));
        contacts.add(new PhonePerson("Hila Ermiş","Rektörlük","05531213565"));
        PhonePersonAdapter adapter=new PhonePersonAdapter(getBaseContext(),contacts);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
