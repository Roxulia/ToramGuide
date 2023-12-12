package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class halberdT3 extends Fragment {

    static TextView txt1,txt2,txt3;
    public halberdT3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.halberd_t3,vg,false);
        txt1=v.findViewById(R.id.txt1hbt3);
        txt2=v.findViewById(R.id.txt2hbt3);
        txt3=v.findViewById(R.id.txt3hbt3);
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
                "dive impact ကေတာ့ခုံပီးေျမႀကီးကိုလွံနဲ႔ထိုးတာပါ။ထိုးလိုက္တဲ့အခ်ိန္မွာ ေျမႀကီးမွာလွံစိုက္ေနတဲ့ပုံေပၚေနပီး4 secအၾကာမွာအ့ေနရာကေနေပါက္ကြဲထြက္တာပါ။aoe dmg ထြက္တာမို႔farmer ေတသုံးေလ့ရွိတဲ့ skillပါ။ DMG လဲထြက္ပါတယ္။\n" +
                "dizzy ailment chance (10*skill lvl)% ရွိပါတယ္။ ေလေပၚေရာက္ေနတဲ့အခ်ိန္ invicible mode ဝင္ပါတယ္။Dmg ကေတာ့ေျမေပၚက်တဲ့အခ်ိန္တခါ ေပါက္ကြဲတဲ့အခ်ိန္တခါထိပါတယ္။ပထမအခ်က္ Aoe hit range ကေတာ့ (2.5 +0.25*skill lvl)m ျဖစ္ပီး ေပါက္ကြဲတဲ့ Aoe range ကေတာ့ (4.5+0.25*skill lvl)m ျဖစ္ပါတယ္။mp cost 400ျဖစ္ပီး placed skillအမ်ိဳးအစားျဖစ္ပါတယ္။\n");
        txt2.setText("\n" +
                "strike stab ကေတာ့ လွံနဲ႔ရိုက္ပီးထိုးတာပါ။DMG 3ခ်က္ထြက္ပါတယ္။level 4 skill မရေသးတဲ့သူေတာ္ေတာ္မ်ားမ်ား သုံးတဲ့ DPS skill ျဖစ္ပါတယ္။DMG လဲထြက္ပါတယ္။str အေပၚမူတည္ပီးလဲdmg ထပ္ေပါင္းေပးပါတယ္။\n" +
                "ဒီ skill မွာေတာ့ base critical rate reduction (5*skill lvl)%ရွိပါတယ္။target မွာ ailment တခုခုထိထားရင္ DMG ပိုထြက္ပါတယ္။mp cost 200ျဖစ္ပါတယ္။ ohs/halberd ႏွစ္မ်ိဳးလုံးနဲ႔သုံးလို႔ရပါတယ္။\n" +
                "\n" +
                "halberd နဲ႔သုံးရင္ေတာ့ ailmentရွိတဲ့ target ကိုသုံးတဲ့အခါထြက္တဲ့ DMG ကိုႏွစ္ဆနီးပါးတိုးေပးထားပါတယ္။\n" +
                "one handed sword နဲ႔ဆိုရင္ေတာ့ critical rate % ကရတဲ့ effect ကိုတဝက္ထပ္ေလ်ာ့ေပးမွာပါ။\n");
        txt3.setText("\n" +
                "critical spear ကေတာ့ halberd ကိုင္ထားတဲ့အခါ critical rate ကိုတိုးေပးတာပါ။passive skillပါ။\n" +
                "critical rate +1% (lvl 1-2)ကေနပီး 5%(lvl 9-10)အထိတိုးေပးပါတယ္။\n" +
                "flat critical rate +1 (lvl 1-2)ကေန +5(lvl 9-10)အထိတိုးေပးပါတယ္။\n");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "dive impact ကတော့ခုံပီးမြေကြီးကိုလှံနဲ့ထိုးတာပါ။ထိုးလိုက်တဲ့အချိန်မှာ မြေကြီးမှာလှံစိုက်နေတဲ့ပုံပေါ်နေပီး4 secအကြာမှာအ့နေရာကနေပေါက်ကွဲထွက်တာပါ။aoe dmg ထွက်တာမို့farmer တေသုံးလေ့ရှိတဲ့ skillပါ။ DMG လဲထွက်ပါတယ်။\n" +
                "dizzy ailment chance (10*skill lvl)% ရှိပါတယ်။ လေပေါ်ရောက်နေတဲ့အချိန် invicible mode ဝင်ပါတယ်။Dmg ကတော့မြေပေါ်ကျတဲ့အချိန်တခါ ပေါက်ကွဲတဲ့အချိန်တခါထိပါတယ်။ပထမအချက် Aoe hit range ကတော့ (2.5 +0.25*skill lvl)m ဖြစ်ပီး ပေါက်ကွဲတဲ့ Aoe range ကတော့ (4.5+0.25*skill lvl)m ဖြစ်ပါတယ်။mp cost 400ဖြစ်ပီး placed skillအမျိုးအစားဖြစ်ပါတယ်။\n");
        txt2.setText("\n" +
                "strike stab ကတော့ လှံနဲ့ရိုက်ပီးထိုးတာပါ။DMG 3ချက်ထွက်ပါတယ်။level 4 skill မရသေးတဲ့သူတော်တော်များများ သုံးတဲ့ DPS skill ဖြစ်ပါတယ်။DMG လဲထွက်ပါတယ်။str အပေါ်မူတည်ပီးလဲdmg ထပ်ပေါင်းပေးပါတယ်။\n" +
                "ဒီ skill မှာတော့ base critical rate reduction (5*skill lvl)%ရှိပါတယ်။target မှာ ailment တခုခုထိထားရင် DMG ပိုထွက်ပါတယ်။mp cost 200ဖြစ်ပါတယ်။ ohs/halberd နှစ်မျိုးလုံးနဲ့သုံးလို့ရပါတယ်။\n" +
                "\n" +
                "halberd နဲ့သုံးရင်တော့ ailmentရှိတဲ့ target ကိုသုံးတဲ့အခါထွက်တဲ့ DMG ကိုနှစ်ဆနီးပါးတိုးပေးထားပါတယ်။\n" +
                "one handed sword နဲ့ဆိုရင်တော့ critical rate % ကရတဲ့ effect ကိုတဝက်ထပ်လျော့ပေးမှာပါ။\n");
        txt3.setText("\n" +
                "critical spear ကတော့ halberd ကိုင်ထားတဲ့အခါ critical rate ကိုတိုးပေးတာပါ။passive skillပါ။\n" +
                "critical rate +1% (lvl 1-2)ကနေပီး 5%(lvl 9-10)အထိတိုးပေးပါတယ်။\n" +
                "flat critical rate +1 (lvl 1-2)ကနေ +5(lvl 9-10)အထိတိုးပေးပါတယ်။\n");
    }

}
