package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class hbStat extends Fragment {

    static TextView txt1;
    public hbStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.hb_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatHb);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("character stat ရဲ႕ effect ေတကေတာ့\n" +
                "\n" +
                "str က 2.5atk,(0.2*armor effect) aspd,0.05stability  per pt တိုးေပးပါတယ္။HB ရဲ႕အဓိက DMG ကိုဒီကေနရပါတယ္။\n" +
                "\n" +
                "int ကေတာ့ 3matk,0.1mp per ptတိုးေပးပါတယ္။ (1* armor effect) mdef per ptလဲတိုးေပးပါတယ္။\n" +
                "\n" +
                "vit ကေတာ့ 0.33hp*lvl per ptတိုးေပးပီး (1*armor effect) def per ptတိုးေပးပါတယ္။\n" +
                "\n" +
                "agi ကေတာ့ 1.5 atk,(3.5* armor effect)aspd,(1*armor effect) flee per pt တိုးေပးပါတယ္။motion speed လိုတဲ့အတြက္ str အျပည့္ယူပီးရင္ယူေလ့ရွိတဲ့ stat ပါ။\n" +
                "\n" +
                "dex ကေတာ့ 0.05 stability per ptတိုးေပးပါတယ္။သိပ္အေရးမပါပါဘူး။");
    }
    public static void unicode()
    {
        txt1.setText("character stat ရဲ့ effect တေကတော့\n" +
                "\n" +
                "str က 2.5atk,(0.2*armor effect) aspd,0.05stability  per pt တိုးပေးပါတယ်။HB ရဲ့အဓိက DMG ကိုဒီကနေရပါတယ်။\n" +
                "\n" +
                "int ကတော့ 3matk,0.1mp per ptတိုးပေးပါတယ်။ (1* armor effect) mdef per ptလဲတိုးပေးပါတယ်။\n" +
                "\n" +
                "vit ကတော့ 0.33hp*lvl per ptတိုးပေးပီး (1*armor effect) def per ptတိုးပေးပါတယ်။\n" +
                "\n" +
                "agi ကတော့ 1.5 atk,(3.5* armor effect)aspd,(1*armor effect) flee per pt တိုးပေးပါတယ်။motion speed လိုတဲ့အတွက် str အပြည့်ယူပီးရင်ယူလေ့ရှိတဲ့ stat ပါ။\n" +
                "\n" +
                "dex ကတော့ 0.05 stability per ptတိုးပေးပါတယ်။သိပ်အရေးမပါပါဘူး။");
    }

}
