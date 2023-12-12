package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class stfOverview extends Fragment {

    static TextView txt1;
    public stfOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.stf_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvStf);
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
        txt1.setText("staff ကေတာ့ mage class ထဲက dmg အထြက္ဆုံး ေကာင္ပါ။mage ဆိုတဲ့အတြက္ spell သုံးတဲ့အခါ cast time ၾကာပါတယ္။ spell ကေနပဲ dmg ထြက္တာဆိုေတာ့ newbie ေတအေနနဲ႔ေဆာ့ဖို႔ခက္တဲ့အထဲပါပါတယ္။ staff ဟာလဲ ohs,bowgun ေတလိုပဲ sub weapon ေတအစုံကိုင္လို႔ရပါတယ္ ။ aggro က tank လိုမ်ိဳးပဲထြက္တာမို႔ shield တပ္ပီး tank build သြားလို႔ရပါတယ္။ lvl အနိမ့္ပိုင္းမွာ ထဲက ၾကမ္းလို႔ရပါတယ္။solo battle ေတြကေတာ့သိပ္မရပါဘူး။staff + knuckle ေပါင္းပီးလဲ physical build သြားလို႔ရပါတယ္။ဒါ့အျပင္ support ဘက္လဲသြားလို႔ရပါတယ္။ DMG လဲထုတ္ေပး support လဲလုပ္လို႔ရပါတယ္။အေနအထိုင္မတတ္ရင္ေသမဲ့အထဲလဲပါပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("staff ကတော့ mage class ထဲက dmg အထွက်ဆုံး ကောင်ပါ။mage ဆိုတဲ့အတွက် spell သုံးတဲ့အခါ cast time ကြာပါတယ်။ spell ကနေပဲ dmg ထွက်တာဆိုတော့ newbie တေအနေနဲ့ဆော့ဖို့ခက်တဲ့အထဲပါပါတယ်။ staff ဟာလဲ ohs,bowgun တေလိုပဲ sub weapon တေအစုံကိုင်လို့ရပါတယ် ။ aggro က tank လိုမျိုးပဲထွက်တာမို့ shield တပ်ပီး tank build သွားလို့ရပါတယ်။ lvl အနိမ့်ပိုင်းမှာ ထဲက ကြမ်းလို့ရပါတယ်။solo battle တွေကတော့သိပ်မရပါဘူး။staff + knuckle ပေါင်းပီးလဲ physical build သွားလို့ရပါတယ်။ဒါ့အပြင် support ဘက်လဲသွားလို့ရပါတယ်။ DMG လဲထုတ်ပေး support လဲလုပ်လို့ရပါတယ်။အနေအထိုင်မတတ်ရင်သေမဲ့အထဲလဲပါပါတယ်။");
    }


}
