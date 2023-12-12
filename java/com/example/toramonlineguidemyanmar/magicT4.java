package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class magicT4 extends Fragment {

    static TextView txt1,txt2,txt3;
    public magicT4()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.magic_t4,vg,false);
        txt1=v.findViewById(R.id.txt1magict4);
        txt2=v.findViewById(R.id.txt2magict4);
        txt3=v.findViewById(R.id.txt3magict4);
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
                "magic finale ကေတာ့ေျမျပင္မွာအကြင္းႀကီးေပၚလာပီး မိုးေပၚကေန အခ်က္သုံးခ်က္ပစ္ခ်တာပါ။ mage ေတရဲ႕အဓိက DMGထြက္တဲ့ skill ျဖစ္ပါတယ္။ DMG လဲေတာ္ေတာ္ထြက္ပါတယ္။သူ႔ cast time ဟာ cspd နဲ႔ effect မျဖစ္ပါဘူး။\n" +
                "တခ်က္ပီးတခ်က္ Aoe က်ယ္က်ယ္လာပီး DMG နည္းနည္းလာပါတယ္။ \n" +
                "cast time ကေတာ့ (13-skill lvl)sec ျဖစ္ပါတယ္။ aggro generate လုပ္တာလဲထူးျခားပါတယ္။ cast time 1 sec ကို aggro 100ထုတ္ပါတယ္။ အေနအထိုင္းမတတ္ရင္ boss လိုက္႐ိုက္တာခံရမွာပါ။ \n" +
                "hit range Aoe  ကေတာ့ 0.5m(first hit),4m(second hit),10m(third hit) အသီးသီးျဖစ္ပါတယ္။ maximum cast range 12mျဖစ္ပီး mp cost ကေတာ့ 1600ပါ။ element effect မဝင္ပါဘူး။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ DMG ကို int နဲ႔ကိုက္ပီးမ်ားမ်ားတိုးေပးပါတယ္။\n" +
                "magic device နဲ႔ဆိုရင္လဲ DMG ကို int နဲ႔တိုးေပးပါတယ္။staff ထက္နဲပါတယ္။ hit range Aoe ကိုလဲ second hit ရဲ႕ range ကို ႏွစ္ဆ , third hitရဲ႕ range ကိုေလးဆတိုးေပးပါတယ္။\n");
        txt2.setText("\n" +
                "magic burst ကေတာ့ ကိုယ့္ေရွ႕ fan shape area အတြင္းကို wave ႀကီးထုတ္ပီးတြန္းထုတ္တာပါ။ သူကလဲ DMG ၾကမ္းပါတယ္။ စက္ဝိုင္းစိတ္ပုံစံ area ရွိပါတယ္။ cast time ကေတာ့ၾကာပါတယ္။\n" +
                "စက္ဝိုင္းရဲ႕ အခ်င္းဝက္ကေတာ့ lvl 10မွာ 13m ျဖစ္ပီး အထဲက angle ကေတာ့ (40+2*skill lvl) degree ရွိပါတယ္။\n" +
                "cast time ကေတာ့ 8sec ျဖစ္ပီး cspd effect ဝင္ပါတယ္။ဒါ့အျပင္ magic skill တခုသုံးတိုင္း cast time 1sec ေလ်ာ့ေပးပါတယ္။ knockback chance ကေတာ့ monster ေတမွာ (10*skill lvl)%ရွိပီး boss ေတကိုေတာ့ knockback မျဖစ္ေစပါဘူး။maximum cast range 8mျဖစ္ပီး mp cost 500ပါ။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ DMG ပိုတိုးေပးထားပါတယ္။\n" +
                "magic device နဲ႔ဆိုရင္ေတာ့ DMG နဲနဲတိုးေပးပီး fan shape Aoe ကိုက်ယ္ေပးမွာပါ။\n" +
                "\n");
        txt3.setText("\n" +
                "maximizer ကေတာ့ mp အမ်ားႀကီးျပန္ျဖည့္ေပးတဲ့ skill ပါ။ cast time ကေတာ့ေတာ္ေတာ္ၾကာပါတယ္။ ဒီskill မသုံးခင္ mp charge အရင္သုံးသင့္ပါတယ္။\n" +
                "cast time  ကေတာ့ lvl 10မွာ 10secပါ။mp 1000 ျပန္ျဖည့္ေပးပါတယ္။mp cost 300ျဖစ္ပါတယ္။\n" +
                "\n" +
                "staff နဲ႔သုံးရင္ေတာ့ mp ျပန္ျပည့္တာကို  500တိုးေပးပါတယ္။\n" +
                "magic device ဆိုရင္ေတာ့ 700 ထပ္တိုးေပးပါတယ္။\n");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "magic finale ကတော့မြေပြင်မှာအကွင်းကြီးပေါ်လာပီး မိုးပေါ်ကနေ အချက်သုံးချက်ပစ်ချတာပါ။ mage တေရဲ့အဓိက DMGထွက်တဲ့ skill ဖြစ်ပါတယ်။ DMG လဲတော်တော်ထွက်ပါတယ်။သူ့ cast time ဟာ cspd နဲ့ effect မဖြစ်ပါဘူး။\n" +
                "တချက်ပီးတချက် Aoe ကျယ်ကျယ်လာပီး DMG နည်းနည်းလာပါတယ်။ \n" +
                "cast time ကတော့ (13-skill lvl)sec ဖြစ်ပါတယ်။ aggro generate လုပ်တာလဲထူးခြားပါတယ်။ cast time 1 sec ကို aggro 100ထုတ်ပါတယ်။ အနေအထိုင်းမတတ်ရင် boss လိုက်ရိုက်တာခံရမှာပါ။ \n" +
                "hit range Aoe  ကတော့ 0.5m(first hit),4m(second hit),10m(third hit) အသီးသီးဖြစ်ပါတယ်။ maximum cast range 12mဖြစ်ပီး mp cost ကတော့ 1600ပါ။ element effect မဝင်ပါဘူး။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ DMG ကို int နဲ့ကိုက်ပီးများများတိုးပေးပါတယ်။\n" +
                "magic device နဲ့ဆိုရင်လဲ DMG ကို int နဲ့တိုးပေးပါတယ်။staff ထက်နဲပါတယ်။ hit range Aoe ကိုလဲ second hit ရဲ့ range ကို နှစ်ဆ , third hitရဲ့ range ကိုလေးဆတိုးပေးပါတယ်။");
        txt2.setText("\n" +
                "magic burst ကတော့ ကိုယ့်ရှေ့ fan shape area အတွင်းကို wave ကြီးထုတ်ပီးတွန်းထုတ်တာပါ။ သူကလဲ DMG ကြမ်းပါတယ်။ စက်ဝိုင်းစိတ်ပုံစံ area ရှိပါတယ်။ cast time ကတော့ကြာပါတယ်။\n" +
                "စက်ဝိုင်းရဲ့ အချင်းဝက်ကတော့ lvl 10မှာ 13m ဖြစ်ပီး အထဲက angle ကတော့ (40+2*skill lvl) degree ရှိပါတယ်။\n" +
                "cast time ကတော့ 8sec ဖြစ်ပီး cspd effect ဝင်ပါတယ်။ဒါ့အပြင် magic skill တခုသုံးတိုင်း cast time 1sec လျော့ပေးပါတယ်။ knockback chance ကတော့ monster တေမှာ (10*skill lvl)%ရှိပီး boss တေကိုတော့ knockback မဖြစ်စေပါဘူး။maximum cast range 8mဖြစ်ပီး mp cost 500ပါ။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ DMG ပိုတိုးပေးထားပါတယ်။\n" +
                "magic device နဲ့ဆိုရင်တော့ DMG နဲနဲတိုးပေးပီး fan shape Aoe ကိုကျယ်ပေးမှာပါ။\n" +
                "\n");
        txt3.setText("\n" +
                "maximizer ကတော့ mp အများကြီးပြန်ဖြည့်ပေးတဲ့ skill ပါ။ cast time ကတော့တော်တော်ကြာပါတယ်။ ဒီskill မသုံးခင် mp charge အရင်သုံးသင့်ပါတယ်။\n" +
                "cast time  ကတော့ lvl 10မှာ 10secပါ။mp 1000 ပြန်ဖြည့်ပေးပါတယ်။mp cost 300ဖြစ်ပါတယ်။\n" +
                "\n" +
                "staff နဲ့သုံးရင်တော့ mp ပြန်ပြည့်တာကို  500တိုးပေးပါတယ်။\n" +
                "magic device ဆိုရင်တော့ 700 ထပ်တိုးပေးပါတယ်။");
    }

}
