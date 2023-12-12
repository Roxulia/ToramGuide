package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class mdEq extends Fragment {

    static TextView txt1;
    public mdEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.md_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqMd);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("equipment တွေအနေနဲ့ကတော့\n" +
                "\n" +
                "weapon ကို npc craft or boss drop ထဲက base atkကြမ်းတာသုံးစေချင်ပါတယ်\n" +
                "\n" +
                "arm ကတော့ကြိုက်တာသုံးနိုင်ပါတယ်\n" +
                "\n" +
                "additional gear ကတော့ matk နဲ့ int တိုးပေးတဲ့ဟာသုံးပါ\n" +
                "\n" +
                "ring ကတော့ mp များများတက်တာသုံးပါ။");
    }
    public static void zawgyi()
    {
        txt1.setText("equipment ေတြအေနနဲ႔ကေတာ့\n" +
                "\n" +
                "weapon ကို npc craft or boss drop ထဲက base atkၾကမ္းတာသုံးေစခ်င္ပါတယ္\n" +
                "\n" +
                "arm ကေတာ့ႀကိဳက္တာသုံးႏိုင္ပါတယ္\n" +
                "\n" +
                "additional gear ကေတာ့ matk နဲ႔ int တိုးေပးတဲ့ဟာသုံးပါ\n" +
                "\n" +
                "ring ကေတာ့ mp မ်ားမ်ားတက္တာသုံးပါ။");
    }


}
