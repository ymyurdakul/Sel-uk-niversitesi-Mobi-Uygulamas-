package com.example.mustafa.myapplication;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class TestClass {
    public static  void  main(String[]args) throws IOException {

       // Document doc  = Jsoup.connect("http://www.selcuk.edu.tr/").get();
        /*System.out.println(doc.title());*/
        //Elements links ;
        /*
        for (int i=0;i<10;i++)
        {
            links = doc.select(".row-fluid").select(".baslik").select("#ContentPlaceHolder1_rptduyuruust_rptduyurualt_2_lblduylistbaslik_"+i);
            for (Element link : links) {
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());
            }
        }

        links = doc.select(".span8").select(".baslik").select("a");
        for (Element link : links) {
            System.out.println("\nlink : " + link.attr("href"));
            System.out.println("text : " + link.text());
        }

    */
     DuyuruRep.getAllDuyuru().forEach(System.out::println);



    }
    public  TestClass(){


    }

    public static class Loader extends AsyncTask{

        @Override
        protected void onPreExecute() {
            System.out.println("Veri Yazılıyor");
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Object o) {
            System.out.println("Veri getirildi");
            super.onPostExecute(o);
        }

        @Override
        protected void onProgressUpdate(Object[] values) {
            System.out.println("update progress");
            super.onProgressUpdate(values);
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            class  Person{
                String name;
                String sname;
                public  Person(String name,String sname)
                {

                    this.name=name;
                    this.sname=sname;
                }

            }
            for (int i=0;i<155555555;i++)
                new Person("ds","dsds");
            return null;
        }
    }
}
