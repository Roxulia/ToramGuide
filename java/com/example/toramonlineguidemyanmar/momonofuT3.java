package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class momonofuT3 extends Fragment {

    static TextView txt1,txt2,txt3;
    public momonofuT3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.momonofu_t3,vg,false);
        txt1=v.findViewById(R.id.txt1ktnt3);
        txt2=v.findViewById(R.id.txt2ktnt3);
        txt3=v.findViewById(R.id.txt3ktnt3);
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
                "hasso happa ကလဲ issem လိုမ်ိဳးပါပဲ။ katana  ကိုဆြဲထုတ္ပီး ဓားအိမ္ထဲျပန္ထည့္တာပါ။ဓားထုတ္ေနစဥ္ေဘးနားမွာ ဆာကူရာပန္းပြင့္ေတလြင့္လာပါတယ္။DMG လဲၾကမ္းပါတယ္။ Aoe DMG ပါ။ farm ရင္လဲသုံးလို႔ရပါတယ္။level 3 skill user ေတနဲ႔ level 4 skill user အခ်ိဳ႕လဲသုံးေလ့ရွိၾကပါတယ္။\n" +
                "hit count ကေတာ့ 1 (lvl 1-3),2(lvl 4-6),3 (lvl 7- 10) ျဖစ္ပါတယ္။hit range Aoe ကေတာ့ first hit မွာ 2m(lvl 1-3) ကေန 4m (lvl 7-10)အထိရွိပါတယ္။ေနာက္ ပိုင္း hit ေတကေတာ့ 4m (lvl 1-2) ကေန 8m(lvl 7-10) ရွိပါတယ္။mp cost 500ျဖစ္ပီး unsheathe skill ပါ။placed skill လဲျဖစ္ပါတယ္။\n");
        txt2.setText("\n" +
                "zentai settetsu ကေတာ့ katana နဲ႔ေလးခ်က္ခုတ္တာပါ။ခုတ္ေနတဲ့အခ်ိန္အတြင္း DMG ထိရင္ ထိတဲ့ DMG ဟာ zero ျဖစ္သြားပီး counter hit ျပန္ထတာပါ။ counter hit ကေတာ့ DMG ေတာ္ေတာ္ၾကမ္းပါတယ္။level 3 skill သုံးတဲ့သူေတသုံးေလ့ရွိတဲ့ skill ပါ။ကာတဲ့ေနရာမာလဲသုံးၾကပါတယ္။သုံးရခက္တဲ့ထဲမွာလဲပါပါတယ္။\n" +
                "arm break chance (50+(5*skill lvl ))% ရွိပါတယ္။tumble,flinch,stun,knockback ေတကိုလဲကာေပးပါတယ္။(ပထမေလးခ်က္အတြင္း)DMG ကို zero ေျပာင္းေပးတာကပထမဆုံးဝင္တဲ့ DMG ကိုပဲေျပာင္းတာပါေနာက္ဝင္လာတာေတမပါပါဘူး။unsheathe skill ျဖစ္ပီး mp cost 400ပါ။\n");
        txt3.setText("\n" +
                "shukuchi ကေတာ့ target စီကိုခူန္ပီးခ်တာပါ။ခုန္ပီးခ်တဲ့ atk ကို unsheathe atk လို႔သတ္မွတ္ပါတယ္။ဒါ့အျပင္ ampr နဲ႔ DMG လဲထပ္တိုးေပးပါတယ္။\n" +
                "ampr +0(lvl 1)ကေန +25(lvl 10)အထိေပးပါတယ္။basic atk +(5*skill lvl)% တိုးေပးပါတယ္။ slow/stop ေတမိထားရင္ေတာ့ခုန္မရပါဘူး။ခုန္တာက skill မွာeffect မဝင္ပါဘူး။ဒါမဲ့mononofu skill ေတဆိုရင္ေတာ့ ခုန္လို႔ရပါတယ္။ maximum range 24m ရွိပါတယ္။\n" +
                "\n" +
                "main weaponမွာ katana သုံးထားရင္ေတာ့ ampr buff ကိုႏွစ္ဆတိုးေပးမွာပါ။\n" +
                "\n");
    }

    public static void unicode()
    {

        txt1.setText("\n" +
                "hasso happa ကလဲ issem လိုမျိုးပါပဲ။ katana  ကိုဆွဲထုတ်ပီး ဓားအိမ်ထဲပြန်ထည့်တာပါ။ဓားထုတ်နေစဉ်ဘေးနားမှာ ဆာကူရာပန်းပွင့်တေလွင့်လာပါတယ်။DMG လဲကြမ်းပါတယ်။ Aoe DMG ပါ။ farm ရင်လဲသုံးလို့ရပါတယ်။level 3 skill user တေနဲ့ level 4 skill user အချို့လဲသုံးလေ့ရှိကြပါတယ်။\n" +
                "hit count ကတော့ 1 (lvl 1-3),2(lvl 4-6),3 (lvl 7- 10) ဖြစ်ပါတယ်။hit range Aoe ကတော့ first hit မှာ 2m(lvl 1-3) ကနေ 4m (lvl 7-10)အထိရှိပါတယ်။နောက် ပိုင်း hit တေကတော့ 4m (lvl 1-2) ကနေ 8m(lvl 7-10) ရှိပါတယ်။mp cost 500ဖြစ်ပီး unsheathe skill ပါ။placed skill လဲဖြစ်ပါတယ်။\n");
        txt2.setText("\n" +
                "zentai settetsu ကတော့ katana နဲ့လေးချက်ခုတ်တာပါ။ခုတ်နေတဲ့အချိန်အတွင်း DMG ထိရင် ထိတဲ့ DMG ဟာ zero ဖြစ်သွားပီး counter hit ပြန်ထတာပါ။ counter hit ကတော့ DMG တော်တော်ကြမ်းပါတယ်။level 3 skill သုံးတဲ့သူတေသုံးလေ့ရှိတဲ့ skill ပါ။ကာတဲ့နေရာမာလဲသုံးကြပါတယ်။သုံးရခက်တဲ့ထဲမှာလဲပါပါတယ်။\n" +
                "arm break chance (50+(5*skill lvl ))% ရှိပါတယ်။tumble,flinch,stun,knockback တေကိုလဲကာပေးပါတယ်။(ပထမလေးချက်အတွင်း)DMG ကို zero ပြောင်းပေးတာကပထမဆုံးဝင်တဲ့ DMG ကိုပဲပြောင်းတာပါနောက်ဝင်လာတာတေမပါပါဘူး။unsheathe skill ဖြစ်ပီး mp cost 400ပါ။\n");
        txt3.setText("\n" +
                "shukuchi ကတော့ target စီကိုခူန်ပီးချတာပါ။ခုန်ပီးချတဲ့ atk ကို unsheathe atk လို့သတ်မှတ်ပါတယ်။ဒါ့အပြင် ampr နဲ့ DMG လဲထပ်တိုးပေးပါတယ်။\n" +
                "ampr +0(lvl 1)ကနေ +25(lvl 10)အထိပေးပါတယ်။basic atk +(5*skill lvl)% တိုးပေးပါတယ်။ slow/stop တေမိထားရင်တော့ခုန်မရပါဘူး။ခုန်တာက skill မှာeffect မဝင်ပါဘူး။ဒါမဲ့mononofu skill တေဆိုရင်တော့ ခုန်လို့ရပါတယ်။ maximum range 24m ရှိပါတယ်။\n" +
                "\n" +
                "main weaponမှာ katana သုံးထားရင်တော့ ampr buff ကိုနှစ်ဆတိုးပေးမှာပါ။\n");
    }

}
