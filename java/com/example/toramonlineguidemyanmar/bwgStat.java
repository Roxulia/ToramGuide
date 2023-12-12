package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bwgStat extends Fragment {

    static TextView txt1;
    public bwgStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.bwg_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatBwg);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("character stat ရဲ႕ effect ေတကေတာ့\n" +
                "\n" +
                "str 0.5 stability per ptပဲေပးပါတယ္။\n" +
                "\n" +
                "int ကေတာ့ +3matk,0.1mdef,0.1mp per pt ေပးပါတယ္။magic device နဲ႔တြဲေဆာ့တဲ့အခါယူသင့္တဲ့ stat ပါ။\n" +
                "\n" +
                "vit ကေတာ့ 1def per 10 pt,1HP per 3PT ေပးပါတယ္ tank ဘက္သြားမဲ့သူေတယူသင့္တဲ့ဟာပါ။\n" +
                "\n" +
                "agi ကေတာ့ aspd,cspd,fleeေတပဲတိုးေပးတာပါ။အသုံးမဝင္ပါဘူး\n" +
                "\n" +
                "dex ကေတာ့ 4atk,1matk,1cspd per PT ေပးပါတယ္။ bowgunရဲ႕အဓိကယူသင့္တဲ့ဟာပါ။");
    }
    public static void unicode()
    {
        txt1.setText("character stat ရဲ့ effect တေကတော့\n" +
                "\n" +
                "str 0.5 stability per ptပဲပေးပါတယ်။\n" +
                "\n" +
                "int ကတော့ +3matk,(1*armor effect)mdef,0.1mp per pt ပေးပါတယ်။magic device နဲ့တွဲဆော့တဲ့အခါယူသင့်တဲ့ stat ပါ။\n" +
                "\n" +
                "vit ကတော့ (1* armor effect)def per 10 pt,(1*lvl) HP per 3PT ပေးပါတယ် tank ဘက်သွားမဲ့သူတေယူသင့်တဲ့ဟာပါ။\n" +
                "\n" +
                "agi ကတော့ aspd,cspd,fleeတေပဲတိုးပေးတာပါ။အသုံးမဝင်ပါဘူး\n" +
                "\n" +
                "dex ကတော့ 4atk,1matk,1cspd per PT ပေးပါတယ်။ bowgunရဲ့အဓိကယူသင့်တဲ့ဟာပါ။");
    }

}
