package com.example.mustafa.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class DuyuruAdapter extends  RecyclerView.Adapter<DuyuruViewHolder>{
    LayoutInflater layoutInflater;
    Context context;
    ArrayList<Duyuru>duyurular;
    public DuyuruAdapter(Context context,ArrayList<Duyuru>duyurularim)
    {
        this.context=context;
        layoutInflater=LayoutInflater.from(context);
        this.duyurular=duyurularim;

    }

    @NonNull
    @Override
    public DuyuruViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.duyururecitem,parent,false);

        return new DuyuruViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DuyuruViewHolder holder, int position) {

        holder.setData(duyurular.get(position));
    }

    @Override
    public int getItemCount() {
            if (duyurular.size()==0)
            {
                Toast.makeText(context
                ,"hata no number"
                ,Toast.LENGTH_SHORT).show();
            }
        return duyurular.size();
    }



}
class DuyuruViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textView;
    public Button btn;
    public String link;
    View view;

    public DuyuruViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.duyururecitem_tv_duyurutext);
        btn = itemView.findViewById(R.id.duyururecitem_btnlink);
        this.view=itemView;
        btn.setOnClickListener(this);
    }

    public void setData(Duyuru duyuru) {
        textView.setText(duyuru.getTitle());
        link = duyuru.getLink();

    }

    @Override
    public void onClick(View v) {

        Toast.makeText(v.getContext(),link,Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
        intent.setData(Uri.parse("www.google.com"));
        view.getContext().startActivity(intent);
    }
}