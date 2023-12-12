package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class momonofuT2 extends Fragment {

    static TextView txt1,txt2,txt3;
    public momonofuT2()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.momonofu_t2,vg,false);
        txt1=v.findViewById(R.id.txt1ktnt2);
        txt2=v.findViewById(R.id.txt2ktnt2);
        txt3=v.findViewById(R.id.txt3ktnt2);
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
                "triple thurst ကေတာ့ target ကို katana နဲ႔ဝင္ထိုးပီးျဖတ္သြားတာပါ။DMG သုံးခါထြက္ပါတယ္။ skill သုံးပီးတဲ့အခါ target အေနာက္ကိုေရာက္သြားပီး buff ေပးပါတယ္။\n" +
                "buff effect ကေတာ့ ေနာက္သုံးမဲ့ skill ရဲ႕ base DMGကို player lvl /(11-skill lvl) ထပ္ေပါင္းေပးပါတယ္။buff duration ကေတာ့ေနာက္ skill တျခမသုံးမခ်င္းျဖစ္ပါတယ္။maximum cast range 12m ျဖစ္ပီး mp cost 300 ျဖစ္ပါတယ္။ unsheathe skill ပါ။\n");
        txt2.setText("\n" +
                "madagachi ကေတာ့ katana ကိုေျဖးေျဖးခ်င္းေထာင္ပီး ေျမႇာက္ပီးေတာ့ခုတ္ခ်တာပါ။ ဓားထုတ္တဲ့အခ်ိန္ကေနစပီးမခုတ္ခင္အထိ buff ဝင္ပါတယ္။buff ဝင္ေနတုန္းအခ်ခံရရင္ skill ပ်က္ပီး mp ျပန္ျဖည့္ေပးပါတယ္။\n" +
                "buff effect ကေတာ့ physical DMG,fractional DMG taken ေတကို90% ေလ်ာ့ေပးပီး magic DMG taken ကို 45% ေလ်ာ့ေပးတာပါ။ ailment ေတတခုမွမထိပါဘူး။ဒါ့အျပင္ DMG ကကိုယ့္ကိုေသေစႏိုင္ရင္ မေသဘဲ 1 HP က်န္ပါတယ္။အခ်ခံရရင္ buff ေကာ skill ေကာပ်က္ပီး mp(100+10*skill lvl)ျပန္ျဖည့္ေပးပါတယ္။DMG 1 ခ်က္ေလးထိတာနဲ႔ပ်က္ပါတယ္။ skill DMG ထြက္ပီးရင္လဲ buff ေပ်ာက္ပါတယ္။skill က DMG မထြက္လဲ proration ထြက္ပါတယ္။ mp cost 300ျဖစ္ပါတယ္။unsheathe skill ပါ။\n");
        txt3.setText("\n" +
                "meikyo shisui ကေတာ့ buff skill ပါ။သူ႔ effect ကေတာ့ critical rate +(20+2*skill lvl)တိုးေပးပါတယ္။ debuff အေနနဲ႔ def/mdef -(100*(11-skill lvl))ေလ်ာ့ေပးပီး cdmg -(15-skill lvl)% ေလ်ာ့ေပးပါတယ္။buff duration ကေတာ့ (10+ 2*skill lvl) sec ပါ။ mp cost 200 ပါ။\n" +
                "\n" +
                "main or sub weapon မွာ katana ကိုင္ထားရင္ေတာ့ Cdmg မေလ်ာ့ပါဘူး။crit  rate +25တိုးေပးပီး duration ကိုလဲ ႏွစ္ဆတိုးေပးမွာပါ။");
    }

    public static void unicode()
    {

        txt1.setText("\n" +
                "triple thurst ကတော့ target ကို katana နဲ့ဝင်ထိုးပီးဖြတ်သွားတာပါ။DMG သုံးခါထွက်ပါတယ်။ skill သုံးပီးတဲ့အခါ target အနောက်ကိုရောက်သွားပီး buff ပေးပါတယ်။\n" +
                "buff effect ကတော့ နောက်သုံးမဲ့ skill ရဲ့ base DMGကို player lvl /(11-skill lvl) ထပ်ပေါင်းပေးပါတယ်။buff duration ကတော့နောက် skill တခြမသုံးမချင်းဖြစ်ပါတယ်။maximum cast range 12m ဖြစ်ပီး mp cost 300 ဖြစ်ပါတယ်။ unsheathe skill ပါ။\n");
        txt2.setText("\n" +
                "madagachi ကတော့ katana ကိုဖြေးဖြေးချင်းထောင်ပီး မြှောက်ပီးတော့ခုတ်ချတာပါ။ ဓားထုတ်တဲ့အချိန်ကနေစပီးမခုတ်ခင်အထိ buff ဝင်ပါတယ်။buff ဝင်နေတုန်းအချခံရရင် skill ပျက်ပီး mp ပြန်ဖြည့်ပေးပါတယ်။\n" +
                "buff effect ကတော့ physical DMG,fractional DMG taken တေကို90% လျော့ပေးပီး magic DMG taken ကို 45% လျော့ပေးတာပါ။ ailment တေတခုမှမထိပါဘူး။ဒါ့အပြင် DMG ကကိုယ့်ကိုသေစေနိုင်ရင် မသေဘဲ 1 HP ကျန်ပါတယ်။အချခံရရင် buff ကော skill ကောပျက်ပီး mp(100+10*skill lvl)ပြန်ဖြည့်ပေးပါတယ်။DMG 1 ချက်လေးထိတာနဲ့ပျက်ပါတယ်။ skill DMG ထွက်ပီးရင်လဲ buff ပျောက်ပါတယ်။skill က DMG မထွက်လဲ proration ထွက်ပါတယ်။ mp cost 300ဖြစ်ပါတယ်။unsheathe skill ပါ။\n");
        txt3.setText("\n" +
                "meikyo shisui ကတော့ buff skill ပါ။သူ့ effect ကတော့ critical rate +(20+2*skill lvl)တိုးပေးပါတယ်။ debuff အနေနဲ့ def/mdef -(100*(11-skill lvl))လျော့ပေးပီး cdmg -(15-skill lvl)% လျော့ပေးပါတယ်။buff duration ကတော့ (10+ 2*skill lvl) sec ပါ။ mp cost 200 ပါ။\n" +
                "\n" +
                "main or sub weapon မှာ katana ကိုင်ထားရင်တော့ Cdmg မလျော့ပါဘူး။crit  rate +25တိုးပေးပီး duration ကိုလဲ နှစ်ဆတိုးပေးမှာပါ။");
    }

}
