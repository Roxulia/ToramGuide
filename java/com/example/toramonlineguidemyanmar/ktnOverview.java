package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ktnOverview extends Fragment {

    static TextView txt1;
    public ktnOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.ktn_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvKtn);
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
        txt1.setText("Mononofu Classဟာ ကစားလို႔ စိတ္ေက်နပ္စရာ\n" +
                "ေကာင္းတယ့္ ထဲ မွာပါ ပါတယ္။ Mononofuဆိုတာ\n" +
                "ေရွးေဟာင္းစကားလုံး ျဖစ္ၿပီး Warriorဆိုတယ့္\n" +
                "စစ္သည္ သူရဲေကာင္း အဓိပၸါယ္ေဆာင္ပါတယ္။\n" +
                "\n" +
                "Katana Weaponကို ကိုင္ေဆာင္တယ့္ အတြက္ \n" +
                "ဒီ Classကို Katanaသို႔ Ktnဆိုၿပီးအေခၚမ်ားပါတယ္။\n" +
                "Katanaရဲ႕Playstyleဟာ Parryေတြ Blockေတြ\n" +
                "Counterေတြ အျပင္DpsေကာBurstပုံစံေကာ \n" +
                "မ်ိဳးစုံ ကစားလို႔ ရတယ့္ Classပါ။ Stability ေကာ\n" +
                "Dmgေကာ ေတာ္ေတာ္ ေကာင္းတယ့္ Classပါ \n" +
                "Timing နဲ႔ Reflex အနဲငယ္လိုအပ္ၿပီး Bossရဲ႕\n" +
                "Pattern ေတြကိုပါ ေလ့လာထားမွသာ ၾကမ္းႏိုင္တယ့္\n" +
                "Classျဖစ္ပါတယ္။ မေလ့လာရင္ေတာ့ 'အေသ'ၾကမ္း\n" +
                "တယ့္ Classျဖစ္သြားမွာပါ :3\n" +
                "\n" +
                "Early Newbieေတြ အတြက္Damageေကာင္းေကာင္း\n" +
                "ထြက္တယ့္ Classတစ္ခု လည္း ျဖစ္ၿပီး AMPRေတာ့ \n" +
                "ေတာ္ေတာ္ လိုပါတယ္ Katana Weaponေတြက\n" +
                "Base ATKနည္းေသာ္လည္းThe Way of Warriorလို႔\n" +
                "ေခၚတယ့္ Bushidoနဲ႔ Two-Handedစေသာ\n" +
                "Passiveမ်ားမွ Buffေတြ ေတာ္ေတာ္မ်ားရလို႔ \n" +
                "ၾကမ္းပါတယ္။ Two-Handedက ရတယ့္ Passiveထက္ ေကာင္းတယ့္Statမေပးႏိုင္ၾကလို႔ \n" +
                "Katanaဟာ Sub-Weaponမပါဘဲအသုံးမ်ားပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("Mononofu Classဟာ ကစားလို့ စိတ်ကျေနပ်စရာ\n" +
                "ကောင်းတယ့် ထဲ မှာပါ ပါတယ်။ Mononofuဆိုတာ\n" +
                "ရှေးဟောင်းစကားလုံး ဖြစ်ပြီး Warriorဆိုတယ့်\n" +
                "စစ်သည် သူရဲကောင်း အဓိပ္ပါယ်ဆောင်ပါတယ်။\n" +
                "\n" +
                "Katana Weaponကို ကိုင်ဆောင်တယ့် အတွက် \n" +
                "ဒီ Classကို Katanaသို့ Ktnဆိုပြီးအခေါ်များပါတယ်။\n" +
                "Katanaရဲ့Playstyleဟာ Parryတွေ Blockတွေ\n" +
                "Counterတွေ အပြင်DpsကောBurstပုံစံကော \n" +
                "မျိုးစုံ ကစားလို့ ရတယ့် Classပါ။ Stability ကော\n" +
                "Dmgကော တော်တော် ကောင်းတယ့် Classပါ \n" +
                "Timing နဲ့ Reflex အနဲငယ်လိုအပ်ပြီး Bossရဲ့\n" +
                "Pattern တွေကိုပါ လေ့လာထားမှသာ ကြမ်းနိုင်တယ့်\n" +
                "Classဖြစ်ပါတယ်။ မလေ့လာရင်တော့ 'အသေ'ကြမ်း\n" +
                "တယ့် Classဖြစ်သွားမှာပါ :3\n" +
                "\n" +
                "Early Newbieတွေ အတွက်Damageကောင်းကောင်း\n" +
                "ထွက်တယ့် Classတစ်ခု လည်း ဖြစ်ပြီး AMPRတော့ \n" +
                "တော်တော် လိုပါတယ် Katana Weaponတွေက\n" +
                "Base ATKနည်းသော်လည်းThe Way of Warriorလို့\n" +
                "ခေါ်တယ့် Bushidoနဲ့ Two-Handedစသော\n" +
                "Passiveများမှ Buffတွေ တော်တော်များရလို့ \n" +
                "ကြမ်းပါတယ်။ Two-Handedက ရတယ့် Passiveထက် ကောင်းတယ့်Statမပေးနိုင်ကြလို့ \n" +
                "Katanaဟာ Sub-Weaponမပါဘဲအသုံးများပါတယ်။");
    }

}
