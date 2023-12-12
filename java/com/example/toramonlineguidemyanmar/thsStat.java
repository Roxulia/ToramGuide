package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class thsStat extends Fragment {

    static TextView txt1;
    public thsStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.ths_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatThs);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("THS အေပၚသက္ေရာက္တဲ့ character stat ေတရဲ႕ effect ေတကေတာ့\n" +
                "\n" +
                "STR သူကေတာ့atk power ကိုအဓိကတိုးေပးတဲ့ stat ပါ +3 atk per point တက္ပါတယ္ + 1 aspd,  + 1cdmg per 5ptလဲေပးပါတယ္ \n" +
                "\n" +
                "INT ကေတာ့ THS နဲ႔ လားလားမွမသက္ဆိုင္ပါဘူး သူက matkနဲ႔ mdef ရယ္ mp အနဲငယ္ရယ္ပဲတိုးေပးပါတယ္ \n" +
                "\n" +
                "AGI ကေတာ့ aspd, flee ေတကိုတိုးေပးတာပါ အရမ္းအသုံးဝင္တဲ့ဟာေတာ့မဟုတ္ပါဘူး\n" +
                "\n" +
                "VIT သူကေတာ့hp နဲ႔ def တိုးေပးပါတယ္ semi tank အေနနဲ႔ေဆာ့ခ်င္တဲ့ THS သမားေတ str ျပည့္ရင္ယူတဲ့ဟာပါ \n" +
                "\n" +
                "DEX ကေတာ့ stability , atk power ရယ္တိုးေပးပါတယ္ ဒါေၾကာင့္မို႔ DPS ေဆာ့မဲ့သူအေနနဲ႔ str ျပည့္ရင္ဒါကိုယူသင့္ပါတယ္ 0.1 stab,1 atk ,3 aspd per PT တိုးေပးပါတယ္");
    }
    public static void unicode()
    {
        txt1.setText("THS အပေါ်သက်ရောက်တဲ့ character stat တေရဲ့ effect တေကတော့\n" +
                "\n" +
                "STR သူကတော့atk power ကိုအဓိကတိုးပေးတဲ့ stat ပါ +3 atk per point တက်ပါတယ် + 1 aspd,  + 1cdmg per 5ptလဲပေးပါတယ် \n" +
                "\n" +
                "INT ကတော့ THS နဲ့ လားလားမှမသက်ဆိုင်ပါဘူး သူက matkနဲ့ mdef ရယ် mp အနဲငယ်ရယ်ပဲတိုးပေးပါတယ် \n" +
                "\n" +
                "AGI ကတော့ aspd, flee တေကိုတိုးပေးတာပါ အရမ်းအသုံးဝင်တဲ့ဟာတော့မဟုတ်ပါဘူး\n" +
                "\n" +
                "VIT သူကတော့hp နဲ့ def တိုးပေးပါတယ် semi tank အနေနဲ့ဆော့ချင်တဲ့ THS သမားတေ str ပြည့်ရင်ယူတဲ့ဟာပါ \n" +
                "\n" +
                "DEX ကတော့ stability , atk power ရယ်တိုးပေးပါတယ် ဒါကြောင့်မို့ DPS ဆော့မဲ့သူအနေနဲ့ str ပြည့်ရင်ဒါကိုယူသင့်ပါတယ် 0.1 stab,1 atk ,3 aspd per PT တိုးပေးပါတယ်");
    }
}
