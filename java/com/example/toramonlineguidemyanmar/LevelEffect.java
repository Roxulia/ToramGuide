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

public class LevelEffect extends AppCompatActivity {

    TextView txt1;
    InterstitialAd adsToram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_effect);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        txt1=findViewById(R.id.txtlvleff1);
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
    }

    void zawgyi()
    {
        txt1.setText("level ကလဲ character development ပိုင္းမွာအေရးပါပါတယ္။ stat point ေတskill point ေတ ရတာအျပင္ အျခား character ရဲ႕ stat ေတအေပၚသက္ေရာက္ပါတယ္။ထို႔အျပင္ monster အေပၚထြက္တဲ့ DMG , ကိုယ့္ကိုထိတဲ့ DMG  ကလဲ lvl အေပၚအနဲငယ္မီခိုပါတယ္။\n" +
                "\n" +
                "character ရဲ႕ stat အကုန္လုံးဟာ lvl နဲ႔သက္ေရာက္မႈရွိပါတယ္။\n" +
                "e.g atk ,matk,aspd,cspd,hit,flee,etc\n" +
                "\n" +
                "effect သက္ေရာက္ပုံကလဲ ပုံစံခြဲလို႔ရပါတယ္ ကိုယ့္ lvl no အတိအက်အတိုင္းတိုးတဲ့ပုံရွိသလို multiplier ေတနဲ႔ေျမႇာက္ပီးတိုးတာလဲရွိပါတယ္။\n" +
                "\n" +
                "lvl အတိုင္းအတိအက်တိုးသြားတဲ့ stat ေတကေတာ့\n" +
                "atk,matk,aspd,cspd,hit,mp ေတျဖစ္ပါတယ္။\n" +
                "e.g atk ဆိုရင္ lvl 1 ခုတက္တိုင္း atk 1 ခုတိုးပါတယ္။က်န္တာေတလဲအ့ပုံစံပါပဲ။\n" +
                "\n" +
                "multiplier နဲ႔ေျမႇာက္ပီးမွတိုးတာေတကေတာ့\n" +
                "Max HP,def,mdef,flee ေတပဲျဖစ္ပါတယ္။\n" +
                "Max HP ကေတာ့ lvl * 0.33 တက္ပါတယ္။ေျမႇာက္လို႔ရလာတာကိုမွ vit point နဲ႔ထပ္ေျမႇာက္ပီး Max HP တြက္ေပးတာပါ။\n" +
                "Def,mdef ,fleeကေတာ့ armor နဲ႔ထပ္ဆိုင္သြားပါတယ္။\n" +
                "normal armor ဆိုရင္ေတာ့ atk တို႔လို lvl no နဲ႔ပဲတိုးပါတယ္။\n" +
                "\n" +
                "for def,mdef\n" +
                "light ဆိုရင္ေတာ့ lvl *0.8,\n" +
                "heavy ဆိုရင္ေတာ့ lvl * 1.2\n" +
                "no armor ဆိုရင္ေတာ့ lvl * 0.4 ပါ။သူကေတာ့ေျမႇာက္လို႔ရတာနဲ႔ stat ကရတဲ့ effect ရယ္ ,equip ကနဂိုရွိတာရယ္ကိုေပါင္းပီး def,mdef တြက္ေပးတာပါ။\n" +
                "\n" +
                "for flee\n" +
                "light armor ဆိုရင္ေတာ့ lvl * 1.25\n" +
                "heavy armor ဆိုရင္ေတာ့ lvl * 0.5\n" +
                "no armor ဆိုရင္ေတာ့ lvl * 1.5 နဲ႔ေျမႇာက္ေပးရပါတယ္။ေျမႇာက္လို႔ရတဲ့ဟာနဲ႔ stat ကေနရတာေတေပါင္းပီး flee တြက္ေပးတာပါ။");
    }

    void unicode()
    {
        txt1.setText("level ကလဲ character development ပိုင်းမှာအရေးပါပါတယ်။ stat point တေskill point တေ ရတာအပြင် အခြား character ရဲ့ stat တေအပေါ်သက်ရောက်ပါတယ်။ထို့အပြင် monster အပေါ်ထွက်တဲ့ DMG , ကိုယ့်ကိုထိတဲ့ DMG  ကလဲ lvl အပေါ်အနဲငယ်မီခိုပါတယ်။\n" +
                "\n" +
                "character ရဲ့ stat အကုန်လုံးဟာ lvl နဲ့သက်ရောက်မှုရှိပါတယ်။\n" +
                "e.g atk ,matk,aspd,cspd,hit,flee,etc\n" +
                "\n" +
                "effect သက်ရောက်ပုံကလဲ ပုံစံခွဲလို့ရပါတယ် ကိုယ့် lvl no အတိအကျအတိုင်းတိုးတဲ့ပုံရှိသလို multiplier တေနဲ့မြှောက်ပီးတိုးတာလဲရှိပါတယ်။\n" +
                "\n" +
                "lvl အတိုင်းအတိအကျတိုးသွားတဲ့ stat တေကတော့\n" +
                "atk,matk,aspd,cspd,hit,mp တေဖြစ်ပါတယ်။\n" +
                "e.g atk ဆိုရင် lvl 1 ခုတက်တိုင်း atk 1 ခုတိုးပါတယ်။ကျန်တာတေလဲအ့ပုံစံပါပဲ။\n" +
                "\n" +
                "multiplier နဲ့မြှောက်ပီးမှတိုးတာတေကတော့\n" +
                "Max HP,def,mdef,flee တေပဲဖြစ်ပါတယ်။\n" +
                "Max HP ကတော့ lvl * 0.33 တက်ပါတယ်။မြှောက်လို့ရလာတာကိုမှ vit point နဲ့ထပ်မြှောက်ပီး Max HP တွက်ပေးတာပါ။\n" +
                "Def,mdef ,fleeကတော့ armor နဲ့ထပ်ဆိုင်သွားပါတယ်။\n" +
                "normal armor ဆိုရင်တော့ atk တို့လို lvl no နဲ့ပဲတိုးပါတယ်။\n" +
                "\n" +
                "for def,mdef\n" +
                "light ဆိုရင်တော့ lvl *0.8,\n" +
                "heavy ဆိုရင်တော့ lvl * 1.2\n" +
                "no armor ဆိုရင်တော့ lvl * 0.4 ပါ။သူကတော့မြှောက်လို့ရတာနဲ့ stat ကရတဲ့ effect ရယ် ,equip ကနဂိုရှိတာရယ်ကိုပေါင်းပီး def,mdef တွက်ပေးတာပါ။\n" +
                "\n" +
                "for flee\n" +
                "light armor ဆိုရင်တော့ lvl * 1.25\n" +
                "heavy armor ဆိုရင်တော့ lvl * 0.5\n" +
                "no armor ဆိုရင်တော့ lvl * 1.5 နဲ့မြှောက်ပေးရပါတယ်။မြှောက်လို့ရတဲ့ဟာနဲ့ stat ကနေရတာတေပေါင်းပီး flee တွက်ပေးတာပါ။");
    }

}
