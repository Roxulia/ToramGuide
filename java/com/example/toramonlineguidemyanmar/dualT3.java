package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dualT3 extends Fragment {

    static TextView txt1,txt2,txt3;
    public dualT3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.dual_t3,vg,false);
        txt1=v.findViewById(R.id.txt1dualt3);
        txt2=v.findViewById(R.id.txt2dualt3);
        txt3=v.findViewById(R.id.txt3dualt3);
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
                "phantom slash ကေတာ့ ကိုယ္ေဖ်ာက္ပီး၁၂ခ်က္ပိုင္းတာပါ။DMG လဲထြက္ပါတယ္။level 4 skill မရေသးတဲ့အခ်ိန္မွာ main DPS skill အေနနဲ႔သုံးၾကပါတယ္။12ခ်က္ပိုင္းေနစဥ္မွာ invicible mode ျဖစ္ပီး ပိုင္းေနတဲ့အခ်ိန္မွာလဲ joy stick ကိုေ႐ြ႕ပီး invicible mode ကိုcancel လို႔ရပါတယ္။DMG ကေတာ့ 12ခ်က္ျပည့္ေအာင္ဆက္ထြက္မွာပါ။monster ေတကိုသုံးတဲ့အခါ DMG 999999999 ထြက္ႏိုင္ပါတယ္။\n" +
                "freeze chance (10*skill lvl)% ရွိပါတယ္။maximum cast range 8mရွိပီး mp cost 400ပါ။placed skillျဖစ္ပါတယ္။\n");
        txt2.setText("\n" +
                "shadow stepကေတာ့ target ရဲ႕အေနာက္ကိုခုံတာပါ။ခုံပီးေနာက္ခ်တဲ့ atkဟာ unsheathe atkျဖစ္ပါတယ္။buff ေတလဲတိုးေပးပါတယ္။\n" +
                "ampr +(skill lvl)တိုးေပးပါတယ္။ဒါ့အျပင္ေနာက္သုံးမဲ့ skill ရဲ႕ crit rate ကိုလဲ +(20*skill lvl)တိုးေပးပါတယ္။buff duration ကေတာ့ေနာက္ထပ္skillတခုမသုံးမခ်င္းပါ။maximum cast range 4m(lvl 1)ကေန 12m (lvl 10)အထိရွိပါတယ္။mp cost ကေတာ့ lvl 1-3မွာ 400,  lvl 4-6 မွာ 300ျဖစ္ပီး lvl 7 အထက္မွာေတာ့ 200ပါ။ flash blast effect ဝင္ေနရင္ flash blast ရဲ႕ blast DMG ထြက္ပါတယ္။\n");
        txt3.setText("\n" +
                "flash blast ကေတာ့ unsheathe atk%တိုးေပးတဲ့ buff skill ပါ။buff ဝင္ေနတဲ့အခ်ိန္ evade ျဖစ္ရင္ (or) shadow step သုံးရင္ blast aoe DMG 2 ခ်က္ ထြက္ပါတယ္။ၾကမ္းလဲၾကမ္းပါတယ္။\n" +
                "buff effect ကေတာ့ unsheathe atk +(skill lvl)% တိုးေပးပါတယ္။mp cost 200ျဖစ္ပါတယ္။buff duration 20sec ပါ။\n" +
                "\n" +
                "dual sword နဲ႔သုံးရင္ေတာ့ weapon atk +25% ထပ္ရမွာျဖစ္ပါတယ္။ဒါ့အျပင္ duration ကိုလဲ 1 min 40sec ထပ္တိုးေပးပါတယ္။\n" +
                "one handed sword နဲ႔ဆိုရင္ေတာ့ blast DMG နဲ႔ Aoe ကိုတိုးေပးမွာပါ။(dual is also effected)");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "phantom slash ကတော့ ကိုယ်ဖျောက်ပီး၁၂ချက်ပိုင်းတာပါ။DMG လဲထွက်ပါတယ်။level 4 skill မရသေးတဲ့အချိန်မှာ main DPS skill အနေနဲ့သုံးကြပါတယ်။12ချက်ပိုင်းနေစဉ်မှာ invicible mode ဖြစ်ပီး ပိုင်းနေတဲ့အချိန်မှာလဲ joy stick ကိုရွေ့ပီး invicible mode ကိုcancel လို့ရပါတယ်။DMG ကတော့ 12ချက်ပြည့်အောင်ဆက်ထွက်မှာပါ။monster တေကိုသုံးတဲ့အခါ DMG 999999999 ထွက်နိုင်ပါတယ်။\n" +
                "freeze chance (10*skill lvl)% ရှိပါတယ်။maximum cast range 8mရှိပီး mp cost 400ပါ။placed skillဖြစ်ပါတယ်။\n");
        txt2.setText("\n" +
                "shadow stepကတော့ target ရဲ့အနောက်ကိုခုံတာပါ။ခုံပီးနောက်ချတဲ့ atkဟာ unsheathe atkဖြစ်ပါတယ်။buff တေလဲတိုးပေးပါတယ်။\n" +
                "ampr +(skill lvl)တိုးပေးပါတယ်။ဒါ့အပြင်နောက်သုံးမဲ့ skill ရဲ့ crit rate ကိုလဲ +(20*skill lvl)တိုးပေးပါတယ်။buff duration ကတော့နောက်ထပ်skillတခုမသုံးမချင်းပါ။maximum cast range 4m(lvl 1)ကနေ 12m (lvl 10)အထိရှိပါတယ်။mp cost ကတော့ lvl 1-3မှာ 400,  lvl 4-6 မှာ 300ဖြစ်ပီး lvl 7 အထက်မှာတော့ 200ပါ။ flash blast effect ဝင်နေရင် flash blast ရဲ့ blast DMG ထွက်ပါတယ်။\n");
        txt3.setText("\n" +
                "flash blast ကတော့ unsheathe atk%တိုးပေးတဲ့ buff skill ပါ။buff ဝင်နေတဲ့အချိန် evade ဖြစ်ရင် (or) shadow step သုံးရင် blast aoe DMG 2 ချက် ထွက်ပါတယ်။ကြမ်းလဲကြမ်းပါတယ်။\n" +
                "buff effect ကတော့ unsheathe atk +(skill lvl)% တိုးပေးပါတယ်။mp cost 200ဖြစ်ပါတယ်။buff duration 20sec ပါ။\n" +
                "\n" +
                "dual sword နဲ့သုံးရင်တော့ weapon atk +25% ထပ်ရမှာဖြစ်ပါတယ်။ဒါ့အပြင် duration ကိုလဲ 1 min 40sec ထပ်တိုးပေးပါတယ်။\n" +
                "one handed sword နဲ့ဆိုရင်တော့ blast DMG နဲ့ Aoe ကိုတိုးပေးမှာပါ။(dual is also effected)");
    }

}
