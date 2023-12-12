package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bladeT3 extends Fragment {

static TextView txt1,txt2,txt3;
    public bladeT3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.blade_t3,vg,false);
        txt1=v.findViewById(R.id.txt1bladet3);
        txt2=v.findViewById(R.id.txt2bladet3);
        txt3=v.findViewById(R.id.txt3bladet3);
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
                "rampageကေတာ့ buff skill ပါ။သူ႔ buff ကေတာ့ basic atk ကို 10 ခါခ်ဆာ buff ေပးတာပါ။ဒါအျပင္ 1 ခါခ်တဲ့ အခါတိုင္း ေလးခ်က္ျဖစ္သြားပါတယ္။(dual sword ဆိုရင္ေတာ့ 7ခ်က္ပါ) ေတာ္ေတာ္ေလး dmg ထြက္ပါတယ္။attack mp recovery ကိုလဲတိုးေပးပါတယ္။(lvl 10မွာ 25 အထိတိုးေပးပါတယ္) def,mdef,dodgeေတြကို 0 ေျပာင္းလိုက္ပါတယ္။ buff duration ကေတာ့ 10min ဒါမွမဟုတ္ ailment တခုခုမမိမခ်င္း ခံပါတယ္။10 ခါခ်ပီးလို႔ေနာက္တခါခ်တဲ့အခါ DMG အမ်ားႀကီးထြက္တဲ့ finishing blow သုံးခ်က္ထြက္ပါတယ္။အ့ထြက္တဲ့ ဟာကိုskill လို႔သတ္မွတ္ပါတယ္။ဒါေၾကာင့္ skill သုံးရင္ buff effect ေပ်ာက္တဲ့ဟာေတအကုန္ေပ်ာက္သြားမာပါ။အကယ္၍rampage ကို combo ထဲထည့္သုံးထားရင္ေတာ့ rampage buff မေပ်ာက္မခ်င္း အ့ combo သုံးလို႔မရပါဘူး။DMG လဲထြက္တာမို႔ level 4 skill ေတမရခင္မာသုံးေလ့ရွိၾကတဲ့ skill ပါ။dual sword သုံးထားရင္ေတာ့ atk buff ဟာ main hand ကိုပဲသက္ေရာက္မာပါ။mp costကေတာ့ 500 ျဖစ္ပါတယ္။\n" +
                "one handed sword ကိုင္ထားရင္ေတာ့ basic atkအတြက္ buff ကိုပိုတိုးေပးပါတယ္။\n" +
                "two handed sword ကိုင္ထားရင္ေတာ့ finishing blow DMG ကိုတိုးေပးပါတယ္။ \n" +
                "\n");
        txt2.setText("sword tempest ကေတာ့ ဓားနဲ႔ရမ္းပီး wave ႀကီးတခုပစ္လိုက္တာပါ။အ့ wave  က target ကိုထိသြားရင္ storm ထြက္ပါတယ္။wave DMG ကမ်ားပါတယ္။ဒါအျပင္storm ကေနထိတဲ့ DMG ဟာလဲ magic proration ေပးပါတယ္။level 4 skill ေတမရခင္လူေတာ္ေတာ္မ်ားမ်ားသုံးၾကတဲ့ skill ပါ။storm က area effect ပါ။mp cost ကေတာ့ 400ျဖစ္ပါတယ္။\n" +
                "one handed sword ကိုင္ထားရင္ေတာ့ storm ကေနထိတဲ့ DMG ကိုတိုးေပးမာပါ။\n" +
                "two handed sword ဆိုရင္ေတာ့ wave ရဲ႕ DMG ကိုတိုးေပးမာပါ။\n" +
                "\n");
        txt3.setText("warcry ကေတာ့ buff skill ပါ။ atk power ကိုတိုးေပးပါတယ္။buff effect ကေတာ့ atk + (skill lvl )% တိုးေပးပီး duration ကေတာ့ 15+ skill lvl sec ျဖစ္ပါတယ္။ဘယ္ weapon နဲ႔ျဖစ္ျဖစ္သုံးလို႔ရပါတယ္။ဒါ့အျပင္ support skill လို႔လဲသတ္မွတ္ပါတာေၾကာင့္ warcry သုံးပီး support rank ယူလို႔ရပါတယ္။\n" +
                "one handed swordသုံးထားရင္ေတာ့ buff duration ကို 50 sec ထပ္တိုးေပးမာပါ။\n" +
                "two handed sword သုံးထားရင္ေတာ့ atk buff ကို +5% ထပ္တိုးေပးမာပါ။");
    }

    public static void unicode()
    {
        txt1.setText(
                "rampageကတော့ buff skill ပါ။သူ့ buff ကတော့ basic atk ကို 10 ခါချဆာ buff ပေးတာပါ။ဒါအပြင် 1 ခါချတဲ့ အခါတိုင်း လေးချက်ဖြစ်သွားပါတယ်။(dual sword ဆိုရင်တော့ 7ချက်ပါ) တော်တော်လေး dmg ထွက်ပါတယ်။attack mp recovery ကိုလဲတိုးပေးပါတယ်။(lvl 10မှာ 25 အထိတိုးပေးပါတယ်) def,mdef,dodgeတွေကို 0 ပြောင်းလိုက်ပါတယ်။ buff duration ကတော့ 10min ဒါမှမဟုတ် ailment တခုခုမမိမချင်း ခံပါတယ်။10 ခါချပီးလို့နောက်တခါချတဲ့အခါ DMG အများကြီးထွက်တဲ့ finishing blow သုံးချက်ထွက်ပါတယ်။အ့ထွက်တဲ့ ဟာကိုskill လို့သတ်မှတ်ပါတယ်။ဒါကြောင့် skill သုံးရင် buff effect ပျောက်တဲ့ဟာတေအကုန်ပျောက်သွားမာပါ။အကယ်၍rampage ကို combo ထဲထည့်သုံးထားရင်တော့ rampage buff မပျောက်မချင်း အ့ combo သုံးလို့မရပါဘူး။DMG လဲထွက်တာမို့ level 4 skill တေမရခင်မာသုံးလေ့ရှိကြတဲ့ skill ပါ။dual sword သုံးထားရင်တော့ atk buff ဟာ main hand ကိုပဲသက်ရောက်မာပါ။mp costကတော့ 500 ဖြစ်ပါတယ်။\n" +
                "one handed sword ကိုင်ထားရင်တော့ basic atkအတွက် buff ကိုပိုတိုးပေးပါတယ်။\n" +
                "two handed sword ကိုင်ထားရင်တော့ finishing blow DMG ကိုတိုးပေးပါတယ်။ \n" +
                "\n");
        txt2.setText("sword tempest ကတော့ ဓားနဲ့ရမ်းပီး wave ကြီးတခုပစ်လိုက်တာပါ။အ့ wave  က target ကိုထိသွားရင် storm ထွက်ပါတယ်။wave DMG ကများပါတယ်။ဒါအပြင်storm ကနေထိတဲ့ DMG ဟာလဲ magic proration ပေးပါတယ်။level 4 skill တေမရခင်လူတော်တော်များများသုံးကြတဲ့ skill ပါ။storm က area effect ပါ။mp cost ကတော့ 400ဖြစ်ပါတယ်။\n" +
                "one handed sword ကိုင်ထားရင်တော့ storm ကနေထိတဲ့ DMG ကိုတိုးပေးမာပါ။\n" +
                "two handed sword ဆိုရင်တော့ wave ရဲ့ DMG ကိုတိုးပေးမာပါ။\n" +
                "\n");
        txt3.setText("warcry ကတော့ buff skill ပါ။ atk power ကိုတိုးပေးပါတယ်။buff effect ကတော့ atk + (skill lvl )% တိုးပေးပီး duration ကတော့ 15+ skill lvl sec ဖြစ်ပါတယ်။ဘယ် weapon နဲ့ဖြစ်ဖြစ်သုံးလို့ရပါတယ်။ဒါ့အပြင် support skill လို့လဲသတ်မှတ်ပါတာကြောင့် warcry သုံးပီး support rank ယူလို့ရပါတယ်။\n" +
                "one handed swordသုံးထားရင်တော့ buff duration ကို 50 sec ထပ်တိုးပေးမာပါ။\n" +
                "two handed sword သုံးထားရင်တော့ atk buff ကို +5% ထပ်တိုးပေးမာပါ။");

    }

}
