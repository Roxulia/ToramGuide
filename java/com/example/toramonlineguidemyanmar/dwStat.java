package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dwStat extends Fragment {

    static TextView txt1;
    public dwStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.dw_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatDw);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("character stat ေတရဲ႕ effect ေတြကေတာ့ \n" +
                "\n" +
                "str က 1 main atk,1 sub atk ,0.025 main stability,0.06 sub stability per pt တိုးေပးပီး (1*armor effect)aspd per 5ptတိုးေပးပါတယ္။dual sword ထဲမာယူသင့္တဲ့ stat ႏွစ္ခုထဲကတခုျဖစ္ပါတယ္။\n" +
                "\n" +
                "int ကေတာ့ 3matk per ptနဲ႔ 0.1 mp,(1*armor effect)mdef per pt တိုးေပးပါတယ္။လားလားမွမအပ္စပ္တဲ့stat ပါ။\n" +
                "\n" +
                "vit ကေတာ့ (1*lvl)HP per 3pt,(1*armor effect)def per 1ptတိုးေပးပါတယ္။မာခ်င္တဲ့အခါနဲနဲယူၾကေလ့ရွိပါတယ္။ဒါမဲ့လဲ evade ေတflee ေတမ်ားတာေၾကာင့္မလိုအပ္ပါဘူး။\n" +
                "\n" +
                "agi ကေတာ့ 1 main atk,3 sub atk,0.04 sub stability,4*armor effect aspd,2*armor effect flee per ptတိုးေပးပါတယ္။ျမန္ျမန္ဆန္ဆန္နဲ႔ evade ေတdodge ေတမ်ားမ်ားထခ်င္တဲ့သူေတယူရမဲ့ stat ပါ။ အဓိက ယူရမဲ့ႏွစ္ခုထဲကတခုျဖစ္ပါတယ္။\n" +
                "\n" +
                "dexကေတာ့ 2 main atk,0.075 main stabilityပဲတိုးေပးပါတယ္။ဒီ stat က in game ထဲက stat description မွာ ဦးစားေပးထားတဲ့ stat ျဖစ္ပါတယ္ဒါ့ေၾကာင့္ newbie ေတေတာ္ေတာ္မ်ားမ်ားမွားယူတတ္ၾကပါတယ္။\n" +
                "\n" +
                "recommended stat build ကေတာ့ str နဲ႔ agiပါ။newbie ေတအေနနဲ႔ကေတာ့ str အျပည့္ယူပီးမွ agi သြားေစခ်င္ပါတယ္။ဒါမဲ့တခုရွိတာက str သြားတဲ့သူေတက crt ထမွagi သြားတဲ့သူထက္ပိုၾကမ္းတာပါ။ကိုယ့္အေျခအေနေပၚမူတည္ပီးယူၾကပါ။");
    }
    public static void unicode()
    {
        txt1.setText("character stat တေရဲ့ effect တွေကတော့ \n" +
                "\n" +
                "str က 1 main atk,1 sub atk ,0.025 main stability,0.06 sub stability per pt တိုးပေးပီး 1* armor effect aspd per 5ptတိုးပေးပါတယ်။dual sword ထဲမာယူသင့်တဲ့ stat နှစ်ခုထဲကတခုဖြစ်ပါတယ်။\n" +
                "\n" +
                "int ကတော့ 3matk per ptနဲ့ 0.1 mp,(1*armor effect)mdef per pt တိုးပေးပါတယ်။လားလားမှမအပ်စပ်တဲ့stat ပါ။\n" +
                "\n" +
                "vit ကတော့ (1*lvl)HP per 3pt,(1*armor effect)def per 1ptတိုးပေးပါတယ်။မာချင်တဲ့အခါနဲနဲယူကြလေ့ရှိပါတယ်။ဒါမဲ့လဲ evade တေflee တေများတာကြောင့်မလိုအပ်ပါဘူး။\n" +
                "\n" +
                "agi ကတော့ 1 main atk,3 sub atk,0.04 sub stability,4*armor effect aspd,2*armor effect flee per ptတိုးပေးပါတယ်။မြန်မြန်ဆန်ဆန်နဲ့ evade တေdodge တေများများထချင်တဲ့သူတေယူရမဲ့ stat ပါ။ အဓိက ယူရမဲ့နှစ်ခုထဲကတခုဖြစ်ပါတယ်။\n" +
                "\n" +
                "dexကတော့ 2 main atk,0.075 main stabilityပဲတိုးပေးပါတယ်။ဒီ stat က in game ထဲက stat description မှာ ဦးစားပေးထားတဲ့ stat ဖြစ်ပါတယ်ဒါ့ကြောင့် newbie တေတော်တော်များများမှားယူတတ်ကြပါတယ်။\n" +
                "\n" +
                "recommended stat build ကတော့ str နဲ့ agiပါ။newbie တေအနေနဲ့ကတော့ str အပြည့်ယူပီးမှ agi သွားစေချင်ပါတယ်။ဒါမဲ့တခုရှိတာက str သွားတဲ့သူတေက crt ထမှagi သွားတဲ့သူထက်ပိုကြမ်းတာပါ။ကိုယ့်အခြေအနေပေါ်မူတည်ပီးယူကြပါ။");
    }

}
