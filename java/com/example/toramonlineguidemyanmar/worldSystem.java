package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AppCompatActivity;

import  java.util.*;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class worldSystem extends AppCompatActivity {

    InterstitialAd adsToram;
    Random r;
    TextView txt1,txt2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_system);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtWch1);
        txt2=(TextView)findViewById(R.id.txtWch2);
        txt3=(TextView)findViewById(R.id.txtWch3);
        txt4=(TextView)findViewById(R.id.txtWch4);
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
        r=new Random();
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

    void unicode()
    {
        txt1.setText("Toramထဲမာက server တေအများကြီးခွဲထားပါတယ် server ကို server ဆိုပီးမပြဘဲ world လို့ပဲပြလေ့ရှိပါတယ် ပုံမှန် မြန်မာနိုင်ငံ မာ ဒေါင်းတဲ့ app မာဆိုရင် world ၅ခုပါပါတယ် Global World 1,International 1,2,3 နဲ့ Eng world ဆိုပီးရှိပါတယ် \n\n  "+"world ထဲမာမှ ကိုယ်ရောက်နေတဲ့နေရာကလူများတာနဲတာပေါ်မူတည်ပီး channel တေခွဲပါတယ်  channel ကိုတော့screan ရဲ့ဘယ်ဘက်ထောင့်မာကြည့်လို့ရပါတယ်");
        txt2.setText("world မတူတာဘဲဖြစ်ဖြစ် channel မတူတာပဲဖြစ်ဖြစ် အကြောင်းတခုခုကြောင့် ကိုယ်နဲ့ချိန်းထားတဲ့သူတေနဲ့မတွေ့တာတေဖြစ်တတ်ပါတယ် world or channel ဘလိုပြောင်းရလဲဆိုတော့ ပထမဆုံး menu ထဲကိုဝင်ပါ ပီးရငိ terminal ကိုဝင်လိုက်ရင် အောက်ပါပုံထွက်လာပါမယ်");
        txt3.setText("အ့ထဲမှ switch channel ထဲကိုဝင်ပီးပြောင်းလို့ရပါပီ");
        txt4.setText("အ့အနောက်မာပါတဲ့အတန်းလေးတေက လူများလားနည်းလားကိုပြတာပါ  \n"+"ပုံမှန်အားဖြင့် \n"+"Int 1 က Lvling နဲ့ business အတွက်လူတေသပ်သပ်စုလေ့ရှိပါတယ် \n"+"Int 2 ,3 နဲ့ Eng ကတော့ပုံမှန် friend တေနဲ့ ဆော့တာတေပဲများတော့ လူသိပ်မရှိပါဘူး \n"+"newbie တေစစထွက်ရင် Eng world ကပဲစပါတယ်");
    }
    void zawgyi()
    {
        txt1.setText("Toramထဲမာက server ေတအမ်ားႀကီးခြဲထားပါတယ္ server ကို server ဆိုပီးမျပဘဲ world လို႔ပဲျပေလ့ရွိပါတယ္ ပုံမွန္ ျမန္မာႏိုင္ငံ မာ ေဒါင္းတဲ့ app မာဆိုရင္ world ၅ခုပါပါတယ္\n" +
                "Global World 1,International 1,2,3 နဲ႔ Eng world ဆိုပီးရွိပါတယ္ \n" +
                "\n" +
                "world ထဲမာမွ ကိုယ္ေရာက္ေနတဲ့ေနရာကလူမ်ားတာနဲတာေပၚမူတည္ပီး channel ေတခြဲပါတယ္  channel ကိုေတာ့screan ရဲ႕ဘယ္ဘက္ေထာင့္မာၾကည့္လို႔ရပါတယ္");
        txt2.setText("world မတူတာဘဲျဖစ္ျဖစ္ channel မတူတာပဲျဖစ္ျဖစ္ အေၾကာင္းတခုခုေၾကာင့္ ကိုယ္နဲ႔ခ်ိန္းထားတဲ့သူေတနဲ႔မေတြ႕တာေတျဖစ္တတ္ပါတယ္\n" +
                "world or channel ဘလိုေျပာင္းရလဲဆိုေတာ့ ပထမဆုံး menu ထဲကိုဝင္ပါ ပီးရငိ terminal ကိုဝင္လိုက္ရင္ ေအာက္ပါပုံထြက္လာပါမယ္");
        txt3.setText("အ့ထဲမွ switch channel ထဲကိုဝင္ပီးေျပာင္းလို႔ရပါပီ");
        txt4.setText("အ့အေနာက္မာပါတဲ့အတန္းေလးေတက လူမ်ားလားနည္းလားကိုျပတာပါ\n" +
                "\n" +
                "ပုံမွန္အားျဖင့္\n" +
                "Int 1 က Lvling နဲ႔ business အတြက္လူေတသပ္သပ္စုေလ့ရွိပါတယ္\n" +
                "Int 2 ,3 နဲ႔ Eng ကေတာ့ပုံမွန္ friend ေတနဲ႔ ေဆာ့တာေတပဲမ်ားေတာ့ လူသိပ္မရွိပါဘူး\n" +
                "newbie ေတစစထြက္ရင္ Eng world ကပဲစပါတယ္");
    }
}
