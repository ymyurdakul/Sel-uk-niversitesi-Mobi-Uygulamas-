package com.example.mustafa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.Toast;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class Deneme extends AppCompatActivity {

    @BindView(R.id.botto)ChipNavigationBar chipNavigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme);
        ButterKnife.bind(this);

        FragmentManager fragmentManager=getSupportFragmentManager();

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Toast.makeText(getBaseContext(),""+i,Toast.LENGTH_LONG).show();
                switch (i)
                {
                    case R.id.menu_home: {
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame,new DenemeFragment());
                        fragmentTransaction.commit();
                    }
                        break;
                    case R.id.favorites:
                    {

                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame,new DenemeFragment2());
                        fragmentTransaction.commit();
                    }
                }
            }
        });
        chipNavigationBar.showBadge(R.id.menu_home,150);
        chipNavigationBar.showBadge(R.id.favorites,12);
    }
}
