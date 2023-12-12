package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class martialT3 extends Fragment {

    static TextView txt1,txt2,txt3;
    public martialT3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.martial_t3,vg,false);
        txt1=v.findViewById(R.id.txt1martialt3);
        txt2=v.findViewById(R.id.txt2martialt3);
        txt3=v.findViewById(R.id.txt3martialt3);
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
                "heavy smash ကေတာ့အေပၚကေနခုံပီးထုတာပါ။DMGလဲၾကမ္းပါတယ္။ arm break ျဖစ္ေနတဲ့သူကိုသုံးရင္ additional hit ထြက္တာေၾကာင့္ shell break နဲ႔တြဲသုံးေလ့ရွိပါတယ္။ level 4 skill မရခင္သုံးေလ့ရွိတဲ့ skill ပါ။ lethargy chance (20+3*skill lvl)% ရွိပါတယ္။additional hitကေတာ့အၿမဲ crit ထပါတယ္။mp cost ကေတာ့ 400ျဖစ္ပါတယ္။\n" +
                "\n" +
                "main or sub weapon မွာ knuckle တပ္ထားရင္ေတာ့ DMG ပိုတိုးေပးမွာပါ။ additional hit ရဲ႕ DMG ကိုအမ်ားႀကီးတိုးေပးထားပါတယ္။lethargy chance +50%တိုးေပးပါတယ္။\n");
        txt2.setText("\n" +
                "triple kick ကေတာ့သုံးခ်က္ဆက္တိုက္ကန္တာပါ။DMG လဲေကာင္းသလိုျမန္လဲျမန္ပါတယ္။ level 4 skill မရခင္ main DPS အေနနဲ႔သြားလို႔ရပါတယ္။ ဒုတိယနဲ႔တတိယအခ်က္မွာ crit ပိုထပါတယ္။\n" +
                "second hit မွာ crit rate (2*skill lvl)ရွိပီး third hit မွာ (4*skill lvl)ရွိပါတယ္။mp cost 300ျဖစ္ပါတယ္။\n" +
                "\n" +
                "main or sub weapon မွာ knuckle တပ္ထားရင္ေတာ့ skill DMG ကိုတိုးေပးပီး crit rate  ကိုအခ်က္တိုင္းအတြက္ 50ထပ္တိုးေပးပါတယ္။\n");
        txt3.setText("\n" +
                "martial discipline ကေတာ့  main or sub weapon မွာ knuckle သုံးထားရင္ martial skill ေတရဲ႕ DMG ကိုတိုးေပးတဲ့ passive ပါ။aspd လဲတိုးေပးပါတယ္။\n" +
                "DMG +(skill lvl)% တိုးေပးပါတယ္။\n" +
                "aspd ကေတာ့ (skill lvl)% နဲ႔ (10* skill lvl)တိုးေပးပါတယ္။(main weapon မွာ knuckle ကိုင္ထားမွပါ)\n");
    }

    public static void unicode()
    {
        txt1.setText("\n" +
                "heavy smash ကတော့အပေါ်ကနေခုံပီးထုတာပါ။DMGလဲကြမ်းပါတယ်။ arm break ဖြစ်နေတဲ့သူကိုသုံးရင် additional hit ထွက်တာကြောင့် shell break နဲ့တွဲသုံးလေ့ရှိပါတယ်။ level 4 skill မရခင်သုံးလေ့ရှိတဲ့ skill ပါ။ lethargy chance (20+3*skill lvl)% ရှိပါတယ်။additional hitကတော့အမြဲ crit ထပါတယ်။mp cost ကတော့ 400ဖြစ်ပါတယ်။\n" +
                "\n" +
                "main or sub weapon မှာ knuckle တပ်ထားရင်တော့ DMG ပိုတိုးပေးမှာပါ။ additional hit ရဲ့ DMG ကိုအများကြီးတိုးပေးထားပါတယ်။lethargy chance +50%တိုးပေးပါတယ်။\n" );
        txt2.setText("\n" +
                "triple kick ကတော့သုံးချက်ဆက်တိုက်ကန်တာပါ။DMG လဲကောင်းသလိုမြန်လဲမြန်ပါတယ်။ level 4 skill မရခင် main DPS အနေနဲ့သွားလို့ရပါတယ်။ ဒုတိယနဲ့တတိယအချက်မှာ crit ပိုထပါတယ်။\n" +
                "second hit မှာ crit rate (2*skill lvl)ရှိပီး third hit မှာ (4*skill lvl)ရှိပါတယ်။mp cost 300ဖြစ်ပါတယ်။\n" +
                "\n" +
                "main or sub weapon မှာ knuckle တပ်ထားရင်တော့ skill DMG ကိုတိုးပေးပီး crit rate  ကိုအချက်တိုင်းအတွက် 50ထပ်တိုးပေးပါတယ်။\n");
        txt3.setText("\n" +
                "martial discipline ကတော့  main or sub weapon မှာ knuckle သုံးထားရင် martial skill တေရဲ့ DMG ကိုတိုးပေးတဲ့ passive ပါ။aspd လဲတိုးပေးပါတယ်။\n" +
                "DMG +(skill lvl)% တိုးပေးပါတယ်။\n" +
                "aspd ကတော့ (skill lvl)% နဲ့ (10* skill lvl)တိုးပေးပါတယ်။(main weapon မှာ knuckle ကိုင်ထားမှပါ)\n");
    }

}
