package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class ohsEq extends Fragment {

    static TextView txt1;
    public ohsEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.ohs_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqOhs);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("equip တေအနေနဲ့ကတော့ \n" +
                "main weapon stat မာ acccdကိုပုံမှန်အားဖြင့်သုံးကြပါတယ် တတ်နိုင်ရင်တော့ element တေသုံးတာကောင်းပါတယ်\n" +
                "\n" +
                "sub weapon ကတော့ကိုယ်ဆော့မဲ့အပေါ်မူတည်ပီးကိုင်ချင်တာကိုင်လို့ရပါတယ်\n" +
                "\n" +
                "armor ကတော့ full CRT ပဲအသုံးများပါတယ်\n" +
                "\n" +
                "additional gear အနေနဲ့ကတော့ tyrant mask,full beard, demon mantle သုံးကြတာများပါတယ်တခြားဟာတွေလဲသုံးလို့ရပါတယ် \n" +
                "\n" +
                "ring အနေနဲ့ကတော့ muscle talisman V,IV or dark power ring ကိုသုံးစေချင်ပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("equip ေတအေနနဲ႔ကေတာ့ \n" +
                "main weapon stat မာ acccdကိုပုံမွန္အားျဖင့္သုံးၾကပါတယ္ တတ္ႏိုင္ရင္ေတာ့ element ေတသုံးတာေကာင္းပါတယ္\n" +
                "\n" +
                "sub weapon ကေတာ့ကိုယ္ေဆာ့မဲ့အေပၚမူတည္ပီးကိုင္ခ်င္တာကိုင္လို႔ရပါတယ္\n" +
                "\n" +
                "armor ကေတာ့ full CRT ပဲအသုံးမ်ားပါတယ္\n" +
                "\n" +
                "additional gear အေနနဲ႔ကေတာ့ tyrant mask,full beard, demon mantle သုံးၾကတာမ်ားပါတယ္တျခားဟာေတြလဲသုံးလို႔ရပါတယ္ \n" +
                "\n" +
                "ring အေနနဲ႔ကေတာ့ muscle talisman V,IV or dark power ring ကိုသုံးေစခ်င္ပါတယ္");
    }
}
