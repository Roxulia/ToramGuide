package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class shotT1 extends Fragment {

    static TextView txt1,txt2,txt3,txt4,txt5;
    public shotT1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.shot_t1,vg,false);
        txt1=v.findViewById(R.id.txt1shott1);
        txt2=v.findViewById(R.id.txt2shott1);
        txt3=v.findViewById(R.id.txt3shott1);
        txt4=v.findViewById(R.id.txt4shott1);
        txt5=v.findViewById(R.id.txt5shott1);
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
        txt1.setText("power shot ကေတာ့ ေသခ်ာအားေတြစုပီးပစ္လိုက္တာပါ။ အားစုရတာဆိုေတာ့ charge time ပါပါတယ္။ bow,bowgun,arrow ေတထဲကတခုခုကိုင္ထားရင္သုံးလို႔ရပါတယ္။dmg လဲထြက္ပါတယ္။ဒါ့အျပင္ monster ေတ boss ေတကိုလဲ tumble လုပ္ဖို႔ chance(20+3*skill lvl )% ရွိပါတယ္။ သူက motion speed ေလ်ာ့ပါတယ္။ skill ရဲ႕ speed ကိုေလ်ာ့တာပါ။charge time ကိုသက္ေရာက္ပါတယ္။skill lvl တက္ေလ motion speed ေလ်ာ့တာနဲေလျဖစ္လိူ႔ charge time လဲပိုျမန္လာပါတယ္။တကယ္လို႔ အပစ္ခံရတဲ့ေကာင္က slow ေနမယ္ဆိုရင္ skill ရဲ႕ critical rate ကို(5*skill lvl)တိုးေပးပါတယ္။mp cost ကေတာ့ 100 ျဖစ္ပီး cast range ကေတာ့16m ပါ။ \n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့tumble chance ကို 40% ထပ္တိုးေပးပါတယ္။\n" +
                "bowgunနဲ႔သုံးရင္ေတာ့ motion speed ေလ်ာ့တာကိုတဝက္ေလ်ာ့ခ်ေပးၿပီး tumble chance ကိုလဲ -40% ေလ်ာ့မာပါ။\n");
        txt2.setText("bullseye ကေတာ့ သုံးခ်က္ဆက္တိုက္ပစ္တာပါ။DMG လဲထြက္ပါတယ္။ပထမအခ်က္ကေတာ့ေထြေထြထူးထူးမဟုတ္ေပမဲ့ ေနာက္ႏွစ္ခ်က္ကေတာ့ def ကို ignore လုပ္တဲ့ physical Pierce ပါပါတယ္။ဒါ့ေၾကာင့္မို႔ တခ်က္ပီးတခ်က္ dmg ပိုတိုးလာမာပါ။charge time မလိုပါဘူး။\n" +
                "ဒုတိယအခ်က္မွာ physical Pierce (4*skill lvl)% ပါပီး တတိယအခ်က္မွာ (8*skill lvl)% ပါပါတယ္။\n" +
                "mp cost 200 ျဖစ္ပီး cast range ကေတာ့ 12m ပါ။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ DMG ပိူတိုးေပးမွာပါ။\n" +
                "bowgun နဲ႔ဆိုရင္ေတာ့ physical Pierce ကို ဒုတိယခ်က္မွာ10% တတိယအခ်က္မွာ 20% တိုးေပးပါတယ္။\n");
        txt3.setText("moba shot ကေတာ့ ျမႇားထဲမွာ water element ထည့္ပီးပစ္တာပါ။ ပစ္တဲ့အခါ charge time မလိုသလို ပစ္ခံရတဲ့ေကာင္ကိုလဲslowေပးပါတယ္။DMG လဲအေတာ္အသင့္ထြက္တဲ့ skill ပါ။ \n" +
                "slow chance ကေတာ့ (50+ 2*skill lvl)%ျဖစ္ပါတယ္။\n" +
                "mp cost 100ျဖစ္ပီး cast range ကေတာ့ 14m ပါ။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ slow chance 30%ထပ္တိုးေပးမွာပါ။\n" +
                " bowgun နဲ႔သုံးရင္ေတာ့ skill DMG ကိုတိုးေပးပီး slow chance ကို 30%ေလ်ာ့ေပးမွာပါ။\n");
        txt4.setText("shot mastery ကေတာ့ bow or bowgun ကိုင္ထားရင္ရတဲ့ atk ကိုတိုးေပးတဲ့ passive skill ပါ။\n" +
                "weapon atk (3*skill lvl ) % တိုးေပးပါတယ္။\n" +
                "ဒါအျပင္ skill lvl 10မွာ atk 3% အထိတိုးေပးႏိုင္ပါတယ္။\n");
        txt5.setText("sneak attack ကေတာ့ buff skill ပါ။သူကေတာ့ attack skill ေတbasic atk ေတရဲ႕ aggro ကိုေဖ်ာက္ေပးတာပါ။ဘယ္weaponနဲ႔ပဲျဖစ္ျဖစ္သုံးလို႔ရပါတယ္။ duration နဲ႔မဟုတ္ဘဲ ကိုယ္သုံးတဲ့ attack skill,basic atkအခ်က္ေရနဲ႔ ေဖ်ာက္ေပးတာပါ။ lvl 10 မွာ 10ခ်က္ဆာေဖ်ာက္ေပးပါတယ္။ mp cost ကေတာ့ 400ပါ။\n" +
                "\n" +
                "bow/ bowgun နဲ႔သုံးရင္ေတာ့ mp 200နဲ႔ပဲသုံးလို႔ရမွာပါ။\n");
    }

    public static void unicode()
    {
        txt1.setText("power shot ကတော့ သေချာအားတွေစုပီးပစ်လိုက်တာပါ။ အားစုရတာဆိုတော့ charge time ပါပါတယ်။ bow,bowgun,arrow တေထဲကတခုခုကိုင်ထားရင်သုံးလို့ရပါတယ်။dmg လဲထွက်ပါတယ်။ဒါ့အပြင် monster တေ boss တေကိုလဲ tumble လုပ်ဖို့ chance(20+3*skill lvl )% ရှိပါတယ်။ သူက motion speed လျော့ပါတယ်။ skill ရဲ့ speed ကိုလျော့တာပါ။charge time ကိုသက်ရောက်ပါတယ်။skill lvl တက်လေ motion speed လျော့တာနဲလေဖြစ်လိူ့ charge time လဲပိုမြန်လာပါတယ်။တကယ်လို့ အပစ်ခံရတဲ့ကောင်က slow နေမယ်ဆိုရင် skill ရဲ့ critical rate ကို(5*skill lvl)တိုးပေးပါတယ်။mp cost ကတော့ 100 ဖြစ်ပီး cast range ကတော့16m ပါ။ \n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့tumble chance ကို 40% ထပ်တိုးပေးပါတယ်။\n" +
                "bowgunနဲ့သုံးရင်တော့ motion speed လျော့တာကိုတဝက်လျော့ချပေးပြီး tumble chance ကိုလဲ -40% လျော့မာပါ။\n");
        txt2.setText("bullseye ကတော့ သုံးချက်ဆက်တိုက်ပစ်တာပါ။DMG လဲထွက်ပါတယ်။ပထမအချက်ကတော့ထွေထွေထူးထူးမဟုတ်ပေမဲ့ နောက်နှစ်ချက်ကတော့ def ကို ignore လုပ်တဲ့ physical Pierce ပါပါတယ်။ဒါ့ကြောင့်မို့ တချက်ပီးတချက် dmg ပိုတိုးလာမာပါ။charge time မလိုပါဘူး။\n" +
                "ဒုတိယအချက်မှာ physical Pierce (4*skill lvl)% ပါပီး တတိယအချက်မှာ (8*skill lvl)% ပါပါတယ်။\n" +
                "mp cost 200 ဖြစ်ပီး cast range ကတော့ 12m ပါ။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ DMG ပိူတိုးပေးမှာပါ။\n" +
                "bowgun နဲ့ဆိုရင်တော့ physical Pierce ကို ဒုတိယချက်မှာ10% တတိယအချက်မှာ 20% တိုးပေးပါတယ်။\n");
        txt3.setText("moba shot ကတော့ မြှားထဲမှာ water element ထည့်ပီးပစ်တာပါ။ ပစ်တဲ့အခါ charge time မလိုသလို ပစ်ခံရတဲ့ကောင်ကိုလဲslowပေးပါတယ်။DMG လဲအတော်အသင့်ထွက်တဲ့ skill ပါ။ \n" +
                "slow chance ကတော့ (50+ 2*skill lvl)%ဖြစ်ပါတယ်။\n" +
                "mp cost 100ဖြစ်ပီး cast range ကတော့ 14m ပါ။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ slow chance 30%ထပ်တိုးပေးမှာပါ။\n" +
                " bowgun နဲ့သုံးရင်တော့ skill DMG ကိုတိုးပေးပီး slow chance ကို 30%လျော့ပေးမှာပါ။\n");
        txt4.setText("shot mastery ကတော့ bow or bowgun ကိုင်ထားရင်ရတဲ့ atk ကိုတိုးပေးတဲ့ passive skill ပါ။\n" +
                "weapon atk (3*skill lvl ) % တိုးပေးပါတယ်။\n" +
                "ဒါအပြင် skill lvl 10မှာ atk 3% အထိတိုးပေးနိုင်ပါတယ်။\n");
        txt5.setText("sneak attack ကတော့ buff skill ပါ။သူကတော့ attack skill တေbasic atk တေရဲ့ aggro ကိုဖျောက်ပေးတာပါ။ဘယ်weaponနဲ့ပဲဖြစ်ဖြစ်သုံးလို့ရပါတယ်။ duration နဲ့မဟုတ်ဘဲ ကိုယ်သုံးတဲ့ attack skill,basic atkအချက်ရေနဲ့ ဖျောက်ပေးတာပါ။ lvl 10 မှာ 10ချက်ဆာဖျောက်ပေးပါတယ်။ mp cost ကတော့ 400ပါ။\n" +
                "\n" +
                "bow/ bowgun နဲ့သုံးရင်တော့ mp 200နဲ့ပဲသုံးလို့ရမှာပါ။\n");
    }

}
