package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dualT1 extends Fragment {

    static TextView txt1,txt2,txt3,txt4,txt5;
    public dualT1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.dual_t1,vg,false);
        txt1=v.findViewById(R.id.txt1dualt1);
        txt2=v.findViewById(R.id.txt2dualt1);
        txt3=v.findViewById(R.id.txt3dualt1);
        txt4=v.findViewById(R.id.txt4dualt1);
        txt5=v.findViewById(R.id.txt5dualt1);
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
                "dual sword mastery ကေတာ့ dual sword ကိုင္လို႔ရေအာင္လုပ္ေပးတဲ့ passive skill ပါ။ dual sword ကိုင္ရင္ debuffေတေပးပါတယ္။\n" +
                "debuff: accuracy -(55-(3*skill lvl))% နဲ႔ critical rate -(55-(3*skill lvl))% ေလ်ာ့ေပးပါတယ္။\n" +
                "buff အေနနဲ႔ကေတာ့ ampr ႏွစ္ဆရပါတယ္။\n");
        txt2.setText("\n" +
                "twin slash ကေတာ့ ခုန္ပီးဓားႏွစ္ေခ်ာင္းနဲ႔တၿပိဳင္ထဲခုတ္တာပါ။ Cdmg တိုးေပးထားတာေၾကာင့္ crit ထရင္ DMG ေတာ္ေတာ္ထြက္ပါတယ္။အေစာပိုင္းမွာ main DPS skill အေနနဲ႔သုံးလို႔ရပါတယ္။\n" +
                "skill ရဲ႕ Cdmg +(50+5*skill lvl) တိုးေပးပါတယ္။mp cost 200 ျဖစ္ပါတယ္။\n");
        txt3.setText("\n" +
                "cross parry ကေတာ့ ဓားႏွစ္ေခ်ာင္းနဲ႔ကန႔္လန႔္ကာပီး ခ်တာပါ။DMG ႏွစ္ခ်က္ထြက္ပါတယ္။ skill မွာ buff ႏွစ္မ်ိဳးပါပါတယ္။\n" +
                "ပထမ buff ကေတာ့ skill သုံးေနတုန္းမွာထတာပါ။သူကေတာ့ physical,magical resistance 10%(lvl  1)ကေန 90%(lvl 10)အထိတိုးေပးပါတယ္။ဒါ့အျပင္ tumble,knockback,stun,flinch ေတကိုလဲကာေပးပါတယ္။\n" +
                "ဒုတိယ buff ကေတာ့ skill သုံးေနတုန္းမွာ boss or mob စီက DMG ထိမွထြက္တာပါ။သူကေတာ့ atk +(skill lvl )%,aspd +(10*skill lvl)%တိုးေပးပါတယ္။buff duration ကေတာ့ 30sec or skill ထပ္မသုံးမခ်င္းပါ။\n" +
                "mp cost ကေတာ့ 100ပါ။\n");
        txt4.setText("\n" +
                "reflex ကေတာ့ buff skill ပါ။သူ႔ကို combo opener အေနနဲ႔အသုံးမ်ားပါတယ္။သူက evasion rateကိုတိုးေပးပီး def/mdef ကိုေလ်ာ့ေပးတာပါ။\n" +
                "evasion rate +(3*skill lvl)%တိုးေပးပါတယ္။def/mdef -(100-skill lvl)% ေလ်ာ့ေပးပါတယ္။buff duration ကေတာ့ 10sec ပါ။ weapon တိုင္းနဲ႔သုံးလို႔ရပါတယ္။mp cost 100ပါ။\n" +
                "dual sword နဲ႔သုံးရင္ေတာ့ buff duration +1min 30sec တိုးေပးမွာပါ။\n");
        txt5.setText("\n" +
                "dual sword control ကေတာ့ dual sword ကိုင္ရင္ရတဲ့ debuff(side effect)ေတကိုေလ်ာ့ေပးတာပါ။aspd လဲတိုးေပးပါတယ္။\n" +
                "accuracy +5+(3*skill lvl)%,critical rate +(5+(3*skill lvl))% တိုးေပးတယ္။aspd +(50*skill lvl)တိုးေပးပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "dual sword mastery ကတော့ dual sword ကိုင်လို့ရအောင်လုပ်ပေးတဲ့ passive skill ပါ။ dual sword ကိုင်ရင် debuffတေပေးပါတယ်။\n" +
                "debuff: accuracy -(55-(3*skill lvl))% နဲ့ critical rate -(55-(3*skill lvl))% လျော့ပေးပါတယ်။\n" +
                "buff အနေနဲ့ကတော့ ampr နှစ်ဆရပါတယ်။\n");
        txt2.setText("\n" +
                "twin slash ကတော့ ခုန်ပီးဓားနှစ်ချောင်းနဲ့တပြိုင်ထဲခုတ်တာပါ။ Cdmg တိုးပေးထားတာကြောင့် crit ထရင် DMG တော်တော်ထွက်ပါတယ်။အစောပိုင်းမှာ main DPS skill အနေနဲ့သုံးလို့ရပါတယ်။\n" +
                "skill ရဲ့ Cdmg +(50+5*skill lvl) တိုးပေးပါတယ်။mp cost 200 ဖြစ်ပါတယ်။\n");
        txt3.setText("\n" +
                "cross parry ကတော့ ဓားနှစ်ချောင်းနဲ့ကန့်လန့်ကာပီး ချတာပါ။DMG နှစ်ချက်ထွက်ပါတယ်။ skill မှာ buff နှစ်မျိုးပါပါတယ်။\n" +
                "ပထမ buff ကတော့ skill သုံးနေတုန်းမှာထတာပါ။သူကတော့ physical,magical resistance 10%(lvl  1)ကနေ 90%(lvl 10)အထိတိုးပေးပါတယ်။ဒါ့အပြင် tumble,knockback,stun,flinch တေကိုလဲကာပေးပါတယ်။\n" +
                "ဒုတိယ buff ကတော့ skill သုံးနေတုန်းမှာ boss or mob စီက DMG ထိမှထွက်တာပါ။သူကတော့ atk +(skill lvl )%,aspd +(10*skill lvl)%တိုးပေးပါတယ်။buff duration ကတော့ 30sec or skill ထပ်မသုံးမချင်းပါ။\n" +
                "mp cost ကတော့ 100ပါ။\n");
        txt4.setText("\n" +
                "reflex ကတော့ buff skill ပါ။သူ့ကို combo opener အနေနဲ့အသုံးများပါတယ်။သူက evasion rateကိုတိုးပေးပီး def/mdef ကိုလျော့ပေးတာပါ။\n" +
                "evasion rate +(3*skill lvl)%တိုးပေးပါတယ်။def/mdef -(100-skill lvl)% လျော့ပေးပါတယ်။buff duration ကတော့ 10sec ပါ။ weapon တိုင်းနဲ့သုံးလို့ရပါတယ်။mp cost 100ပါ။\n" +
                "dual sword နဲ့သုံးရင်တော့ buff duration +1min 30sec တိုးပေးမှာပါ။\n");
        txt5.setText("\n" +
                "dual sword control ကတော့ dual sword ကိုင်ရင်ရတဲ့ debuff(side effect)တေကိုလျော့ပေးတာပါ။aspd လဲတိုးပေးပါတယ်။\n" +
                "accuracy +5+(3*skill lvl)%,critical rate +(5+(3*skill lvl))% တိုးပေးတယ်။aspd +(50*skill lvl)တိုးပေးပါတယ်။");
    }

}
