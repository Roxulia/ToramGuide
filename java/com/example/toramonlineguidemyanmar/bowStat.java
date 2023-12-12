package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class bowStat extends Fragment {

    static TextView txt1;
    public bowStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.bow_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatBow);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("character stat ရဲ႕ effect ေတြကေတာ့ \n" +
                "\n" +
                "str ကေတာ့ +1 atk , +0.05 stability per pt ေပးပါတယ္။\n" +
                "\n" +
                "int ကေတာ့ +3matk per pt ေပးပါတယ္။  1 pt ကို mdef 1*armor effect တိုးေပးပါတယ္။ bow အတြက္မလိုတဲ့ stat ပါ။\n" +
                "\n" +
                "vit ကေတာ့ HP ရယ္ def ရယ္တိုးေပးတာပါ။ သိပ္အသုံးမဝင္ပါဘူး။\n" +
                "\n" +
                "agi ကေတာ့ 3*armor effect aspd,2*armor effect flee,1cspd per pt\u200Eေပးပါတယ္။bow နဲ႔မကိုက္ပါဘူး။\n" +
                "\n" +
                "Dex ကေတာ့ +3atk,0.5 stability တိုးေပးပါတယ္။ bow မွာ DMG မ်ားမ်ားရႏိုင္တဲ့ stat ပါ။ဦးစားေပးယူသင့္ပါတယ္။");
    }
    public static void unicode()
    {
        txt1.setText("character stat ရဲ့ effect တွေကတော့ \n" +
                "\n" +
                "str ကတော့ +1 atk , +0.05 stability per pt ပေးပါတယ်။\n" +
                "\n" +
                "int ကတော့ +3matk per pt ပေးပါတယ်။1 pt ကို mdef 1*armor effect တိုးပေးပါတယ်။ bow အတွက်မလိုတဲ့ stat ပါ။\n" +
                "\n" +
                "vit ကတော့ HP ရယ် def ရယ်တိုးပေးတာပါ။ သိပ်အသုံးမဝင်ပါဘူး။\n" +
                "\n" +
                "agi ကတော့ 3*armor effect aspd,2*armor effect flee,1cspd per pt\u200Eပေးပါတယ်။bow နဲ့မကိုက်ပါဘူး။\n" +
                "\n" +
                "Dex ကတော့ +3atk,0.5 stability တိုးပေးပါတယ်။ bow မှာ DMG များများရနိုင်တဲ့ stat ပါ။ဦးစားပေးယူသင့်ပါတယ်။");
    }
}
