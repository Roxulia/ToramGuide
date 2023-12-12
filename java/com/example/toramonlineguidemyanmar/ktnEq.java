package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ktnEq extends Fragment {

    static TextView txt1;
    public ktnEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.ktn_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqKtn);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("Katanaအတွက် Equipsအနေနဲ့ အရေးကြီးဆုံးက \n" +
                "Critical ကို Focusပါ Meikyoပါတာကြောင့် \n" +
                "Critical မစိုးရိမ်ရဘူးထင်ရပေမယ့် ရှိလေ\n" +
                "ကောင်းလေပါ \n" +
                "\n" +
                "Weaponကို AFC FCစတာတွေ သုံးနိုင်ပြီး\n" +
                "EleWeaponနဲ့ NPC Equipsအချို့ကလည်း ကြမ်းတာကြောင့် သုံးနိုင်ပါတယ် \n" +
                "\n" +
                "Armorက Full Critအကောင်းဆုံးပါ \n" +
                "Modestiaသမားတွေကတော့ S7CD7CDMGစတာ\n" +
                "တွေ သုံးတာများပါတယ် NPCအနေနဲ့ \n" +
                "' Assassin Garb 'တော်တော် ကောင်းပါတယ်\n" +
                "\n" +
                "Add Gearကတော့ Top Hat|BearHat|ShavedIce\n" +
                "စတာတေ့ အပြင် Garyoသမားတွေကတော့ Tyrant Maskတို့ Reindeer FullBeard DevilCircletစတာ\n" +
                "တွေပါ သုံးနိုင်ပါတယ်။\n" +
                "\n" +
                "Ringအနေနဲ့ Muscle/Dexterity Talismanတွေ\n" +
                "အပြင် DarkPowerRingပါသုံးနိုင်ပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("Katanaအတြက္ Equipsအေနနဲ႔ အေရးႀကီးဆုံးက \n" +
                "Critical ကို Focusပါ Meikyoပါတာေၾကာင့္ \n" +
                "Critical မစိုးရိမ္ရဘူးထင္ရေပမယ့္ ရွိေလ\n" +
                "ေကာင္းေလပါ \n" +
                "\n" +
                "Weaponကို AFC FCစတာေတြ သုံးႏိုင္ၿပီး\n" +
                "EleWeaponနဲ႔ NPC Equipsအခ်ိဳ႕ကလည္း ၾကမ္းတာေၾကာင့္ သုံးႏိုင္ပါတယ္ \n" +
                "\n" +
                "Armorက Full Critအေကာင္းဆုံးပါ \n" +
                "Modestiaသမားေတြကေတာ့ S7CD7CDMGစတာ\n" +
                "ေတြ သုံးတာမ်ားပါတယ္ NPCအေနနဲ႔ \n" +
                "' Assassin Garb 'ေတာ္ေတာ္ ေကာင္းပါတယ္\n" +
                "\n" +
                "Add Gearကေတာ့ Top Hat|BearHat|ShavedIce\n" +
                "စတာေတ့ အျပင္ Garyoသမားေတြကေတာ့ Tyrant Maskတို႔ Reindeer FullBeard DevilCircletစတာ\n" +
                "ေတြပါ သုံးႏိုင္ပါတယ္။\n" +
                "\n" +
                "Ringအေနနဲ႔ Muscle/Dexterity Talismanေတြ\n" +
                "အျပင္ DarkPowerRingပါသုံးႏိုင္ပါတယ္");
    }

}
