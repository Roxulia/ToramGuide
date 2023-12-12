package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dualT4 extends Fragment {

    static TextView txt1,txt2,txt3;
    public dualT4()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.dual_t4,vg,false);
        txt1=v.findViewById(R.id.txt1dualt4);
        txt2=v.findViewById(R.id.txt2dualt4);
        txt3=v.findViewById(R.id.txt3dualt4);
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
                "shining cross ကေတာ့ၾကက္ေျခခတ္ပုံအလင္းတန္းေတပစ္တာပါ။DMG လဲေတာ္ေတာ္ၾကမ္းပါတယ္။ main DPS skill အေနနဲ႔သုံးေလ့ရွိၾကပါတယ္။ DMG ကေတာ့ str,agi,Dex  ေတေပၚမွာမူတည္ပီးထပ္တိုးေပးပါတယ္။\n" +
                "maximum cast range 12m ရွိပါတယ္။ဒါေပမဲ့ 3m အထက္ကေနသုံးရင္ metre တိုးတိုင္း DMG ေလ်ာ့ပါတယ္။ skill သုံးပီးရင္ HP recovery buff ဝင္ပါတယ္။7m ထက္နဲတဲ့ေနရာကေနသုံးရင္(0.1*skill lvl)% HP recovery per 3sec ရမွာပါ။(11m အတြင္းမွာဆိုႏွစ္ဆ 11m အထက္ဆိုသုံးဆရရွိမွာပါ)buff duration 9sec ပါ။crit ထရင္လဲ mp (10*skill lvl)ျပန္ျပည့္ပါတယ္။mp cost 600ျဖစ္ပါတယ္။placed skill ပါ။ဒါမဲ့short range DMG,whack,စတာေတအကုန္လုံးနဲ႔ effect ဝင္ပါတယ္။\n");
        txt2.setText("\n" +
                "storm reaper ကေတာ့ ဓားပစ္ပီးအေဝးကိုခုန္တာပါ။ခုန္ေနတဲ့အခ်ိန္ invicible mode ရပါတယ္။DMG လဲၾကမ္းပါတယ္။တခ်ိဳ႕ player ေတmain DPS အေနနဲ႔သုံးၾကပါတယ္။\n" +
                "unsheathe skill ျဖစ္ပါတယ္။skill သုံးပီးေနာက္ skill တခုမသုံးမခ်င္း short range DMG +(10*skill lvl)% တိုးေပးပါတယ္။DMG ကေတာ့ Dex အေပၚမွာလဲမီခိုပါတယ္။ခုန္ပီးက်တဲ့ေနရာကေတာ့ skill သုံးတဲ့ေနရာရဲ႕အေနာက္ဘက္ 8m ပါ။mp cost 400ျဖစ္ပါတယ္။long range လို႔ပဲသတ္မွတ္ပါတယ္။\n");
        txt3.setText("\n" +
                "saber aura ကေတာ့ buff skill ပါ။သုံးလိုက္ရင္ element ေပၚမူတည္ပီးဓားႏွစ္လက္မွာအေရာင္ေတေတာက္လာတာပါ။buff effect ေကာ debuffေကာပါပါတယ္။stack နဲ႔ပါ။\n" +
                "buff စစခ်င္း stack 1 ခုရပီး 7sec(lvl 1) or 2sec(lvl 10) ၾကာတိုင္း stack 1ခုတိုးမွာပါ။\n" +
                "buff effect ေတကေတာ့ movement speed ကိုႏွစ္ဆတိုးပါတယ္။aspd +(10*skill lvl*number of stack)%,\n" +
                "accuracy +(5*skill lvl*number of stack), \n" +
                "critical rate +(floor(2.5*skill lvl)*number of stack),\n" +
                "ampr+(ceiling(0.5*skill lvl)*number of stack) တိုးေပးပါတယ္။\n" +
                "debuff အေနနဲ႔ current HPရဲ႕ (25-2*skill lvl+5*(number of stack-9))% ဟာစကၠန႔္တိုင္းေလ်ာ့ေလ်ာ့သြားပါတယ္။တကယ္လို႔ HP မေလာက္ေတာ့ရင္ (or) DMG ထိပီးေသရင္ immortal effect ဝင္ပီးမေသဘဲhp  (5*number of stack)%ျပန္ျပည့္ပါတယ္။အ့လိုျပန္ျပည့္ပီးတဲ့အခါမွာ cooldown (10+number of stack) secက်ပါတယ္။ အ့cooldown က်ေနစဥ္အတြင္း skill ထပ္သုံးမရပါဘူး။combo ထဲလဲထည့္သုံးမရသလို dual sword တမ်ိဳးထဲမွာပဲသုံးလို႔ရတာပါ။ mp cost 900ျဖစ္ပါတယ္။သုံးတတ္ရင္ၾကမ္းပီးမသုံးတတ္ရင္ဖြတ္ပါ။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "shining cross ကတော့ကြက်ခြေခတ်ပုံအလင်းတန်းတေပစ်တာပါ။DMG လဲတော်တော်ကြမ်းပါတယ်။ main DPS skill အနေနဲ့သုံးလေ့ရှိကြပါတယ်။ DMG ကတော့ str,agi,Dex  တေပေါ်မှာမူတည်ပီးထပ်တိုးပေးပါတယ်။\n" +
                "maximum cast range 12m ရှိပါတယ်။ဒါပေမဲ့ 3m အထက်ကနေသုံးရင် metre တိုးတိုင်း DMG လျော့ပါတယ်။ skill သုံးပီးရင် HP recovery buff ဝင်ပါတယ်။7m ထက်နဲတဲ့နေရာကနေသုံးရင်(0.1*skill lvl)% HP recovery per 3sec ရမှာပါ။(11m အတွင်းမှာဆိုနှစ်ဆ 11m အထက်ဆိုသုံးဆရရှိမှာပါ)buff duration 9sec ပါ။crit ထရင်လဲ mp (10*skill lvl)ပြန်ပြည့်ပါတယ်။mp cost 600ဖြစ်ပါတယ်။placed skill ပါ။ဒါမဲ့short range DMG,whack,စတာတေအကုန်လုံးနဲ့ effect ဝင်ပါတယ်။\n");
        txt2.setText("\n" +
                "storm reaper ကတော့ ဓားပစ်ပီးအဝေးကိုခုန်တာပါ။ခုန်နေတဲ့အချိန် invicible mode ရပါတယ်။DMG လဲကြမ်းပါတယ်။တချို့ player တေmain DPS အနေနဲ့သုံးကြပါတယ်။\n" +
                "unsheathe skill ဖြစ်ပါတယ်။skill သုံးပီးနောက် skill တခုမသုံးမချင်း short range DMG +(10*skill lvl)% တိုးပေးပါတယ်။DMG ကတော့ Dex အပေါ်မှာလဲမီခိုပါတယ်။ခုန်ပီးကျတဲ့နေရာကတော့ skill သုံးတဲ့နေရာရဲ့အနောက်ဘက် 8m ပါ။mp cost 400ဖြစ်ပါတယ်။long range လို့ပဲသတ်မှတ်ပါတယ်။\n");
        txt3.setText("\n" +
                "saber aura ကတော့ buff skill ပါ။သုံးလိုက်ရင် element ပေါ်မူတည်ပီးဓားနှစ်လက်မှာအရောင်တေတောက်လာတာပါ။buff effect ကော debuffကောပါပါတယ်။stack နဲ့ပါ။\n" +
                "buff စစချင်း stack 1 ခုရပီး 7sec(lvl 1) or 2sec(lvl 10) ကြာတိုင်း stack 1ခုတိုးမှာပါ။\n" +
                "buff effect တေကတော့ movement speed ကိုနှစ်ဆတိုးပါတယ်။aspd +(10*skill lvl*number of stack)%,\n" +
                "accuracy +(5*skill lvl*number of stack), \n" +
                "critical rate +(floor(2.5*skill lvl)*number of stack),\n" +
                "ampr+(ceiling(0.5*skill lvl)*number of stack) တိုးပေးပါတယ်။\n" +
                "debuff အနေနဲ့ current HPရဲ့ (25-2*skill lvl+5*(number of stack-9))% ဟာစက္ကန့်တိုင်းလျော့လျော့သွားပါတယ်။တကယ်လို့ HP မလောက်တော့ရင် (or) DMG ထိပီးသေရင် immortal effect ဝင်ပီးမသေဘဲhp  (5*number of stack)%ပြန်ပြည့်ပါတယ်။အ့လိုပြန်ပြည့်ပီးတဲ့အခါမှာ cooldown (10+number of stack) secကျပါတယ်။ အ့cooldown ကျနေစဉ်အတွင်း skill ထပ်သုံးမရပါဘူး။combo ထဲလဲထည့်သုံးမရသလို dual sword တမျိုးထဲမှာပဲသုံးလို့ရတာပါ။ mp cost 900ဖြစ်ပါတယ်။သုံးတတ်ရင်ကြမ်းပီးမသုံးတတ်ရင်ဖွတ်ပါ။");
    }

}
