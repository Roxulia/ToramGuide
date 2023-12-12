package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bladeT1 extends Fragment {

    static TextView txt1,txt2,txt3,txt4,txt5;
    public bladeT1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.blade_t1,vg,false);
        txt1=v.findViewById(R.id.txt1bladet1);
        txt2=v.findViewById(R.id.txt2bladet1);
        txt3=v.findViewById(R.id.txt3bladet1);
        txt4=v.findViewById(R.id.txt4bladet1);
        txt5=v.findViewById(R.id.txt5bladet1);
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
                "hard hit skill ကေတာ့ ေခါင္းကိုဓားနဲ႔ေခါက္တာပါ။ သူ က dmg ထြက္တာနဲပါတယ္။ဒါေပမဲ့ flinch ဖို႔အတြက္ chance ေပးပါတယ္။ lvl မ်ားေလ dmgမ်ားသလို flinch တဲ့ chance လဲပိုပိုတိုးလာပါတယ္။maximum 50% ထိတိုးႏိုင္ပါတယ္။mp 100 သုံးပါတယ္။tank ေတြအတြက္လဲအသုံးဝင္တဲ့ skill ျဖစ္ပါတယ္။\n" +
                "one handed sword ကိုင္ထားရင္ flinch chance ကို 50% ထပ္တိုးေပးပါတယ္။\n" +
                "two handed sword ဆိုရင္ေတာ့ dmgတိုးေပးတာပါ။\n" +
                "\n");
        txt2.setText("astute ကေတာ့ ဓားနဲ႔အေပၚကေနျမန္ျမန္ခုတ္ခ်တာပါ။DMG output လဲေကာင္းသလို အေစာပိုင္း lvl အနိမ့္ပိုင္းမာ dmg ေကာင္းေကာင္းထုတ္ႏိုင္တဲ့ skill ပါ။ ဒါ့အျပင္ critical rate +25 တိုးေပးပါတယ္။buff duration ကေတာ့ 5 secေလာက္ၾကာပါတယ္။mp 200 အသုံးျပဳရပါတယ္။\n" +
                  "one handed sword ကိုင္ထားရင္ေတာ့ mp 100ထဲနဲ႔သုံးလို႔ရမာပါ။\n" +
                  "two handed sword ကိုင္ထားရင္ေတာ့ critical rate +25ထပ္တိုးေပးပါတယ္။\n" +
                  "\n");
        txt3.setText( "sonic blade ကေတာ့ အေဝးကေနပီးဓားနဲ႔လွည့္ပီးဝင္တာပါ။ Aoe dmg ထြက္ပါတယ္။farm တဲ့အခါသုံးလို႔ေကာင္းပါတယ္။mp cost ကေတာ့ 200 ပါ။ဒါ့အျပင္ crt rate ကို skill lvl* 10 တိုးေပးပါတယ္။duration ကေတာ့ 5sec ပါ။အ့ buff ဝင္ေနခ်ိန္အတြင္းမွာ skillထပ္သုံးရင္မူရင္းdmg ထက္ပိုၾကမ္းတဲ့ DMG ထြက္သလို range လဲပိုက်ယ္ပါတယ္။cast range ကေတာ့ lvl 10 ဆိုရင္20m ထိေဝးပါတယ္။\n" +
                 "one handed swordသုံးထားရင္ ပိုေဝးေဝးကေနသုံးလို႔ရပါတယ္။cast range ကို 4m ေပါင္းေပးတာပါ။\n" +
                 "two handed sword ဆိုရင္ေတာ့ DMG ထိတဲ့ area ပိုက်ယ္ကာ CRT buff ကိုလဲတဝက္ပဲေပးပါတယ္။\n" +
                 "\n");
        txt4.setText("sword mastery ကေတာ့ passive skill ျဖစ္ၿပီး sword ကိုင္ထားရင္ရတဲ့ atk ကိုတိုးေပးပါတယ္။ dual sword ကိုင္ထားရင္လဲ ဓားႏွစ္ေခ်ာင္းလုံးအတြက္ effect ဝင္ပါတယ္။\n" +
                "weapon atk 3*skill lvlတိုးေပးတဲ့အျပင္ lvl 10 ဆိုရင္ atk 3% တိုးေပးပါတယ္။\n" +
                "\n");
        txt5.setText("quick slash ဟာလဲ passive skill ပါပဲ။သူကေတာ့sword သုံးရင္ ရမဲ့aspd ကိုတိုးေပးတာပါ။aspd ပဲျမန္လာမွာဆိုေတာ့အရမ္းႀကီးေတာ့အသုံးမဝင္ပါဘူး။\n" +
                "သူ႔effect ကေတာ့ aspd+(skill lvl)% , aspd +(10*skill lvl )တိုးေပးပါတယ္။");

    }

    public static void unicode()
    {
        txt1.setText(
                "hard hit skill ကတော့ ခေါင်းကိုဓားနဲ့ခေါက်တာပါ။ သူ က dmg ထွက်တာနဲပါတယ်။ဒါပေမဲ့ flinch ဖို့အတွက် chance ပေးပါတယ်။ lvl များလေ dmgများသလို flinch တဲ့ chance လဲပိုပိုတိုးလာပါတယ်။maximum 50% ထိတိုးနိုင်ပါတယ်။mp 100 သုံးပါတယ်။tank တွေအတွက်လဲအသုံးဝင်တဲ့ skill ဖြစ်ပါတယ်။\n" +
                "one handed sword ကိုင်ထားရင် flinch chance ကို 50% ထပ်တိုးပေးပါတယ်။\n" +
                "two handed sword ဆိုရင်တော့ dmgတိုးပေးတာပါ။\n" +
                "\n");
        txt2.setText("astute ကတော့ ဓားနဲ့အပေါ်ကနေမြန်မြန်ခုတ်ချတာပါ။DMG output လဲကောင်းသလို အစောပိုင်း lvl အနိမ့်ပိုင်းမာ dmg ကောင်းကောင်းထုတ်နိုင်တဲ့ skill ပါ။ ဒါ့အပြင် critical rate +25 တိုးပေးပါတယ်။buff duration ကတော့ 5 secလောက်ကြာပါတယ်။mp 200 အသုံးပြုရပါတယ်။\n" +
                "one handed sword ကိုင်ထားရင်တော့ mp 100ထဲနဲ့သုံးလို့ရမာပါ။\n" +
                "two handed sword ကိုင်ထားရင်တော့ critical rate +25ထပ်တိုးပေးပါတယ်။\n" +
                "\n");
        txt3.setText("sonic blade ကတော့ အဝေးကနေပီးဓားနဲ့လှည့်ပီးဝင်တာပါ။ Aoe dmg ထွက်ပါတယ်။farm တဲ့အခါသုံးလို့ကောင်းပါတယ်။mp cost ကတော့ 200 ပါ။ဒါ့အပြင် crt rate ကို skill lvl* 10 တိုးပေးပါတယ်။duration ကတော့ 5sec ပါ။အ့ buff ဝင်နေချိန်အတွင်းမှာ skillထပ်သုံးရင်မူရင်းdmg ထက်ပိုကြမ်းတဲ့ DMG ထွက်သလို range လဲပိုကျယ်ပါတယ်။cast range ကတော့ lvl 10 ဆိုရင်20m ထိဝေးပါတယ်။\n" +
                "one handed swordသုံးထားရင် ပိုဝေးဝေးကနေသုံးလို့ရပါတယ်။cast range ကို 4m ပေါင်းပေးတာပါ။\n" +
                "two handed sword ဆိုရင်တော့ DMG ထိတဲ့ area ပိုကျယ်ကာ CRT buff ကိုလဲတဝက်ပဲပေးပါတယ်။\n" +
                "\n");
        txt4.setText("sword mastery ကတော့ passive skill ဖြစ်ပြီး sword ကိုင်ထားရင်ရတဲ့ atk ကိုတိုးပေးပါတယ်။ dual sword ကိုင်ထားရင်လဲ ဓားနှစ်ချောင်းလုံးအတွက် effect ဝင်ပါတယ်။\n" +
                "weapon atk 3*skill lvlတိုးပေးတဲ့အပြင် lvl 10 ဆိုရင် atk 3% တိုးပေးပါတယ်။\n" +
                "\n");
        txt5.setText( "quick slash ဟာလဲ passive skill ပါပဲ။သူကတော့sword သုံးရင် ရမဲ့aspd ကိုတိုးပေးတာပါ။aspd ပဲမြန်လာမှာဆိုတော့အရမ်းကြီးတော့အသုံးမဝင်ပါဘူး။\n" +
                "သူ့effect ကတော့ aspd+(skill lvl)% , aspd +(10*skill lvl )တိုးပေးပါတယ်။");

    }

}
