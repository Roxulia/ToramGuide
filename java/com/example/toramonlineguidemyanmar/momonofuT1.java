package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class momonofuT1 extends Fragment {

    static TextView txt1,txt2,txt3,txt4,txt5;
    public momonofuT1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.momonofu_t1,vg,false);
        txt1=v.findViewById(R.id.txt1ktnt1);
        txt2=v.findViewById(R.id.txt2ktnt1);
        txt3=v.findViewById(R.id.txt3ktnt1);
        txt4=v.findViewById(R.id.txt4ktnt1);
        txt5=v.findViewById(R.id.txt5ktnt1);
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
                "issem ကေတာ့ katana ကိုထုတ္ပီးျပန္ထည့္တာပါ။ထုတ္တဲ့အခ်ိန္တခါထည့္တဲ့အခ်ိန္တခါ DMG ထိပါတယ္။ ျပန္ထည့္တဲ့အခ်ိန္ ထြက္တဲ့ DMG ကေတာ္ေတာ္ေလးမ်ားပါတယ္။ဒါ့အျပင္crit rate ကိုလဲ 200% ထပ္ေပါင္းေပးပါတယ္။mp cost ကေတာ့ 100ပါ။unsheathe skill ျဖစ္ပါတယ္။\n");
        txt2.setText("\n" +
                "pulse blade ကေတာ့ katana နဲ႔ ေလကိုပိုင္းပီး wave ေလးေတပစ္တာပါ။hit count 3 ခ်က္ျဖစ္ပါတယ္။တခ်က္ပီးတခ်က္ DMG ပိုတိုးလာပါတယ္။ပိုေဝးေလပိုပီး DMG နဲေလျဖစ္ပါတယ္။skill သုံးပီးတဲ့အခါမွာ dash လုပ္လို႔ရပါတယ္။mp cost 100ျဖစ္ပီး unsheathe skill ျဖစ္ပါတယ္။maximum cast range 12mျဖစ္ပါတယ္။\n");
        txt3.setText("\n" +
                "pommel strike ကေတာ့katana လက္ကိုင္နဲ႔ထိုးတာပါ။DMG ေတာ့သိပ္အၾကမ္းႀကီးမဟုတ္ပါဘူး။\n" +
                "paralysed chance 50+(5*skill lvl)% ရွိပါတယ္။ paralysed ျဖစ္ေနတဲ့သူကိုသုံးရင္ေတာ့ stun chance (5*skill lvl)% ရွိပါတယ္။mp cost 200ျဖစ္ပါတယ္။ ");
        txt4.setText("\n" +
                "Bushido ကေတာ့ passive skill ပါ။ \n" +
                "effect ေတြကေတာ့ Max HP +(10*skill lvl),Max mp +(10*skill lvl),accuracy + (skill lvl ) တိုးေပးပါတယ္။\n" +
                "main hand မွာ katana ကိုင္ထားရင္ေတာ့ weapon atk(3*skill lvl)% ထပ္တိုးေပးပါတယ္။ဒါ့အျပင္ atk 3%အထိ lvl အလိုက္တိုးေပးပါေသးတယ္။\n");
        txt5.setText("\n" +
                "Two- handed ကေတာ့ passive skill ပါ။သူကေတာ့ sub weapon မွာဘာမွမသုံးထားရင္ skill  effectရတာပါ။\n" +
                "သူ႔ effect ေတြကေတာ့ weapon atk(skill lvl)% , accuracy +(skill lvl)% , critical rate + (skill lvl) , stability +(skill lvl)% တိုးေပးတာပါ။\n" +
                "main weapon မွာ katana သုံးထားရင္ေတာ့ crit ထတဲ့အခါ ရတဲ့dmg ကို (5*skill lvl)% ထက္တိုးေပးမွာပါ။\n" +
                "တျခား weaponကိုင္ထားရင္ေတာ့crit rateနဲ႔ stability ကိုတဝက္ပဲရမွာပါ။\n");
    }

    public static void unicode()
    {

        txt1.setText("\n" +
                "issem ကတော့ katana ကိုထုတ်ပီးပြန်ထည့်တာပါ။ထုတ်တဲ့အချိန်တခါထည့်တဲ့အချိန်တခါ DMG ထိပါတယ်။ ပြန်ထည့်တဲ့အချိန် ထွက်တဲ့ DMG ကတော်တော်လေးများပါတယ်။ဒါ့အပြင်crit rate ကိုလဲ 200% ထပ်ပေါင်းပေးပါတယ်။mp cost ကတော့ 100ပါ။unsheathe skill ဖြစ်ပါတယ်။\n");
        txt2.setText("\n" +
                "pulse blade ကတော့ katana နဲ့ လေကိုပိုင်းပီး wave လေးတေပစ်တာပါ။hit count 3 ချက်ဖြစ်ပါတယ်။တချက်ပီးတချက် DMG ပိုတိုးလာပါတယ်။ပိုဝေးလေပိုပီး DMG နဲလေဖြစ်ပါတယ်။skill သုံးပီးတဲ့အခါမှာ dash လုပ်လို့ရပါတယ်။mp cost 100ဖြစ်ပီး unsheathe skill ဖြစ်ပါတယ်။maximum cast range 12mဖြစ်ပါတယ်။\n");
        txt3.setText("\n" +
                "pommel strike ကတော့katana လက်ကိုင်နဲ့ထိုးတာပါ။DMG တော့သိပ်အကြမ်းကြီးမဟုတ်ပါဘူး။\n" +
                "paralysed chance 50+(5*skill lvl)% ရှိပါတယ်။ paralysed ဖြစ်နေတဲ့သူကိုသုံးရင်တော့ stun chance (5*skill lvl)% ရှိပါတယ်။mp cost 200ဖြစ်ပါတယ်။ ");
        txt4.setText("\n" +
                "Bushido ကတော့ passive skill ပါ။ \n" +
                "effect တွေကတော့ Max HP +(10*skill lvl),Max mp +(10*skill lvl),accuracy + (skill lvl ) တိုးပေးပါတယ်။\n" +
                "main hand မှာ katana ကိုင်ထားရင်တော့ weapon atk(3*skill lvl)% ထပ်တိုးပေးပါတယ်။ဒါ့အပြင် atk 3%အထိ lvl အလိုက်တိုးပေးပါသေးတယ်။\n");
        txt5.setText("\n" +
                "Two- handed ကတော့ passive skill ပါ။သူကတော့ sub weapon မှာဘာမှမသုံးထားရင် skill  effectရတာပါ။\n" +
                "သူ့ effect တွေကတော့ weapon atk(skill lvl)% , accuracy +(skill lvl)% , critical rate + (skill lvl) , stability +(skill lvl)% တိုးပေးတာပါ။\n" +
                "main weapon မှာ katana သုံးထားရင်တော့ crit ထတဲ့အခါ ရတဲ့dmg ကို (5*skill lvl)% ထက်တိုးပေးမှာပါ။\n" +
                "တခြား weaponကိုင်ထားရင်တော့crit rateနဲ့ stability ကိုတဝက်ပဲရမှာပါ။\n" +
                "\n");
    }

}
