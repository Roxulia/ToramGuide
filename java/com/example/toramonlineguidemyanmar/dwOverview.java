package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class dwOverview extends Fragment {

    static TextView txt1;
    public dwOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.dw_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvDw);
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
        txt1.setText("dual sword ဟာ လူႀကိဳက္အမ်ားဆုံး skill ေတbalance အလုပ္ခံရဆုံး class ပါ။ sword class ရဲ႕ sub class လဲဟုတ္ပါတယ္။သူဟာ mechanic ေတြနဲ႔ျပည့္နက္ေနတဲ့ class ဆိုလဲမမွားပါဘူး။ၾကမ္းေအာင္ေဆာ့ဖို႔လဲခက္သလိုၾကမ္းပီဆိုရင္လည္း အသားကုန္ၾကမ္းႏိုင္တဲ့ class ျဖစ္ပါတယ္။ untouch ေဆာ့ႏိုင္တဲ့ class လဲျဖစ္ပါတယ္။ animation လဲလွပါတယ္။ampr ကလဲပုံမွန္ထင္ႏွစ္ဆရပါတယ္။ dual sword ဟာ ဓားႏွစ္ေခ်ာင္းကိုင္တာျဖစ္လို႔ သူ႔ရဲ႕ skill ေတြက main hand atk,sub hand atk ေကာၾကမ္းမွၾကမ္းတာပါ။ဒါအျပင္ sub hand stability ဟာလဲအေရးပါပါတယ္။sub hand atk နဲ႔ stability ႏွစ္ခုလုံးကို ပုံမွန္ atk%, stability % ေတြကေနရရွိႏိုင္ပါတယ္။ dmg ကလဲ lvlမ်ားေလမ်ားသလိုၾကမ္းလာပါတယ္။ ခုတ္တဲ့ animation ကလဲၾကာတဲ့အတြက္ mspd မ်ားမွ Aoe ေတကေနေရွာင္လို႔ရမွာပါ။ဒါမွမဟုတ္ရင္ေတာ့ auto atk cancel လုပ္မွရပါမယ္။ dual sword ဟာလဲ blade skill ကဟာေတြသုံးလို႔ရတာေၾကာင့္ playstyle မ်ားတဲ့အထဲလဲပါပါတယ္။mechanic,playstyle မ်ားျပားတဲ့အျပင္ main hand swordေကာ sub hand sword ေကာ ေကာင္းဖို႔လိုတာေၾကာင့္ စစေဆာ့ခ်င္း newbie ေတနဲ႔လုံးဝမသင့္ေတာ္တဲ့ class ျဖစ္ပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("dual sword ဟာ လူကြိုက်အများဆုံး skill တေbalance အလုပ်ခံရဆုံး class ပါ။ sword class ရဲ့ sub class လဲဟုတ်ပါတယ်။သူဟာ mechanic တွေနဲ့ပြည့်နက်နေတဲ့ class ဆိုလဲမမှားပါဘူး။ကြမ်းအောင်ဆော့ဖို့လဲခက်သလိုကြမ်းပီဆိုရင်လည်း အသားကုန်ကြမ်းနိုင်တဲ့ class ဖြစ်ပါတယ်။ untouch ဆော့နိုင်တဲ့ class လဲဖြစ်ပါတယ်။ animation လဲလှပါတယ်။ampr ကလဲပုံမှန်ထင်နှစ်ဆရပါတယ်။ dual sword ဟာ ဓားနှစ်ချောင်းကိုင်တာဖြစ်လို့ သူ့ရဲ့ skill တွေက main hand atk,sub hand atk ကောကြမ်းမှကြမ်းတာပါ။ဒါအပြင် sub hand stability ဟာလဲအရေးပါပါတယ်။sub hand atk နဲ့ stability နှစ်ခုလုံးကို ပုံမှန် atk%, stability % တွေကနေရရှိနိုင်ပါတယ်။ dmg ကလဲ lvlများလေများသလိုကြမ်းလာပါတယ်။ ခုတ်တဲ့ animation ကလဲကြာတဲ့အတွက် mspd များမှ Aoe တေကနေရှောင်လို့ရမှာပါ။ဒါမှမဟုတ်ရင်တော့ auto atk cancel လုပ်မှရပါမယ်။ dual sword ဟာလဲ blade skill ကဟာတွေသုံးလို့ရတာကြောင့် playstyle များတဲ့အထဲလဲပါပါတယ်။mechanic,playstyle များပြားတဲ့အပြင် main hand swordကော sub hand sword ကော ကောင်းဖို့လိုတာကြောင့် စစဆော့ချင်း newbie တေနဲ့လုံးဝမသင့်တော်တဲ့ class ဖြစ်ပါတယ်။");
    }

}
