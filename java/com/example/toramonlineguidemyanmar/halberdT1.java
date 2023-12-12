package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class halberdT1 extends Fragment {

    static TextView txt1,txt2,txt3,txt4,txt5;
    public halberdT1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.halberd_t1,vg,false);
        txt1=v.findViewById(R.id.txt1hbt1);
        txt2=v.findViewById(R.id.txt2hbt1);
        txt3=v.findViewById(R.id.txt3hbt1);
        txt4=v.findViewById(R.id.txt4hbt1);
        txt5=v.findViewById(R.id.txt5hbt1);
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
                "flash stabကေတာ့အျမန္ခုတ္ခ်တာပါ။ DMG ကေတာ့သိပ္မထြက္ပါဘူး။ skill မွာ motion speed buff ပါပါတယ္။skillရဲ႕\n" +
                "mspd +(5*skill lvl)%တိုးေပးပါတယ္။\n" +
                "mp cost 100  ျဖစ္ပါတယ္။ohs/halberd ႏွစ္ခုလုံးနဲ႔သုံးလို႔ရပါတယ္။\n" +
                " \n" +
                "one handed sword နဲ႔သုံးရင္ေတာ့ motion speed ကို 25%ေလ်ာ့ေပးမွာပါ။\n");
        txt2.setText("\n" +
                "canon spear ကေတာ့ လွံကိုေျမႇာက္ပိိးပစ္လိုက္တာပါ။ ေျမႇာက္တဲ့အခ်ိန္မွာ တခါ ပစ္တဲ့အခ်ိန္မွာတခါ DMG ထြက္ပါတယ္။ ပစ္တဲ့အခ်ိန္ကေတာ့ Aoe Dmg ထိပါတယ္။ \n" +
                " ပစ္တဲ့အခ်ိန္ hit range ကေတာ့ 8m(lvl 1) ကေန 12m(lvl 10အထိရွိပါတယ္။halberd နဲ႔ပဲသုံးလို႔ရတာပါ။mp cost 200ရွိပါတယ္။\n");
        txt3.setText("\n" +
                "deadly spear ကေတာ့ စြမ္းအားစုပီးခုတ္ခ်လိုက္တာပါ။skill မွာ crt rate buff နဲ႔ physical Pierce buff ပါပါတယ္။DMG လဲထြက္ပါတယ္။\n" +
                "charge time ကေတာ့ 1.5 sec(lvl 1),0 sec(lvl 8-10) ရွိပါတယ္။crit rate buff ကေတာ့ (total crt *3 )ျဖစ္ပါတယ္။physical Pierce 10%(lvl 1-3)ကေန 25%(lvl 10)အထိရွိပါတယ္။crit ထခဲ့ရင္ေတာ့ေနာက္ သုံးမဲ့ skill ရဲ႕ mp ကိုတဝက္ေလ်ာ့ေပးပါတယ္။ohs/halberd ႏွစ္ခုလုံးနဲ႔သုံးလို႔ရပါတယ္။ mp cost 200ပါ။\n" +
                "\n" +
                "one handed sword နဲ႔သုံးရင္ေတာ့skillရဲ႕ crit rate +(total crt rate * 0.5)ပဲေပးမွာပါ။ဒါ့အျပင္ DMG လဲထပ္ေလ်ာ့ပါတယ္။\n");
        txt4.setText("\n" +
                "halberd mastery ကေတာ့ halberd ကိုင္ထားရင္ရတဲ့atk ကိုတိုးေပးတဲ့ passive ပါ။\n" +
                "weapon atk (3*skill lvl)% တိုးေပးပါတယ္။atk + 1% (lvl 1)ကေန 3%(lvl 10)အထိတိုးေပးပါေသးတယ္။\n");
        txt5.setText("\n" +
                "quick aura ကေတာ့ HP သုံးပီး aspd buff ေပးတဲ့ buff skill ပါ။skill သုံးတိုင္း HP 15% ကုန္ပါတယ္။\n" +
                "aspd +(50*skill lvl),  +(2.5*skill lvl)% တိုးေပးပါတယ္။weapon အကုန္လုံးနဲ႔သုံးလို႔ရပါတယ္။duration ကေတာ့ 3min ပါ။\n" +
                "\n" +
                "halberd နဲ႔သုံးရင္ေတာ့ HP 10%ပဲကုန္မွာပါ။duration ကိုလဲ 2min ထပ္တိုးေပးပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "flash stabကတော့အမြန်ခုတ်ချတာပါ။ DMG ကတော့သိပ်မထွက်ပါဘူး။ skill မှာ motion speed buff ပါပါတယ်။skillရဲ့\n" +
                "mspd +(5*skill lvl)%တိုးပေးပါတယ်။\n" +
                "mp cost 100  ဖြစ်ပါတယ်။ohs/halberd နှစ်ခုလုံးနဲ့သုံးလို့ရပါတယ်။\n" +
                " \n" +
                "one handed sword နဲ့သုံးရင်တော့ motion speed ကို 25%လျော့ပေးမှာပါ။\n");
        txt2.setText("\n" +
                "canon spear ကတော့ လှံကိုမြှောက်ပိိးပစ်လိုက်တာပါ။ မြှောက်တဲ့အချိန်မှာ တခါ ပစ်တဲ့အချိန်မှာတခါ DMG ထွက်ပါတယ်။ ပစ်တဲ့အချိန်ကတော့ Aoe Dmg ထိပါတယ်။ \n" +
                " ပစ်တဲ့အချိန် hit range ကတော့ 8m(lvl 1) ကနေ 12m(lvl 10အထိရှိပါတယ်။halberd နဲ့ပဲသုံးလို့ရတာပါ။mp cost 200ရှိပါတယ်။\n");
        txt3.setText("\n" +
                "deadly spear ကတော့ စွမ်းအားစုပီးခုတ်ချလိုက်တာပါ။skill မှာ crt rate buff နဲ့ physical Pierce buff ပါပါတယ်။DMG လဲထွက်ပါတယ်။\n" +
                "charge time ကတော့ 1.5 sec(lvl 1),0 sec(lvl 8-10) ရှိပါတယ်။crit rate buff ကတော့ (total crt *3 )ဖြစ်ပါတယ်။physical Pierce 10%(lvl 1-3)ကနေ 25%(lvl 10)အထိရှိပါတယ်။crit ထခဲ့ရင်တော့နောက် သုံးမဲ့ skill ရဲ့ mp ကိုတဝက်လျော့ပေးပါတယ်။ohs/halberd နှစ်ခုလုံးနဲ့သုံးလို့ရပါတယ်။ mp cost 200ပါ။\n" +
                "\n" +
                "one handed sword နဲ့သုံးရင်တော့skillရဲ့ crit rate +(total crt rate * 0.5)ပဲပေးမှာပါ။ဒါ့အပြင် DMG လဲထပ်လျော့ပါတယ်။\n");
        txt4.setText("\n" +
                "halberd mastery ကတော့ halberd ကိုင်ထားရင်ရတဲ့atk ကိုတိုးပေးတဲ့ passive ပါ။\n" +
                "weapon atk (3*skill lvl)% တိုးပေးပါတယ်။atk + 1% (lvl 1)ကနေ 3%(lvl 10)အထိတိုးပေးပါသေးတယ်။\n");
        txt5.setText("\n" +
                "quick aura ကတော့ HP သုံးပီး aspd buff ပေးတဲ့ buff skill ပါ။skill သုံးတိုင်း HP 15% ကုန်ပါတယ်။\n" +
                "aspd +(50*skill lvl),  +(2.5*skill lvl)% တိုးပေးပါတယ်။weapon အကုန်လုံးနဲ့သုံးလို့ရပါတယ်။duration ကတော့ 3min ပါ။\n" +
                "\n" +
                "halberd နဲ့သုံးရင်တော့ HP 10%ပဲကုန်မှာပါ။duration ကိုလဲ 2min ထပ်တိုးပေးပါတယ်။");
    }

}
