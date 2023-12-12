package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class mdGnb extends Fragment {

    static TextView txt1;
    public mdGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.md_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbMd);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်ကတော့ spell Aoe, range တွေကျယ်တာကြောင့် item farm တဲ့အခါအသုံးဝင်ပါတယ်။ animation ကလဲလှပါတယ်။\n" +
                "\n" +
                "အားနည်းချက်ကတော့ DMG သိပ်မထွက်လို့ boss battle မှာသိပ်အသုံးမဝင်ပါဘူး။support ဆော့လို့ရပါတယ်။နှေးလဲနှေးပါတယ်။");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ကေတာ့ spell Aoe, range ေတြက်ယ္တာေၾကာင့္ item farm တဲ့အခါအသုံးဝင္ပါတယ္။ animation ကလဲလွပါတယ္။\n" +
                "\n" +
                "အားနည္းခ်က္ကေတာ့ DMG သိပ္မထြက္လို႔ boss battle မွာသိပ္အသုံးမဝင္ပါဘူး။support ေဆာ့လို႔ရပါတယ္။ေႏွးလဲေႏွးပါတယ္။");
    }


}
