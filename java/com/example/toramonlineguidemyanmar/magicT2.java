package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class magicT2 extends Fragment {

    static TextView txt1,txt2,txt3;
    public magicT2()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.magic_t2,vg,false);
        txt1=v.findViewById(R.id.txt1magict2);
        txt2=v.findViewById(R.id.txt2magict2);
        txt3=v.findViewById(R.id.txt3magict2);
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
                "magic lance ကေတာ့ magic arrow လိုမ်ိဳးပါပဲ။ဒါမဲ့သူကေတာ့ လွံနဲ႔ပစ္တာပါ။ DMG လဲေတာ္ေတာ္ထြက္ပါတယ္။ lvl အနိမ့္ပိုင္းမွာ DPS skill အေနနဲ႔လဲသုံးၾကပါတယ္။ cast time ပါပါတယ္။ stop ailment သက္ေရာက္ေပးႏိုင္ပါတယ္။\n" +
                "cast time ကေတာ့ 2sec ပါ။ailment chance 10+(2*skill lvl) % ရွိပါတယ္။\n" +
                "hit count ကေတာ့ lvl 5ေအာက္ဆို 2ခ်က္ျဖစ္ပီး အထက္ဆို 3ခ်က္ပါ။ DMG ကေတာ့ int အေပၚမူတည္ပီးထပ္တိုးေပးပါတယ္။mp cost 300ျဖစ္ပီး cast range 14mရွိပါတယ္။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ ailment chance ကို သုံးဆတိုးေပးမွာပါ။DMG လဲပိုတိုးေပးပါတယ္။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ hit count+1တိုးေပးပီး ailment chance သုံးဆတိုးေပးမွာပါ။ \n");
        txt2.setText("\n" +
                "magic blast ကေတာ့ monster/boss ေအာက္မွာ charge စုပီး ေပါက္ကြဲတာပါ။Aoe DMG သက္ေရာက္ပါတယ္။Dmg လဲေတာ္ေတာ္ထြက္ပါတယ္။အေစာပိုင္း mage ေတြ DPS skill အေနနဲ႔သုံးၾကပါတယ္။ cast time ကေတာ့ 4sec ပါ။\n" +
                "target ရဲ႕ ေဘး 3m ( lvl 1-5) or 4m (lvl 6-10)အထိ DMG သက္ေရာက္ပါတယ္။magic javelin လိုပဲ ailment သက္ေရာက္ႏိုင္တယ္။ element ေပၚမးတည္ပီးသက္ေရာက္တဲ့ type ကေတာ့ magic javelin နဲ႔တူတူပါပဲ။ailment chance (5*skill lvl)%ရွိပါတယ္။ mp cost 300 ျဖစ္ပီး maximum cast range 8mရွိပါတယ္။\n" +
                "\n" +
                "staff သုံးထားရင္ေတာ့ int အေပၚမူတည္ပီး DMG ေတထပ္တိုးေပးပါတယ္။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ ailment chance 50%နဲ႔ hit range 2m ထပ္တိုးေပးပါတယ္။Dmg လဲအနည္းငယ္တိုးေပးပါတယ္။\n");
        txt3.setText("\n" +
                "chain cast ကေတာ့ passive skill ပါ။သူကေတာ့magic arrow သုံးပီးတဲ့အခါ buff ေပးတာပါ။ buff ကေတာ့ ေနာက္ထပ္သုံးမဲ့ magic skill ရဲ႕ cast time ကို (5*skill lvl)% ေလ်ာ့ေပးတာပါ။ buff effect က ေနာက္ skill သုံးပီးရင္ေပ်ာက္ပါတယ္။တကယ္လို႔ cast time မပါရင္ motion speed တိုးေပးပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "magic lance ကတော့ magic arrow လိုမျိုးပါပဲ။ဒါမဲ့သူကတော့ လှံနဲ့ပစ်တာပါ။ DMG လဲတော်တော်ထွက်ပါတယ်။ lvl အနိမ့်ပိုင်းမှာ DPS skill အနေနဲ့လဲသုံးကြပါတယ်။ cast time ပါပါတယ်။ stop ailment သက်ရောက်ပေးနိုင်ပါတယ်။\n" +
                "cast time ကတော့ 2sec ပါ။ailment chance 10+(2*skill lvl) % ရှိပါတယ်။\n" +
                "hit count ကတော့ lvl 5အောက်ဆို 2ချက်ဖြစ်ပီး အထက်ဆို 3ချက်ပါ။ DMG ကတော့ int အပေါ်မူတည်ပီးထပ်တိုးပေးပါတယ်။mp cost 300ဖြစ်ပီး cast range 14mရှိပါတယ်။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ ailment chance ကို သုံးဆတိုးပေးမှာပါ။DMG လဲပိုတိုးပေးပါတယ်။\n" +
                "magic device နဲ့ဆိုရင်တော့ hit count+1တိုးပေးပီး ailment chance သုံးဆတိုးပေးမှာပါ။ \n");
        txt2.setText("\n" +
                "magic blast ကတော့ monster/boss အောက်မှာ charge စုပီး ပေါက်ကွဲတာပါ။Aoe DMG သက်ရောက်ပါတယ်။Dmg လဲတော်တော်ထွက်ပါတယ်။အစောပိုင်း mage တွေ DPS skill အနေနဲ့သုံးကြပါတယ်။ cast time ကတော့ 4sec ပါ။\n" +
                "target ရဲ့ ဘေး 3m ( lvl 1-5) or 4m (lvl 6-10)အထိ DMG သက်ရောက်ပါတယ်။magic javelin လိုပဲ ailment သက်ရောက်နိုင်တယ်။ element ပေါ်မးတည်ပီးသက်ရောက်တဲ့ type ကတော့ magic javelin နဲ့တူတူပါပဲ။ailment chance (5*skill lvl)%ရှိပါတယ်။ mp cost 300 ဖြစ်ပီး maximum cast range 8mရှိပါတယ်။\n" +
                "\n" +
                "staff သုံးထားရင်တော့ int အပေါ်မူတည်ပီး DMG တေထပ်တိုးပေးပါတယ်။\n" +
                "magic device နဲ့ဆိုရင်တော့ ailment chance 50%နဲ့ hit range 2m ထပ်တိုးပေးပါတယ်။Dmg လဲအနည်းငယ်တိုးပေးပါတယ်။\n");
        txt3.setText(
                "\n" +
                "chain cast ကတော့ passive skill ပါ။သူကတော့magic arrow သုံးပီးတဲ့အခါ buff ပေးတာပါ။ buff ကတော့ နောက်ထပ်သုံးမဲ့ magic skill ရဲ့ cast time ကို (5*skill lvl)% လျော့ပေးတာပါ။ buff effect က နောက် skill သုံးပီးရင်ပျောက်ပါတယ်။တကယ်လို့ cast time မပါရင် motion speed တိုးပေးပါတယ်။");
    }

}
