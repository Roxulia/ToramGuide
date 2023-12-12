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

public class cbSystem extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1,txt2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb_system);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtCb1);
        txt2=(TextView)findViewById(R.id.txtCb2);
        txt3=(TextView)findViewById(R.id.txtCb3);
        txt4=(TextView)findViewById(R.id.txtCb4);
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
        txt1.setText("consignment board ဆိုတာက toramထဲကplayerေတအခ်င္းခ်င္းitem ေတေရာင္းၾကဝယ္ၾကတဲ့ေနရာေပါ့\n" +
                "အြန္လိုင္းေရွာ့ပင္းပုံစံေပါ့ဝယ္တဲ့သူက Spina ေပးလိုက္တာနဲ႔ item ခ်က္ခ်င္းေရာက္တာမ်ိဳး ေရာင္းတဲ့သူစီကို Spina ေရာက္တာမ်ိဳးေပါ့  bank မာသြားထုတ္တလိုမ်ိဳး consignment board မာ Spina ျပန္ထုတ္ရတာေပါ့");
        txt2.setText("ဒါကေတာ့ဝင္ဝင္ခ်င္းမာေတြ႕ရတဲ့ပုံပါ\n" +
                "\n" +
                "1 ကေတာ့ ကိုယ္ေရာင္းခ်င္တဲ့ itemကို ေရာင္းလို႔ရတဲ့ေနရာပါ ပထမဆုံး ေရာင္းမဲ့ item ကိုေ႐ြးပီးရင္ ေရာင္းေစ်းသတ္မွတ္ရပါတယ္ consignment board ကအခြန္ 10% ေကာက္ပါတယ္\n" +
                "ေရာင္းလို႔ရတဲ့spina ကိုလဲ ဒီမာပဲျပန္ထုတ္ရတာပါ\n" +
                "2. ဒါကေတာ့ ဝယ္မဲ့သူေတအတြက္ပါ consignment board မာတင္ထားတဲ့ item ေတအကုန္လုံးကို ၾကည့္လို႔ရပါတယ္ ရွာပီးလဲဝယ္လို႔ရပါတယ္");
        txt3.setText("ဒီပုံကေတာ့ ဝယ္မဲ့သူအတြက္ item ေတရွာလို႔ရတဲ့ေနရာပါ\n" +
                "\n" +
                "1 . ကေတာ့ category ပါ အမ်ိဳးအစား အလိုက္ရွာတာပါ အ့ မာတခုေ႐ြးပီး search ကိုနိပ္ရင္ ေ႐ြးထားတဲ့အမ်ိဳးအစားနဲ႔ပတ္သက္ပီးထြက္လာမာပါ\n" +
                "2. sort by register time ပါတင္ထားတဲ့အခ်ိန္နဲ႔စီထားတာပါ\n" +
                "3. sort by price ေစ်းနည္းတာကေနစီထားတာပါ ကိုယ္ေရာင္းမဲ့ item ရဲ႕ေစ်းကိုလဲၾကည့္လို႔ရပါတယ္\n" +
                "4.item name ထည့္ပီးရွာတာပါ (everyone knows)\n" +
                "5.ရွာတာေပါ့:3ရွာတဲ့ေနရာမာ သုံးမ်ိဳးရွိတယ္ ႐ိုး႐ိုး default ဟာရယ္ all user ရယ္ guild only ရယ္ပါ");
        txt4.setText("ဒါကေတာ့ေအာက္ကို scroll လုပ္လိုက္တာပါ ဒီမာက filter ေတပါပါတယ္ equipment မာ slot ပါတာရွာခ်င္တာလား dye ပါတာရွာခ်င္တာလား ကိုယ္အေပၚက search barမာေရးခဲ့တဲ့ နာမည္နဲ႔ ဆိုင္တဲ့ item အစစ္ကိုလား ဒါမွမဟုတ္ appearance ကိုပဲရွာခ်င္တာလား သတ္မွတ္လို႔ရပါတယ္");
    }
    void unicode()
    {
        txt1.setText("consignment board ဆိုတာက toramထဲကplayerတေအချင်းချင်းitem တေရောင်းကြဝယ်ကြတဲ့နေရာပေါ့ အွန်လိုင်းရှော့ပင်းပုံစံပေါ့ဝယ်တဲ့သူက Spina ပေးလိုက်တာနဲ့ item ချက်ချင်းရောက်တာမျိုး ရောင်းတဲ့သူစီကို Spina \u200Eရောက်တာမျိုးပေါ့  bank မာသွားထုတ်တလိုမျိုး consignment board မာ Spina ပြန်ထုတ်ရတာပေါ့");
        txt2.setText("ဒါကတော့ဝင်ဝင်ချင်းမာတွေ့ရတဲ့ပုံပါ \\n 1 ကတော့ ကိုယ်ရောင်းချင်တဲ့ itemကို ရောင်းလို့ရတဲ့နေရာပါ ပထမဆုံး ရောင်းမဲ့ item ကိုရွေးပီးရင် ရောင်းစျေးသတ်မှတ်ရပါတယ် consignment board ကအခွန် 10% ကောက်ပါတယ် ရောင်းလို့ရတဲ့spina ကိုလဲ ဒီမာပဲပြန်ထုတ်ရတာပါ \\n2. ဒါကတော့ ဝယ်မဲ့သူတေအတွက်ပါ consignment board မာတင်ထားတဲ့ item တေအကုန်လုံးကို ကြည့်လို့ရပါတယ် ရှာပီးလဲဝယ်လို့ရပါတယ်");
        txt3.setText("ဒီပုံကတော့ ဝယ်မဲ့သူအတွက် item တေရှာလို့ရတဲ့နေရာပါ \n\n 1 . ကတော့ category ပါ အမျိုးအစား အလိုက်ရှာတာပါ အ့ မာတခုရွေးပီး search ကိုနိပ်ရင် ရွေးထားတဲ့အမျိုးအစားနဲ့ပတ်သက်ပီးထွက်လာမာပါ \n2. sort by register time ပါတင်ထားတဲ့အချိန်နဲ့စီထားတာပါ \n3. sort by price စျေးနည်းတာကနေစီထားတာပါ ကိုယ်ရောင်းမဲ့ item ရဲ့စျေးကိုလဲကြည့်လို့ရပါတယ် \n4.item name ထည့်ပီးရှာတာပါ (everyone knows)\n 5.ရှာတာပေါ့:3ရှာတဲ့နေရာမာ သုံးမျိုးရှိတယ် ရိုးရိုး default ဟာရယ် all user ရယ် guild only ရယ်ပါ");
        txt4.setText("ဒါကတော့အောက်ကို scroll လုပ်လိုက်တာပါ ဒီမာက filter တေပါပါတယ် equipment မာ slot ပါတာရှာချင်တာလား dye ပါတာရှာချင်တာလား ကိုယ်အပေါ်က search barမာရေးခဲ့တဲ့ နာမည်နဲ့ ဆိုင်တဲ့ item အစစ်ကိုလား ဒါမှမဟုတ် appearance ကိုပဲရှာချင်တာလား သတ်မှတ်လို့ရပါတယ်");
    }
}
