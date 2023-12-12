package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class halberdT4 extends Fragment {

    static TextView txt1,txt2,txt3;
    public halberdT4()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.halberd_t4,vg,false);
        txt1=v.findViewById(R.id.txt1hbt4);
        txt2=v.findViewById(R.id.txt2hbt4);
        txt3=v.findViewById(R.id.txt3hbt4);
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
                "dragon tooth ကေတာ့ အေဝးကေနပီးလွန္းခုံရိုက္တာပါ။ဝင္ရိုက္တဲ့ခ်ိန္တခါျပန္ထြက္တဲ့အခ်ိန္တခါ DMG ထိပါတယ္။level 4 skill ရဲ့ main DPS skill အျဖစ္သုံးၾကပါတယ္။ၾကမ္းလဲၾကမ္းပါတယ္။def မ်ားတဲ့ boss ေတမွာပိုၾကမ္းပါတယ္။\n" +
                "ဒီ skill မွာ crit rate (65+skill lvl) ပါပီး physical Pierce (10*skill lvl)%ပါပါတယ္။ခုံေနတဲ့အခ်ိန္အတြင္းမွာ stun,flinch,knockback,tumble ေတမထိပါဘူး။maximum cast range 12mျဖစ္ပီး mp cost 500ျဖစ္ပါတယ္။\n");
        txt2.setText("\n" +
                "chronos driveကေတာ့ေအာက္ကေနလွံနဲ႔ပင့္ထိုးတာျဖစ္ပါတယ္။ထိုးတဲ့အခ်ိန္မွာdmg သုံးခ်က္ဝင္ပါတယ္။dmg လဲေကာင္းပါတယ္။ဒါ့အျပင္ ေနာက္ထပ္ အခ်ိန္တစ္ခုအတြင္းမွာadditional hit ေတလဲထပ္လာပါတယ္။additional hit မွာ ampr ပါပါတယ္။(တျခား ampr buff ေတရဲ့effectမဝင္ပါဘူး)\n" +
                "skill သုံးပီးတိုင္း additional hit ထဖို႔ဝသ္တဲ့ buff duration ကေတာ့ 5sec(lvl 1-2)ကေန 10sec(lvl 10)အထိရွိပါတယ္။ additional hit count ကေတာ့ကိုယ့္ရဲ့ attack delay(aspd) , skill ရဲ့ motion speed နဲ႔ဆိုင္ပါတယ္။ampr (3*skill lvl) ရွိပါတယ္။mp cost 400ျဖစ္ပါတယ္။\n");
        txt3.setText("\n" +
                "God speed wield ကေတာ့ ကိုယ္ရဲ့ အျမန္ႏႈန္းကိုတိုးေပးတဲ့ buff skill ပါ။သူ႔မွာေၾကာက္စရာေကာင္းတဲ့ debuffလည္းပါပါတယ္။stack 3 ခုအထိရွိပါတယ္။\n" +
                "buff effect ေတကေတာ့\n" +
                "aspd +(30*skill lvl*number of stack),\n" +
                "motion speed +(skill lvl*number of stack)%\n" +
                "evasion rate +(skill lvl* number of stack)% တိုးေပးပါတယ္။\n" +
                "debuffအေနနဲ႔ကေတာ့ mp -(100*number of stack) ေလ်ာ့ေပးပီး\n" +
                "resistance -((100-3*skill lvl)*skill lvl)% ေလ်ာ့ေပးပါတယ္။resistance ေလ်ာ့တာမို႔ တခ်က္ေလးပဲျဖစ္ျဖစ္အရိုက္ခံရတာနဲ႔ေသနိုင္တဲ့အထိၾကမ္းပါတယ္။\n" +
                "buff duration  ကေတာ့ (10+ skill lvl*3) sec (or) DMG မထိမခ်င္းျဖစ္ပါတယ္။mp cost 100ျဖစ္ပါတယ္။weaponတိုင္းနဲ႔သုံးလို႔ရပါတယ္။\n" +
                "\n" +
                "halberd နဲ႔သုံးရင္ေတာ့ aspd +(100*number of stacks),buff duration +30secထပ္တိုးေပးမွာပါ။ resistance ေလ်ာ့တာကိုလဲ (45*number of stack)%ေလ်ာ့ခ်ေပးမွာပါ။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "dragon tooth ကတော့ အဝေးကနေပီးလှန်းခုံရိုက်တာပါ။ဝင်ရိုက်တဲ့ချိန်တခါပြန်ထွက်တဲ့အချိန်တခါ DMG ထိပါတယ်။level 4 skill ရဲ့ main DPS skill အဖြစ်သုံးကြပါတယ်။ကြမ်းလဲကြမ်းပါတယ်။def များတဲ့ boss တေမှာပိုကြမ်းပါတယ်။\n" +
                "ဒီ skill မှာ crit rate (65+skill lvl) ပါပီး physical Pierce (10*skill lvl)%ပါပါတယ်။ခုံနေတဲ့အချိန်အတွင်းမှာ stun,flinch,knockback,tumble တေမထိပါဘူး။maximum cast range 12mဖြစ်ပီး mp cost 500ဖြစ်ပါတယ်။\n");
        txt2.setText("\n" +
                "chronos driveကတော့အောက်ကနေလှံနဲ့ပင့်ထိုးတာဖြစ်ပါတယ်။ထိုးတဲ့အချိန်မှာdmg သုံးချက်ဝင်ပါတယ်။dmg လဲေကာင်းပါတယ်။ဒါ့အပြင် နောက်ထပ် အချိန်တစ်ခုအတွင်းမှာadditional hit တေလဲထပ်လာပါတယ်။additional hit မှာ ampr ပါပါတယ်။(တခြား ampr buff တေရဲ့effectမဝင်ပါဘူး)\n" +
                "skill သုံးပီးတိုင်း additional hit ထဖို့ဝသ်တဲ့ buff duration ကတော့ 5sec(lvl 1-2)ကနေ 10sec(lvl 10)အထိရှိပါတယ်။ additional hit count ကတော့ကိုယ့်ရဲ့ attack delay(aspd) , skill ရဲ့ motion speed နဲ့ဆိုင်ပါတယ်။ampr (3*skill lvl) ရှိပါတယ်။mp cost 400ဖြစ်ပါတယ်။\n");
        txt3.setText("\n" +
                "God speed wield ကတော့ ကိုယ်ရဲ့ အမြန်နှုန်းကိုတိုးပေးတဲ့ buff skill ပါ။သူ့မှာကြောက်စရာကောင်းတဲ့ debuffလည်းပါပါတယ်။stack 3 ခုအထိရှိပါတယ်။\n" +
                "buff effect တေကတော့\n" +
                "aspd +(30*skill lvl*number of stack),\n" +
                "motion speed +(skill lvl*number of stack)%\n" +
                "evasion rate +(skill lvl* number of stack)% တိုးပေးပါတယ်။\n" +
                "debuffအနေနဲ့ကတော့ mp -(100*number of stack) လျော့ပေးပီး\n" +
                "resistance -((100-3*skill lvl)*skill lvl)% လျော့ပေးပါတယ်။resistance လျော့တာမို့ တချက်လေးပဲဖြစ်ဖြစ်အရိုက်ခံရတာနဲ့သေနိုင်တဲ့အထိကြမ်းပါတယ်။\n" +
                "buff duration  ကတော့ (10+ skill lvl*3) sec (or) DMG မထိမချင်းဖြစ်ပါတယ်။mp cost 100ဖြစ်ပါတယ်။weaponတိုင်းနဲ့သုံးလို့ရပါတယ်။\n" +
                "\n" +
                "halberd နဲ့သုံးရင်တော့ aspd +(100*number of stacks),buff duration +30secထပ်တိုးပေးမှာပါ။ resistance လျော့တာကိုလဲ (45*number of stack)%လျော့ချပေးမှာပါ။");
    }

}
