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

public class Gems extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1,txt2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gems);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtGem1);
        txt2=(TextView)findViewById(R.id.txtGem2);
        txt3=(TextView)findViewById(R.id.txtgem3);
        txt4=(TextView)findViewById(R.id.txtgem4);
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
        txt1.setText("Holy Gemေတြ က လူသုံးနဲ ပါတယ္ \n" +
                "Boss Battles ေတြ မွာ Support လုပ္ေပးတယ့္ \n" +
                "Gem ေတြ ျဖစ္ၿပီး Statအခ်ိဳ႕ကို Gemအလိုက္ Enchanted လုပ္ေပးတာပါ တစ္နည္းေျပာရရင္\n" +
                "Character ေတြကို ပို Strongေအာင္ လုပ္ေပးတာပါ \n" +
                "ဥပမာ AGILE Gemသုံးမယ္ ဆိုရင္ AGI Statဟာ\n" +
                "ပိုတက္ေစ မွာပါ။ ဒီ Effectဟာ တစ္ေယာက္သုံးတာနဲ႔ Party Memberေတြ\n" +
                "အကုန္လုံးကို ထိေရာက္ေစပါတယ္\n" +
                "အရမ္း OPျဖစ္တယ့္ Effectမဟုတ္တယ့္အတြက္ \n" +
                "လူသုံးနဲပါတယ္ မသုံးလဲ သိပ္မကြာပါဘူး ေျပာရမွာပါ\n" +
                "ထို Gemေတြနဲ႔ တူတယ့္ Drop Rateျမင့္ Gemေတြလည္း ရွိပါတယ္ ဒါေပမယ့္ သူတို႔က Supportေပးတာမဟုတ္ဘဲ Bossကို Enchant ေပးပါတယ္ \n" +
                "\n" +
                "Holy Gemေတြကို Resistle Merchant ေတြနဲ႔ \n" +
                "General Storesအခ်ိဳ႕မွာ ဝယ္လို႔ရပါတယ္ \n" +
                "ဒါကေတာ့resistle merchant ေတရဲ႕ shop item ေတပါ");
        txt2.setText("ဒါကေတာ့general store မွာရွိတဲ့ တခ်ိဳ႕ gem ေတပါ");
        txt3.setText("Resistle Merchant ေတြဟာ Sofyaနဲ႔ Figo's Manor တို႔\n" +
                "မွာ ရွိၿပီး ဝယ္လို႔ရပါတယ္");
        txt4.setText("ဒါကေတာ့sofya မာရွိတဲ့ resistle merchant ပါ:3");
    }

    void unicode()
    {
        txt1.setText("Holy Gemတွေ က လူသုံးနဲ ပါတယ်  Boss Battles တွေ မှာ Support လုပ်ပေးတယ့်  Gem တွေ ဖြစ်ပြီး Statအချို့ကို Gemအလိုက် Enchanted လုပ်ပေးတာပါ တစ်နည်းပြောရရင် Character တွေကို ပို Strongအောင် လုပ်ပေးတာပါ  \n\nဥပမာ AGILE Gemသုံးမယ် ဆိုရင် AGI Statဟာ ပိုတက်စေ မှာပါ။ ဒီ Effectဟာ တစ်ယောက်သုံးတာနဲ့ Party Memberတွေ အကုန်လုံးကို ထိရောက်စေပါတယ် အရမ်း OPဖြစ်တယ့် Effectမဟုတ်တယ့်အတွက်  လူသုံးနဲပါတယ် မသုံးလဲ သိပ်မကွာပါဘူး ပြောရမှာပါ \nထို Gemတွေနဲ့ တူတယ့် Drop Rateမြင့် Gemတွေလည်း ရှိပါတယ် ဒါပေမယ့် သူတို့က Supportပေးတာမဟုတ်ဘဲ Bossကို Enchant ပေးပါတယ်   \n\n\nHoly Gemတွေကို Resistle Merchant တွေနဲ့  General Storesအချို့မှာ ဝယ်လို့ရပါတယ်  \n\nဒါကတော့resistle merchant တေရဲ့ shop item တေပါ");
        txt2.setText("ဒါကတော့general store မှာရှိတဲ့ တချို့ gem တေပါ");
        txt3.setText("Resistle Merchant တွေဟာ Sofyaနဲ့ Figo's Manor တွေ မှာ ရှိပြီး  Gem ဝယ်လို့ရပါတယ်");
        txt4.setText("ဒါကတော့sofya မာရှိတဲ့ resistle merchant ပါ:3");
    }

}
