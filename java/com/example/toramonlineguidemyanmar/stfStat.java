package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class stfStat extends Fragment {

    static TextView txt1;
    public stfStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.stf_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatStf);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("character stat ရဲ႕ effect ေတြကေတာ့\n" +
                "\n" +
                "str 3atk,0.05stability per pt ေပးပါတယ္။knuckleနဲ႔တြဲပီးေဆာ့ခ်င္တဲ့သူေတယူရမဲ့ဟာပါ။\n" +
                "\n" +
                "int ကေတာ့ 4matk,1atk, per pt တိုးေပးပါတယ္။mdef,mp,aspdလဲနဲနဲစီတိုးေပးပါတယ္။magic အတြက္အဓိကယူရမဲ့ဟာပါ။\n" +
                "\n" +
                "vit ကေတာ့ HP နဲ႔ def ကိုတိုးေပးတာပါ။tank ဘက္သြားမဲ့သးေတယူသင့္ပါတယ္။\n" +
                "\n" +
                "agi ကေတာ့ aspd,cspd,fleeေတပဲတိုးေပးတာပါ။အသုံးမဝင္ပါဘူး။\n" +
                "\n" +
                "dex ကေတာ့ 1matk,3cspd per pt တိုးေပးပါတယ္။ int ပီးရင္ဆက္ယူသင့္ပါတယ္။");
    }
    public static void unicode()
    {
        txt1.setText("character stat ရဲ့ effect တွေကတော့\n" +
                "\n" +
                "str 3atk,0.05stability per pt ပေးပါတယ်။knuckleနဲ့တွဲပီးဆော့ချင်တဲ့သူတေယူရမဲ့ဟာပါ။\n" +
                "\n" +
                "int ကတော့ 4matk,1atk, per pt တိုးပေးပါတယ်။mdef,mp,aspdလဲနဲနဲစီတိုးပေးပါတယ်။magic အတွက်အဓိကယူရမဲ့ဟာပါ။\n" +
                "\n" +
                "vit ကတော့ HP နဲ့ def ကိုတိုးပေးတာပါ။tank ဘက်သွားမဲ့သးတေယူသင့်ပါတယ်။\n" +
                "\n" +
                "agi ကတော့ aspd,cspd,fleeတေပဲတိုးပေးတာပါ။အသုံးမဝင်ပါဘူး။\n" +
                "\n" +
                "dex ကတော့ 1matk,3cspd per pt တိုးပေးပါတယ်။ int ပီးရင်ဆက်ယူသင့်ပါတယ်။");
    }

}
