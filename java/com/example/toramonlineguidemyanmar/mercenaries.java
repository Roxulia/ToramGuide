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

public class mercenaries extends AppCompatActivity {

    InterstitialAd adsToram;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercenaries);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        txt1=(TextView)findViewById(R.id.txtmerc1);
        txt2=(TextView)findViewById(R.id.txtmerc2);
        txt3=(TextView)findViewById(R.id.txtmerc3);
        txt4=(TextView)findViewById(R.id.txtmerc4);
        txt5=(TextView)findViewById(R.id.txtmerc5);
        txt6=(TextView)findViewById(R.id.txtmerc6);
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
        txt1.setText("mercenary ဆိုတာ ေနာက္လိုက္ bot တေကာင္လိုမ်ိဳးပဲသူကကိုယ္ခ်မွလိုက္ခ်တာ:3 spell ေတလဲမသုံးပါဘူး ဒီတိုင္းလိုက္ခ်တာပါ\n" +
                " mercenary ႏွစ္မ်ိဳးရွိပါတယ္ attacker နဲ႔ defender ဆိုပီးရွိပါတယ္ \n" +
                "\n" +
                "attacker ကေတာ့ DMG output မ်ားပါတယ္ မူလ character ရဲ႕ atk power ၂ ဆ ရွိပါတယ္ def ေတhp ေတက်န္တာေတကေတာ့ပုံမွန္အတိုင္းပါပဲ\n" +
                "defender ကေတာ့ ခံႏိုင္ရည္မ်ားတဲ့အေကာင္ပါ မူလ character ရဲ႕ HP ၂ဆရွိပါတယ္ def လဲ lvl အလိုက္တိုးေပးပါတယ္  aggro 100 per hit ထြက္ပါတယ္ \n" +
                "\n" +
                "သူမ်ားရဲ႕ mercenary ကိုေခၚလို႔ရသလို ကိုယ့္ထဲက character တခုကိုလဲ mercenary အေနနဲ႔ register လုပ္လို႔ရပါတယ္ \n" +
                "\n" +
                "mercenary ေခၚမယ္ဆိုရင္ေတာ့\n" +
                "menu ထဲကေန community ထဲကိုဝင္ရမာပါ");
        txt2.setText("community ထဲက ဒီသုံးခူလုံးကေန ေခၚလို႔ရပါတယ္ အေပၚတခုကကိုယ္နဲ႔ lvlတူပဲထြက္တာပါ Spina လဲေပးရပါတယ္\n" +
                "register လုပ္ရင္လဲ Party ထဲကေနလုပ္ရတာပါ");
        txt3.setText("ပထမတခုက register  လုပ္တာပါ:3\n" +
                "ေခၚရင္ေတာ့ ဒုတိယတခုမာေခၚရမာပါ");
        txt4.setText("Friend ထဲမာဆိုရင္ေတာ့ ကိုယ့္ထဲက friend ေတထဲက mercenaries ေတထဲကႀကိဳက္တာေခၚလို႔ရပါတယ္");
        txt5.setText("Guild ထဲကေနေခၚရင္လဲ အေပၚကလိုပါပဲ:3");
        txt6.setText("mercenariesဆိုတဲ့ထဲဝင္လိုက္ရင္ ဒါမ်ိဳးေတထြက္လာမာပါ ပုံကေတာ့နမူနာပါ အ့ထဲကေနႀကိဳက္တဲ့ နာမည္ကိုနိပ္ပီးေခၚလို႔ရပါပီ");
    }

    void unicode()
    {
        txt1.setText("mercenary ဆိုတာ နောက်လိုက် bot တကောင်လိုမျိုးပဲသူကကိုယ်ချမှလိုက်ချတာ:3 spell တေလဲမသုံးပါဘူး ဒီတိုင်းလိုက်ချတာပါ \n"+" mercenary နှစ်မျိုးရှိပါတယ် attacker နဲ့ defender ဆိုပီးရှိပါတယ်  \n\n"+" 1. attacker ကတော့ DMG output များပါတယ် မူလ character ရဲ့ atk power ၂ ဆ ရှိပါတယ် def တေhp တေကျန်တာတေကတော့ပုံမှန်အတိုင်းပါပဲ\n\n"+"2. defender ကတော့ ခံနိုင်ရည်များတဲ့အကောင်ပါ မူလ character ရဲ့ HP ၂ဆရှိပါတယ် def လဲ lvl အလိုက်တိုးပေးပါတယ်  aggro 100 per hit ထွက်ပါတယ်   \n\n"+"သူများရဲ့ mercenary ကိုခေါ်လို့ရသလို ကိုယ့်ထဲက character တခုကိုလဲ mercenary အနေနဲ့ register လုပ်လို့ရပါတယ်   mercenary \n"+"ခေါ်မယ်ဆိုရင်တော့ menu ထဲကနေ community ထဲကိုဝင်ရမာပါ");
        txt2.setText("community ထဲက ဒီသုံးခူလုံးကနေ ခေါ်လို့ရပါတယ် အပေါ်တခုကကိုယ်နဲ့ lvlတူပဲထွက်တာပါ Spina လဲပေးရပါတယ် register လုပ်ရင်လဲ Party ထဲကနေလုပ်ရတာပါ");
        txt3.setText("ပထမတခုက register  လုပ်တာပါ:3 ခေါ်ရင်တော့ ဒုတိယတခုမာခေါ်ရမာပါ");
        txt4.setText("Friend ထဲမာဆိုရင်တော့ ကိုယ့်ထဲက friend တေထဲက mercenaries တေထဲကကြိုက်တာခေါ်လို့ရပါတယ်");
        txt5.setText("Guild ထဲကနေခေါ်ရင်လဲ အပေါ်ကလိုပါပဲ:3");
        txt6.setText("mercenariesဆိုတဲ့ထဲဝင်လိုက်ရင် ဒါမျိုးတေထွက်လာမာပါ ပုံကတော့နမူနာပါ အ့ထဲကနေကြိုက်တဲ့ နာမည်ကိုနိပ်ပီးခေါ်လို့ရပါပီ");
    }
}
