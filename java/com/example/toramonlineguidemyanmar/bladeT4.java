package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bladeT4 extends Fragment {

    static TextView txt1,txt2,txt3;
    public bladeT4()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.blade_t4,vg,false);
        txt1=v.findViewById(R.id.txt1bladet4);
        txt2=v.findViewById(R.id.txt2bladet4);
        txt3=v.findViewById(R.id.txt3bladet4);
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
        txt1.setText(
                "meteor breaker ကေတာ့ ေလေပၚခုံပီး႐ိုက္ခ်တာပါ။level 4 skill ရထားပီးတဲ့သူေတ main DPS skill အျဖစ္သုံးၾကတဲ့ skill လဲျဖစ္ပါတယ္။ DMG လဲ blade skill ေတြထဲမာအၾကမ္းဆုံးပါ။သူက DMG ႏွစ္ခါထိပါတယ္။ပထမအခ်က္က dizzy ျဖစ္ေအာင္လုပ္ႏိုင္တဲ့ chance (2.5*skill lvl )% ရွိပါတယ္။ဒါအျပင္ေလေပၚခုံေနတဲ့အခ်ိန္အတြင္း DMG မထိပါဘူး invicible ျဖစ္ပါတယ္။ဒုတိယအခ်က္ကေတာ့ ေဘးကိုလဲ DMG ထိပါတယ္။mp cost 600 သုံးရပီး aggro လဲအရမ္းထြက္ပါတယ္။tank ေတလဲသုံးေလ့ရွိတဲ့ skill ျဖစ္ပါတယ္။\n" +
                "one handed sword သုံးထားရင္ေတာ့ dizzy ျဖစ္ေအာင္လုပ္တဲ့ chance ကို 75%ထပ္တိုးေပးမာပါ။\n" +
                "two handed sword သုံးထားရင္ေတာ့ ဒုတိယအခ်က္ရဲ႕ DMG ကိုထပ္တိုးေပးမွာပါ။\n" +
                "\n");
        txt2.setText("buster blade ကေတာ့အေဝးကေန သုံးခ်က္႐ိုက္တာပါ။သူ႔ကိုေတာ့secondary DPS skill အေနနဲ႔အသုံးျပဳၾကပါတယ္။DMG လဲထြက္သလို buff လဲေပးပါတယ္။အၿမဲတမ္း crit ထပါတယ္။\n" +
                "buff effect ကေတာ့ weapon atk +(skill lvl )% တိုးေပးပါတယ္။ဒါ့အျပင္ HP 1000 ျပန္ျဖည့္ေပးပါတယ္။ buff ဝင္ေနခ်ိန္အတြင္းမွာထပ္သုံးရင္ buff duration ကိုထပ္မတိုးေပးသလို HP လဲျပန္မတက္ပါဘူး။ cast range 7m ရွိပါတယ္။mp cost 300ပါ။\n" +
                "one handed sword သုံးထားရင္ေတာ့ HP ျပန္တက္တဲ့ amount ကို vit*2 ထပ္ေပါင္းေပးပါတယ္။\n" +
                "two handed sword သုံးထားရင္ေတာ့ DMG ကို str ေပၚမူတည္ပီးထပ္တိုးေပးပါတယ္။\n" +
                "\n");
        txt3.setText("berserk ကေတာ့ buff skill ပါ။debuff လဲမ်ားသလို အသုံးလဲဝင္ပါတယ္။ သူကေတာ့basic atk dmg,aspd,crt ေတြကိုတိုးေပးပီး stability,def,mdefေတြကိုေလ်ာ့ေပးပါတယ္။ဒါ့အျပင္ rampage ဟာလဲ ailment ထိရင္မပ်က္ေတာ့ပါဘူး။\n" +
                "aspd+(10*skill lvl)% , (100*skill lvl)ထပ္တိုးေပးပါတယ္။\n" +
                "critical rate +(2.5*skill lvl)တိုးေပးပါတယ္။\n" +
                "basic atk DMG ကို (0.1*skill lvl) ထပ္တိုးေပးပါတယ္။(lvl 10မွာ basic atk DMG ႏွစ္ဆျဖစ္သြားမာပါ)\n" +
                "stability -(100-(5*skill lvl )) ေလ်ာ့ေပးပါတယ္။(only main hand stability in dual sword)\n" +
                "def/mdef -(100-skill lvl)% ေလ်ာ့ေပးပါတယ္။\n" +
                "buff duration ကေတာ့ 10 sec ျဖစ္ပီး mp cost 500ပါ။\n" +
                "\n" +
                "one handed swordကိုင္ထားရင္ေတာ့ stability ေလ်ာ့တာကိုတဝက္ေလ်ာ့ေပးပါတယ္။def/mdef ေလ်ာ့တာကိုလဲတဝက္ေလ်ာ့ေပးပါတယ္(dual sword မပါ)။buff duration + 20 sec တိုးေပးပါတယ္။\n" +
                "two handed sword သုံးထားရင္ေတာ့  stability ေလ်ာ့တာကိုတဝက္ေလ်ာ့ေပးပါတယ္။critical buff ကိုႏွစ္ဆတိုးေပးပါတယ္။buff duration +20sec တိုးေပးပါတယ္။");

    }

    public static void unicode()
    {
        txt1.setText(
                "meteor breaker ကတော့ လေပေါ်ခုံပီးရိုက်ချတာပါ။level 4 skill ရထားပီးတဲ့သူတေ main DPS skill အဖြစ်သုံးကြတဲ့ skill လဲဖြစ်ပါတယ်။ DMG လဲ blade skill တွေထဲမာအကြမ်းဆုံးပါ။သူက DMG နှစ်ခါထိပါတယ်။ပထမအချက်က dizzy ဖြစ်အောင်လုပ်နိုင်တဲ့ chance (2.5*skill lvl )% ရှိပါတယ်။ဒါအပြင်လေပေါ်ခုံနေတဲ့အချိန်အတွင်း DMG မထိပါဘူး invicible ဖြစ်ပါတယ်။ဒုတိယအချက်ကတော့ ဘေးကိုလဲ DMG ထိပါတယ်။mp cost 600 သုံးရပီး aggro လဲအရမ်းထွက်ပါတယ်။tank တေလဲသုံးလေ့ရှိတဲ့ skill ဖြစ်ပါတယ်။\n" +
                "one handed sword သုံးထားရင်တော့ dizzy ဖြစ်အောင်လုပ်တဲ့ chance ကို 75%ထပ်တိုးပေးမာပါ။\n" +
                "two handed sword သုံးထားရင်တော့ ဒုတိယအချက်ရဲ့ DMG ကိုထပ်တိုးပေးမှာပါ။\n" +
                "\n");
        txt2.setText("buster blade ကတော့အဝေးကနေ သုံးချက်ရိုက်တာပါ။သူ့ကိုတော့secondary DPS skill အနေနဲ့အသုံးပြုကြပါတယ်။DMG လဲထွက်သလို buff လဲပေးပါတယ်။အမြဲတမ်း crit ထပါတယ်။\n" +
                "buff effect ကတော့ weapon atk +(skill lvl )% တိုးပေးပါတယ်။ဒါ့အပြင် HP 1000 ပြန်ဖြည့်ပေးပါတယ်။ buff ဝင်နေချိန်အတွင်းမှာထပ်သုံးရင် buff duration ကိုထပ်မတိုးပေးသလို HP လဲပြန်မတက်ပါဘူး။ cast range 7m ရှိပါတယ်။mp cost 300ပါ။\n" +
                "one handed sword သုံးထားရင်တော့ HP ပြန်တက်တဲ့ amount ကို vit*2 ထပ်ပေါင်းပေးပါတယ်။\n" +
                "two handed sword သုံးထားရင်တော့ DMG ကို str ပေါ်မူတည်ပီးထပ်တိုးပေးပါတယ်။\n" +
                "\n");
        txt3.setText("berserk ကတော့ buff skill ပါ။debuff လဲများသလို အသုံးလဲဝင်ပါတယ်။ သူကတော့basic atk dmg,aspd,crt တွေကိုတိုးပေးပီး stability,def,mdefတွေကိုလျော့ပေးပါတယ်။ဒါ့အပြင် rampage ဟာလဲ ailment ထိရင်မပျက်တော့ပါဘူး။\n" +
                "aspd+(10*skill lvl)% , (100*skill lvl)ထပ်တိုးပေးပါတယ်။\n" +
                "critical rate +(2.5*skill lvl)တိုးပေးပါတယ်။\n" +
                "basic atk DMG ကို (0.1*skill lvl) ထပ်တိုးပေးပါတယ်။(lvl 10မှာ basic atk DMG နှစ်ဆဖြစ်သွားမာပါ)\n" +
                "stability -(100-(5*skill lvl )) လျော့ပေးပါတယ်။(only main hand stability in dual sword)\n" +
                "def/mdef -(100-skill lvl)% လျော့ပေးပါတယ်။\n" +
                "buff duration ကတော့ 10 sec ဖြစ်ပီး mp cost 500ပါ။\n" +
                "\n" +
                "one handed swordကိုင်ထားရင်တော့ stability လျော့တာကိုတဝက်လျော့ပေးပါတယ်။def/mdef လျော့တာကိုလဲတဝက်လျော့ပေးပါတယ်(dual sword မပါ)။buff duration + 20 sec တိုးပေးပါတယ်။\n" +
                "two handed sword သုံးထားရင်တော့  stability လျော့တာကိုတဝက်လျော့ပေးပါတယ်။critical buff ကိုနှစ်ဆတိုးပေးပါတယ်။buff duration +20sec တိုးပေးပါတယ်။");
    }

}
