package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class momonofuT4 extends Fragment {

    static TextView txt1,txt2,txt3;
    public momonofuT4()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.momonofu_t4,vg,false);
        txt1=v.findViewById(R.id.txt1ktnt4);
        txt2=v.findViewById(R.id.txt2ktnt4);
        txt3=v.findViewById(R.id.txt3ktnt4);
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
                "tenryu ranseiကေတာ့ katana နဲ႔ေလးခ်က္ခုတ္တာပါ။တခါသုံးတိုင္းdmg ပိုပိုၾကမ္းလာပါတယ္။ဒါ့အျပင္ skill ရဲ႕ motion လဲျမန္ျမန္လာပါတယ္။stack နဲ႔လဲျဖစ္ပါတယ္။maximum stack 4 ျဖစ္ပါတယ္။stack ကေတာ့ tenryu သုံးရင္တက္လာတာပါ။\n" +
                "tenryu ဟာ buff လဲေပးပါတယ္။ stack ကလဲ buff ဝင္ေနတဲ့အခ်ိန္သုံးမွတက္တာပါ။basic atk ေတဟာ time interval မရွိေတာ့ပဲျဖစ္မွာပါ။ဒါ့အျပင္ buff ဝင္ေနခ်ိန္ madagachi, zentai settetsu ကိုသုံးတာ success ျဖစ္ပီး DMG ထြက္ရင္ skill name ကို tenryu ransei:zannou လို႔ေျပာင္းေပးပီး immune effect ရတဲ့အျပင္ skill ရဲ႕ DMG ကိုလဲstack ကိုလိုက္ပီးေတာ္ေတာ္မ်ားမ်ားတိုးေပးမွာပါ။duration ကိုလဲ 30sec အထိဆြဲဆန႔္လိုက္မွာပါ။ဒါမဲ့ stack ကေတာ့ 1ကျပန္စမွာပါ။\n" +
                "normal buff duration ကေတာ့ 10sec ျဖစ္ပပါတယ္။skill ကိုစစသုံးခ်င္းမွာ mp cost 300ရွိပီး buff ဝင္ေနခ်ိန္သုံးရင္ေတာ့ mp cost 100ျဖစ္သြားမာပါ။umsheathe skill ျဖစ္ပါတယ္။\n");
        txt2.setText("\n" +
                "garyou tensei ကေတာ့ madagachiလိုမ်ိဳးပါပဲ။ေဘးမွာအကြင္းေလးကြင္းေပၚလာတာပဲကြာတာပါ။သူကလဲ stack နဲ႔ပါပဲ။stack ကိုလိုက္ပီး DMG တိုးေပးမွာပါ။ဒီ skill ကိုတစ္ခါသုံးတိုင္း stack က 0 ျဖစ္သြားမွာပါ။maximum stack ကေတာ့ 10 ပါ။ stack ကိုေတာ့mononofu skill ေတကိုသုံးရင္ရမွာပါ။DMG လဲအရမ္းၾကမ္းတဲ့ထဲမွာပါပါတယ္။\n" +
                "skill မွာ debuffပါပါတယ္။ဒါကေတာ့skillရဲ႕ crit rate -(110-10*skill lvl)ေလ်ာ့ေပးတာပါ။arm break ျဖစ္ေနတဲ့သူကိုသုံးရင္ေတာ့ DMG ထပ္တိုးေပးမွာပါ။mp cost 500ျဖစ္ပါတယ္။\n");
        txt3.setText("\n" +
                "kairiki ranshinကေတာ့ buff skill ျဖစ္ပါတယ္။buff ေကာ debuff ေကာပါပါတယ္။\n" +
                "debuff ကေတာ့ 5secကေန 10sec အထိ မီးေလာင္မွာပါ။ (lvl မ်ားေလပိုၾကာေလပါ)\n" +
                "buff အေနနဲ႔ကေတာ့ atk +10*skill lvlတိုးေပးပါတယ္။ ampr +6 (level 1)/ +7 (level 2)/ +8 (level 3)/ +9 (level 4)/ +10 (level 5)/ +16 (level 6)/ +17 (level 7)/ +18 (level 8)/ +19 (level 9)/ +25 (level 10)တိုးေပးပါမယ္။ဒါ့အျပင္ basic atk DMG ကိုလဲ (5*skill lvl )%တိုးေပးမွာပါ။ Garyou tensei ရဲ႕ crit rate ကိုလဲ(10*skill lvl),physical Pierce +(10*skill lvl )%တိုးေပးပါေသးတယ္။duration ကေတာ့ 5sec ကေန 10sec အထိျဖစ္ပါတယ္။(lvl အလိုက္တိုးတာပါ)\n" +
                "\n" +
                "katana ကိုင္ထားရင္ေတာ့ buff duration ကိုသုံးဆလုပ္ေပးမွာပါ။ဒါ့အျပင္ basic atk DMG +50%ထပ္တိုးေပးမွာပါ။");
    }

    public static void unicode()
    {

        txt1.setText("\n" +
                "tenryu ranseiကတော့ katana နဲ့လေးချက်ခုတ်တာပါ။တခါသုံးတိုင်းdmg ပိုပိုကြမ်းလာပါတယ်။ဒါ့အပြင် skill ရဲ့ motion လဲမြန်မြန်လာပါတယ်။stack နဲ့လဲဖြစ်ပါတယ်။maximum stack 4 ဖြစ်ပါတယ်။stack ကတော့ tenryu သုံးရင်တက်လာတာပါ။\n" +
                "tenryu ဟာ buff လဲပေးပါတယ်။ stack ကလဲ buff ဝင်နေတဲ့အချိန်သုံးမှတက်တာပါ။basic atk တေဟာ time interval မရှိတော့ပဲဖြစ်မှာပါ။ဒါ့အပြင် buff ဝင်နေချိန် madagachi, zentai settetsu ကိုသုံးတာ success ဖြစ်ပီး DMG ထွက်ရင် skill name ကို tenryu ransei:zannou လို့ပြောင်းပေးပီး immune effect ရတဲ့အပြင် skill ရဲ့ DMG ကိုလဲstack ကိုလိုက်ပီးတော်တော်များများတိုးပေးမှာပါ။duration ကိုလဲ 30sec အထိဆွဲဆန့်လိုက်မှာပါ။ဒါမဲ့ stack ကတော့ 1ကပြန်စမှာပါ။\n" +
                "normal buff duration ကတော့ 10sec ဖြစ်ပပါတယ်။skill ကိုစစသုံးချင်းမှာ mp cost 300ရှိပီး buff ဝင်နေချိန်သုံးရင်တော့ mp cost 100ဖြစ်သွားမာပါ။unsheathe skill ဖြစ်ပါတယ်။\n");
        txt2.setText("\n" +
                "garyou tensei ကတော့ madagachiလိုမျိုးပါပဲ။ဘေးမှာအကွင်းလေးကွင်းပေါ်လာတာပဲကွာတာပါ။သူကလဲ stack နဲ့ပါပဲ။stack ကိုလိုက်ပီး DMG တိုးပေးမှာပါ။ဒီ skill ကိုတစ်ခါသုံးတိုင်း stack က 0 ဖြစ်သွားမှာပါ။maximum stack ကတော့ 10 ပါ။ stack ကိုတော့mononofu skill တေကိုသုံးရင်ရမှာပါ။DMG လဲအရမ်းကြမ်းတဲ့ထဲမှာပါပါတယ်။\n" +
                "skill မှာ debuffပါပါတယ်။ဒါကတော့skillရဲ့ crit rate -(110-10*skill lvl)လျော့ပေးတာပါ။arm break ဖြစ်နေတဲ့သူကိုသုံးရင်တော့ DMG ထပ်တိုးပေးမှာပါ။mp cost 500ဖြစ်ပါတယ်။\n");
        txt3.setText("\n" +
                "kairiki ranshinကတော့ buff skill ဖြစ်ပါတယ်။buff ကော debuff ကောပါပါတယ်။\n" +
                "debuff ကတော့ 5secကနေ 10sec အထိ မီးလောင်မှာပါ။ (lvl များလေပိုကြာလေပါ)\n" +
                "buff အနေနဲ့ကတော့ atk +10*skill lvlတိုးပေးပါတယ်။ ampr +6 (level 1)/ +7 (level 2)/ +8 (level 3)/ +9 (level 4)/ +10 (level 5)/ +16 (level 6)/ +17 (level 7)/ +18 (level 8)/ +19 (level 9)/ +25 (level 10)တိုးပေးပါမယ်။ဒါ့အပြင် basic atk DMG ကိုလဲ (5*skill lvl )%တိုးပေးမှာပါ။ Garyou tensei ရဲ့ crit rate ကိုလဲ(10*skill lvl),physical Pierce +(10*skill lvl )%တိုးပေးပါသေးတယ်။duration ကတော့ 5sec ကနေ 10sec အထိဖြစ်ပါတယ်။(lvl အလိုက်တိုးတာပါ)\n" +
                "\n" +
                "katana ကိုင်ထားရင်တော့ buff duration ကိုသုံးဆလုပ်ပေးမှာပါ။ဒါ့အပြင် basic atk DMG +50%ထပ်တိုးပေးမှာပါ။");
    }

}
