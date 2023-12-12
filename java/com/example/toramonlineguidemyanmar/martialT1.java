package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class martialT1 extends Fragment {

    static TextView txt1,txt2,txt3,txt4,txt5;
    public martialT1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.martial_t1,vg,false);
        txt1=v.findViewById(R.id.txt1martialt1);
        txt2=v.findViewById(R.id.txt2martialt1);
        txt3=v.findViewById(R.id.txt3martialt1);
        txt4=v.findViewById(R.id.txt4martialt1);
        txt5=v.findViewById(R.id.txt5martialt1);
        if(MainActivity.zg)
        {
            zawgyi();
        }
        else
        {
            unicode();
        }

        return v;
    }

    public static void zawgyi()
    {
        txt1.setText("\n" +
                "smash ကေတာ့ မ်က္ႏွာကိုတည္ထိုးတာျဖစ္ပါတယ္။flinch လုပ္ႏိုင္ပါတယ္။ DMG ေတာ့အရမ္းမထိပါဘူး။knuckle tank ေတအတြက္သုံးေလ့ရွိတဲ့ skill ပါ။\n" +
                "flinch chance 50%(lvl 1-5),75%(lvl 6-10)ရွိပါတယ္။mp cost 100ပါ။\n" +
                "main or sub weapon မွာ knuckle ကိုင္ထားရင္ေတာ့ agi stat ေပၚမူတည္ပီး DMG ထပ္တိုးေပးမွာပါ။ flinch chance +25%ထပ္တိုးေပးမွာပါ။\n");
        txt2.setText("\n" +
                "bash ကေတာ့ခုံပီးေခါင္းကိုထိုးတာပါ။stun လုပ္ႏိုင္ပါတယ္။DMG ကေတာ့ အေတာ္အသင့္ထြက္ပါတယ္။ stun chance 25%(lvl 1-5),50%(lvl 6-10)ရွိပါတယ္။mp cost 200ပါ။\n" +
                "main or sub weapon မွာ knuckle တပ္ထားရင္ေတာ့ agi stat ေပၚမူတည္ပီးdmgတိုးေပးမွာပါ။ stun chance ကိုလဲ +(25+agi/10)% တိုးေပးမွာပါ။\n");
        txt3.setText("\n" +
                "sonic wave ကေတာ့ အေဝးကေနကန္ပီး waveအေသးေလးလွန္းပစ္တာပါ။tumble ႏိုင္တဲ့ chance ရွိပါတယ္။dmg သိပ္မထြက္ပါဘူး။cast range ကေတာ့ 4m ကေန 16m အထိ lvl အလိုက္တိုးေပးပါတယ္။ tumble chance (5*skill lvl)%ရွိပါတယ္။mp cost 100ရွိပါတယ္။\n" +
                "main or sub weapon ပါ knuckle ကိုင္ထားရင္ေတာ့ tumble chance 50%တိုးေပးမွာပါ။DMG လဲတိုးေပးတယ္။\n");
        txt4.setText(
                "\n" +
                "martial mastery ကေတာ့ main weaponမွာ knuckle ကိုင္ထားတဲ့အခါရတဲ့ atkတိုးေပးတဲ့ passive skill ပါ။\n" +
                "weapon atk +(3*skill lvl)%တိုးေပးပါတယ္။\n" +
                "atk 1% ကေန 3%အထိ lvl အလိုက္တိုးေပးပါေသးတယ္။\n");
        txt5.setText("\n" +
                "aggravate ကေတာ့ knuckle main ေတအတြက္ passive ပါ။သူကေတာ့basic atkခ်တဲ့အခါ additional DMG ပုံစံထြက္တာပါ။ critical မထပါဘူး။ DMG ထြက္ႏိုင္တဲ့ chance (10+ 4*skill lvl )%ရွိပါတယ္။ampr effect လဲ ဝင္ပါတယ္။ ampr (0.5*skill lvl)ရပါတယ္။မူရင္းatk DMG ရဲ႕ 27% ကေန 50% အထိထြက္ပါတယ္။(lvlအလိုက္တိုးလာတာပါ)\n");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "smash ကတော့ မျက်နှာကိုတည်ထိုးတာဖြစ်ပါတယ်။flinch လုပ်နိုင်ပါတယ်။ DMG တော့အရမ်းမထိပါဘူး။knuckle tank တေအတွက်သုံးလေ့ရှိတဲ့ skill ပါ။\n" +
                "flinch chance 50%(lvl 1-5),75%(lvl 6-10)ရှိပါတယ်။mp cost 100ပါ။\n" +
                "main or sub weapon မှာ knuckle ကိုင်ထားရင်တော့ agi stat ပေါ်မူတည်ပီး DMG ထပ်တိုးပေးမှာပါ။ flinch chance +25%ထပ်တိုးပေးမှာပါ။\n");
        txt2.setText("\n" +
                "bash ကတော့ခုံပီးခေါင်းကိုထိုးတာပါ။stun လုပ်နိုင်ပါတယ်။DMG ကတော့ အတော်အသင့်ထွက်ပါတယ်။ stun chance 25%(lvl 1-5),50%(lvl 6-10)ရှိပါတယ်။mp cost 200ပါ။\n" +
                "main or sub weapon မှာ knuckle တပ်ထားရင်တော့ agi stat ပေါ်မူတည်ပီးdmgတိုးပေးမှာပါ။ stun chance ကိုလဲ +(25+agi/10)% တိုးပေးမှာပါ။\n");
        txt3.setText("\n" +
                "sonic wave ကတော့ အဝေးကနေကန်ပီး waveအသေးလေးလှန်းပစ်တာပါ။tumble နိုင်တဲ့ chance ရှိပါတယ်။dmg သိပ်မထွက်ပါဘူး။cast range ကတော့ 4m ကနေ 16m အထိ lvl အလိုက်တိုးပေးပါတယ်။ tumble chance (5*skill lvl)%ရှိပါတယ်။mp cost 100ရှိပါတယ်။\n" +
                "main or sub weapon ပါ knuckle ကိုင်ထားရင်တော့ tumble chance 50%တိုးပေးမှာပါ။DMG လဲတိုးပေးတယ်။\n");
        txt4.setText("\n" +
                "martial mastery ကတော့ main weaponမှာ knuckle ကိုင်ထားတဲ့အခါရတဲ့ atkတိုးပေးတဲ့ passive skill ပါ။\n" +
                "weapon atk +(3*skill lvl)%တိုးပေးပါတယ်။\n" +
                "atk 1% ကနေ 3%အထိ lvl အလိုက်တိုးပေးပါသေးတယ်။\n");
        txt5.setText("\n" +
                "aggravate ကတော့ knuckle main တေအတွက် passive ပါ။သူကတော့basic atkချတဲ့အခါ additional DMG ပုံစံထွက်တာပါ။ critical မထပါဘူး။ DMG ထွက်နိုင်တဲ့ chance (10+ 4*skill lvl )%ရှိပါတယ်။ampr effect လဲ ဝင်ပါတယ်။ ampr (0.5*skill lvl)ရပါတယ်။မူရင်းatk DMG ရဲ့ 27% ကနေ 50% အထိထွက်ပါတယ်။(lvlအလိုက်တိုးလာတာပါ)\n");
    }

}
