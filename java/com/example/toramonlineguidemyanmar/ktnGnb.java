package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ktnGnb extends Fragment {

    static TextView txt1;
    public ktnGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.ktn_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbKtn);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်ကတော့ လုပ်ကွက်တွေများPlayStyleများပြီး Damageကော Stability ကော မြင့်ပါတယ်Aggroလည်း သိပ်မထွက်ပါဘူး\n" +
                "ကိုယ်Skillရှိသလောက် ကိုကြမ်းပါတယ်\n" +
                "\n" +
                "အားနည်းချက်က ကတော့ အရမ်းပျော့ပါတယ် \n" +
                "Critical မလောက်ရင်လည်း ခွေးဖြစ်ပါတယ် \n" +
                "Boss Aoeမှာ Zanteiတို့လို Skillလွဲရင်လည်း\n" +
                "မလကီးယားသွားနိုင်ပါတယ်\n" +
                "Budgetနည်းနည်း လိုပါတယ် သို့သော် NPC Equips\n" +
                "Setမှန်မှန်နဲ့ ဆော့ရင် တော်တော်လေးကြမ်းပါတယ်");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ကေတာ့ လုပ္ကြက္ေတြမ်ားPlayStyleမ်ားၿပီး Damageေကာ Stability ေကာ ျမင့္ပါတယ္Aggroလည္း သိပ္မထြက္ပါဘူး\n" +
                "ကိုယ္Skillရွိသေလာက္ ကိုၾကမ္းပါတယ္\n" +
                "\n" +
                "အားနည္းခ်က္က ကေတာ့ အရမ္းေပ်ာ့ပါတယ္ \n" +
                "Critical မေလာက္ရင္လည္း ေခြးျဖစ္ပါတယ္ \n" +
                "Boss Aoeမွာ Zanteiတို႔လို Skillလြဲရင္လည္း\n" +
                "မလကီးယားသြားႏိုင္ပါတယ္\n" +
                "Budgetနည္းနည္း လိုပါတယ္ သို႔ေသာ္ NPC Equips\n" +
                "Setမွန္မွန္နဲ႔ ေဆာ့ရင္ ေတာ္ေတာ္ေလးၾကမ္းပါတယ္");
    }

}
