package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.DialogInterface;
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
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder a;
    //InterstitialAd adsToram;
    AdView banMain;
    public static boolean zg=false;
    Button btnUni;
    DisplayMetrics dmetric;
    Display d;
    Button btnBG,btnCls,btnSk,btnCG,btnAF,btnAbt;
    ScrollView scl;
    float density,h,w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        banMain=(AdView)findViewById(R.id.adView1);
        banMain.loadAd(new AdRequest.Builder().build());
        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        density=getResources().getDisplayMetrics().density;
        h=dmetric.heightPixels/density;
        w=dmetric.widthPixels/density;

        a=new AlertDialog.Builder(this);
        btnBG=(Button)findViewById(R.id.btnBeginnerguide);
        btnCls=(Button)findViewById(R.id.btnClass);
        btnSk=(Button)findViewById(R.id.btnskills);
        btnCG=(Button)findViewById(R.id.btnCombat);
        btnAF=(Button)findViewById(R.id.btnAF);
        btnAbt=(Button)findViewById(R.id.btnAbout);
        btnUni=(Button)findViewById(R.id.btnUni);
        scl=(ScrollView)findViewById(R.id.scrollView2);

        setLayout();

        btnUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(zg==true)
                {
                    btnUni.setText("ZG");
                    zg=false;
                }
                else
                {
                    btnUni.setText("UN");
                    zg=true;
                }
            }
        });

        btnBG.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent iBG=new Intent(MainActivity.this,beginnerGuide.class);
                startActivity(iBG);
            }

        });
        btnCls.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i=new Intent(MainActivity.this,classReview.class);
                startActivity(i);
            }
        });
        btnSk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(MainActivity.this,skillReview.class);
                startActivity(i);
            }
        });
        btnCG.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*Intent i=new Intent(MainActivity.this,combatGuide.class);
                startActivity(i);*/
                message();
            }
        });
        btnAF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(MainActivity.this,advancedFacts.class);
                startActivity(i);
            }
        });
        btnAbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent iAbt=new Intent(MainActivity.this,aboutUs.class);
                startActivity(iAbt);
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
        txt.setText("Toram Online Guide Myanmar");

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

    private void message()
    {
        a.setMessage("Will be available on next update").setCancelable(true)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        a.setTitle("Coming Soon");
        AlertDialog b =a.create();
        b.show();
    }
    private void setLayout()
    {
        ViewGroup.LayoutParams p=btnAbt.getLayoutParams();
        p.height=(int)(h/10*density);
        btnAbt.setLayoutParams(p);
        btnAbt.setTextSize(w/20);
        p=btnBG.getLayoutParams();
        p.height=(int)(h/10*density);
        btnBG.setLayoutParams(p);
        btnBG.setTextSize(w/20);
        p=btnCls.getLayoutParams();
        p.height=(int)(h/10*density);
        btnCls.setLayoutParams(p);
        btnCls.setTextSize(w/20);
        p=btnSk.getLayoutParams();
        p.height=(int)(h/10*density);
        btnSk.setLayoutParams(p);
        btnSk.setTextSize(w/20);
        p=btnCG.getLayoutParams();
        p.height=(int)(h/10*density);
        btnCG.setLayoutParams(p);
        btnCG.setTextSize(w/20);
        p=btnAF.getLayoutParams();
        p.height=(int)(h/10*density);
        btnAF.setLayoutParams(p);
        btnAF.setTextSize(w/20);
        ViewGroup.MarginLayoutParams mp=(ViewGroup.MarginLayoutParams)scl.getLayoutParams();
        mp.bottomMargin=(int)(h/7.5*density);
        mp.leftMargin=(int)(w/15*density);
        mp.rightMargin=(int)(w/15*density);
        mp.topMargin=(int)(h/3.5*density);
        scl.setLayoutParams(mp);

    }

}
