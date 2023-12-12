package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dwGnb extends Fragment {

    static TextView txt1;
    public dwGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.dw_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbDw);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်တွေကတော့ DMG output များပီး အကြိမ်ရေများများသုံးနိုင်တာကြောင့် battle ထဲမှာကြမ်းပါတယ်။aspd,flee,dodge,evade,invicible,parry,immortality တွေလဲပါတာမို့ battle ထဲမာ စောက်ရမ်းကြမ်းတဲ့ကောင်ဖြစ်တဲ့အပြင် boss တွေကိုလဲ solo ကြိတ်နိုင်တဲ့အထိကြမ်းပါတယ်။ampr လဲစိတ်ပူစရာမလိုပါဘူး။animation တွေလဲလှတဲ့အပြင် မြန်လဲမြန်ပါတယ်။\n" +
                "\n" +
                "အားနည်းချက်ကတော့ basic atk ချတာဟာ တခါချ လေးငါးချက်ဖြစ်နေတာကြောင့် နဲနဲကြာပါတယ်။ကြာတဲ့အတွက် boss ရဲ့ Aoe တေမိနိုင်ပါတယ်။mechanic တွေများတာရယ် budget build ဆိုတာရှားတာရယ်ကြောင့် newbie တွေအတွက်ခက်ခဲပါတယ်။");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ေတြကေတာ့ DMG output မ်ားပီး အႀကိမ္ေရမ်ားမ်ားသုံးႏိုင္တာေၾကာင့္ battle ထဲမွာၾကမ္းပါတယ္။aspd,flee,dodge,evade,invicible,parry,immortality ေတြလဲပါတာမို႔ battle ထဲမာ ေစာက္ရမ္းၾကမ္းတဲ့ေကာင္ျဖစ္တဲ့အျပင္ boss ေတြကိုလဲ solo ႀကိတ္ႏိုင္တဲ့အထိၾကမ္းပါတယ္။ampr လဲစိတ္ပူစရာမလိုပါဘူး။animation ေတြလဲလွတဲ့အျပင္ ျမန္လဲျမန္ပါတယ္။\n" +
                "\n" +
                "အားနည္းခ်က္ကေတာ့ basic atk ခ်တာဟာ တခါခ် ေလးငါးခ်က္ျဖစ္ေနတာေၾကာင့္ နဲနဲၾကာပါတယ္။ၾကာတဲ့အတြက္ boss ရဲ႕ Aoe ေတမိႏိုင္ပါတယ္။mechanic ေတြမ်ားတာရယ္ budget build ဆိုတာရွားတာရယ္ေၾကာင့္ newbie ေတြအတြက္ခက္ခဲပါတယ္။");
    }

}
