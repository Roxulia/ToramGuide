package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;
import java.util.RandomAccess;

public class easyMq extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mq);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtMq1);
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
        txt.setText("Beginner Guide");
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
                    btnUni.setText("ZG");
                    MainActivity.zg=false;
                    unicode();
                }
                else
                {
                    btnUni.setText("UN");
                    MainActivity.zg=true;
                    zawgyi();
                }
            }
        });
    }
    void zawgyi()
    {
        txt1.setText("main quest ေတဟာ lvlတက္ဖို႔အျမန္ဆုံး ဟာပါ ဒါမဲ့ တခါတေလ quest ကခ်ခိုင္းတဲ့ boss ေတက newbie ေတအေနနဲ႔ခ်ရခက္တာေတ မႏိူင္တာေတေၾကာင့္ ၾကန႔္ၾကာတာေတြျဖစ္ေလ့ရွိပါတယ္ \n" +
                "\n" +
                "MQ ကိုဘလိုျမန္ျမန္ပီးေအာင္ ဘလိုလုပ္ရမလဲ ဆိုေတာ့\n" +
                "\n" +
                "ပထမဦးစြာ Guild ဝင္ရပါမယ္ မဝင္ခ်င္ရင္ ကိုယ့္ in game friend ထဲမာ lvlမ်ားတဲ့သူရွိရပါမယ္ \n" +
                "ပီးရင္ friend list ထဲက  (or) guild ထဲက mercenary ေခၚရပါမယ္ power 4000 အထက္ဆိုရင္ ရပါတယ္\n" +
                "quest လုပ္တဲ့အခါေခၚထားပါ quest ထဲမွာ boss ခ်ရေတာ့မယ္ ဆိုရင္ boss battle ကို tutorial မာလုပ္တဲ့အတိုင္း exit လုပ္ပါ \n" +
                "လုပ္ပီးရင္ boss ကို easy mode ေျပာင္းပါ ေျပာင္းပီးခ်ပါ ခနေလးနဲ႔ပီးပါတယ္ \n" +
                "\n" +
                "တခ်ိဳ႕ boss ေတက်ေတာ့ easy ေျပာင္းမရတာရွိပါတယ္ \n" +
                "easy mode နဲ႔ပဲေပးတဲ့ boss ေတလဲရွိပါတယ္\n" +
                "chapter 5 က imitacia နဲ႔ chapter 6 က mozto machina ပါ အ့ႏွစ္ေကာင္က battle စစခ်င္းထဲက easy mode နဲ႔ေပးပါတယ္ \n" +
                "\n" +
                "mercenary ကပါမႏိုင္ေတာ့ရင္ေတာ့ guild ထဲက တေယာက္ကိုအကူအညီေတာင္းပီးလုပ္ပါ:3\n" +
                "mercenary ေခၚနည္းကိုေတာ့ေနာက္တပိုင္းမွာေဖာ္ျပပါမယ္");
    }
    void unicode()
    {
        txt1.setText("main quest တေဟာ lvlတက်ဖို့အမြန်ဆုံး ဟာပါ ဒါမဲ့ တခါတလေ quest ကချခိုင်းတဲ့ boss တေက newbie တေအနေနဲ့ချရခက်တာတေ မနိူင်တာတေကြောင့် ကြန့်ကြာတာတွေဖြစ်လေ့ရှိပါတယ်  \n\n MQ ကိုဘလိုမြန်မြန်ပီးအောင် ဘလိုလုပ်ရမလဲ ဆိုတော့  \n\nပထမဦးစွာ Guild ဝင်ရပါမယ် မဝင်ချင်ရင် ကိုယ့် in game friend ထဲမာ lvlများတဲ့သူရှိရပါမယ်  \nပီးရင် friend list ထဲက  (or) guild ထဲက mercenary ခေါ်ရပါမယ် power 4000 အထက်ဆိုရင် ရပါတယ် \nquest လုပ်တဲ့အခါခေါ်ထားပါ quest ထဲမှာ boss ချရတော့မယ် ဆိုရင် boss battle ကို tutorial မာလုပ်တဲ့အတိုင်း exit လုပ်ပါ  လုပ်ပီးရင် boss ကို easy mode ပြောင်းပါ ပြောင်းပီးချပါ ခနလေးနဲ့ပီးပါတယ်   \n\nတချို့ boss တေကျတော့ easy ပြောင်းမရတာရှိပါတယ် \n\neasy mode နဲ့ပဲပေးတဲ့ boss တေလဲရှိပါတယ် \nchapter 5 က imitacia နဲ့ \nchapter 6 က mozto machina ပါ အ့နှစ်ကောင်က battle စစချင်းထဲက easy mode နဲ့ပေးပါတယ်   \n\nmercenary ကပါမနိုင်တော့ရင်တော့ guild ထဲက တယောက်ကိုအကူအညီတောင်းပီးလုပ်ပါ:3 mercenary ခေါ်နည်းကိုတော့နောက်တပိုင်းမှာဖော်ပြပါမယ်");
    }
}

