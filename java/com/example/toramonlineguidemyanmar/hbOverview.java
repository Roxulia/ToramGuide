package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class hbOverview extends Fragment {

    static TextView txt1;
    public hbOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.hb_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvHb);
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
        txt1.setText("Halberd သူကေတာ့ Spear Classေပါ့ \n" +
                "Spearဆိုတယ့္ အတိုင္း ထိုးမယ္ ေလွာ္မယ္ :3\n" +
                "HBက Developersေတြ ရဲ႕ အႀကိဳက္Classျဖစ္ၿပီး\n" +
                "OP Buffsေတြ အမ်ားႀကီးရွိတယ့္ Classလည္းျဖစ္ပါ\n" +
                "တယ္ Early Newbieေတြ အတြက္ ေပ်ာ္ဖို႔ေကာင္း\n" +
                "ေပမယ့္ နည္းနည္း ခက္တယ့္ ထဲမွာပါပါတယ္ \n" +
                "Equips ေတြက လည္းT3 Skillsေတြနဲ႔ T4 Skills\n" +
                "ေတြ တူညီမွ မရွိတာေၾကာင့္ T4နဲ႔T3ကြာပါတယ္ \n" +
                "ေသခ်ာ EarlyT3မွာ NPCေကာင္းေကာင္းေလးေတ့နဲ႔\n" +
                "ေသခ်ာ Mechanic က်က် ေဆာ့ႏိုင္ရင္ေတာ့\n" +
                "ေပ်ာ္စရာေကာင္းေပမယ့္ Newbieေတြအတြက္ \n" +
                "ခက္ခဲ ႏိုင္ပါတယ္ ဒါေပမယ့္ မေဆာ့သင့္ဘူးလို႔ေတာ့\n" +
                "အႀကံေပး ခ်င္တာ မဟုတ္ပါ ေဆာ့တယ့္သူရွားပါတယ္");
    }

    public static void unicode()
    {
        txt1.setText("Halberd သူကတော့ Spear Classပေါ့ \n" +
                "Spearဆိုတယ့် အတိုင်း ထိုးမယ် လှော်မယ် :3\n" +
                "HBက Developersတွေ ရဲ့ အကြိုက်Classဖြစ်ပြီး\n" +
                "OP Buffsတွေ အများကြီးရှိတယ့် Classလည်းဖြစ်ပါ\n" +
                "တယ် Early Newbieတွေ အတွက် ပျော်ဖို့ကောင်း\n" +
                "ပေမယ့် နည်းနည်း ခက်တယ့် ထဲမှာပါပါတယ် \n" +
                "Equips တွေက လည်းT3 Skillsတွေနဲ့ T4 Skills\n" +
                "တွေ တူညီမှ မရှိတာကြောင့် T4နဲ့T3ကွာပါတယ် \n" +
                "သေချာ EarlyT3မှာ NPCကောင်းကောင်းလေးတေ့နဲ့\n" +
                "သေချာ Mechanic ကျကျ ဆော့နိုင်ရင်တော့\n" +
                "ပျော်စရာကောင်းပေမယ့် Newbieတွေအတွက် \n" +
                "ခက်ခဲ နိုင်ပါတယ် ဒါပေမယ့် မဆော့သင့်ဘူးလို့တော့\n" +
                "အကြံပေး ချင်တာ မဟုတ်ပါ ဆော့တယ့်သူရှားပါတယ်");
    }


}
