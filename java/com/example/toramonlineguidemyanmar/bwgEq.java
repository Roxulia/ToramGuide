package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bwgEq extends Fragment {

    static TextView txt1;
    public bwgEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.bwg_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqBwg);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("equipment တေအနေနဲ့ကတော့\n" +
                "\n" +
                "main မာ latest bowgun ကိုမှ\n" +
                "acccd stat နဲ့သုံးစေချင်ပါတယ် တကယ်လို့ sub က arrow မဟုတ်ရင်တော့ ele bowgun နဲ့မှကြမ်းမာပါ\n" +
                "\n" +
                "sub ကတော့ကြိုက်ရာသုံးနိုင်ပါတယ်\n" +
                "\n" +
                "armor ကတော့ထုံးစံအတိုင်း FC  ပါ\n" +
                "\n" +
                "additional gearကတော့ tyrant mask,ghost zipper,shaved ice hat,bear hat စတာတေကိုသုံးနိုင်ပါတယ်\n" +
                "\n" +
                "ring ကတော့dex V,IV, dark(power) dark knight amulet (budget) သုံးစေချင်ပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("equipment ေတအေနနဲ႔ကေတာ့\n" +
                "\n" +
                "main မာ latest bowgun ကိုမွ\n" +
                "acccd stat နဲ႔သုံးေစခ်င္ပါတယ္ တကယ္လို႔ sub က arrow မဟုတ္ရင္ေတာ့ ele bowgun နဲ႔မွၾကမ္းမာပါ\n" +
                "\n" +
                "sub ကေတာ့ႀကိဳက္ရာသုံးႏိုင္ပါတယ္\n" +
                "\n" +
                "armor ကေတာ့ထုံးစံအတိုင္း FC  ပါ\n" +
                "\n" +
                "additional gearကေတာ့ tyrant mask,ghost zipper,shaved ice hat,bear hat စတာေတကိုသုံးႏိုင္ပါတယ္\n" +
                "\n" +
                "ring ကေတာ့dex V,IV, dark(power) dark knight amulet (budget) သုံးေစခ်င္ပါတယ္");
    }

}
