package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class magicT3 extends Fragment {

    static TextView txt1,txt2,txt3;
    public magicT3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.magic_t3,vg,false);
        txt1=v.findViewById(R.id.txt1magict3);
        txt2=v.findViewById(R.id.txt2magict3);
        txt3=v.findViewById(R.id.txt3magict3);
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
                "magic impact ကေတာ့ကိုယ့္ေဘးနားကmonstersေတကို shockwave နဲ႔သက္ေရာက္တာပါ။ေဘးနားကmonsters/boss ေတကိုtumbleႏိုင္ပါတယ္။ဒီ skill ဟာ ေနာက္သုံးမဲ့ skill ရဲ႕ mp cost ကိုတဝက္ေလ်ာ့ေပးပါတယ္။ဒါေၾကာင့္မို႔ လူသုံးမ်ားတဲ့ skill ျဖစ္ပါတယ္။ dmgေတာ့အမ်ားႀကီးမထြက္ပါဘူး။ဒီ skillရဲ႕ buff ဝင္ေနခ်ိန္မွာ ဒီဟာကိုပဲထပ္သုံးမယ္ဆိုရင္ေတာ့ tumble rate ေတdmg ေတေလ်ာ့ေပးပီး staff/magic device  တို႔ကရမဲ့ bonusေတေဖ်ာက္ပစ္ပါတယ္။ ဒါ့အျပင္ buff လဲထပ္ရမွာမဟုတ္ပါဘူး။cast time ကေတာ့ 2 sec(lvl 1-2),1 sec ( lvl 3-6),no cast time(lvl 7-10) အသီးသီးျဖစ္ပါတယ္။tumble chance 15+(5*skill lvl) % ရွိပာတယ္။mp cost 200ျဖစ္ပါတယ္။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ tumble chance 25%ထပ္တိုးေပးမွာပါ။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ skill DMG ထပ္တိုးေပးမွာပါ။\n");
        txt2.setText("\n" +
                "magic storm ကေတာ့ မုန္တိုင္းတခု cast လုပ္လိုက္တာပါ။သူ႔ Aoe ထဲမွာရွိတဲ့အေကာင္ေတကိုအလည္ကိုဆြဲစုပါတယ္။ farm တဲ့သူေတေတာ္ေတာ္မ်ားမ်ားသုံးေလ့ရွိပါတယ္။ DMG လဲထြက္သလိုအသုံးလဲဝင္ပါတယ္။ cast time ကေတာ့  1 sec ပါ။ DMG ထုတ္ေပးတဲ့အႀကိမ္ေရကေတာ့   lvl 10 မွာ 6 ခ်က္ပါ။ Aoe ကေတာ့ lvl 10မွာ 3.75m အထိက်ယ္ပါတယ္။အထဲကိုဆြဲစုပ္ႏိုင္တဲ့ chance ကေတာ့ monsters ေတမွာ 100%ျဖစ္ပီး boss ေတမွာ 50%ျဖစ္ပါတယ္။mp cost 400ျဖစ္ပီး maximum cast range 8mရွိပါတယ္။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ DMG ပိုတိုးေပးပါတယ္။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ Aoe ကို 2mထပ္က်ယ္ေပးမွာပါ။\n");
        txt3.setText("\n" +
                "power wave ကေတာ့ passive skill ပါ။သူကေတာ့ melee weapon ကိုင္ထားတဲ့သူေတကိုအေဝးကေနခ်လို႔ရေအာင္လုပ္ေပးတာပါ။ခုတ္တဲ့အခ်က္တိုင္း wave ေလးေတထြက္ပါတယ္။ampr လဲရပါတယ္။ wave ရဲ႕ DMG ကေတာ့ basic atk dmg ရဲ႕(5*skill lvl)% ပဲထြက္ပါတယ္။ range ကေတာ့ 5+(0.5*skill lvl) m ရွိပါတယ္။ rampage သုံးလိုက္ရင္ေတာ့ effect ေပ်ာက္ပါတယ္။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ range ကို 2m တိုးေပးမွာျဖစ္ပီး DMG ကိုလဲ 40% တိုးေပးမွာပါ။(40+ 5*skill lvl)% ျဖစ္သြားမွာပါ။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့dmg  70%ထပ္တိုးမွာပါ။");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "magic impact ကတော့ကိုယ့်ဘေးနားကmonstersတေကို shockwave နဲ့သက်ရောက်တာပါ။ဘေးနားကmonsters/boss တေကိုtumbleနိုင်ပါတယ်။ဒီ skill ဟာ နောက်သုံးမဲ့ skill ရဲ့ mp cost ကိုတဝက်လျော့ပေးပါတယ်။ဒါကြောင့်မို့ လူသုံးများတဲ့ skill ဖြစ်ပါတယ်။ dmgတော့အများကြီးမထွက်ပါဘူး။ဒီ skillရဲ့ buff ဝင်နေချိန်မှာ ဒီဟာကိုပဲထပ်သုံးမယ်ဆိုရင်တော့ tumble rate တေdmg တေလျော့ပေးပီး staff/magic device  တို့ကရမဲ့ bonusတေဖျောက်ပစ်ပါတယ်။ ဒါ့အပြင် buff လဲထပ်ရမှာမဟုတ်ပါဘူး။cast time ကတော့ 2 sec(lvl 1-2),1 sec ( lvl 3-6),no cast time(lvl 7-10) အသီးသီးဖြစ်ပါတယ်။tumble chance 15+(5*skill lvl) % ရှိပာတယ်။mp cost 200ဖြစ်ပါတယ်။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ tumble chance 25%ထပ်တိုးပေးမှာပါ။\n" +
                "magic device နဲ့ဆိုရင်တော့ skill DMG ထပ်တိုးပေးမှာပါ။\n" +
                "\n" );
        txt2.setText("\n" +
                "magic storm ကတော့ မုန်တိုင်းတခု cast လုပ်လိုက်တာပါ။သူ့ Aoe ထဲမှာရှိတဲ့အကောင်တေကိုအလည်ကိုဆွဲစုပါတယ်။ farm တဲ့သူတေတော်တော်များများသုံးလေ့ရှိပါတယ်။ DMG လဲထွက်သလိုအသုံးလဲဝင်ပါတယ်။ cast time ကတော့  1 sec ပါ။ DMG ထုတ်ပေးတဲ့အကြိမ်ရေကတော့   lvl 10 မှာ 6 ချက်ပါ။ Aoe ကတော့ lvl 10မှာ 3.75m အထိကျယ်ပါတယ်။အထဲကိုဆွဲစုပ်နိုင်တဲ့ chance ကတော့ monsters တေမှာ 100%ဖြစ်ပီး boss တေမှာ 50%ဖြစ်ပါတယ်။mp cost 400ဖြစ်ပီး maximum cast range 8mရှိပါတယ်။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ DMG ပိုတိုးပေးပါတယ်။\n" +
                "magic device နဲ့ဆိုရင်တော့ Aoe ကို 2mထပ်ကျယ်ပေးမှာပါ။\n");
        txt3.setText("\n" +
                "power wave ကတော့ passive skill ပါ။သူကတော့ melee weapon ကိုင်ထားတဲ့သူတေကိုအဝေးကနေချလို့ရအောင်လုပ်ပေးတာပါ။ခုတ်တဲ့အချက်တိုင်း wave လေးတေထွက်ပါတယ်။ampr လဲရပါတယ်။ wave ရဲ့ DMG ကတော့ basic atk dmg ရဲ့(5*skill lvl)% ပဲထွက်ပါတယ်။ range ကတော့ 5+(0.5*skill lvl) m ရှိပါတယ်။ rampage သုံးလိုက်ရင်တော့ effect ပျောက်ပါတယ်။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ range ကို 2m တိုးပေးမှာဖြစ်ပီး DMG ကိုလဲ 40% တိုးပေးမှာပါ။(40+ 5*skill lvl)% ဖြစ်သွားမှာပါ။\n" +
                "magic device နဲ့ဆိုရင်တော့dmg  70%ထပ်တိုးမှာပါ။");
    }

}
