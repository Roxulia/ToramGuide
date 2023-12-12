package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class martialT4 extends Fragment {

    static TextView txt1,txt2,txt3;
    public martialT4()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.martial_t4,vg,false);
        txt1=v.findViewById(R.id.txt1martialt4);
        txt2=v.findViewById(R.id.txt2martialt4);
        txt3=v.findViewById(R.id.txt3martialt4);
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
                "chariot ကေတာ့လက္ထဲကေနေလဆာတန္းႀကီးပစ္တာပါ။Kamehameha နဲ႔တူပါတယ္။ level 4 skill ထဲမွာ DMG  အထုတ္ႏိုင္ဆုံးပါ။အေဝးကေနလဲသုံးလို႔ရပါတယ္။စြမ္းအားစုရတာမို႔ charge timeပါပါတယ္။\n" +
                "fear ailment chance (5*skill lvl)% ရွိပါတယ္။boss ေတဆိုရင္ေတာ့ chance  တဝက္ပဲရွိပါတယ္။ \n" +
                "charge time ကေတာ့ lvl 1မွာ 11 sec ျဖစ္ပီး lvl 10မွာေတာ့ 1sec ပါ။cast range 12m ရွိပီးmp cost ကေတာ့ 500ပါ။\n" +
                "\n" +
                "main or sub weaponမွာ knuckle သုံးထားရင္ေတာ့ agi ေပၚမူတည္ပီးdmg ထပ္တိုးေပးမွာပါ။ဒါ့အျပင္ fear chance ကိုလဲ 50% တိုးေပးပီး charge time ကိုလဲ 1 sec ေလ်ာ့ေပးပါတယ္။\n");
        txt2.setText("\n" +
                "rush ကေတာ့ triple kick လိုမ်ိဳးပါပဲ။ သူကေတာ့ ကန္တာပဲမဟုတ္ပဲထိုးတာပါပါပါတယ္။ေလးခ်က္ခ်တာပါ။DMG လဲထြက္ပါတယ္။ secondary DPS skill အေနနဲ႔သုံးၾကပါတယ္။skill သုံးပီးတိုင္း motion speed buff ေပးပါတယ္။\n" +
                "buff effect ကေတာ့ motion speed +2% ကေန 5% အထိတိုးေပးပါတယ္(buff effect က skill lvlအလိုက္တိုးလာတာပါ။)\n" +
                "buff duration ကေတာ့ 10secျဖစ္ပါတယ္။mp cost 400ျဖစ္ပါတယ္။\n" +
                "\n" +
                "main or sub weaponမွာ knuckle သုံးထားရင္ေတာ့ skill DMG ဟာ agiအေပၚမူတည္ပီး တိုးေပးမွာျဖစ္ပါတယ္။motion speedတိုးတာကိုလဲ ႏွစ္ဆတိုးေပးမွာပါ။ ");
        txt3.setText("\n" +
                "chakra ကေတာ့ buff skill ျဖစ္ပါတယ္။charge time ပါပါတယ္။ party member အကုန္သက္ေရာက္မႈရွိပါတယ္။support skill ပုံစံပါ။\n" +
                "skill သုံးတာပီးေျမာက္ရင္ 50mp ျပန္ျဖည့္ေပးပါတယ္။ဒါ့အျပင္ ampr ကိုလဲ  +1 (lvl 1)ကေန +15 (lvl 10)အထိတိုးေပးမွာပါ။buff effectဝင္ေနစဥ္အတြင္းမွာ႐ိုက္ခံရရင္ DMG ကို (2* vit)ေလ်ာ့ေပးပီးက်န္တဲ့ DMG ကို (10+ 2*skill lvl)% ထပ္ေလ်ာ့ေပးမွာပါ။(skill cast တဲ့သူကေတာ့ပထမတခ်က္ေလ်ာ့တဲ့ effect မရပါဘူး)\n" +
                "buff duration ကေတာ့ (10+ skill lvl) sec (or) အ႐ိုက္မခံရမခ်င္းျဖစ္ပါတယ္။\n" +
                "\n" +
                "skill သုံးတဲ့သူက main or sub weapon မွာ knuckle သုံးထားရင္ေတာ့mp recovery + 50တိုးေပးမွာပါ။DMG reduction % ကိုလဲ 20%ထပ္တိုးေပးမွာပါ။( ထိတဲ့ DMG ကို 20%ထပ္ေလ်ာ့ေပးမွာပါ)");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "chariot ကတော့လက်ထဲကနေလေဆာတန်းကြီးပစ်တာပါ။Kamehameha နဲ့တူပါတယ်။ level 4 skill ထဲမှာ DMG  အထုတ်နိုင်ဆုံးပါ။အဝေးကနေလဲသုံးလို့ရပါတယ်။စွမ်းအားစုရတာမို့ charge timeပါပါတယ်။\n" +
                "fear ailment chance (5*skill lvl)% ရှိပါတယ်။boss တေဆိုရင်တော့ chance  တဝက်ပဲရှိပါတယ်။ \n" +
                "charge time ကတော့ lvl 1မှာ 11 sec ဖြစ်ပီး lvl 10မှာတော့ 1sec ပါ။cast range 12m ရှိပီးmp cost ကတော့ 500ပါ။\n" +
                "\n" +
                "main or sub weaponမှာ knuckle သုံးထားရင်တော့ agi ပေါ်မူတည်ပီးdmg ထပ်တိုးပေးမှာပါ။ဒါ့အပြင် fear chance ကိုလဲ 50% တိုးပေးပီး charge time ကိုလဲ 1 sec လျော့ပေးပါတယ်။\n");
        txt2.setText("\n" +
                "rush ကတော့ triple kick လိုမျိုးပါပဲ။ သူကတော့ ကန်တာပဲမဟုတ်ပဲထိုးတာပါပါပါတယ်။လေးချက်ချတာပါ။DMG လဲထွက်ပါတယ်။ secondary DPS skill အနေနဲ့သုံးကြပါတယ်။skill သုံးပီးတိုင်း motion speed buff ပေးပါတယ်။\n" +
                "buff effect ကတော့ motion speed +2% ကနေ 5% အထိတိုးပေးပါတယ်(buff effect က skill lvlအလိုက်တိုးလာတာပါ။)\n" +
                "buff duration ကတော့ 10secဖြစ်ပါတယ်။mp cost 400ဖြစ်ပါတယ်။\n" +
                "\n" +
                "main or sub weaponမှာ knuckle သုံးထားရင်တော့ skill DMG ဟာ agiအပေါ်မူတည်ပီး တိုးပေးမှာဖြစ်ပါတယ်။motion speedတိုးတာကိုလဲ နှစ်ဆတိုးပေးမှာပါ။ \n");
        txt3.setText("\n" +
                "chakra ကတော့ buff skill ဖြစ်ပါတယ်။charge time ပါပါတယ်။ party member အကုန်သက်ရောက်မှုရှိပါတယ်။support skill ပုံစံပါ။\n" +
                "skill သုံးတာပီးမြောက်ရင် 50mp ပြန်ဖြည့်ပေးပါတယ်။ဒါ့အပြင် ampr ကိုလဲ  +1 (lvl 1)ကနေ +15 (lvl 10)အထိတိုးပေးမှာပါ။buff effectဝင်နေစဉ်အတွင်းမှာရိုက်ခံရရင် DMG ကို (2* vit)လျော့ပေးပီးကျန်တဲ့ DMG ကို (10+ 2*skill lvl)% ထပ်လျော့ပေးမှာပါ။(skill cast တဲ့သူကတော့ပထမတချက်လျော့တဲ့ effect မရပါဘူး)\n" +
                "buff duration ကတော့ (10+ skill lvl) sec (or) အရိုက်မခံရမချင်းဖြစ်ပါတယ်။\n" +
                "\n" +
                "skill သုံးတဲ့သူက main or sub weapon မှာ knuckle သုံးထားရင်တော့mp recovery + 50တိုးပေးမှာပါ။DMG reduction % ကိုလဲ 20%ထပ်တိုးပေးမှာပါ။( ထိတဲ့ DMG ကို 20%ထပ်လျော့ပေးမှာပါ)");
    }

}
