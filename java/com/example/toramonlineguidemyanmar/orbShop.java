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

public class orbShop extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1,txt2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orb_shop);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtorb1);
        txt2=(TextView)findViewById(R.id.txtorb2);
        txt3=(TextView)findViewById(R.id.txtorb3);
        txt4=(TextView)findViewById(R.id.txtorb4);
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
        txt1.setText("orb shop ဆိုတာက orbေတနဲ႔ item ေတယ္လို႔ရတဲ့ေနရာပါ \n" +
                "orb ဆိုတာက purchase item ပါ အျပင္ပိုက္ဆံနဲ႔ဝယ္ဖည့္ရတဲ့ဟာပါ (ML က Diamond လိုေပါ့ )\n" +
                "orb ေတကိုတခ်ိဳ႕ event ေတကေနရႏိုင္ပါတယ္ orb နဲ႔ ဝယ္ရတဲ့ item တခ်ိဳ႕ကိုin game မွာ Spina မ်ားမ်ားနဲ႔ ေရာင္းလို႔ရပါတယ္ \n" +
                "avator ကေတာ့ ဝတ္စုံလိုမ်ိဳးပါ အလွဆင္တာမ်ိဳးပါ သူကလဲ orb နဲ႔ ဝယ္ရတဲ့ ဟာပါပဲ ဒါမဲ့ avator ticket နဲ႔လဲဝယ္လို႔ရပါတယ္ avator ticket ကိုေတာ့ in game\n" +
                "emblems ေတကေနရႏိုင္ပါတယ္  \n" +
                "\n" +
                "orb shop ထဲကိုဝင္ခ်င္ရင္ကေတာ့\n" +
                "menu ထဲကေန orb shop ကိုဝင္ရမာပါ");
        txt2.setText("-add orb ကေတာ့ orb ဝယ္တာတို႔ orb shard ကေန orb ေျပာင္းတာတို႔ ticket pieces ေတကေန avator ticket ေျပာင္းတာတို႔ကိုလုပ္တဲ့ေနရာပါ \n" +
                "-orb shop / treasure chest ထဲမွာက orb item ေတဝယ္ရတာပါ\n" +
                "avator ဝယ္ရင္လဲအ့ထဲကပဲဝယ္ရတာပါ");
        txt3.setText("avator chest ထဲဝင္ပီး ႀကိဳက္တဲ့ avator ကိုဝယ္ေဖာက္လို႔ရပါတယ္:3 တကယ္လို႔ မႀကိဳက္ရင္ေတာ့ recycle လုပ္ပီး item ေကာင္းေကာင္းေလးေတကံဆန္းလို႔ရပါတယ္ recycle လုပ္ရင္ ေတာ့equipment ထဲက avator ထဲကိုသြားပါ မႀကိဳက္တဲ့ဟာကိုေထာက္ လိုက္ပီးလုပ္ရင္ရပါပီ");
        txt4.setText("avator ေတကိုrecycle လုပ္လို႔ရတဲ့ item ေတက Spina မ်ားမ်ားနဲ႔ေရာင္းလို႔ရတာေတပါလို႔ newbie ေတအတြက္ Spina ရလြယ္ပါတယ္\n" +
                "\n" +
                "\n" +
                "orb item ေတထဲက \n" +
                "1.piecer(slotထပ္ေဖာက္တဲ့ဟာ) ေတ\n" +
                "2.extraction crystal(crystal ျဖဳတ္တဲ့ဟာ) ေတ\n" +
                "3.drop rate gem(boss ရဲ႕ rare item ေတက်ေစတဲ့ဟာ )လဲေစ်းေကာင္းပါတယ္ \n" +
                "\n" +
                "ဒါေၾကာင့္မို႔ orb ေတရလာရင္ \"1st piecer pack\",\"item chest\",\"extraction crystal\",\"gem lottery\" ေတဝယ္ေဖာက္ပါ avator ကိုေတာ့ticket နဲ႔ပဲဝယ္ေစခ်င္ပါတယ္");
    }

    void unicode()
    {
        txt1.setText("orb shop ဆိုတာက orbတေနဲ့ item တေယ်လို့ရတဲ့နေရာပါ  \norb ဆိုတာက purchase item ပါ အပြင်ပိုက်ဆံနဲ့ဝယ်ဖည့်ရတဲ့ဟာပါ (ML က Diamond လိုပေါ့ ) \norb တေကိုတချို့ event တေကနေရနိုင်ပါတယ် \norb နဲ့ ဝယ်ရတဲ့ item တချို့ကိုin game မှာ Spina များများနဲ့ ရောင်းလို့ရပါတယ်  \navator ကတော့ ဝတ်စုံလိုမျိုးပါ အလှဆင်တာမျိုးပါ သူကလဲ orb နဲ့ ဝယ်ရတဲ့ ဟာပါပဲ ဒါမဲ့ avator ticket နဲ့လဲဝယ်လို့ရပါတယ် \navator ticket ကိုတော့ in game emblems တေကနေရနိုင်ပါတယ်   \n\n\n orb shop ထဲကိုဝင်ချင်ရင်ကတော့ menu ထဲကနေ orb shop ကိုဝင်ရမာပါ");
        txt2.setText("-add orb ကတော့ orb ဝယ်တာတို့ orb shard ကနေ orb ပြောင်းတာတို့ ticket pieces တေကနေ avator ticket ပြောင်းတာတို့ကိုလုပ်တဲ့နေရာပါ  \n-orb shop / treasure chest ထဲမှာက orb item တေဝယ်ရတာပါ avator ဝယ်ရင်လဲအ့ထဲကပဲဝယ်ရတာပါ");
        txt3.setText("avator chest ထဲဝင်ပီး ကြိုက်တဲ့ avator ကိုဝယ်ဖောက်လို့ရပါတယ်:3 တကယ်လို့ မကြိုက်ရင်တော့ recycle လုပ်ပီး item ကောင်းကောင်းလေးတေကံဆန်းလို့ရပါတယ် recycle လုပ်ရင် တော့equipment ထဲက avator ထဲကိုသွားပါ မကြိုက်တဲ့ဟာကိုထောက် လိုက်ပီးလုပ်ရင်ရပါပီ");
        txt4.setText("avator တေကိုrecycle လုပ်လို့ရတဲ့ item တေက Spina များများနဲ့ရောင်းလို့ရတာတေပါလို့ newbie တေအတွက် Spina ရလွယ်ပါတယ်   \n\n\norb item တေထဲက  \n1.piecer(slotထပ်ဖောက်တဲ့ဟာ) တေ \n2.extraction crystal(crystal ဖြုတ်တဲ့ဟာ) တေ \n3.drop rate gem(boss ရဲ့ rare item တေကျစေတဲ့ဟာ )လဲစျေးကောင်းပါတယ်   \n\n\nဒါကြောင့်မို့ orb တေရလာရင် \"1st piecer pack\",\"item chest\",\"extraction crystal\",\"gem lottery\" တေဝယ်ဖောက်ပါ avator ကိုတော့ticket နဲ့ပဲဝယ်စေချင်ပါတယ်");
    }
}
