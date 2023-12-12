package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;

public class BSGuide extends AppCompatActivity {

    TextView txt1;
    InterstitialAd adsToram;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsguide);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        txt1=findViewById(R.id.txtbs1);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        btn1=findViewById(R.id.btnBsDetail);
        if(MainActivity.zg==true)
        {
            btnUni.setText("UN");
            zawgyi();
        }
        else
        {
            btnUni.setText("ZG");
            unicode();
        }
        txt.setText("Advanced Facts");
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
        btnUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.zg)
                {
                    unicode();
                    btnUni.setText("ZG");
                    MainActivity.zg=false;
                }
                else
                {
                    zawgyi();
                    btnUni.setText("UN");
                    MainActivity.zg=true;
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BSGuide.this,BSDetail.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        //txt1=(TextView)findViewById(R.id.txtLvl1);
        if(MainActivity.zg==true)
        {
            btnUni.setText("UN");
            zawgyi();
        }
        else
        {
            btnUni.setText("ZG");
            unicode();
        }
        txt.setText("Advanced Facts");
    }


    void zawgyi()
    {
        txt1.setText("Blacksmith ဟာအလြန္အသုံးဝင္ပါတယ္။\n" +
                "ဘာအသုံးဝင္လဲဆိုေတာ့ weapon ေတ armor ေတကိုကိုယ္တိုင္craftပီးေရာင္းစားလို႔ရပါတယ္ weapon ေတ ကိုအဆင့္ျမင့္ေပးတဲ့ refine serviceနဲ႔ stat ေတထည့္တဲ့ stat fill service လဲလုပ္ပီးေရာင္းလို႔ရပါတယ္။\n" +
                "အ့လိုေတဆိုေတာ့ characterတခုလုပ္႐ုံနဲ႔အကုန္လုံးေပါင္းလုပ္လို႔ရလားမရလားကိုေတာ့ေအာက္ကdetailထဲမာဆက္လက္ဖတ္ရႈေပးပါ။");
    }

    void unicode()
    {
        txt1.setText("Blacksmith ဟာအလွန်အသုံးဝင်ပါတယ်။\n" +
                "ဘာအသုံးဝင်လဲဆိုတော့ weapon တေ armor တေကိုကိုယ်တိုင်craftပီးရောင်းစားလို့ရပါတယ် weapon တေ ကိုအဆင့်မြင့်ပေးတဲ့ refine serviceနဲ့ stat တေထည့်တဲ့ stat fill service လဲလုပ်ပီးရောင်းလို့ရပါတယ်။\n" +
                "အ့လိုတေဆိုတော့ characterတခုလုပ်ရုံနဲ့အကုန်လုံးပေါင်းလုပ်လို့ရလားမရလားကိုတော့အောက်ကdetailထဲမာဆက်လက်ဖတ်ရှုပေးပါ။");
    }

}
