package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bwgOverview extends Fragment {

    static TextView txt1;
    public bwgOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.bwg_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvBwg);
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
        txt1.setText("bowgunဟာလဲ bow လိုပဲအေဝးကေညႇာ္လိူ႔ေကာင္းတဲ့ class တခုပါ။\n" +
                "သူ႔မွာထူးျခားတာကေတာ့ bow ထက္ပိုပီး sub weapon ေတထည့္လို႔ တာပါ။သူက arrow,magic device,knuckle,shield,dagger ေတြကို sub အေနနဲ႔သုံးလို႔ရပါတယ္။ တခုရွိတာက bowgunဟာ bow လိုမ်ိဳး arrow ကေန stability အျပည့္မရပါဘူး။ stat ကေနလဲ DMGရတာနဲပါတယ္။ ဒါေပမဲ့ type အမ်ိဳးမ်ိဳးနဲ႔ေဆာ့လို႔ရတာေၾကာင့္ ေတာ္ေတာ္မ်ားမ်ားက bowgun+shield သုံးပီး tank ၾကပါတယ္။ bowgun +md နဲ႔လဲ magic gunner သြားတာေတလဲရွိသလို dagger,knuckle ေတနဲ႔လဲ DPS သြားတာေတရွိပါတယ္။ bowgunဟာ burst type ျဖစ္ပါတယ္။ newbie ေတနဲ႔ သင့္ေတာ္တဲ့ class လဲျဖစ္ပါတယ္။lvl အေစာပိုင္းမွာၾကမ္းပါတယ္။bowgun+arrow ကိုlvl အနိမ့္ပိုင္းမွာေဆာ့ပီး lvl မ်ားလာတဲ့အခါ bow နဲ႔အစားထိုးလို႔လဲရပါတယ္။skillေတတူတူပဲမို႔လို႔ပါ။");
    }

    public static void unicode()
    {
        txt1.setText("bowgunဟာလဲ bow လိုပဲအဝေးကညှော်လိူ့ကောင်းတဲ့ class တခုပါ။\n" +
                "သူ့မှာထူးခြားတာကတော့ bow ထက်ပိုပီး sub weapon တေထည့်လို့ တာပါ။သူက arrow,magic device,knuckle,shield,dagger တွေကို sub အနေနဲ့သုံးလို့ရပါတယ်။ တခုရှိတာက bowgunဟာ bow လိုမျိုး arrow ကနေ stability အပြည့်မရပါဘူး။ stat ကနေလဲ DMGရတာနဲပါတယ်။ ဒါပေမဲ့ type အမျိုးမျိုးနဲ့ဆော့လို့ရတာကြောင့် တော်တော်များများက bowgun+shield သုံးပီး tank ကြပါတယ်။ bowgun +md နဲ့လဲ magic gunner သွားတာတေလဲရှိသလို dagger,knuckle တေနဲ့လဲ DPS သွားတာတေရှိပါတယ်။ bowgunဟာ burst type ဖြစ်ပါတယ်။ newbie တေနဲ့ သင့်တော်တဲ့ class လဲဖြစ်ပါတယ်။lvl အစောပိုင်းမှာကြမ်းပါတယ်။bowgun+arrow ကိုlvl အနိမ့်ပိုင်းမှာဆော့ပီး lvl များလာတဲ့အခါ bow နဲ့အစားထိုးလို့လဲရပါတယ်။skillတေတူတူပဲမို့လို့ပါ။");
    }

}
