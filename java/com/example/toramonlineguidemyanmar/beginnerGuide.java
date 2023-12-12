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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class beginnerGuide extends AppCompatActivity {

    //InterstitialAd adsToram;
    AdView banMain;
    Button btn1,btn2,btn3,btn4,btn5,btn8,btn9,btn10,btn11;
   // Button btn6,btn7,btn12;
    DisplayMetrics dmetric;
    Display d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_guide);

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
        txt.setText("Beginner Guide");


       /* adsToram = new InterstitialAd(this);
        adsToram.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        //adsToram.setAdUnitId("ca-app-pub-8495785390528556/5325025823");
        adsToram.loadAd(new AdRequest.Builder().build());*/

        banMain=(AdView)findViewById(R.id.adView4);
        banMain.loadAd(new AdRequest.Builder().build());
        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        float density=getResources().getDisplayMetrics().density;
        float h=dmetric.heightPixels/density;
        float w=dmetric.widthPixels/density;


        btn1=(Button)findViewById(R.id.btnCbSys);
        btn2=(Button)findViewById(R.id.btnWorldSys);
        btn3=(Button)findViewById(R.id.btnEzmq);
        btn4=(Button)findViewById(R.id.btnmercenaries);
        btn5=(Button)findViewById(R.id.btnorb);

      // btn7=(Button)findViewById(R.id.btnItem);
        btn8=(Button)findViewById(R.id.btnMap);
        btn9=(Button)findViewById(R.id.btnLvl);
        btn10=(Button)findViewById(R.id.btnDungeon);
        btn11=(Button)findViewById(R.id.btnGem);
        //btn12=(Button)findViewById(R.id.btnDrop);
        ScrollView scl=(ScrollView)findViewById(R.id.scrollView3);


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
        p=btn5.getLayoutParams();
        p.height=(int)(h/10*density);
        btn5.setLayoutParams(p);
        btn5.setTextSize(w/20);
        /*p=btn7.getLayoutParams();
        p.height=(int)(h/10*density);
        btn7.setLayoutParams(p);
        btn7.setTextSize(w/20);*/
        p=btn8.getLayoutParams();
        p.height=(int)(h/10*density);
        btn8.setLayoutParams(p);
        btn8.setTextSize(w/20);
        p=btn9.getLayoutParams();
        p.height=(int)(h/10*density);
        btn9.setLayoutParams(p);
        btn9.setTextSize(w/20);
        p=btn10.getLayoutParams();
        p.height=(int)(h/10*density);
        btn10.setLayoutParams(p);
        btn10.setTextSize(w/20);
        p=btn11.getLayoutParams();
        p.height=(int)(h/10*density);
        btn11.setLayoutParams(p);
        btn11.setTextSize(w/20);
        /*p=btn12.getLayoutParams();
        p.height=(int)(h/10*density);
        btn12.setLayoutParams(p);
        btn12.setTextSize(w/20);*/


        /*adsToram.setAdListener(new AdListener()
        {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                if(adsToram.isLoaded())
                {
                    adsToram.show();
                }
            }
        });*/

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
                Intent i=new Intent(beginnerGuide.this,cbSystem.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,worldSystem.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,easyMq.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,mercenaries.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,orbShop.class);
                startActivity(i);
            }
        });
        /*btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,RecommendedItem.class);
                startActivity(i);
            }
        });*/
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,Map.class);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,Lvling.class);
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,Dungeon.class);
                startActivity(i);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,Gems.class);
                startActivity(i);
            }
        });
        /*btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(beginnerGuide.this,Drop.class);
                startActivity(i);
            }
        });*/
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
        txt.setText("Beginner Guide");
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
