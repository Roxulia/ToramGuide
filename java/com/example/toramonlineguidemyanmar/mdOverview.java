package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class mdOverview extends Fragment {

    static TextView txt1;
    public mdOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.md_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvMd);
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
        txt1.setText("magic device ကေတာ့ mage ထဲမာမွ farmer ေတအေနနဲ႔ေဆာ့တဲ့သူေတသုံးတဲ့ဟာပါ။ DMG က staff ေတေလာက္မထြက္တာေၾကာင့္ farmer အေနနဲ႔ပဲသြားၾကတာမ်ားပါတယ္။spell Aoe ေတလဲက်ယ္ပါတယ္။animation ကလဲ လွပါတယ္ ေလေပၚပ်ံပီးခ်တာပါ။ magic device သီးသန႔္ႀကီးနဲ႔ DPS မေတြ႕ရေပမဲ့ အျခား main weapon ေတမွာတပ္ပီး DPS အေနနဲ႔သြားၾကတာပဲမ်ားပါတယ္။သူကေတာ့sub weapon တပ္လို႔မရပါဘူး။farmer အေနနဲ႔သြားလို႔ရတယ္ဆိုေပမဲ့လဲ lvl နဲတဲ့ HP လဲနဲတဲ့ mob ေတကိုfarmတဲ့အခါမွာပဲအသုံးဝင္တာပါ။");
    }

    public static void unicode()
    {
        txt1.setText("magic device ကတော့ mage ထဲမာမှ farmer တေအနေနဲ့ဆော့တဲ့သူတေသုံးတဲ့ဟာပါ။ DMG က staff တေလောက်မထွက်တာကြောင့် farmer အနေနဲ့ပဲသွားကြတာများပါတယ်။spell Aoe တေလဲကျယ်ပါတယ်။animation ကလဲ လှပါတယ် လေပေါ်ပျံပီးချတာပါ။ magic device သီးသန့်ကြီးနဲ့ DPS မတွေ့ရပေမဲ့ အခြား main weapon တေမှာတပ်ပီး DPS အနေနဲ့သွားကြတာပဲများပါတယ်။သူကတော့sub weapon တပ်လို့မရပါဘူး။farmer အနေနဲ့သွားလို့ရတယ်ဆိုပေမဲ့လဲ lvl နဲတဲ့ HP လဲနဲတဲ့ mob တေကိုfarmတဲ့အခါမှာပဲအသုံးဝင်တာပါ။");
    }


}
