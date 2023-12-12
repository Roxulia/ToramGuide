package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dwEq extends Fragment {

    static TextView txt1;
    public dwEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.dw_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqDw);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("equipment  တွေအနေနဲ့ကတော့\n" +
                "\n" +
                "main hand weapon ကို atk များများပါတာကို acccd stat နဲ့ ကိုင်လေ့ရှိပါတယ်ဒါမှမဟုတ်ရင်တော့ event ကရတဲ့ proto clarity rose ကိုင်ပါ။\n" +
                "\n" +
                "sub hand weapon ကိုတော့ base atk ရယ် stability ရယ်များတဲ့ဟာကို element ထည့်ပီးကိုင်ပါ။\n" +
                "\n" +
                "armor ကတော့ full crit သုံးစေချင်ပါတယ်။\n" +
                "\n" +
                "additional gear အနေနဲ့ကတော့ demon mantle,york pendant,heaven feather headband,snowman on the head စတာတေအပြင် stability နဲ့ atk % တိုးတာတွေကိုင်နိုင်ပါတယ်။\n" +
                "\n" +
                "ring ကတော့ speed talisman V,muscle talisman V,dark talisman(power) သုံးလို့ရပါတယ်။");
    }
    public static void zawgyi()
    {
        txt1.setText("equipment  ေတြအေနနဲ႔ကေတာ့\n" +
                "\n" +
                "main hand weapon ကို atk မ်ားမ်ားပါတာကို acccd stat နဲ႔ ကိုင္ေလ့ရွိပါတယ္ဒါမွမဟုတ္ရင္ေတာ့ event ကရတဲ့ proto clarity rose ကိုင္ပါ။\n" +
                "\n" +
                "sub hand weapon ကိုေတာ့ base atk ရယ္ stability ရယ္မ်ားတဲ့ဟာကို element ထည့္ပီးကိုင္ပါ။\n" +
                "\n" +
                "armor ကေတာ့ full crit သုံးေစခ်င္ပါတယ္။\n" +
                "\n" +
                "additional gear အေနနဲ႔ကေတာ့ demon mantle,york pendant,heaven feather headband,snowman on the head စတာေတအျပင္ stability နဲ႔ atk % တိုးတာေတြကိုင္ႏိုင္ပါတယ္။\n" +
                "\n" +
                "ring ကေတာ့ speed talisman V,muscle talisman V,dark talisman(power) သုံးလို႔ရပါတယ္။");
    }

}
