package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class halberdT2 extends Fragment {

    static TextView txt1,txt2,txt3;
    public halberdT2()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.halberd_t2,vg,false);
        txt1=v.findViewById(R.id.txt1hbt2);
        txt2=v.findViewById(R.id.txt2hbt2);
        txt3=v.findViewById(R.id.txt3hbt2);
        if(MainActivity.zg)
        {
            zawgyi();
        }
        else
        {
            unicode();
        }

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("\n" +
                "dragon tail ကေတာ့ကိုယ္ကိုတပတ္လည္ပီးလွံနဲ႔ရမ္းတာပါ။DMG ထြက္ပါတယ္။ဒါ့အျပင္ skill သုံးေနခ်ိန္ DMG ထိရင္လဲ ထိတဲ့DMG ကိုေလ်ာ့ေပးပါတယ္။hit count ႏွစ္ခ်က္ျဖစ္ပါတယ္။ Aoe DMG ျဖစ္ပါတယ္။\n" +
                "first hit ရဲ႕ Aoe ကေတာ့ 1.5mကေန2 mအထိျဖစ္ပါတယ္။second hit ရဲ႕ Aoe ကေတာ့ 2.5m ကေန 4m အထိျဖစ္ပါတယ္။monster ေတကိုtumble chance (10*skill lvl)% ရွိပါတယ္။ပထမအခ်က္မွာ အ႐ိုက္ခံရင္ထိတဲ့ DMG ကို 50ေလ်ာ့ေပးပီး ဒုထိယအခ်က္မွာထိတဲ့ဟာကိုေတာ့ 10*skill lvl ေလ်ာ့ေပးပါတယ္။mp cost 300ျဖစ္ပါတယ္။placed skill ပါ။\n");
        txt2.setText("\n" +
                "punish ray ကေတာ့ လွံထဲကေန wave အေသးေလးနဲ႔ပစ္လိုက္တာပါ။DMG ကေတာ့ Int အေပၚမွာအနည္းငယ္အမွီခိုပါတယ္။skill DMG က magic DMG ပါ။\n" +
                "cast time ကေတာ့ 2sec ပါ။skill သုံးပီးရင္ buff ရပါတယ္။ေနာက္ skill သုံးခု ကို crit rate buff ေပးတာပါ။ ပထမတခုကို (15* skill lvl),ဒုတိယတခုကို (10* skill lvl),တတိယတခုကို (5*skill lvl)တိုးေပးပါတယ္။maximun cast range 12mျဖစ္ပီး mp cost 0 ပါ။ohs/halberd ႏွစ္ခုလုံးနဲ႔သုံးလို႔ရပါတယ္။\n" +
                "\n" +
                "one handed sword နဲ႔သုံးရင္ေတာ့ crt buff ကို တဝက္ေလ်ာ့ေပးမွာပါ။\n" +
                "halberd နဲ႔သုံးရင္ေတာ့ skill DMG တိုးေပးမွာပါ။\n" +
                "\n");
        txt3.setText("\n" +
                "war cry of struggleကေတာ့ mp ျပန္ျဖည့္တဲ့ skill ပါ။HP % ေပၚမူတည္ပီး mp ျပန္ျပည့္တဲ့ amount လဲပိုမ်ားလာမွာပါ။\n" +
                "base mp recovery ကေတာ့ 120ပါ။HP 85% ေအာက္ဆိုရင္ေတာ့ mp recovery +(2*skill lvl), 70% ေအာက္ဆိုရင္ေတာ့ +(4*skill lvl), 55% ေအာက္ဆိုရင္ေတာ့ (20+10* skill lvl)တိုးေပးပါတယ္။ \n" +
                "charge time ကေတာ့ 5 sec (lvl 1)ကေန 2 sec(lvl 10)အထိရွိပါတယ္။ mp cost 100ျဖစ္ပါတယ္။\n" +
                "\n" +
                "halberd နဲ႔သုံးရင္ေတာ့ charge time - 1sec ေလ်ာ့ေပးမွာပါ။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "dragon tail ကတော့ကိုယ်ကိုတပတ်လည်ပီးလှံနဲ့ရမ်းတာပါ။DMG ထွက်ပါတယ်။ဒါ့အပြင် skill သုံးနေချိန် DMG ထိရင်လဲ ထိတဲ့DMG ကိုလျော့ပေးပါတယ်။hit count နှစ်ချက်ဖြစ်ပါတယ်။ Aoe DMG ဖြစ်ပါတယ်။\n" +
                "first hit ရဲ့ Aoe ကတော့ 1.5mကနေ2 mအထိဖြစ်ပါတယ်။second hit ရဲ့ Aoe ကတော့ 2.5m ကနေ 4m အထိဖြစ်ပါတယ်။monster တေကိုtumble chance (10*skill lvl)% ရှိပါတယ်။ပထမအချက်မှာ အရိုက်ခံရင်ထိတဲ့ DMG ကို 50လျော့ပေးပီး ဒုထိယအချက်မှာထိတဲ့ဟာကိုတော့ 10*skill lvl လျော့ပေးပါတယ်။mp cost 300ဖြစ်ပါတယ်။placed skill ပါ။\n");
        txt2.setText("\n" +
                "punish ray ကတော့ လှံထဲကနေ wave အသေးလေးနဲ့ပစ်လိုက်တာပါ။DMG ကတော့ Int အပေါ်မှာအနည်းငယ်အမှီခိုပါတယ်။skill DMG က magic DMG ပါ။\n" +
                "cast time ကတော့ 2sec ပါ။skill သုံးပီးရင် buff ရပါတယ်။နောက် skill သုံးခု ကို crit rate buff ပေးတာပါ။ ပထမတခုကို (15* skill lvl),ဒုတိယတခုကို (10* skill lvl),တတိယတခုကို (5*skill lvl)တိုးပေးပါတယ်။maximun cast range 12mဖြစ်ပီး mp cost 0 ပါ။ohs/halberd နှစ်ခုလုံးနဲ့သုံးလို့ရပါတယ်။\n" +
                "\n" +
                "one handed sword နဲ့သုံးရင်တော့ crt buff ကို တဝက်လျော့ပေးမှာပါ။\n" +
                "halberd နဲ့သုံးရင်တော့ skill DMG တိုးပေးမှာပါ။\n" +
                "\n");
        txt3.setText("\n" +
                "war cry of struggleကတော့ mp ပြန်ဖြည့်တဲ့ skill ပါ။HP % ပေါ်မူတည်ပီး mp ပြန်ပြည့်တဲ့ amount လဲပိုများလာမှာပါ။\n" +
                "base mp recovery ကတော့ 120ပါ။HP 85% အောက်ဆိုရင်တော့ mp recovery +(2*skill lvl), 70% အောက်ဆိုရင်တော့ +(4*skill lvl), 55% အောက်ဆိုရင်တော့ (20+10* skill lvl)တိုးပေးပါတယ်။ \n" +
                "charge time ကတော့ 5 sec (lvl 1)ကနေ 2 sec(lvl 10)အထိရှိပါတယ်။ mp cost 100ဖြစ်ပါတယ်။\n" +
                "\n" +
                "halberd နဲ့သုံးရင်တော့ charge time - 1sec လျော့ပေးမှာပါ။");
    }

}
