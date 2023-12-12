package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class stfEq extends Fragment {

    static TextView txt1;
    public stfEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.stf_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqStf);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("equipment တေအနေနဲ့ကတော့\n" +
                "staff မှာ npc staff တေသုံးတာပိုကောင်းပါတယ်။ဒါမှမဟုတ် ရင်တော့ stat ကို IM7 I14 သုံးရမာပါ။\n" +
                "\n" +
                "sub ကတော့ DPS ဆိုရင်ဘာသုံးသုံးရပါတယ်။ knuckle ဆိုရင်တော့ physical သွားမှရမာပါ\n" +
                "\n" +
                "armor ကတော့ heaven feather garb(boss drop),ဒါမှမဟူတ်ရင်တော့ IM7 သုံးရမာပါ\n" +
                "\n" +
                "additional gear တေကတော့ tyrant Grivence,magic emblemအပြင် အခြားmatk တက်တာတွေသုံးလို့ရပါတယ်။\n" +
                "\n" +
                "ring ကတော့ magic talisman V,IV,dark(magic), တေကိုသုံးလို့ရပါတယ်\n" +
                "aggro -% တေပါ ရင်ပိုကောင်းပါတယ် ။");
    }
    public static void zawgyi()
    {
        txt1.setText("equipment ေတအေနနဲ႔ကေတာ့\n" +
                "staff မွာ npc staff ေတသုံးတာပိုေကာင္းပါတယ္။ဒါမွမဟုတ္ ရင္ေတာ့ stat ကို IM7 I14 သုံးရမာပါ။\n" +
                "\n" +
                "sub ကေတာ့ DPS ဆိုရင္ဘာသုံးသုံးရပါတယ္။ knuckle ဆိုရင္ေတာ့ physical သြားမွရမာပါ\n" +
                "\n" +
                "armor ကေတာ့ heaven feather garb(boss drop),ဒါမွမဟူတ္ရင္ေတာ့ IM7 သုံးရမာပါ\n" +
                "\n" +
                "additional gear ေတကေတာ့ tyrant Grivence,magic emblemအျပင္ အျခားmatk တက္တာေတြသုံးလို႔ရပါတယ္။\n" +
                "\n" +
                "ring ကေတာ့ magic talisman V,IV,dark(magic), ေတကိုသုံးလို႔ရပါတယ္\n" +
                "aggro -% ေတပါ ရင္ပိုေကာင္းပါတယ္ ။");
    }

}
