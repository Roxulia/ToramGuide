package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class hbGnb extends Fragment {

    static TextView txt1;
    public hbGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.hb_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbHb);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက် အနေနဲ့ Halberdဟာ \n" +
                "T3 Skillမှာ ဆို Strike Stabတို့လို Dmgကောင်းတယ့်\n" +
                "Dps Skillတွေ ပိုင်ဆိုင်ထားပြီး Dive Impactလို\n" +
                "Wide Aoe + Immunity တွေပါ ရှိလို့ \n" +
                "ကြမ်းတယ့်ထဲပါ ပါတယ် T4 Dragon Toothဟာ\n" +
                "Crt+75ပါပြီးသား ဖြစ်တယ့် အတွက် Equipsတွေမှာ ATKနဲ့ CDMGကို ပိုမို Focusနိုင်ပြီး\n" +
                "Physical Pieces 100%ပါ ပါတယ့် အတွက်\n" +
                "High Def Bossတွေနဲ့ Nightmare Ultimate Boss\n" +
                "တွေလို Long Runတွေမှာ အမြဲ အသာစီးရကြပါတယ်\n" +
                "\n" +
                "အားနည်းချက်ကတော့ Gswရဲ့ Speedကို အားကိုးပြီး\n" +
                "Spamရတာ ဖြစ်ပြီး DPS Skillမှာ Immueမပါတာ\n" +
                "ကြောင့် လွယ်လွယ်ကူကူ မလကီးယားနိုင်ပါတယ် \n" +
                "DTမှာ CRTပါတယ့်အတွက် Crit Rateကို သိပ်\n" +
                "Focusမလုပ်နိုင်ကြတယ့် အတွက် အမြဲလိုလို\n" +
                "Missဖြစ်နိုင်တယ့် အတွက် Normal Prorationနဲ့\n" +
                "Amprအတွက် အခက်အခဲ ဖြစ်ပါတယ် \n" +
                "WarCry of Struggle ဟာလည်း HP 55%အောက်\n" +
                "ထား ရတယ့် အတွက် Riskအရမ်းများပါတယ် \n" +
                "Dex Statမပါတယ့် အတွက် အမြဲလိုလို Grazeဖြစ်\n" +
                "နေပါပြီးStability Lowပါတယ် Ele Weaponသုံးရင်\n" +
                "တောင် Dmgအရမ်း မမြင့်ပါဘူး ဒါပေမယ့် လျော့လဲ\n" +
                "မလျော့ပါဘူး High Defတွေမှာ ကြမ်းပေမယ့်\n" +
                "Low Defတွေမှာ တခြား Classတွေထက် Weakနေ\n" +
                "တတ်ပါတယ်။ ပြီးတော့Budgetနည်းနည်းလိုပါတယ်။");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ အေနနဲ႔ Halberdဟာ \n" +
                "T3 Skillမွာ ဆို Strike Stabတို႔လို Dmgေကာင္းတယ့္\n" +
                "Dps Skillေတြ ပိုင္ဆိုင္ထားၿပီး Dive Impactလို\n" +
                "Wide Aoe + Immunity ေတြပါ ရွိလို႔ \n" +
                "ၾကမ္းတယ့္ထဲပါ ပါတယ္ T4 Dragon Toothဟာ\n" +
                "Crt+75ပါၿပီးသား ျဖစ္တယ့္ အတြက္ Equipsေတြမွာ ATKနဲ႔ CDMGကို ပိုမို Focusႏိုင္ၿပီး\n" +
                "Physical Pieces 100%ပါ ပါတယ့္ အတြက္\n" +
                "High Def Bossေတြနဲ႔ Nightmare Ultimate Boss\n" +
                "ေတြလို Long Runေတြမွာ အၿမဲ အသာစီးရၾကပါတယ္\n" +
                "\n" +
                "အားနည္းခ်က္ကေတာ့ Gswရဲ႕ Speedကို အားကိုးၿပီး\n" +
                "Spamရတာ ျဖစ္ၿပီး DPS Skillမွာ Immueမပါတာ\n" +
                "ေၾကာင့္ လြယ္လြယ္ကူကူ မလကီးယားႏိုင္ပါတယ္ \n" +
                "DTမွာ CRTပါတယ့္အတြက္ Crit Rateကို သိပ္\n" +
                "Focusမလုပ္ႏိုင္ၾကတယ့္ အတြက္ အၿမဲလိုလို\n" +
                "Missျဖစ္ႏိုင္တယ့္ အတြက္ Normal Prorationနဲ႔\n" +
                "Amprအတြက္ အခက္အခဲ ျဖစ္ပါတယ္ \n" +
                "WarCry of Struggle ဟာလည္း HP 55%ေအာက္\n" +
                "ထား ရတယ့္ အတြက္ Riskအရမ္းမ်ားပါတယ္ \n" +
                "Dex Statမပါတယ့္ အတြက္ အၿမဲလိုလို Grazeျဖစ္\n" +
                "ေနပါၿပီးStability Lowပါတယ္ Ele Weaponသုံးရင္\n" +
                "ေတာင္ Dmgအရမ္း မျမင့္ပါဘူး ဒါေပမယ့္ ေလ်ာ့လဲ\n" +
                "မေလ်ာ့ပါဘူး High Defေတြမွာ ၾကမ္းေပမယ့္\n" +
                "Low Defေတြမွာ တျခား Classေတြထက္ Weakေန\n" +
                "တတ္ပါတယ္။ ၿပီးေတာ့Budgetနည္းနည္းလိုပါတယ္။");
    }


}
