package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class mdStat extends Fragment {

    static TextView txt1;
    public mdStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.md_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatMd);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("character stat ရဲ႕ effect ေတြကေတာ့\n" +
                "\n" +
                "str ကေတာ့ 0.1 stability စီတိုးေပးပါတယ္။ 100 pt ျပည့္ရင္ေတာ့တိုးေပးခ်င္းမရွိေတာ့ပါဘူး။\n" +
                "\n" +
                "int က 4matk,2atk per pt ေပးပါတယ္။(1*armor effect)mdef per pt,mpကိုလဲ 10 pt ကို 1ခုစီတိုးေပးပါတယ္။1*armor effect aspd per 5 ptလဲတိုးေပးပါတယ္။အဓိကယူသင့္တဲ့ stat ပါ။ farming အတြက္ပဲသုံးတာမ်ားလို႔ luk ကိုဦးစားေပးပီး ဒါကိုယူေလ့ရွိၾကပါတယ္။\n" +
                "\n" +
                "vit ကေတာ့  1*lvl HP per 3ptနဲ႔ 1*armor effect def per 1ptတိုးေပးပါတယ္။အသုံးမလိုတဲ့statပါ။\n" +
                "\n" +
                "agi ကေတာ့ 4*armor effect aspd,2atk,2*armor effect flee,1cspd per ptေပးပါတယ္။\n" +
                "\n" +
                "dex ကေတာ့ 1matk,2.5 cspd per pt တိုးေပးပါတယ္။");
    }
    public static void unicode()
    {
        txt1.setText("character stat ရဲ့ effect တွေကတော့\n" +
                "\n" +
                "str ကတော့ 0.1 stability စီတိုးပေးပါတယ်။ 100 pt ပြည့်ရင်တော့တိုးပေးချင်းမရှိတော့ပါဘူး။\n" +
                "\n" +
                "int က 4matk,2atk per pt ပေးပါတယ်။mdef (1*armor effect) per pt,mp ကိုလဲ 10 pt ကို 1ခုစီတိုးပေးပါတယ်။1*armor effect aspd per 5 ptလဲတိုးပေးပါတယ်။အဓိကယူသင့်တဲ့ stat ပါ။ farming အတွက်ပဲသုံးတာများလို့ luk ကိုဦးစားပေးပီး ဒါကိုယူလေ့ရှိကြပါတယ်။\n" +
                "\n" +
                "vit ကတော့  1* lvl HP per 3ptနဲ့ 1*armor effect def per 1ptတိုးပေးပါတယ်။အသုံးမလိုတဲ့statပါ။\n" +
                "\n" +
                "agi ကတော့ 4*armor effect aspd,2atk,2*armor effect flee,1cspd per ptပေးပါတယ်။\n" +
                "\n" +
                "dex ကတော့ 1matk,2.5 cspd per pt တိုးပေးပါတယ်။");
    }

}
