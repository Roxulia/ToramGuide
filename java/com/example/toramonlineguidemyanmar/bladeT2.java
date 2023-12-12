package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bladeT2 extends Fragment {

    static TextView txt1,txt2,txt3;
    public bladeT2()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.blade_t2,vg,false);
        txt1=v.findViewById(R.id.txt1bladet2);
        txt2=v.findViewById(R.id.txt2bladet2);
        txt3=v.findViewById(R.id.txt3bladet2);
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
                "trigger slash ကေတာ့ ဓားနဲ႔ခုတ္တာပါပဲ။ဒါမဲ့သူကဓားနဲ႔ေလကိုပိုင္းပီး မီးလုံးထြက္လာတာပါ။သူက DMG လဲထြက္ပါတယ္။buff လဲေပးပါတယ္။ placed skill ပါ။သူေပးတဲ့ buff ကေတာ့ ေနာက္ skill တခုမသုံးမခ်င္း attack mp recovery ကို (2*skill lvl )တိုးေပးပါတယ္။ဒါအျပင္ေနာက္skill ရဲ႕ motion speed ကိုလဲတိုးေပးပါေသးတယ္။ mp cost ကေတာ့ lvl 1-5 မွာ 300 ျဖစ္ပီး lvl 6-10မွာ 200ျဖစ္ပါတယ္။buff အျဖစ္ေတာ္ေတာ္မ်ားမ်ားသုံးၾကတဲ့ skill ျဖစ္ပါတယ္။\n" +
                "one handed sword သုံးရင္ေတာ့ skill ဟာ miss ထမွာမဟူတ္ပါဘူး။\n" +
                "two handed sword ဆိုရင္ေတာ့ DMG ထပ္တိုးေပးတာပါ။\n" +
                "\n");
        txt2.setText("spiral air ကေတာ့ ဓားနဲ႔ထိုးလိုက္တာပါ။ထိုးလိုက္တဲ့အခါမွ ေလေပြအေသးထြက္လာပီး dmg 10 ခါထိတာပါ။သူက crit မထပါဘူး။ dmgထိတာပီးသြားရင္ buff ေပးပါတယ္။critical DMG + တိုးေပးပါတယ္။minimum 1 ကေနပီး maximum 10 ထိတိုးေပးပါတယ္။ buff အေနနဲ႔သုံးၾကတာမ်ားပါတယ္။ mp cost ကေတာ့ 300 ပါ။\n" +
                "one handed sword ကို bonus မေပးထားပါဘူး။\n" +
                "two handed sword ကိုင္ထားရင္ေတာ့ ေလေပြထြက္တဲ့ DMG ပိုၾကမ္းမာျဖစ္ပီး buff ကေတာ့ maximum 5 အထိပဲရမာပါ။\n" +
                "\n");
        txt3.setText("sword techniques ကေတာ့ blade skill ေတရဲ႕ DMG ကိုတိုးေပးတဲ့ passive skill ပါ။\n" +
                "သူ႔ effect ကေတာ့ blade skill dmg ကို (2*skill lvl)% ထပ္တိုးေပးတာပါ။\n" +
                "dual skill ေတကိုေတာ့ effect မဝင္ပါဘူး။");

    }

    public static void unicode()
    {
        txt1.setText(
                "trigger slash ကတော့ ဓားနဲ့ခုတ်တာပါပဲ။ဒါမဲ့သူကဓားနဲ့လေကိုပိုင်းပီး မီးလုံးထွက်လာတာပါ။သူက DMG လဲထွက်ပါတယ်။buff လဲပေးပါတယ်။ placed skill ပါ။သူပေးတဲ့ buff ကတော့ နောက် skill တခုမသုံးမချင်း attack mp recovery ကို (2*skill lvl )တိုးပေးပါတယ်။ဒါအပြင်နောက်skill ရဲ့ motion speed ကိုလဲတိုးပေးပါသေးတယ်။ mp cost ကတော့ lvl 1-5 မှာ 300 ဖြစ်ပီး lvl 6-10မှာ 200ဖြစ်ပါတယ်။buff အဖြစ်တော်တော်များများသုံးကြတဲ့ skill ဖြစ်ပါတယ်။\n" +
                "one handed sword သုံးရင်တော့ skill ဟာ miss ထမှာမဟူတ်ပါဘူး။\n" +
                "two handed sword ဆိုရင်တော့ DMG ထပ်တိုးပေးတာပါ။\n" +
                "\n");
        txt2.setText("spiral air ကတော့ ဓားနဲ့ထိုးလိုက်တာပါ။ထိုးလိုက်တဲ့အခါမှ လေပွေအသေးထွက်လာပီး dmg 10 ခါထိတာပါ။သူက crit မထပါဘူး။ dmgထိတာပီးသွားရင် buff ပေးပါတယ်။critical DMG + တိုးပေးပါတယ်။minimum 1 ကနေပီး maximum 10 ထိတိုးပေးပါတယ်။ buff အနေနဲ့သုံးကြတာများပါတယ်။ mp cost ကတော့ 300 ပါ။\n" +
                "one handed sword ကို bonus မပေးထားပါဘူး။\n" +
                "two handed sword ကိုင်ထားရင်တော့ လေပွေထွက်တဲ့ DMG ပိုကြမ်းမာဖြစ်ပီး buff ကတော့ maximum 5 အထိပဲရမာပါ။\n" +
                "\n");
        txt3.setText("sword techniques ကတော့ blade skill တေရဲ့ DMG ကိုတိုးပေးတဲ့ passive skill ပါ။\n" +
                "သူ့ effect ကတော့ blade skill dmg ကို (2*skill lvl)% ထပ်တိုးပေးတာပါ။\n" +
                "dual skill တေကိုတော့ effect မဝင်ပါဘူး။");

    }

}
