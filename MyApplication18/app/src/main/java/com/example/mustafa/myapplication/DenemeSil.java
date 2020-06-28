package com.example.mustafa.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;

public class DenemeSil extends AppCompatActivity {
    public static int DENEMESIL_REQUEST_CODE=-3;
    public static String EXTRA_INPUT_VALUE;

    @BindView(R.id.color)Spinner spinner;
    @BindView(R.id.find_beer)Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme_sil);
        ButterKnife.bind(this);




    }
  @OnClick(R.id.find_beer)void click()
  {
      Intent intent=new Intent(Intent.ACTION_SEND);
      intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,"Selama su getir");
        intent.putExtra(Intent.EXTRA_SUBJECT,"05522211349");
        startActivity(intent);
  }

static class Mutfak{
        public  static ArrayList<String>getJuiceByColor(String color){
            ArrayList<String>items=new ArrayList<>();
            switch (color){
                case "Alfa":
                {
                    items.add("elma suyu");
                    items.add("portakal suyu");
                    items.add("çilek suyu");
                return items;
                }

                default:return items;
            }

        }

    }
}
