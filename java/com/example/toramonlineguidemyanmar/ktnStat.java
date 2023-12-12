package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ktnStat extends Fragment {

    static TextView txt1;
    public ktnStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle sis)
    {
        View v= lif.inflate(R.layout.ktn_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtStatKtn);

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("Katanaအတြက္ Stats အေနနဲ႔ကေတာ့ATKေကာ\n" +
                "Stability ေကာDex(Main)နဲ႔ STRကရရွိတာေၾကာင့္\n" +
                "STR and Dexကို အဓိကယူ ရပါမယ္ STRကေန \n" +
                "Stab ပိုရၿပီးCdmgနဲ႔ Aspdညပါရတာေၾကာင့္ \n" +
                "STR->Dex သြားတယ့္ Playerမ်ားပါတယ္။\n" +
                "\n" +
                "STR တစ္ခုဆီတိုင္း ဟာ Katanaအတြက္ \n" +
                "ATK+1.5 | Cdmg+0.2 | Aspd+0.3 | Stab+0.075ကို ေပးပါတယ္\n" +
                "\n" +
                "INT \n" +
                "MATK+3 | MaxMP+0.1 | MDEF+0.1×[X]\n" +
                "[X] = 0.1 (No Armor)\n" +
                "[X] = 0.25 (Light Armor)\n" +
                "[X] = 1 (Normal Armor)\n" +
                "[X] = 2.0 (Heavy Armor)\n" +
                "\n" +
                "VIT\n" +
                "MaxHP+0.33*Lvl | DEF+1*[X]\n" +
                "[X] = 0.1 (No Armor)\n" +
                "[X] = 0.25 (Light Armor)\n" +
                "[X] = 1 (Normal Armor)\n" +
                "[X] = 2.0 (Heavy Armor)\n" +
                "\n" +
                "AGI\n" +
                "MATK+1 | ASPD+3.9 | CSPD+1.16 | \n" +
                "Flee(Dodge)+1×[X]\n" +
                "[X] = 2.0 (No Armor)\n" +
                "[X] = 1.75 (Light Armor)\n" +
                "[X] = 1.0 (Normal Armor)\n" +
                "[X] = 0.75 (Heavy Armor)\n" +
                "\n" +
                "DEX(Must Take)ပါ\n" +
                "ATK+2.5 | MATK+1 | CSPD+2.94 | \n" +
                "Accuracy+1 | Stability+0.025\n" +
                "စသျဖင့္ အသီးသီးရရွိပါတယ္။");
    }
    public static void unicode()
    {
        txt1.setText("Katanaအတွက် Stats အနေနဲ့ကတော့ATKကော\n" +
                "Stability ကောDex(Main)နဲ့ STRကရရှိတာကြောင့်\n" +
                "STR and Dexကို အဓိကယူ ရပါမယ် STRကနေ \n" +
                "Stab ပိုရပြီးCdmgနဲ့ Aspdညပါရတာကြောင့် \n" +
                "STR->Dex သွားတယ့် Playerများပါတယ်။\n" +
                "\n" +
                "STR တစ်ခုဆီတိုင်း ဟာ Katanaအတွက် \n" +
                "ATK+1.5 | Cdmg+0.2 | Aspd+0.3 | Stab+0.075ကို ပေးပါတယ်\n" +
                "\n" +
                "INT \n" +
                "MATK+3 | MaxMP+0.1 | MDEF+0.1×[X]\n" +
                "[X] = 0.1 (No Armor)\n" +
                "[X] = 0.25 (Light Armor)\n" +
                "[X] = 1 (Normal Armor)\n" +
                "[X] = 2.0 (Heavy Armor)\n" +
                "\n" +
                "VIT\n" +
                "MaxHP+0.33*Lvl | DEF+1*[X]\n" +
                "[X] = 0.1 (No Armor)\n" +
                "[X] = 0.25 (Light Armor)\n" +
                "[X] = 1 (Normal Armor)\n" +
                "[X] = 2.0 (Heavy Armor)\n" +
                "\n" +
                "AGI\n" +
                "MATK+1 | ASPD+3.9 | CSPD+1.16 | \n" +
                "Flee(Dodge)+1×[X]\n" +
                "[X] = 2.0 (No Armor)\n" +
                "[X] = 1.75 (Light Armor)\n" +
                "[X] = 1.0 (Normal Armor)\n" +
                "[X] = 0.75 (Heavy Armor)\n" +
                "\n" +
                "DEX(Must Take)ပါ\n" +
                "ATK+2.5 | MATK+1 | CSPD+2.94 | \n" +
                "Accuracy+1 | Stability+0.025\n" +
                "စသဖြင့် အသီးသီးရရှိပါတယ်။");
    }

}
