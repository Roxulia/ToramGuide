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

public class classReview extends AppCompatActivity {

    //InterstitialAd adsToram;
    AdView banMain;
    DisplayMetrics dmetric;
    Display d;
    ScrollView scl;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_review);

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
        txt.setText("Class Review");

        banMain=(AdView)findViewById(R.id.adView3);
        banMain.loadAd(new AdRequest.Builder().build());

        /*adsToram = new InterstitialAd(this);
        adsToram.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        //adsToram.setAdUnitId("ca-app-pub-8495785390528556/5325025823");
        adsToram.loadAd(new AdRequest.Builder().build());*/

        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        float density=getResources().getDisplayMetrics().density;
        float h=dmetric.heightPixels/density;
        float w=dmetric.widthPixels/density;

        scl=(ScrollView)findViewById(R.id.sclClass);
        btn1=(Button)findViewById(R.id.btnOHS);
        btn2=findViewById(R.id.btnTHS);
        btn3=findViewById(R.id.btnBOW);
        btn4=findViewById(R.id.btnBWG);
        btn5=findViewById(R.id.btnSTF);
        btn6=findViewById(R.id.btnMD);
        btn7=findViewById(R.id.btnHB);
        btn8=findViewById(R.id.btnKTN);
        btn9=findViewById(R.id.btnKN);
        btn10=findViewById(R.id.btnDW);

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
        p=btn6.getLayoutParams();
        p.height=(int)(h/10*density);
        btn6.setLayoutParams(p);
        btn6.setTextSize(w/20);
        p=btn7.getLayoutParams();
        p.height=(int)(h/10*density);
        btn7.setLayoutParams(p);
        btn7.setTextSize(w/20);
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
                Intent i=new Intent(classReview.this,revOHS.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revTHS.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revBOW.class);
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revBWG.class);
                startActivity(i);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revSTF.class);
                startActivity(i);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revMD.class);
                startActivity(i);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revHB.class);
                startActivity(i);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revKTN.class);
                startActivity(i);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revKN.class);
                startActivity(i);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(classReview.this,revDW.class);
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
        txt.setText("Class Review");
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
