package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class ohsStat extends Fragment {

    static TextView txt1;
    public ohsStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.ohs_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatOhs);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("Character stat ရဲ႕ effect ေတကေတာ့\n" +
                "\n" +
                "Str: +2 atk,+0.025stability  per point,  +1*armor effect aspd , +1 cdmg per 5 points\n" +
                "\n" +
                "Int: +3 matk per point,  1 pt တိုင္းက mdef 1* armor effect pt ေပးပါတယ္ , +1 mana point per 10 pt\n" +
                "\n" +
                "Vit: ပထမဆုံး 1 pt မွာ +1*lvl hp တိုးပီး ေနာက္ 3 pt ထည့္တိုင္းက +1*lvl hp တိုးေပးပါတယ္  Int လိုပဲ  1 pt တိုးတိုင္း 1*armor effect def တိုးပါတယ္ \n" +
                "\n" +
                "Agi: +2*armor effect flee,+1 cspd ,+ 4.2*armor effect aspd per point\n" +
                "\n" +
                "Dex: +2 atk, +1 matk,+3*armor effect aspd, +1 hit, +0.07 stability per point\n" +
                "\n" +
                "One handed class ေဆာ့မယ္ဆိုရင္ေတာ့ stat ကို full str rest dex ေဆာ့ေစခ်င္ပါတယ္");
    }
    public static void unicode()
    {
        txt1.setText("Character stat ရဲ့ effect တေကတော့\n" +
                "\n" +
                "Str: +2 atk,+0.025stability  per point,  +1*armor effect aspd , +1 cdmg per 5 points\n" +
                "\n" +
                "Int: +3 matk per point,  1 pt တိုင်းက mdef 1*armor effect pt ပေးပါတယ် , +1 mana point per 10 pt\n" +
                "\n" +
                "Vit: ပထမဆုံး 1 pt မှာ +1*lvl hp တိုးပီး နောက် 3 pt ထည့်တိုင်းက +1*lvl hp တိုးပေးပါတယ်  Int လိုပဲ 1 pt တိုးတိုင်း 1*armor effect def တိုးပါတယ် \n" +
                "\n" +
                "Agi: +2*armor effect flee,+1 cspd ,+ 4.2*armor effect aspd per point\n" +
                "\n" +
                "Dex: +2 atk, +1 matk,+3*armor effect aspd, +1 hit, +0.07 stability per point\n" +
                "\n" +
                "One handed class ဆော့မယ်ဆိုရင်တော့ stat ကို full str rest dex ဆော့စေချင်ပါတယ်");
    }
}
