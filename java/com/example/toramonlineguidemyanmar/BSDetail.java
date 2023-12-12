package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class BSDetail extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    DisplayMetrics dmetric;
    Display d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsdetail);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        if(MainActivity.zg==true)
        {
            btnUni.setText("UN");
        }
        else
        {
            btnUni.setText("ZG");
        }
        txt.setText("Blacksmith Guide");

        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        float density=getResources().getDisplayMetrics().density;
        float w=dmetric.widthPixels/density;


        tabLayout=(TabLayout)findViewById(R.id.tabbs);
        viewPager=(ViewPager)findViewById(R.id.bsDetailVP);

        ViewGroup.LayoutParams p=tabLayout.getLayoutParams();
        p.width=(int)(w*density);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final adaptBS adaptBS=new adaptBS(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adaptBS);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(!MainActivity.zg)
                {
                    setUnicode();
                }
                else
                {
                    setZawgyi();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        btnUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.zg)
                {
                    setUnicode();
                    btnUni.setText("ZG");
                    MainActivity.zg=false;
                }
                else
                {
                    setZawgyi();
                    btnUni.setText("UN");
                    MainActivity.zg=true;
                }
            }
        });
    }

    void setUnicode()
    {
        int pos=tabLayout.getSelectedTabPosition();
        switch (pos)
        {
            case 0:
                bsCraft.unicode();break;
            case 1:
                bsRef.unicode();break;
            case 2:
                bsStat.unicode();break;
        }
    }

    void setZawgyi()
    {
        int pos=tabLayout.getSelectedTabPosition();
        switch (pos)
        {
            case 0:bsCraft.zawgyi();break;
            case 1:bsRef.zawgyi();break;
            case 2:bsStat.zawgyi();break;
        }
    }

}
