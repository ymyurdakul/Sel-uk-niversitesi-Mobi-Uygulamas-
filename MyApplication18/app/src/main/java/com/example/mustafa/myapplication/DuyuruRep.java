package com.example.mustafa.myapplication;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class DuyuruRep {
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
public  static String[]getAllDuyuruAsString() throws IOException {
    ArrayList h=getAllDuyuru();
        String[]array=new String[h.size()];

  for (int i=0;i<array.length;i++)
      array[i]=h.get(i).toString();
    return array;
}
}
