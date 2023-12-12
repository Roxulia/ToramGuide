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

public class Lvling extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvling);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtLvl1);
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
        Button btnchart=(Button)findViewById(R.id.btnchart);

        btnchart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Lvling.this,lvlingChart.class);
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
        txt.setText("Beginner Guide");
    }

    void zawgyi()
    {
        txt1.setText("ဒါကေတာ့ ရွင္းပါတယ္Character Levelတက္ေအာင္\n" +
                "လုပ္တာ ပါ။ Lvlingတယ့္ ေနရာမွာ ျမန္ျမန္နဲ႔ \n" +
                "Exp မ်ားမ်ား ရေအာင္ ဘယ္လိုလုပ္မလဲ ဆိုတာ\n" +
                "ရွင္းလင္း မွာပါ။\n" +
                "\n" +
                "Monster /Bossေတြကို သတ္ရင္ Expရတာ အားလုံး\n" +
                "သိၾကမွာပါ ထို Exp ရမွ Levelတက္မွာပါ \n" +
                "Bossေတြ ရဲ႕ Expဟာ Monsterေတြက ရတာထက္ ပို\n" +
                "မ်ားပါတယ္။ ဒါသိ႐ုံနဲ႔ Lvတက္ေအာင္ေတြ႕သမွ်ေကာင္\n" +
                "ပတ္ခုတ္ ေနလို႔ မရပါဘူး\n" +
                "\n" +
                "Toram မွာ Lvl Gapအလိုက္ Expရတာမတူပါဘူး\n" +
                "Difference Lv(ကိုယ့္ရဲ႕ Cha Lvနဲ႔ သတ္မယ့္Mob/\n" +
                "Bossရဲ႕ Lv) အလိုက္ Expပို ရသလို ေလ်ာ့ ရတာလဲ\n" +
                "ရွိပါတယ္။ပုံမွန္ အားျဖင့္ Lvကြာျခားမႈ 9\n" +
                "(ကိုယ္က နည္း သို႔မဟုတ္ ပိုမ်ား) ရင္ Expပို\n" +
                "တက္ ေစပါတယ္ ဒါေပမယ့္ Lvကြာျခားမႈ 4အတြင္းကိုပဲ\n" +
                "သတ္ဖို႔ အႀကံေပးပါတယ္။\n" +
                "\n" +
                "MAIN QUESTကို အရင္ ၿပီးေအာင္လုပ္ဖို႔ \n" +
                "Recommendေပးပါတယ္ ဘာလို႔လဲ ဆိုေတာ့ \n" +
                "MainQuestလုပ္ တာနဲ႔ လြယ္လြယ္ကူကူ Lvl120+\n" +
                "ကို ေရာက္ႏိုင္ပါတယ္\n\n\n");
    }

    void unicode()
    {
        txt1.setText("ဒါကတော့ ရှင်းပါတယ်Character Levelတက်အောင် လုပ်တာ ပါ။ Lvlingတယ့် နေရာမှာ မြန်မြန်နဲ့  Exp များများ ရအောင် ဘယ်လိုလုပ်မလဲ ဆိုတာ ရှင်းလင်း မှာပါ။  \n\nMonster /Bossတွေကို သတ်ရင် Expရတာ အားလုံး သိကြမှာပါ ထို Exp ရမှ Levelတက်မှာပါ  Bossတွေ ရဲ့ Expဟာ Monsterတွေက ရတာထက် ပို များပါတယ်။ ဒါသိရုံနဲ့ Lvတက်အောင်တွေ့သမျှကောင် ပတ်ခုတ် နေလို့ မရပါဘူး  \n\n\nToram မှာ Lvl Gapအလိုက် Expရတာမတူပါဘူး Difference Lv(ကိုယ့်ရဲ့ Cha Lvနဲ့ သတ်မယ့်Mob/ Bossရဲ့ Lv) အလိုက် Expပို ရသလို လျော့ ရတာလဲ ရှိပါတယ်။ပုံမှန် အားဖြင့် Lvကွာခြားမှု 9 (ကိုယ်က နည်း သို့မဟုတ် ပိုများ) ရင် Expပို တက် စေပါတယ် ဒါပေမယ့် Lvကွာခြားမှု 4အတွင်းကိုပဲ သတ်ဖို့ အကြံပေးပါတယ်။ \n\n MAIN QUESTကို အရင် ပြီးအောင်လုပ်ဖို့  Recommendပေးပါတယ် ဘာလို့လဲ ဆိုတော့  MainQuestလုပ် တာနဲ့ လွယ်လွယ်ကူကူ Lvl135+ ကို ရောက်နိုင်ပါတယ်  \n\n\n\n");
    }
}
