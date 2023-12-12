package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.awt.font.TextAttribute;

public class magicT1 extends Fragment {

    static TextView txt1,txt2,txt3,txt4,txt5;
    public magicT1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.magic_t1,vg,false);
        txt1=v.findViewById(R.id.txt1magict1);
        txt2=v.findViewById(R.id.txt2magict1);
        txt3=v.findViewById(R.id.txt3magict1);
        txt4=v.findViewById(R.id.txt4magict1);
        txt5=v.findViewById(R.id.txt5magict1);
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
                "magic arrow ကေတာ့ အကြင္းေလးေပၚလာပီးအ့ထဲကေနျမႇားနဲ႔ပစ္တာပါ။cast time ရွိပါတယ္။lvl ႏွစ္ခုတိုးတိုင္းမွာ hit count တစ္ခုတိုးပါတယ္။DMG လဲထြက္သင့္သေလာက္ထြက္ပါတယ္။weapon ရဲ႕ element ေပၚမူတည္ပီးနာမည္ေျပာင္းသြားပါတယ္။\n" +
                "cast time ကေတာ့ 2 sec ပါ။maximum cast range 12mရွိပါတယ္။ mp cost ကေတာ့ 100ပါ။placed skill ပါ။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ DMG တိုးေပးမွာပါ။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ ပစ္တဲ့အခ်က္ေရ(hit count)ကို 2ခ်က္တိုးေပးမွာပါ။\n");
        txt2.setText("\n" +
                "magic javelin ကေတာ့အေပၚကေနပစ္ခ်တာပါ။status ailment ထုတ္ႏိုင္တဲ့ chance ရွိပါတယ္။level 1 skill ထဲမွာdmg မ်ားတဲ့ skill ပါ။ cast time လဲမလိုပါဘူး။\n" +
                "ailment chance (7.5*skill lvl)% ရွိပါတယ္။ element အေပၚမူတည္ပီး နာမည္ေျပာင္းသလို ailment type လဲေျပာင္းပါတယ္။\n" +
                "neutral - flinch\n" +
                "fire - ignite\n" +
                "water - freeze \n" +
                "wind - paralysed\n" +
                "earth - slow\n" +
                "light - dizzy\n" +
                "dark - fear\n" +
                "mp cost ကေတာ့ 200 ျဖစ္ပီး maximun cast rangeကေတာ့ 8m ပါ။placed skill ပါ။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ DMG တိုးေပးမွာပါ။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ ailment chance ကို 25%တိုးေပးမွာပါ။\n");
        txt3.setText("\n" +
                "magic wall ကေတာ့ user ေအာက္ကေနပီးအကြင္းႀကီးထြက္လာတာပါ။ အ့အကြင္းထဲမွာရွိတဲ့ monsters/boss ေတကိုတြန္းထုတ္ေပးပါတယ္။DMG လဲထိပါတယ္။\n" +
                "cast time ကေတာ့ 1sec ပါ။တြန္းထုတ္ႏိုင္တဲ့အခ်က္ေရကေတာ့ lvl 1 မွာ 5 ခ်က္ျဖစ္ပီး lvl 10မွာ 10ခ်က္ျဖစ္ပါတယ္။\n" +
                "knockback chance ကေတာ့ aggro ဝင္ေနသ၍ 100%ပါ။knockback distance ကေတာ့ 5m ျဖစ္ပီး boss ေတဆိုရင္ေတာ့ တဝက္ေလာက္ထိပဲတြန္းႏိုင္ပါတယ္။hit range ကေတာ့ စစ သုံးခ်င္းေနရာရဲ႕ 1.5m ပတ္လည္ပါ။mp cost 200ပါ။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ DMG ပိုတိုးေပးမွာပါ။\n" +
                "magic device ဆိုရင္ေတာ့ hit range + 1m တိုးေပးမွာပါ။\n");
        txt4.setText("\n" +
                "magic mastery ကေတာ့ staff/magic device သုံးတဲ့အခါရတဲ့ matk,atkကိုတိုးေပးတဲ့ passive ပါ။\n" +
                "weapon atk +(3*skill lvl)% တိုးေပးပါတယ္။\n" +
                "lvl 10 မွာဆိုရင္ေတာ့ matk +3%အထိတိုးေပးမွာပါ။\n");
        txt5.setText("\n" +
                "mp charge ကေတာ့ mana ျပန္ျဖည့္တာပါ။ cast time နဲ႔ပါပဲ။ပုံမွန္အားျဖင့္အသုံးမ်ားတဲ့ skill ပါ။ mp (200+10*skill lvl) ျပန္ျဖည့္ေပးပါတယ္။ cast time ကေတာ့ 9sec ကေန 6 sec အထိ lvlတိုးတိုင္းေျပာင္းသြားမာပါ။ဒါ့အျပင္ level 4 skill က maximizer ရဲ႕ cast time ကိုလဲ ေနာက္ skill တခုမသုံးမခ်င္း(skill lvl) sec ေလ်ာ့ေပးပါတယ္။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ cast time ကိုတဝက္ေလ်ာ့ေပးမွာပါ။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ cast time ကို cast time/1.5 sec ေျပာင္းေပးမွာပါ။ဒါ့အျပင္ mp ျပန္ျပည့္တာကိုလဲ 50 တိုးေပးပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "magic arrow ကတော့ အကွင်းလေးပေါ်လာပီးအ့ထဲကနေမြှားနဲ့ပစ်တာပါ။cast time ရှိပါတယ်။lvl နှစ်ခုတိုးတိုင်းမှာ hit count တစ်ခုတိုးပါတယ်။DMG လဲထွက်သင့်သလောက်ထွက်ပါတယ်။weapon ရဲ့ element ပေါ်မူတည်ပီးနာမည်ပြောင်းသွားပါတယ်။\n" +
                "cast time ကတော့ 2 sec ပါ။maximum cast range 12mရှိပါတယ်။ mp cost ကတော့ 100ပါ။placed skill ပါ။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ DMG တိုးပေးမှာပါ။\n" +
                "magic device နဲ့ဆိုရင်တော့ ပစ်တဲ့အချက်ရေ(hit count)ကို 2ချက်တိုးပေးမှာပါ။\n");
        txt2.setText("\n" +
                "magic javelin ကတော့အပေါ်ကနေပစ်ချတာပါ။status ailment ထုတ်နိုင်တဲ့ chance ရှိပါတယ်။level 1 skill ထဲမှာdmg များတဲ့ skill ပါ။ cast time လဲမလိုပါဘူး။\n" +
                "ailment chance (7.5*skill lvl)% ရှိပါတယ်။ element အပေါ်မူတည်ပီး နာမည်ပြောင်းသလို ailment type လဲပြောင်းပါတယ်။\n" +
                "neutral - flinch\n" +
                "fire - ignite\n" +
                "water - freeze \n" +
                "wind - paralysed\n" +
                "earth - slow\n" +
                "light - dizzy\n" +
                "dark - fear\n" +
                "mp cost ကတော့ 200 ဖြစ်ပီး maximun cast rangeကတော့ 8m ပါ။placed skill ပါ။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ DMG တိုးပေးမှာပါ။\n" +
                "magic device နဲ့ဆိုရင်တော့ ailment chance ကို 25%တိုးပေးမှာပါ။\n");
        txt3.setText("\n" +
                "magic wall ကတော့ user အောက်ကနေပီးအကွင်းကြီးထွက်လာတာပါ။ အ့အကွင်းထဲမှာရှိတဲ့ monsters/boss တေကိုတွန်းထုတ်ပေးပါတယ်။DMG လဲထိပါတယ်။\n" +
                "cast time ကတော့ 1sec ပါ။တွန်းထုတ်နိုင်တဲ့အချက်ရေကတော့ lvl 1 မှာ 5 ချက်ဖြစ်ပီး lvl 10မှာ 10ချက်ဖြစ်ပါတယ်။\n" +
                "knockback chance ကတော့ aggro ဝင်နေသ၍ 100%ပါ။knockback distance ကတော့ 5m ဖြစ်ပီး boss တေဆိုရင်တော့ တဝက်လောက်ထိပဲတွန်းနိုင်ပါတယ်။hit range ကတော့ စစ သုံးချင်းနေရာရဲ့ 1.5m ပတ်လည်ပါ။mp cost 200ပါ။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ DMG ပိုတိုးပေးမှာပါ။\n" +
                "magic device ဆိုရင်တော့ hit range + 1m တိုးပေးမှာပါ။\n");
        txt4.setText("\n" +
                "magic mastery ကတော့ staff/magic device သုံးတဲ့အခါရတဲ့ matk,atkကိုတိုးပေးတဲ့ passive ပါ။\n" +
                "weapon atk +(3*skill lvl)% တိုးပေးပါတယ်။\n" +
                "lvl 10 မှာဆိုရင်တော့ matk +3%အထိတိုးပေးမှာပါ။\n");
        txt5.setText("\n" +
                "mp charge ကတော့ mana ပြန်ဖြည့်တာပါ။ cast time နဲ့ပါပဲ။ပုံမှန်အားဖြင့်အသုံးများတဲ့ skill ပါ။ mp (200+10*skill lvl) ပြန်ဖြည့်ပေးပါတယ်။ cast time ကတော့ 9sec ကနေ 6 sec အထိ lvlတိုးတိုင်းပြောင်းသွားမာပါ။ဒါ့အပြင် level 4 skill က maximizer ရဲ့ cast time ကိုလဲ နောက် skill တခုမသုံးမချင်း(skill lvl) sec လျော့ပေးပါတယ်။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ cast time ကိုတဝက်လျော့ပေးမှာပါ။\n" +
                "magic device နဲ့ဆိုရင်တော့ cast time ကို cast time/1.5 sec ပြောင်းပေးမှာပါ။ဒါ့အပြင် mp ပြန်ပြည့်တာကိုလဲ 50 တိုးပေးပါတယ်။");
    }

}
