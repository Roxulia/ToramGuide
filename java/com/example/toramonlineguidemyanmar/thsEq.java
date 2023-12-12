package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class thsEq extends Fragment {

    static TextView txt1;
    public thsEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.ths_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqThs);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("Weapon stat ကတော့ Acdcd (Atk%, Crt damage%, Crt damage+) အပြင် Acdcdc (Atk%, Crt damage%, Crt damage+, Crt Rate+) ကလဲအဆင်ပြေပါတယ်။\n" +
                "\n" +
                "Armor stat အနေနဲ့ကတော့ Scdcd (Str%, Crt damage%, Crt damage+) ကိုသုံးနိုင်ပြီး Scdcdc (Str, Crt damage%, Crt damage+, Crt Rate+) ကိုလဲ သုံးနိုင်ပါတယ်။\n" +
                "\n" +
                "Additional gear ကတော့ ပုံမှန်အသုံးများကြတာကတော့ Tyrant Mask , full beard,devil circlet,reindeer headbandပါ။ Budget build သမားတွေအတွက်ကတော့ Bear Hat ကပိုအဆင်ပြေမယ်လို့ မြင်ပါတယ်။ တခြားသော ကောင်းမယ်ထင်တဲ့ Hat တွေကိုလဲ အဆင်ပြေသလိုပြောင်းလဲသုံးလို့ရပါတယ်။\n" +
                " \n" +
                "Ring အနေနဲ့ကတော့ Muscle Talisman V or IV ပါ။");
    }
    public static void zawgyi()
    {
        txt1.setText("Weapon stat ကေတာ့ Acdcd (Atk%, Crt damage%, Crt damage+) အျပင္ Acdcdc (Atk%, Crt damage%, Crt damage+, Crt Rate+) ကလဲအဆင္ေျပပါတယ္။\n" +
                "\n" +
                "Armor stat အေနနဲ႔ကေတာ့ Scdcd (Str%, Crt damage%, Crt damage+) ကိုသုံးႏိုင္ၿပီး Scdcdc (Str, Crt damage%, Crt damage+, Crt Rate+) ကိုလဲ သုံးႏိုင္ပါတယ္။\n" +
                "\n" +
                "Additional gear ကေတာ့ ပုံမွန္အသုံးမ်ားၾကတာကေတာ့ Tyrant Mask , full beard,devil circlet,reindeer headbandပါ။ Budget build သမားေတြအတြက္ကေတာ့ Bear Hat ကပိုအဆင္ေျပမယ္လို႔ ျမင္ပါတယ္။ တျခားေသာ ေကာင္းမယ္ထင္တဲ့ Hat ေတြကိုလဲ အဆင္ေျပသလိုေျပာင္းလဲသုံးလို႔ရပါတယ္။\n" +
                " \n" +
                "Ring အေနနဲ႔ကေတာ့ Muscle Talisman V or IV ပါ။");
    }
}
