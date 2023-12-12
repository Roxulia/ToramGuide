package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class knStat extends Fragment {

    static TextView txt1;
    public knStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.kn_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatKn);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("character stat ရဲ႕ effect ေတကေတာ့\n" +
                "\n" +
                "str ကဘာမွမတိုးေပးပါဘူး။ဒါေၾကာင့္ပုံမွန္အားျဖင့္ အေလးေပးပီးယူေလ့မရွိပါဘူး။dagger နဲ႔တြဲပီးေဆာ့မွတာယူေလ့ရွိတာပါ။\n" +
                "\n" +
                "int ကေတာ့ 4matk per ptတိုးေပးပါတယ္။(1*armor effect)mdef per pt,1mp per 10ptလဲတိုးေပးပါတယ္။magic device နဲ႔တြဲပီးေဆာ့ရင္ယူလို႔ရပါတယ္။ဒါမဲ့လဲ useless ပါပဲ။\n" +
                "\n" +
                " vitကေတာ့ 1HP per 3pt,(1*armor effect)def per ptတိုးေပးပါတယ္။shield နဲ႔တြဲပီး tank ရင္ပဲျဖစ္ျဖစ္ semi tank ပဲျဖစ္ျဖစ္ေဆာ့ရင္ယူသင့္ပါတယ္။\n" +
                "\n" +
                "agi ကေတာ့ 2atk,(4.5*armor effect) aspd,(1*armor effect )flee per ptတိုးေပးပါတယ္။knuckle အတြက္ DMG ေပးတဲ့တခုထဲေသာstat ပါ။\n" +
                "\n" +
                "dex ကေတာ့ 0.5atk,0.025 stability per ptတိုးေပးပါတယ္။dpsအတြက္ယူလို႔လဲရပါတယ္။ဒါနဲ႔ဆာရင္ str ကိုပိုယူေစခ်င္ပါတယ္။Cdmg တိုးေပးလို႔ပါ။");
    }
    public static void unicode()
    {
        txt1.setText("character stat ရဲ့ effect တေကတော့\n" +
                "\n" +
                "str ကဘာမှမတိုးပေးပါဘူး။ဒါကြောင့်ပုံမှန်အားဖြင့် အလေးပေးပီးယူလေ့မရှိပါဘူး။dagger နဲ့တွဲပီးဆော့မှတာယူလေ့ရှိတာပါ။\n" +
                "\n" +
                "int ကတော့ 4matk per ptတိုးပေးပါတယ်။(1*armor effect)mdef per pt,1mp per 10ptလဲတိုးပေးပါတယ်။magic device နဲ့တွဲပီးဆော့ရင်ယူလို့ရပါတယ်။ဒါမဲ့လဲ useless ပါပဲ။\n" +
                "\n" +
                " vitကတော့ 1HP per 3pt,(1*armor effect)def per ptတိုးပေးပါတယ်။shield နဲ့တွဲပီး tank ရင်ပဲဖြစ်ဖြစ် semi tank ပဲဖြစ်ဖြစ်ဆော့ရင်ယူသင့်ပါတယ်။\n" +
                "\n" +
                "agi ကတော့ 2atk,(4.5*armor effect )aspd,(1*armor effect)flee per ptတိုးပေးပါတယ်။knuckle အတွက် DMG ပေးတဲ့တခုထဲသောstat ပါ။\n" +
                "\n" +
                "dex ကတော့ 0.5atk,0.025 stability per ptတိုးပေးပါတယ်။dpsအတွက်ယူလို့လဲရပါတယ်။ဒါနဲ့ဆာရင် str ကိုပိုယူစေချင်ပါတယ်။Cdmg တိုးပေးလို့ပါ။");
    }

}
