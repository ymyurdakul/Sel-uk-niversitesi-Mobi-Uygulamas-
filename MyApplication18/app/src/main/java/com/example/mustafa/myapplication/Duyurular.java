package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.sdsmdg.harjot.rotatingtext.RotatingTextWrapper;
import com.sdsmdg.harjot.rotatingtext.models.Rotatable;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;


public class Duyurular extends AppCompatActivity {

   @BindView(R.id.duyurular_tool_bar) Toolbar toolbar;
   @BindView(R.id.recyc_duyurular)RecyclerView recyclerView;
   Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duyurular);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        DuyuruAdapter adapter;
        ArrayList<Duyuru>duyurular= new ArrayList<>();

        duyurular.add(new Duyuru("FE Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","Texas City"));
        duyurular.add(new Duyuru("Doktora Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","morhipo.com"));
        duyurular.add(new Duyuru("Dişhekimligi Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","sadas"));
        duyurular.add(new Duyuru("Veterinerlik Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","sadas")); duyurular.add(new Duyuru("TEknoloji Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","sadas"));
        duyurular.add(new Duyuru("Teknoloji Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","sadas"));
        duyurular.add(new Duyuru("Mühendislik Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","sadas")); duyurular.add(new Duyuru("TEknoloji Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","sadas")); duyurular.add(new Duyuru("TEknoloji Fakültesi Araştırma Görevlisi Sonuçalrı Açıklandı","sadas"));

      new TaskOfFetch().execute(new Void[]{});



    }
    public  static ArrayList<Duyuru>getAllDuyuru() throws IOException {
        ArrayList<Duyuru> duyurus = new ArrayList<>();
        Document doc = Jsoup.connect("http://www.selcuk.edu.tr/").get();
        /*System.out.println(doc.title());*/
        Elements links;
        /*
        for (int i=0;i<10;i++)
        {
            links = doc.select(".row-fluid").select(".baslik").select("#ContentPlaceHolder1_rptduyuruust_rptduyurualt_2_lblduylistbaslik_"+i);
            for (Element link : links) {
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());
            }
        }
*/
        links = doc.select(".span8").select(".baslik").select("a");
        for (Element link : links) {
            // System.out.println("\nlink : " + link.attr("href"));
            // System.out.println("text : " + link.text());
            duyurus.add(new Duyuru(link.text(), link.attr("href")));
        }
        return  duyurus;
    }
    public  class TaskOfFetch extends AsyncTask<Void,Object,Object>{

        ArrayList<Duyuru>duyurular;


        @Override
        protected Object doInBackground(Void... voids) {
            try {
                duyurular=   getAllDuyuru();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            Toast.makeText(getBaseContext(),"basşaldı",Toast.LENGTH_SHORT).show();
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Object o) {
            Toast.makeText(getBaseContext(),"bitti",Toast.LENGTH_SHORT).show();
            DuyuruAdapter adapter =new DuyuruAdapter(context,this.duyurular);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(adapter);
            super.onPostExecute(o);
        }


    }
}
