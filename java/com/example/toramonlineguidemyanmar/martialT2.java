package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class martialT2 extends Fragment {

    static TextView txt1,txt2,txt3;
    public martialT2()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.martial_t2,vg,false);
        txt1=v.findViewById(R.id.txt1martialt2);
        txt2=v.findViewById(R.id.txt2martialt2);
        txt3=v.findViewById(R.id.txt3martialt2);
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
                "shell break ကေတာ့ monster ရဲ႕ armor ကိုေပါက္ေအာင္ထိုးတာပါ။အုတ္နီခဲကိုကြဲေအာင္ထိုးသလိုေပါ့။armor break chance ရွိပါတယ္။DMG လဲထြက္ပါတယ္။\n" +
                "ဒီ skill မွာ physical Pierce(5*skill lvl)% ပါပါတယ္။arm break chance (10+1.5*skill lvl)% ရွိပါတယ္။arm break ထခဲ့ရင္ေတာ့ mp 400ျပန္ရပါတယ္။mp cost 300ရွိပါတယ္။\n" +
                "main or sub weapon မွာ knuckle ကိုင္ထားရင္ေတာ့ target ရဲ႕ def နဲ႔ lvl ေပၚမူတည္ပီး DMG တိုးေပးမွာပါ။\n");
        txt2.setText("\n" +
                "earth bind ကေတာ့ေျမႀကီးကိုေျခေထာက္နဲ႔ေစာင့္လိုက္တာပါ။အနားမွာရွိတဲ့ monster ေတေျမႀကီးထဲညပ္ပီးမေ႐ြ႕ေအာင္လုပ္တာပါ။ထိတဲ့အေကာင္ေရကိုလိုက္ပီးကိုယ့္ကိုလဲေသြးျပန္ျဖည့္ေပးပါတယ္။(Max HP recovery 500ပါ)farm တဲ့အခါအသုံးဝင္တဲ့ skill ပါ။\n" +
                "stop ailment chance (5*skill lvl)%ရွိပါတယ္။hit range ကေတာ့ 1m ကေန 2.5mအထိ lvlအလိုက္က်ယ္လာမာပါ။mp cost 100ျဖစ္ပါတယ္။\n" +
                "\n" +
                "main or sub weapon မွာ knuckle ကိုင္ထားရင္ေတာ့ Max HP recovery +500,ailment chance +50% ,hit range+ 1.5mတိုးေပးပီး DMG ကိုလဲ agi ေပၚမူတည္ပီးထပ္တိုးေပးပါတယ္။\n" +
                "\n");
        txt3.setText("\n" +
                "strong chase attack ကေတာ့ aggravate ကထြက္တဲ့ DMG ကို တိုးေပးတဲ့ passive ပါ။\n" +
                "DMG +(5*skill lvl)% ထပ္တိုးေပးပါတယ္။(lvl Max သြားရင္ basic atkနဲ႔ DMG တူသြားမွာပါ)aggravateကေနထိတဲ့hit ကိုလဲarm break chance (skill lvl)% ထည့္ေပးပါတယ္။\n");
    }

    public static void unicode()
    {
        txt1.setText(
                "\n" +
                "shell break ကတော့ monster ရဲ့ armor ကိုပေါက်အောင်ထိုးတာပါ။အုတ်နီခဲကိုကွဲအောင်ထိုးသလိုပေါ့။armor break chance ရှိပါတယ်။DMG လဲထွက်ပါတယ်။\n" +
                "ဒီ skill မှာ physical Pierce(5*skill lvl)% ပါပါတယ်။arm break chance (10+1.5*skill lvl)% ရှိပါတယ်။arm break ထခဲ့ရင်တော့ mp 400ပြန်ရပါတယ်။mp cost 300ရှိပါတယ်။\n" +
                "main or sub weapon မှာ knuckle ကိုင်ထားရင်တော့ target ရဲ့ def နဲ့ lvl ပေါ်မူတည်ပီး DMG တိုးပေးမှာပါ။\n");
        txt2.setText("\nearth bind ကတော့မြေကြီးကိုခြေထောက်နဲ့စောင့်လိုက်တာပါ။အနားမှာရှိတဲ့ monster တေမြေကြီးထဲညပ်ပီးမရွေ့အောင်လုပ်တာပါ။ထိတဲ့အကောင်ရေကိုလိုက်ပီးကိုယ့်ကိုလဲသွေးပြန်ဖြည့်ပေးပါတယ်။(Max HP recovery 500ပါ)farm တဲ့အခါအသုံးဝင်တဲ့ skill ပါ။\n" +
                "stop ailment chance (5*skill lvl)%ရှိပါတယ်။hit range ကတော့ 1m ကနေ 2.5mအထိ lvlအလိုက်ကျယ်လာမာပါ။mp cost 100ဖြစ်ပါတယ်။\n" +
                "\n" +
                "main or sub weapon မှာ knuckle ကိုင်ထားရင်တော့ Max HP recovery +500,ailment chance +50% ,hit range+ 1.5mတိုးပေးပီး DMG ကိုလဲ agi ပေါ်မူတည်ပီးထပ်တိုးပေးပါတယ်။\n" +
                "\n");
        txt3.setText("\n" +
                "strong chase attack ကတော့ aggravate ကထွက်တဲ့ DMG ကို တိုးပေးတဲ့ passive ပါ။\n" +
                "DMG +(5*skill lvl)% ထပ်တိုးပေးပါတယ်။(lvl Max သွားရင် basic atkနဲ့ DMG တူသွားမှာပါ)aggravateကနေထိတဲ့hit ကိုလဲarm break chance (skill lvl)% ထည့်ပေးပါတယ်။\n");
    }

}
