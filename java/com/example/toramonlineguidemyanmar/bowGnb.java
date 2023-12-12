package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

//import com.example.toramonlineguidemyanmar.R;

public class bowGnb extends Fragment {

    static TextView txt1;
    public bowGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.bow_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbBow);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်ကတော့ bow ဟာ lvlများလေကြမ်းလေထဲမာပါပါတယ်။Dmg ကလဲ burst DMG ဖြစ်တာမို့ equip မကောင်းရင်တောင် သေချာဆော့တတ်ရင် rank 1 ကအေးဆေးယူလို့ရပါတယ်။ အဝေးကနေပစ်ရတာဖြစ်လို့ safeလဲဖြစ်ပါတယ်။ bow KTN ကတော့အနီးကပ်လိုဖြစ်သွားပါတယ်။ele နဲ့ stability ကလဲ arrow ကနေပေးတာဆိုတော့ တော်တော်ကောင်းပါတယ်။ newbie တေအတွက်အသင့်တော်ဆုံးလို့ပြောလို့ရပါတယ် ampr ကလဲ လုံးဝပးစရာမလိုပါဘူး\n" +
                "\n" +
                "အားနည်းချက်ကတော့ အဝေးကပစ်ရတာဖြစ်တာကြောင့်ပျော့ပါတယ်။ aggro ကလဲအရမ်းထုတ်နိုင်တာကြောင့် aggro မလျော့ထားနိုင်ရင်အဆင်မပြေပါဘူး။ skill ကလဲ charge time တေပါတာကြောင့် နဲနဲတော့ကြာပါတယ်။  aspd လဲနှေးပါတယ်။");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ကေတာ့ bow ဟာ lvlမ်ားေလၾကမ္းေလထဲမာပါပါတယ္။Dmg ကလဲ burst DMG ျဖစ္တာမို႔ equip မေကာင္းရင္ေတာင္ ေသခ်ာေဆာ့တတ္ရင္ rank 1 ကေအးေဆးယူလို႔ရပါတယ္။ အေဝးကေနပစ္ရတာျဖစ္လို႔ safeလဲျဖစ္ပါတယ္။ bow KTN ကေတာ့အနီးကပ္လိုျဖစ္သြားပါတယ္။ele နဲ႔ stability ကလဲ arrow ကေနေပးတာဆိုေတာ့ ေတာ္ေတာ္ေကာင္းပါတယ္။ newbie ေတအတြက္အသင့္ေတာ္ဆုံးလို႔ေျပာလို႔ရပါတယ္ ampr ကလဲ လုံးဝပးစရာမလိုပါဘူး\n" +
                "\n" +
                "အားနည္းခ်က္ကေတာ့ အေဝးကပစ္ရတာျဖစ္တာေၾကာင့္ေပ်ာ့ပါတယ္။ aggro ကလဲအရမ္းထုတ္ႏိုင္တာေၾကာင့္ aggro မေလ်ာ့ထားႏိုင္ရင္အဆင္မေျပပါဘူး။ skill ကလဲ charge time ေတပါတာေၾကာင့္ နဲနဲေတာ့ၾကာပါတယ္။  aspd လဲေႏွးပါတယ္။");
    }
}
