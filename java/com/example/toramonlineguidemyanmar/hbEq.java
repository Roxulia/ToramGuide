package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class hbEq extends Fragment {

    static TextView txt1;
    public hbEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.hb_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqHb);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("Equipsတွေ အနေနဲ့ T3နဲ့ T4မတူညီတာကြောင့်\n" +
                "ခွဲ အကြံပေးသွားပါမယ် \n" +
                "\n" +
                "T3အတွက် Weaponကို AFC Statသုံးသင့်ပြီး \n" +
                "T4ကိုတော့ ATKနဲ့ CDmg Only Focusထားတယ့်\n" +
                "Statတွေ သုံးသင့်ပါတယ် ဘာလို့လဲဆိုတော့ \n" +
                "T4 Dps Skill Dog Toothဟာ Crit Rate+75ပါ\n" +
                "ပြီးသား ဖြစ်နေလို့ပါ \n" +
                "NPC Weapon Pava Drop Tolencia နဲ့\n" +
                "Hell Reaper တွေလည်း အသုံးများပါတယ်\n" +
                "\n" +
                "Armorအနေနဲ့ NPC Budget 'Assassin Garb'ဟာ\n" +
                "T3အတွက် ကောင်းပါတယ် T4အနေနဲ့ Heaven Feather Garb NPCကောင်းပါတယ် \n" +
                "Full Critနဲ့ STR CDMG Full Statတွေအသုံးများ\n" +
                "ပါတယ် \n" +
                "\n" +
                "Add Gearအနေနဲ့ Bear Hat, Devil Circlet,\n" +
                "Reindeer Headband, Full Beard, Tyrant Mask,\n" +
                "Demon Mantle, Snowman on the Head,\n" +
                "Ghost Zipper, စသဖြင့် ATKနဲ့ Cdmgနဲ့ ဆိုင်တယ့်\n" +
                "တခြားဟာတွေပါ သုံးနိုင်ပါတယ် \n" +
                "\n" +
                "Ringကို တော့ Dark Power Ringနဲ့ Muscle Talisman တွေ အသုံးများပြီး \n" +
                "Hallucination Sporeနဲ့ Time Warp Watchစတာ\n" +
                "တွေအပြင် Low Budget 2sတွေဖြစ်တယ့်\n" +
                "Machina Ringနဲ့ BeastFangတွေပါ သုံးနိုင်ပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("Equipsေတြ အေနနဲ႔ T3နဲ႔ T4မတူညီတာေၾကာင့္\n" +
                "ခြဲ အႀကံေပးသြားပါမယ္ \n" +
                "\n" +
                "T3အတြက္ Weaponကို AFC Statသုံးသင့္ၿပီး \n" +
                "T4ကိုေတာ့ ATKနဲ႔ CDmg Only Focusထားတယ့္\n" +
                "Statေတြ သုံးသင့္ပါတယ္ ဘာလို႔လဲဆိုေတာ့ \n" +
                "T4 Dps Skill Dog Toothဟာ Crit Rate+75ပါ\n" +
                "ၿပီးသား ျဖစ္ေနလို႔ပါ \n" +
                "NPC Weapon Pava Drop Tolencia နဲ႔\n" +
                "Hell Reaper ေတြလည္း အသုံးမ်ားပါတယ္\n" +
                "\n" +
                "Armorအေနနဲ႔ NPC Budget 'Assassin Garb'ဟာ\n" +
                "T3အတြက္ ေကာင္းပါတယ္ T4အေနနဲ႔ Heaven Feather Garb NPCေကာင္းပါတယ္ \n" +
                "Full Critနဲ႔ STR CDMG Full Statေတြအသုံးမ်ား\n" +
                "ပါတယ္ \n" +
                "\n" +
                "Add Gearအေနနဲ႔ Bear Hat, Devil Circlet,\n" +
                "Reindeer Headband, Full Beard, Tyrant Mask,\n" +
                "Demon Mantle, Snowman on the Head,\n" +
                "Ghost Zipper, စသျဖင့္ ATKနဲ႔ Cdmgနဲ႔ ဆိုင္တယ့္\n" +
                "တျခားဟာေတြပါ သုံးႏိုင္ပါတယ္ \n" +
                "\n" +
                "Ringကို ေတာ့ Dark Power Ringနဲ႔ Muscle Talisman ေတြ အသုံးမ်ားၿပီး \n" +
                "Hallucination Sporeနဲ႔ Time Warp Watchစတာ\n" +
                "ေတြအျပင္ Low Budget 2sေတြျဖစ္တယ့္\n" +
                "Machina Ringနဲ႔ BeastFangေတြပါ သုံးႏိုင္ပါတယ္");
    }

}
