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

public class subWeaponEffect extends AppCompatActivity {

    TextView txt1;
    InterstitialAd adsToram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_weapon_effect);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        txt1=findViewById(R.id.txtsubweapeff1);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
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
            adsToram.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
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
    }

    void zawgyi()
    {
        txt1.setText("Toram မွာ main weapon ေတအျပင္သူတို႔နဲ႔ တြဲသုံးလို႔ရတဲ့ sub weapon ေတရွိပါတယ္။\n" +
                "sub weapon တပ္လိုက္ရင္ character ရဲ႕ stat အခ်ိဳ႕မွာside effect ဝင္တာေတြ႕ရပါတယ္။\n" +
                "\n" +
                "Two handed sword,magic device ကလြဲလို႔က်န္တဲ့ main weapon ေတြအကုန္ sub weapon သုံးလို႔ရပါတယ္။\n" +
                "\n" +
                "sub weapon ေတြကေတာ့ shield,dagger,arrow,knuckle,magic deviceေတြျဖစ္ပါတယ္။\n" +
                "\n" +
                "- one handed sword ဆိုရင္ shield,dagger,arrow,knuckle,magic deviceအျပင္ေနာက္ ohs တေခ်ာင္းကိုပါတြဲသုံးလို႔ရပါတယ္။\n" +
                "-bow ဆိုရင္ေတာ့ arrow,katana\n" +
                "-bowgunဆိုရင္ေတာ့ arrow,shield,magic device,knuckle,dagger ေတြနဲ႔တြဲသုံးလို႔ရပါတယ္။\n" +
                "-staff ကလဲ sub weapon အကုန္လုံးတပ္လို႔ရပါတယ္။\n" +
                "-knuckle ကေတာ့ shield,dagger,arrow,magic device ေတြတပ္လို႔ရပါတယ္\n" +
                "-halberd ကေတာ့ dagger နဲ႔ arrow တပ္လို႔ရပါတယ္။\n" +
                "-katana ကေတာ့ dagger တခုပဲတပ္လို႔ရပါတယ္။\n" +
                "\n" +
                "sub weapon ေတြတပ္ရင္ရတဲ့ side effect ေတြကေတာ့\n" +
                "\n" +
                "1.shield ဆိုရင္ေတာ့ aspd 50% ေလ်ာ့ပါတယ္။\n" +
                "2.dagger ကေတာ့ side effect မရွိပါဘူး။\n" +
                "3.arrow ကေတာ့ def 25% ေလ်ာ့ပါတယ္။\n" +
                "4.knuckle ကေတာ့ matk 25% ေလ်ာ့ပါတယ္။\n" +
                "5.magic device ကေတာ့ atk 25% ေလ်ာ့ေပးပါတယ္။\n" +
                "6.one handed sword ေနာက္တေခ်ာင္းတပ္ရင္ေတာ့ hit 52%,crt rate 52% ေလ်ာ့ပါတယ္။(with level 1 dual sword mastery)\n" +
                " 7.katana ကေတာ့ side effect မရွိပါဘူး။");
    }

    void unicode()
    {
        txt1.setText("Toram မှာ main weapon တေအပြင်သူတို့နဲ့ တွဲသုံးလို့ရတဲ့ sub weapon တေရှိပါတယ်။\n" +
                "sub weapon တပ်လိုက်ရင် character ရဲ့ stat အချို့မှာside effect ဝင်တာတွေ့ရပါတယ်။\n" +
                "\n" +
                "Two handed sword,magic device ကလွဲလို့ကျန်တဲ့ main weapon တွေအကုန် sub weapon သုံးလို့ရပါတယ်။\n" +
                "\n" +
                "sub weapon တွေကတော့ shield,dagger,arrow,knuckle,magic deviceတွေဖြစ်ပါတယ်။\n" +
                "\n" +
                "- one handed sword ဆိုရင် shield,dagger,arrow,knuckle,magic deviceအပြင်နောက် ohs တချောင်းကိုပါတွဲသုံးလို့ရပါတယ်။\n" +
                "-bow ဆိုရင်တော့ arrow,katana\n" +
                "-bowgunဆိုရင်တော့ arrow,shield,magic device,knuckle,dagger တွေနဲ့တွဲသုံးလို့ရပါတယ်။\n" +
                "-staff ကလဲ sub weapon အကုန်လုံးတပ်လို့ရပါတယ်။\n" +
                "-knuckle ကတော့ shield,dagger,arrow,magic device တွေတပ်လို့ရပါတယ်\n" +
                "-halberd ကတော့ dagger နဲ့ arrow တပ်လို့ရပါတယ်။\n" +
                "-katana ကတော့ dagger တခုပဲတပ်လို့ရပါတယ်။\n" +
                "\n" +
                "sub weapon တွေတပ်ရင်ရတဲ့ side effect တွေကတော့\n" +
                "\n" +
                "1.shield ဆိုရင်တော့ aspd 50% လျော့ပါတယ်။\n" +
                "2.dagger ကတော့ side effect မရှိပါဘူး။\n" +
                "3.arrow ကတော့ def 25% လျော့ပါတယ်။\n" +
                "4.knuckle ကတော့ matk 25% လျော့ပါတယ်။\n" +
                "5.magic device ကတော့ atk 25% လျော့ပေးပါတယ်။\n" +
                "6.one handed sword နောက်တချောင်းတပ်ရင်တော့ hit 52%,crt rate 52% လျော့ပါတယ်။(with level 1 dual sword mastery)\n" +
                " 7.katana ကတော့ side effect မရှိပါဘူး။");
    }

}
