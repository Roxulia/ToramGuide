package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class shotT2 extends Fragment {

    static TextView txt1,txt2,txt3;
    public shotT2()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.shot_t2,vg,false);
        txt1=v.findViewById(R.id.txt1shott2);
        txt2=v.findViewById(R.id.txt2shott2);
        txt3=v.findViewById(R.id.txt3shott2);
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
        txt1.setText("arrow rain ကေတာ့ မိုးေပၚကိုျမႇားနဲ႔တခ်က္ပစ္လိုက္ပီး ျမႇားမိုး႐ြာခ်တာပါ။lvl အနိမ့္ပိုင္းေတြမာ farm ရင္သုံးလို႔ရပါတယ္။Aoe DMG ထိပါတယ္။\n" +
                "hit count ကေတာ့ ceiling(skill lvl/2.5) ပါ။(lvl 10ဆိုရင္ ေလးခ်က္ထိပါတယ္။)DMG လဲထြက္ပါတယ္။အေစာပိုင္းေတမွာmain DPS အျဖစ္သုံးတာလဲေတြ႕ရပါတယ္။mp cost 300 သုံးရပီး cast range 12m ပါ။placed skill ပါ။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ Aoe ပိုက်ယ္မွာပါ။ဒါ့အျပင္ hit count ကိုလဲႏွစ္ဆတိုးေပးပါတယ္။\n" +
                "bowgun နဲ႔သုံးရင္ေတာ့ DMG ပိုတိုးေပးမွာပါ။\n");
        txt2.setText("paralysis shot ကေတာ့ျမႇားထဲမွာ wind element ထည့္ပီးပစ္တာပါ။ပစ္ခံရတဲ့အေကာင္ကိုမိုးႀကိဳးပစ္ပါတယ္။paralyse ျဖစ္ေအာင္လုပ္ႏိုင္ပါတယ္။ DMG လဲအေတာ္အသင့္ထြက္ပီး buff လဲေပးပါတယ္။\n" +
                "paralysed ျဖစ္ေအာင္လုပ္ႏိုင္တဲ့ chance (50+ 2*skill lvl )% ရွိပါတယ္။\n" +
                "buff အေနနဲ႔  10 sec အၾကာ stability +(skill lvl )% တိုးေပးပါတယ္။\n" +
                "mp cost 300ျဖစ္ပီး cast range ကေတာ့ 14m ရွိပါတယ္။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ paralysed chance 20% တိုးေပးမွာပါ။DMG လဲနဲနဲထပ္တိုးေပးပါတယ္။\n" +
                "bowgunနဲ႔ဆိုရင္ေတာ့ DMG ကိုေတာ္ေတာ္တိုးေပးထားပီး paralysed chance ကို 20% ေလ်ာ့ေပးမွာပါ။\n");
        txt3.setText("long range ကေတာ့ 8m နဲ႔ 8m အထက္ cast range ရွိတဲ့ skill ေတြရဲ႕ DMG ကိုတိုးေပးတဲ့ passive ပါ။\n" +
                "buff effect ကေတာ့ DMG + (skill lvl )% ပါ။\n" +
                "ဘယ္ weapon သုံးသုံး effect ဝင္ပါတယ္။placed skill ေတြမွာ effect မဝင္ပါဘူး။");
    }

    public static void unicode()
    {
        txt1.setText("arrow rain ကတော့ မိုးပေါ်ကိုမြှားနဲ့တချက်ပစ်လိုက်ပီး မြှားမိုးရွာချတာပါ။lvl အနိမ့်ပိုင်းတွေမာ farm ရင်သုံးလို့ရပါတယ်။Aoe DMG ထိပါတယ်။\n" +
                "hit count ကတော့ ceiling(skill lvl/2.5) ပါ။(lvl 10ဆိုရင် လေးချက်ထိပါတယ်။)DMG လဲထွက်ပါတယ်။အစောပိုင်းတေမှာmain DPS အဖြစ်သုံးတာလဲတွေ့ရပါတယ်။mp cost 300 သုံးရပီး cast range 12m ပါ။placed skill ပါ။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ Aoe ပိုကျယ်မှာပါ။ဒါ့အပြင် hit count ကိုလဲနှစ်ဆတိုးပေးပါတယ်။\n" +
                "bowgun နဲ့သုံးရင်တော့ DMG ပိုတိုးပေးမှာပါ။\n");
        txt2.setText("paralysis shot ကတော့မြှားထဲမှာ wind element ထည့်ပီးပစ်တာပါ။ပစ်ခံရတဲ့အကောင်ကိုမိုးကြိုးပစ်ပါတယ်။paralyse ဖြစ်အောင်လုပ်နိုင်ပါတယ်။ DMG လဲအတော်အသင့်ထွက်ပီး buff လဲပေးပါတယ်။\n" +
                "paralysed ဖြစ်အောင်လုပ်နိုင်တဲ့ chance (50+ 2*skill lvl )% ရှိပါတယ်။\n" +
                "buff အနေနဲ့  10 sec အကြာ stability +(skill lvl )% တိုးပေးပါတယ်။\n" +
                "mp cost 300ဖြစ်ပီး cast range ကတော့ 14m ရှိပါတယ်။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ paralysed chance 20% တိုးပေးမှာပါ။DMG လဲနဲနဲထပ်တိုးပေးပါတယ်။\n" +
                "bowgunနဲ့ဆိုရင်တော့ DMG ကိုတော်တော်တိုးပေးထားပီး paralysed chance ကို 20% လျော့ပေးမှာပါ။\n");
        txt3.setText("long range ကတော့ 8m နဲ့ 8m အထက် cast range ရှိတဲ့ skill တွေရဲ့ DMG ကိုတိုးပေးတဲ့ passive ပါ။\n" +
                "buff effect ကတော့ DMG + (skill lvl )% ပါ။\n" +
                "ဘယ် weapon သုံးသုံး effect ဝင်ပါတယ်။placed skill တွေမှာ effect မဝင်ပါဘူး။");
    }

}
