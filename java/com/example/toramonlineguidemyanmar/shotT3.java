package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class shotT3 extends Fragment {

    static TextView txt1,txt2,txt3;
    public shotT3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.shot_t3,vg,false);
        txt1=v.findViewById(R.id.txt1shott3);
        txt2=v.findViewById(R.id.txt2shott3);
        txt3=v.findViewById(R.id.txt3shott3);
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
        txt1.setText("snipe ကေတာ့ power shot လိုပါပဲ စုပီးပစ္တာပါ။ charge time လဲပါပါတယ္။ DMG လဲအထြက္ၾကမ္းတဲ့ skill ပါ။ဒါမဲ့ skill ရဲ႕ critical rate ကေတာ့ေလ်ာ့ပါတယ္။ armor break ဖို႔ chance (50+skill lvl*2)% ရွိပါတယ္။skill ရဲ႕\n" +
                "critical rate ကို 75-(5*skill lvl)ေလ်ာ့ေပးပါတယ္။တကယ္လို႔ ပစ္ခံရတဲ့ေကာင္က blind မိထားရင္ေတာ့ skill ဟာ miss ထမွမဟုတ္ပါဘူး။charge time ကေတာ့ level 10 မွာ 1 sec ပါ။ mp cost 400 ျဖစ္ပီး cast range ကေတာ့ 16m ပါ။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ armor break chance 30% ပိုရမွာပါ။ဒါ့အျပင္ critical rate ေလ်ာ့တာကိုလဲ 25 ထပ္ေလ်ာ့ေပးပါတယ္။\n" +
                "bowgun နဲ႔သုံးရင္ေတာ့ armor break chance -60%ေလ်ာ့ေပးမွာပါ။charge time ကိုလဲ 0.5 secေလ်ာ့ေပးမွာပါ။DMG ကိုေတာ့ေတာ္ေတာ္ေလးတိုးေပးထားပါတယ္။\n");
        txt2.setText("smoke dust ကေတာ့ျမႇားထဲမွာ dark element စုပီးပစ္လိုက္တာပါ။ blind ျဖစ္ေအာင္လုပ္ႏိုင္ပါတယ္။ဒါ့အျပင္ accuracy buff လဲေပးပါတယ္။\n" +
                "blind chance  50+(2*skill lvl )%ရွိပါတယ္။accuracy +((skill lvl^2)/2 + (5*skill lvl)) တိုးေပးပါတယ္။lvl 10 မွာ accuracy 100တိုးေပးတာပါ။DMG လဲၾကမ္းပါတယ္။aggro လဲေတာ္ေတာ္ထြက္ပါတယ္။bowgun tank ေတaggro ဆြဲတဲ့အခါလဲသုံးေလ့ရွိၾကပါတယ္။mp cost 500 ျဖစ္ပီး maximum cast range 14m ရွိပါတယ္။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ blind chance 20% ထပ္တိုးေပးပီး DMG အနဲငယ္ထပ္တိုးေပးပါတယ္။\n" +
                "bowgun နဲ႔သုံးရင္ေတာ့ DMG ကိုေတာ္ေတာ္တိုးထားပီး blind chance ကို 20% ထပ္ေလ်ာ့ေပးပါတယ္။\n");
        txt3.setText("quick drawကေတာ့ passive skillပါ။သူ႔ effect ကေတာ့ skill သုံးပီးတိုင္း mp 100 ျပန္တက္ဖို႔ chance (skill lvl*3)% ေပးတာပါ။အသုံးဝင္တဲ့ထဲမွာပါပါတယ္");
    }

    public static void unicode()
    {
        txt1.setText("snipe ကတော့ power shot လိုပါပဲ စုပီးပစ်တာပါ။ charge time လဲပါပါတယ်။ DMG လဲအထွက်ကြမ်းတဲ့ skill ပါ။ဒါမဲ့ skill ရဲ့ critical rate ကတော့လျော့ပါတယ်။ armor break ဖို့ chance (50+skill lvl*2)% ရှိပါတယ်။skill ရဲ့\n" +
                "critical rate ကို 75-(5*skill lvl)လျော့ပေးပါတယ်။တကယ်လို့ ပစ်ခံရတဲ့ကောင်က blind မိထားရင်တော့ skill ဟာ miss ထမှမဟုတ်ပါဘူး။charge time ကတော့ level 10 မှာ 1 sec ပါ။ mp cost 400 ဖြစ်ပီး cast range ကတော့ 16m ပါ။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ armor break chance 30% ပိုရမှာပါ။ဒါ့အပြင် critical rate လျော့တာကိုလဲ 25 ထပ်လျော့ပေးပါတယ်။\n" +
                "bowgun နဲ့သုံးရင်တော့ armor break chance -60%လျော့ပေးမှာပါ။charge time ကိုလဲ 0.5 secလျော့ပေးမှာပါ။DMG ကိုတော့တော်တော်လေးတိုးပေးထားပါတယ်။\n");
        txt2.setText("smoke dust ကတော့မြှားထဲမှာ dark element စုပီးပစ်လိုက်တာပါ။ blind ဖြစ်အောင်လုပ်နိုင်ပါတယ်။ဒါ့အပြင် accuracy buff လဲပေးပါတယ်။\n" +
                "blind chance  50+(2*skill lvl )%ရှိပါတယ်။accuracy +((skill lvl^2)/2 + (5*skill lvl)) တိုးပေးပါတယ်။lvl 10 မှာ accuracy 100တိုးပေးတာပါ။DMG လဲကြမ်းပါတယ်။aggro လဲတော်တော်ထွက်ပါတယ်။bowgun tank တေaggro ဆွဲတဲ့အခါလဲသုံးလေ့ရှိကြပါတယ်။mp cost 500 ဖြစ်ပီး maximum cast range 14m ရှိပါတယ်။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ blind chance 20% ထပ်တိုးပေးပီး DMG အနဲငယ်ထပ်တိုးပေးပါတယ်။\n" +
                "bowgun နဲ့သုံးရင်တော့ DMG ကိုတော်တော်တိုးထားပီး blind chance ကို 20% ထပ်လျော့ပေးပါတယ်။\n");
        txt3.setText("quick drawကတော့ passive skillပါ။သူ့ effect ကတော့ skill သုံးပီးတိုင်း mp 100 ပြန်တက်ဖို့ chance (skill lvl*3)% ပေးတာပါ။အသုံးဝင်တဲ့ထဲမှာပါပါတယ်။");
    }

}
