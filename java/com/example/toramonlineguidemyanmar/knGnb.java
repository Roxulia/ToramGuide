package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class knGnb extends Fragment {

    static TextView txt1;
    public knGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.kn_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbKn);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်ကတော့ stun,lock များတာကြောင့် tank အနေနဲ့ဆော့လို့ရပါတယ်။ safe ဖြစ်ပါတယ် လှုပ်ရှားရလွယ်ကူပါတယ်။ aspd လဲမြန်ပါတယ်။ampr လဲစိတ်ပူစရာမလိုပါဘူး။အပျော်ဆော့လို့ကောင်းပါတယ်။evasion,dodge များပါတယ်။\n" +
                "\n" +
                "အားနည်းချက်အနေနဲ့ကတော့ dmg မထွက်တာပါ။npc ထဲက knuckle ကောင်းတာတေမရှာနိုင်ရင် မကြမ်းပါဘူး။stat တခုထဲကနေပဲ atk power တက်တာကြောင့် lvl များလဲမကြမ်းပါဘူး:3");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ကေတာ့ stun,lock မ်ားတာေၾကာင့္ tank အေနနဲ႔ေဆာ့လို႔ရပါတယ္။ safe ျဖစ္ပါတယ္ လႈပ္ရွားရလြယ္ကူပါတယ္။ aspd လဲျမန္ပါတယ္။ampr လဲစိတ္ပူစရာမလိုပါဘူး။အေပ်ာ္ေဆာ့လို႔ေကာင္းပါတယ္။evasion,dodge မ်ားပါတယ္။\n" +
                "\n" +
                "အားနည္းခ်က္အေနနဲ႔ကေတာ့ dmg မထြက္တာပါ။npc ထဲက knuckle ေကာင္းတာေတမရွာႏိုင္ရင္ မၾကမ္းပါဘူး။stat တခုထဲကေနပဲ atk power တက္တာေၾကာင့္ lvl မ်ားလဲမၾကမ္းပါဘူး:3");
    }

}
