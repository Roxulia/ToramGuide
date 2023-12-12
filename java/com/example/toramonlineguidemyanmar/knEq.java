package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class knEq extends Fragment {

    static TextView txt1;
    public knEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.kn_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqKn);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("equipment တေအနေနဲ့ကတော့\n" +
                "\n" +
                "knuckle မာ Boss drop ဖြစ်တဲ့ master tonfa,mortal kata တေသုံးစေချင်ပါတယ် မfarmနိုင်ရင်တော့ latest version knuckle ကိုပဲ acccd stat ထည့်ပီးကိုင်ပါ\n" +
                "\n" +
                "sub အနေနဲ့ကတော့ shield သုံးစေချင်ပါတယ်\n" +
                "\n" +
                "armor ကတော့ FC ပေါ့\n" +
                "\n" +
                "additional gear အနေနဲ့ကတော့ tyrant mask,ghost zipper,bear hatတေနဲ့အခြား agi%,atk % တက်တာတေသုံးပါ။\n" +
                "\n" +
                "ring ကတော့ speed talisman V,IV,dark(power) သုံးစေချင်ပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("equipment ေတအေနနဲ႔ကေတာ့\n" +
                "\n" +
                "knuckle မာ Boss drop ျဖစ္တဲ့ master tonfa,mortal kata ေတသုံးေစခ်င္ပါတယ္ မfarmႏိုင္ရင္ေတာ့ latest version knuckle ကိုပဲ acccd stat ထည့္ပီးကိုင္ပါ\n" +
                "\n" +
                "sub အေနနဲ႔ကေတာ့ shield သုံးေစခ်င္ပါတယ္\n" +
                "\n" +
                "armor ကေတာ့ FC ေပါ့\n" +
                "\n" +
                "additional gear အေနနဲ႔ကေတာ့ tyrant mask,ghost zipper,bear hatေတနဲ႔အျခား agi%,atk % တက္တာေတသုံးပါ။\n" +
                "\n" +
                "ring ကေတာ့ speed talisman V,IV,dark(power) သုံးေစခ်င္ပါတယ္");
    }

}
