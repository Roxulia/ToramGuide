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

public class Dungeon extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dungeon);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtDG1);
        txt2=(TextView)findViewById(R.id.txtDG2);
        txt3=(TextView)findViewById(R.id.txtDG3);
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
        txt1.setText("Dungeon ဆိုတာ Mini Game ပုံစံ ျဖစ္ၿပီး \n" +
                "Level အလိုက္ အဆင့္ေတြ ခြဲ ထားၿပီး အခ်ိန္နဲ႔ ေဆာ့ရတာပါ။ \n" +
                "Game ပုံစံက Crystal ေလးေတြကို Solo/Partyနဲ႔\n" +
                "Monster ေတြ ထံ မွ ကာကြယ္ရမွာ ျဖစ္ပါတယ္။\n" +
                "mercenaries ေတနဲ႔ pet ေတေခၚလို႔မရပါဘူး");
        txt2.setText("Exp နဲ႔ Tickets ေတြကို ပါ ကိုယ္ခ်တဲ့ lvl(difficulty) အေပၚမူတည္ပီး  Rewardအျဖစ္ရႏိုင္ၿပီး\n" +
                "အျမန္ဆုံး ႏိုင္ေအာင္ ရွင္းႏိုင္တယ့္သူေတြရဲ႕ နာမည္ကို \n" +
                "1st 2nd 3rd ဆိုၿပီး အပတ္စဥ္ ေဖာ္ျပထားတယ့္\n" +
                "Title System ပါ ပါေသးတယ္");
        txt3.setText("Dungeonေတြကို Main Quest Chapter 1\n" +
                "ၿပီးတာ နဲ႔ စေဆာ့လို႔ရပါၿပီ။\n" +
                "Dungeon ကိုေဆာ့မယ္ဆိုရင္ေတာ့ sofya city က gate နားက guard တေကာင္စီမာ စကားေျပာပီး challenge dungeonကိုနိပ္ရင္ရပါပီ");
    }

    void unicode()
    {
        txt1.setText("Dungeon ဆိုတာ Mini Game ပုံစံ ဖြစ်ပြီး  Level အလိုက် အဆင့်တွေ ခွဲ ထားပြီး အချိန်နဲ့ ဆော့ရတာပါ။  \nGame ပုံစံက Crystal လေးတွေကို Solo/Partyနဲ့ Monster တွေ ထံ မှ ကာကွယ်ရမှာ ဖြစ်ပါတယ်။ \nmercenaries တေနဲ့ pet တေခေါ်လို့မရပါဘူး");
        txt2.setText("Exp နဲ့ Tickets တွေကို ပါ ကိုယ်ချတဲ့ lvl(difficulty) အပေါ်မူတည်ပီး  Rewardအဖြစ်ရနိုင်ပြီး အမြန်ဆုံး နိုင်အောင် ရှင်းနိုင်တယ့်သူတွေရဲ့ နာမည်ကို  1st 2nd 3rd ဆိုပြီး အပတ်စဉ် ဖော်ပြထားတယ့် Title System ပါ ပါသေးတယ်");
        txt3.setText("Dungeonတွေကို Main Quest Chapter 1 ပြီးတာ နဲ့ စဆော့လို့ရပါပြီ။ Dungeon ကိုဆော့မယ်ဆိုရင်တော့ sofya city က gate နားက guard တကောင်စီမာ စကားပြောပီး challenge dungeonကိုနိပ်ရင်ရပါပီ");
    }
}
