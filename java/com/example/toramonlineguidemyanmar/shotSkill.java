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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.tabs.TabLayout;

import java.util.Random;

public class shotSkill extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    DisplayMetrics dmetric;
    Display d;
    InterstitialAd adsToram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shot_skill);

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
        txt.setText("Shot Skills");
        Random r=new Random();
        int i=r.nextInt(3);
        if(i==1)
        {
            adsToram = new InterstitialAd(this);
            adsToram.setAdUnitId("ca-app-pub-3940256099942544/1033173712");//-test
            //adsToram.setAdUnitId("ca-app-pub-8495785390528556/5325025823");
            adsToram.loadAd(new AdRequest.Builder().build());
            adsToram.setAdListener(new AdListener()
            {
                @Override
                public void onAdLoaded() {
                    super.onAdLoaded();
                    if(adsToram.isLoaded())
                    {
                        adsToram.show();
                    }
                }
            });}
        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        float density=getResources().getDisplayMetrics().density;
        float w=dmetric.widthPixels/density;


        tabLayout=(TabLayout)findViewById(R.id.tabShotSkill);
        viewPager=(ViewPager)findViewById(R.id.ShotSkillVP);

        ViewGroup.LayoutParams p=tabLayout.getLayoutParams();
        p.width=(int)(w*density);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final adaptShot adaptShot=new adaptShot(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adaptShot);

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
                shotT1.unicode();break;
            case 1:
                shotT2.unicode();break;
            case 2:
                shotT3.unicode();break;
            case 3:
                shotT4.unicode();break;
        }
    }

    void setZawgyi()
    {
        int pos=tabLayout.getSelectedTabPosition();
        switch (pos)
        {
            case 0:shotT1.zawgyi();break;
            case 1:shotT2.zawgyi();break;
            case 2:shotT3.zawgyi();break;
            case 3:shotT4.zawgyi();break;
        }
    }


}
