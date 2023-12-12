package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dualT2 extends Fragment {

    static TextView txt1,txt2,txt3;
    public dualT2()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.dual_t2,vg,false);
        txt1=v.findViewById(R.id.txt1dualt2);
        txt2=v.findViewById(R.id.txt2dualt2);
        txt3=v.findViewById(R.id.txt3dualt2);
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
                "spinning slash ကေတာ့ဓားႏွစ္လက္ကိုကိုင္ပီးကိုယ္ကိုတပတ္လွည့္တာပါ။ေလအကြင္းထြက္လာပီးတြန္းထုတ္ပါတယ္။ဒါ့အျပင္အ့အကြင္းထဲေရာက္ေနတဲ့အေကာင္ေတကိုလဲ DMG ထိပါတယ္။အကုန္ Aoe DMG ျဖစ္တာမို႔ farm တဲ့ေနရာမွာလဲသုံးလို႔ရပါတယ္။\n" +
                "ပထမအခ်က္မွာ DMG ပိုၾကမ္းပီးaggro ဝင္ေနရင္knockback chance 100% ရွိပါတယ္။\n" +
                "ေနာက္ထပ္ထိတဲ့အခ်က္ေတမွာေတာ့ blind chance (15+2.5*skill lvl )% ရွိပါတယ္။ mp cost 100ပါ။placed skillျဖစ္ပါတယ္။magic proration ေပးပါတယ္။\n");
        txt2.setText("\n" +
                "charging slash ကေတာ့ target နဲ႔အေနာက္ကိုေတာက္ေလ်ာက္dash ပီးခုန္တာပါ။တလမ္းလုံးကိုdmg ထိပါတယ္။main target ကိုေတာ့dmg ႏွစ္ခါထိပါတယ္။unsheathe skill ပါ။target အေနာက္ 12m အထိေရာက္ပါတယ္။DMG လဲထြက္တာမို႔ DPS အေနနဲ႔သုံးေလ့ရွိၾကပါတယ္။mp cost 300ျဖစ္ပါတယ္။\n");
        txt3.setText("\n" +
                "God speed ကေတာ့ agi နဲ႔ unsheathe atk % ကိုတိုးေပးတဲ့ passive ပါ။unsheathe skill ေတသုံးတဲ့ DPS ေတြယူေလ့ရွိတဲ့ skill ပါ။\n" +
                "agi +1(lvl 1)ကေန +15(lvl 10)အထိတိုးေပးပါတယ္။\n" +
                "unsheathe atk +(5+skill lvl )% လဲတိုးေပးပါတယ္။\n" +
                "\n" +
                "dual sword ကိုင္ထားရင္ေတာ့ unsheathe atk +(10)% ထပ္တိုးေပးမွာပါ။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "spinning slash ကတော့ဓားနှစ်လက်ကိုကိုင်ပီးကိုယ်ကိုတပတ်လှည့်တာပါ။လေအကွင်းထွက်လာပီးတွန်းထုတ်ပါတယ်။ဒါ့အပြင်အ့အကွင်းထဲရောက်နေတဲ့အကောင်တေကိုလဲ DMG ထိပါတယ်။အကုန် Aoe DMG ဖြစ်တာမို့ farm တဲ့နေရာမှာလဲသုံးလို့ရပါတယ်။\n" +
                "ပထမအချက်မှာ DMG ပိုကြမ်းပီးaggro ဝင်နေရင်knockback chance 100% ရှိပါတယ်။\n" +
                "နောက်ထပ်ထိတဲ့အချက်တေမှာတော့ blind chance (15+2.5*skill lvl )% ရှိပါတယ်။ mp cost 100ပါ။placed skillဖြစ်ပါတယ်။magic proration ပေးပါတယ်။\n" +
                "\n");
        txt2.setText("\n" +
                "charging slash ကတော့ target နဲ့အနောက်ကိုတောက်လျောက်dash ပီးခုန်တာပါ။တလမ်းလုံးကိုdmg ထိပါတယ်။main target ကိုတော့dmg နှစ်ခါထိပါတယ်။unsheathe skill ပါ။target အနောက် 12m အထိရောက်ပါတယ်။DMG လဲထွက်တာမို့ DPS အနေနဲ့သုံးလေ့ရှိကြပါတယ်။mp cost 300ဖြစ်ပါတယ်။\n");
        txt3.setText("\n" +
                "God speed ကတော့ agi နဲ့ unsheathe atk % ကိုတိုးပေးတဲ့ passive ပါ။unsheathe skill တေသုံးတဲ့ DPS တွေယူလေ့ရှိတဲ့ skill ပါ။\n" +
                "agi +1(lvl 1)ကနေ +15(lvl 10)အထိတိုးပေးပါတယ်။\n" +
                "unsheathe atk +(5+skill lvl )% လဲတိုးပေးပါတယ်။\n" +
                "\n" +
                "dual sword ကိုင်ထားရင်တော့ unsheathe atk +(10)% ထပ်တိုးပေးမှာပါ။");
    }

}
