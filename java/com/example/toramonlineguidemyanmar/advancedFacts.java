package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class advancedFacts extends AppCompatActivity {

    DisplayMetrics dmetric;
    AdView banMain;
    Display d;
    ScrollView scl;
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_facts);
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
        txt.setText("Advanced Facts");


        banMain=(AdView)findViewById(R.id.adView2);
        banMain.loadAd(new AdRequest.Builder().build());
        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        float density=getResources().getDisplayMetrics().density;
        float h=dmetric.heightPixels/density;
        float w=dmetric.widthPixels/density;

        scl=(ScrollView)findViewById(R.id.sclAF);
        btn1=findViewById(R.id.btnArmEff);
        btn2=findViewById(R.id.btnLvlEff);
        btn3=findViewById(R.id.btnSubWeapEff);
        btn4=findViewById(R.id.btnBsGuide);

        ViewGroup.MarginLayoutParams mp=(ViewGroup.MarginLayoutParams)scl.getLayoutParams();
        mp.bottomMargin=(int)(h/7.5*density);
        mp.leftMargin=(int)(w/15*density);
        mp.rightMargin=(int)(w/15*density);
        mp.topMargin=(int)(h/3*density);
        scl.setLayoutParams(mp);
        ViewGroup.LayoutParams p=btn1.getLayoutParams();
        p.height=(int)(h/10*density);
        btn1.setLayoutParams(p);
        btn1.setTextSize(w/20);
        p=btn2.getLayoutParams();
        p.height=(int)(h/10*density);
        btn2.setLayoutParams(p);
        btn2.setTextSize(w/20);
        p=btn3.getLayoutParams();
        p.height=(int)(h/10*density);
        btn3.setLayoutParams(p);
        btn3.setTextSize(w/20);
        p=btn4.getLayoutParams();
        p.height=(int)(h/10*density);
        btn4.setLayoutParams(p);
        btn4.setTextSize(w/20);

        btnUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.zg)
                {
                    btnUni.setText("ZG");
                    MainActivity.zg=false;
                }
                else
                {
                    btnUni.setText("UN");
                    MainActivity.zg=true;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(advancedFacts.this,ArmEffect.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(advancedFacts.this,LevelEffect.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(advancedFacts.this,subWeaponEffect.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(advancedFacts.this,BSGuide.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
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
        txt.setText("Advanced Facts");
        /*if(adsToram.isLoaded())
        {
            adsToram.show();
        }*/
    }

    @Override
    protected void onPause() {
        if(banMain!=null)
        {
            banMain.pause();
        }
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if(banMain!=null)
        {
            banMain.destroy();
        }
        super.onDestroy();
    }

}
