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

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

 public class PhonePersonAdapter extends RecyclerView.Adapter<PhonePersonViewHolder> {
    public Context context;
    LayoutInflater layoutInflater;
    ArrayList<PhonePerson>contacts;

    public  PhonePersonAdapter(Context context,ArrayList<PhonePerson>contacts)
    {
        this.context=context;
        layoutInflater=LayoutInflater.from(context);
        this.contacts=contacts;

    }

     @NonNull
     @Override
     public PhonePersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view=layoutInflater.inflate(R.layout.contact_person_recitem,parent,false);
         return new PhonePersonViewHolder(view,context);
     }

     @Override
     public void onBindViewHolder(@NonNull PhonePersonViewHolder holder, int position) {
            holder.setData(contacts.get(position));
     }

     @Override
     public int getItemCount() {
         return contacts.size();
     }

 }
class PhonePersonViewHolder extends RecyclerView.ViewHolder{

    TextView tvPersonName,tvPhone,tvDetail;
    Button btnCall;
    Context context;

    public PhonePersonViewHolder(@NonNull View itemView,Context context) {
        super(itemView);
        tvPersonName=(TextView)itemView.findViewById(R.id.recitem_tv_contact_name);
        tvDetail=(TextView)itemView.findViewById(R.id.rec_item_detail);
        tvPhone=(TextView)itemView.findViewById(R.id.recitem_tv_contact_phone);
        btnCall=(Button)itemView.findViewById(R.id.rec_item_btnCall);
        this.context=context;
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

                Intent callIntent = new Intent(itemView.getContext(),WebviewActivity.class);
                callIntent.putExtra("Url","www.google.com");
                itemView.getContext().startActivity(callIntent);


            }
        });
    }

    public void setData(PhonePerson person){
        tvPersonName.setText(person.getName());
        tvPhone.setText(person.getPhone());
        tvDetail.setText(person.getDetail());

    }

}
