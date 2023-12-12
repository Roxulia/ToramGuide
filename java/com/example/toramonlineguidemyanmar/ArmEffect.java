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

public class ArmEffect extends AppCompatActivity {

    TextView txt1;
    InterstitialAd adsToram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_effect);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        txt1=findViewById(R.id.txtarm1);
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
        txt1.setText("armor effect ဆိုတာ character stat ေတြျဖစ္တဲ့ str,int,vit,agi,dexေတြကေနရတဲ့ effect ေတကို သက္ေရာက္ေနတဲ့အရာပါ။def မ်ားပီးtank လိုေဆာ့ခ်င္တဲ့သူပဲျဖစ္ျဖစ္ flee ေတြမ်ားပီး dodge မ်ားမ်ားနဲ႔ ေဆာ့ခ်င္တဲ့သူပဲျဖစ္ျဖစ္အသုံးဝင္တဲ့အရာပါ။ \n" +
                "\n" +
                "armor effect ေတကေန သက္ေရာက္မႈရွိတဲ့ stat ေတကေတာ့\n" +
                "1.aspd \n" +
                "2.def/mdef \n" +
                "3.flee ေတပဲျဖစ္ပါတယ္။(တျခား hidden stat ေတလဲeffect ျဖစ္တာေတရွိပါတယ္)\n" +
                "\n" +
                "1.aspd effect\n" +
                "armor မရွိတာကေတာ့ aspd ကို effect မျဖစ္ပါဘူး။(same as normal armor)\n" +
                "normal armor ဆိုရင္ေတာ့ မူရင္းနဲ႔ stat ကရမဲ့aspd ကို constant (1) နဲ႔ေျမႇာက္ရပါတယ္။\n" +
                "light armor ဆိုရင္ေတာ့ constant (1.5) နဲ႔ေျမႇာက္ရပါတယ္။\n" +
                "heavy armor ဆိုရင္ေတာ့ constant(0.5) နဲ႔ေျမႇာက္ရပါမယ္။(2 နဲ႔စားလဲရပါတယ္)\n" +
                "\n" +
                "2.def/mdef effect\n" +
                "no armor ဆိုရင္ေတာ့ stat ကရမဲ့def ကို constant (0.1) နဲ႔ေျမႇာက္ရမာပါ။\n" +
                "normal armor ဆိုရင္ေတာ့ 1 နဲ႔ေျမႇာက္ရမာပါ။\n" +
                "light armor ဆိုရင္ေတာ့ 0.75 နဲ႔ပါ။\n" +
                "heavy armor ကေတာ့ 2 နဲ႔ေျမႇာက္ရမာပါ။ \n" +
                "\n" +
                "3. flee (dodge) effect\n" +
                "no armor ဆိုရင္ေတာ့ stat ကရမဲ့ flee ကို 2 နဲ႔ေျမႇာက္ရမာပါ။ဒါအျပင္ original flee ကိုလဲ 75 ေပါင္းေပးပါတယ္။\n" +
                "normal armor ဆိုရင္ေတာ့ထုံစံအတိုင္း 1 နဲ႔ေျမႇာက္ေပးရမာပါ။\n" +
                "light armor ဆိုရင္ေတာ့ 1.75 နဲ႔ေျမႇာက္ေပးရမာပါ။ original flee ကိုလဲ 30 ေပါင္းေပးပါတယ္။\n" +
                "heavy armor ဆိုရင္ေတာ့ 0.75 နဲ႔ေျမႇာက္ရမာပါ။original flee ကို 15 ႏုတ္ေပးမွာပါ။\n" +
                "\n" +
                "armor effect ေတကို class review ထဲက stat effect ေတထဲမွာထည့္ထားပါတယ္။ကိုယ္ရမဲ့ stat ကိုအ့မွာၾကည့္လို႔ရပါတယ္။");
    }

    void unicode()
    {
        txt1.setText("armor effect ဆိုတာ character stat တွေဖြစ်တဲ့ str,int,vit,agi,dexတွေကနေရတဲ့ effect တေကို သက်ရောက်နေတဲ့အရာပါ။def များပီးtank လိုဆော့ချင်တဲ့သူပဲဖြစ်ဖြစ် flee တွေများပီး dodge များများနဲ့ ဆော့ချင်တဲ့သူပဲဖြစ်ဖြစ်အသုံးဝင်တဲ့အရာပါ။ \n" +
                "\n" +
                "armor effect တေကနေ သက်ရောက်မှုရှိတဲ့ stat တေကတော့\n" +
                "1.aspd \n" +
                "2.def/mdef \n" +
                "3.flee တေပဲဖြစ်ပါတယ်။(တခြား hidden stat တေလဲeffect ဖြစ်တာတေရှိပါတယ်)\n" +
                "\n" +
                "1.aspd effect\n" +
                "armor မရှိတာကတော့ aspd ကို effect မဖြစ်ပါဘူး။(same as normal armor)\n" +
                "normal armor ဆိုရင်တော့ မူရင်းနဲ့ stat ကရမဲ့aspd ကို constant (1) နဲ့မြှောက်ရပါတယ်။\n" +
                "light armor ဆိုရင်တော့ constant (1.5) နဲ့မြှောက်ရပါတယ်။\n" +
                "heavy armor ဆိုရင်တော့ constant(0.5) နဲ့မြှောက်ရပါမယ်။(2 နဲ့စားလဲရပါတယ်)\n" +
                "\n" +
                "2.def/mdef effect\n" +
                "no armor ဆိုရင်တော့ stat ကရမဲ့def ကို constant (0.1) နဲ့မြှောက်ရမာပါ။\n" +
                "normal armor ဆိုရင်တော့ 1 နဲ့မြှောက်ရမာပါ။\n" +
                "light armor ဆိုရင်တော့ 0.75 နဲ့ပါ။\n" +
                "heavy armor ကတော့ 2 နဲ့မြှောက်ရမာပါ။ \n" +
                "\n" +
                "3. flee (dodge) effect\n" +
                "no armor ဆိုရင်တော့ stat ကရမဲ့ flee ကို 2 နဲ့မြှောက်ရမာပါ။ဒါအပြင် original flee ကိုလဲ 75 ပေါင်းပေးပါတယ်။\n" +
                "normal armor ဆိုရင်တော့ထုံစံအတိုင်း 1 နဲ့မြှောက်ပေးရမာပါ။\n" +
                "light armor ဆိုရင်တော့ 1.75 နဲ့မြှောက်ပေးရမာပါ။ original flee ကိုလဲ 30 ပေါင်းပေးပါတယ်။\n" +
                "heavy armor ဆိုရင်တော့ 0.75 နဲ့မြှောက်ရမာပါ။original flee ကို 15 နုတ်ပေးမှာပါ။\n" +
                "\n" +
                "armor effect တေကို class review ထဲက stat effect တေထဲမှာထည့်ထားပါတယ်။ကိုယ်ရမဲ့ stat ကိုအ့မှာကြည့်လို့ရပါတယ်။");
    }
}
