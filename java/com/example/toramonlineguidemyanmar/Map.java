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

public class Map extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtmap1);
        txt2=(TextView)findViewById(R.id.txtmap2);
        txt3=(TextView)findViewById(R.id.txtmap3);
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
        txt1.setText("Map ဟာ အလြန္ အသုံးဝင္တယ့္ Featureတစ္ခုပါ\n" +
                "Map ကို သုံးၿပီး ကိုယ္သြားခ်င္တယ့္ ေနရာကို \n" +
                "ဘယ္က သြားရမလဲ လမ္းေၾကာင္း ေတြၾကည့္လို႔\n" +
                "ရပါတယ္ ဒါဟာ MQလုပ္တယ့္ ေနရာမွာ သြား\n" +
                "ရမယ့္ေနရာေတြကို အလြတ္မရရင္ ရွာဖို႔ အတြက္ \n" +
                "အေရးပါပါတယ္။");
        txt2.setText("ဒါ အျပင့္ Mapဟာ ေနရာ တစ္ခုမွာရွိတယ့္ Monster \n" +
                "ရဲ႕ Exp, Drops စတာေတြကိုပါ Checkၿပီး \n" +
                "ကိုယ္လိုခ်င္တယ့္ Drop/Itemsက်တယ့္ Mobကို \n" +
                "ေ႐ြးသတ္လို႔ရပါတယ္");
        txt3.setText("Menus > Mapကိုနိပ္ပီးၾကည့္လို႔ရပါတယ္:>");
    }

    void unicode()
    {
        txt1.setText("Map ဟာ အလွန် အသုံးဝင်တယ့် Featureတစ်ခုပါ \nMap ကို သုံးပြီး ကိုယ်သွားချင်တယ့် နေရာကို  ဘယ်က သွားရမလဲ လမ်းကြောင်း တွေကြည့်လို့ ရပါတယ် \nဒါဟာ MQလုပ်တယ့် နေရာမှာ သွား ရမယ့်နေရာတွေကို အလွတ်မရရင် ရှာဖို့ အတွက်  အရေးပါပါတယ်။");
        txt2.setText("ဒါ အပြင့် Mapဟာ နေရာ တစ်ခုမှာရှိတယ့် Monster  ရဲ့ Exp, Drops စတာတွေကိုပါ Checkပြီး  ကိုယ်လိုချင်တယ့် Drop/Itemsကျတယ့် Mobကို  ရွေးသတ်လို့ရပါတယ်");
        txt3.setText("Menus -> Mapကိုနိပ်ပီးကြည့်လို့ရပါတယ်:>");
    }
}
