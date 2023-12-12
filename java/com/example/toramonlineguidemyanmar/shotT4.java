package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class shotT4 extends Fragment {

    static TextView txt1,txt2,txt3;
    public shotT4()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.shot_t4,vg,false);
        txt1=v.findViewById(R.id.txt1shott4);
        txt2=v.findViewById(R.id.txt2shott4);
        txt3=v.findViewById(R.id.txt3shott4);
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
                "cross fire ကေတာ့ magic arrow ပုံစံအကြင္းႀကီးေတထြက္လာပီးပစ္တာပါ။သူကႏွစ္ခါသုံးလို႔ရပါတယ္။ပထမတခါသုံးတာက buff ျဖစ္ပီး ေနာက္တေခါက္ထပ္သုံးမွ ပစ္တာပါ။ stack စုပီးပစ္ရသလိုမ်ိဳးပါ။ buff ဝင္ပီဆိုရင္ stack စစုပါတယ္။ lvl 10 မွာMax က 5 ပါ။ stackစုတာဟာ အခုတ္ခံရရင္ရပ္ပါတယ္။ရပ္သြားရင္လက္ထဲမွာအနီေလးေပၚမာပါ။ေနာက္တေခါက္ထပ္သုံးရင္ထြက္တဲ့ DMG က stack အေပၚမွာမူတည္ပါတယ္။ဒါ့အျပင္ stack တစ္ခုကို additional hit တစ္ခုတိုးေပးပါတယ္။DMG ထြက္တာေတာ္ေတာ္ၾကမ္းပီး weapon ေတအားလုံးထဲမွာအမ်ားဆုံးလို႔ေျပာလို႔ရပါတယ္။main DPS skillလဲျဖစ္ပါတယ္။Aoe effect ပါပါပါတယ္။ ပစ္တဲ့သူရဲ႕ေရွ႕ ကေန 100m အထိထိႏိုင္ပါတယ္။decoy shot သုံးထားရင္လဲ decoy ကေနေနာက္တခ်က္ထပ္ပစ္ပါတယ္။combo ထဲမွာထည့္သုံးရင္ေတာ့ ပထမအခ်က္ သုံးတဲ့အခါပါတဲ့ combo tag effect ရယ္ ဒုတိယတခါသုံးတဲ့အခါပါတဲ့tag effect ရယ္ေရာပီးသက္ေရာက္မွာပါ။tag effect တူေနရင္ေတာ့ ပစ္တဲ့အခါကဟာကိုထည့္မတြက္ပါဘူး။placed skill ျဖစ္ပါတယ္။mp cost ကေတာ့ ပထမတခါသုံးရင္ 400mp ပါေနာက္ပစ္တဲ့အခါသုံးရင္ေတာ့ 0 mpပါ။ cast range 12m ရွိပါတယ္။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ ပထမဆုံးပစ္တဲ့အခ်က္ main hit ရဲ႕ DMG ကိုတိုးေပးမွာပါ။Aoe လဲနဲနဲက်ယ္ေပးပါတယ္။\n" +
                "bowgun နဲ႔သုံးရင္ေတာ့ additional hit ေတရဲ႕ DMG ကိုတိုးေပးမွာပါ။\n" +
                "\n");
        txt2.setText("\n" +
                "arm break ကေတာ့ ရန္သူရဲ႕လက္ကိုခ်ိန္ပီးပစ္တာပါ။ရန္သူရဲ႕ DMG ကိုေလ်ာ့ေပးတဲ့ lethargy ailmentဝင္ေအာင္လုပ္ႏိုင္ပါတယ္။DMG လဲအနဲငယ္ထြက္ပါတယ္။\n" +
                "lethargy chance 50+(2*skill lvl) % ရွိပါတယ္။တျခားေထြေထြထူးထူးမရွိပါဘူး။ mp cost 700 ျဖစ္ပီး aggro လဲထြက္တဲ့ skill ျဖစ္လို႔ bowgun tank ေတအဓိကသုံးၾကပါတယ္။cast range ကေတာ့ 14m ပါ။\n" +
                "\n" +
                "bow နဲ႔သုံးရင္ေတာ့ lethargy chance 20%တိုးေပးပီး DMG တိုးေပးမွာပါ။\n" +
                "bowgun နဲ႔ဆိုရင္ေတာ့ lethargy chance  20%ေလ်ာ့ေပးမွာပါ။DMG လဲမ်ားမ်ားတိုးေပးပါတယ္။\n");
        txt3.setText("\n" +
                "decoy shot ကေတာ့ကိုယ္ပြားခြဲတာပါ။ကိုယ္ပြားက မေ႐ြ႕ပါဘူး။သူ႔နားကပ္ရင္ေတာ့ခ်ပါတယ္။ကိုယ္ခ်ေနတဲ့ေကာင္ကိုပဲလိုက္ခ်တာပါ။ကိုယ္ပြားက ကိုယ္ရဲ႕ stat ေတအကုန္ရပါတယ္။ aspd,atk ေတရပါတယ္။ဒါ့အျပင္ ကိုယ္ပြားခ်ရင္ကိုယ့္စီမွာ ampr effect ဝင္ပါတယ္။(mpျပန္ျပည့္တာပါ)ကိုယ္ပြားခ်တဲ့ atkဟာ proration မရွိပါဘူး။ဒါ့အျပင္ ကိုယ္ပြားထုတ္တဲ့အခါသုံးတဲ့ combo tag ရဲ႕ dmg multiplierကလဲ ကိုယ္ပြားမွာeffect ဝင္ပါတယ္။ cast time ကေတာ့ 1sec ျဖစ္ပီး motion speed ျမန္ရင္ျမန္သလိုပိုပီးျမန္ျမန္ပီးပါတယ္။\n" +
                "ကိုယ္ပြား duration ကေတာ့ lvl 10မွာ 60sec ပါ။boss Aoe မိရင္ေတာ့ 1sec ရပ္ေနပါတယ္။atk range ကေတာ့သုံးတဲ့ weapon ေပၚလိုက္ပီးကြာပါတယ္။power wave effect မဝင္ပါဘူး။\n" +
                "လူသုံးမ်ားတဲ့ skill ျဖစ္ပါတယ္။ mp cost 400ျဖစ္ပါတယ္။placed skill ပါ။\n" +
                "\n" +
                "bow / bowgun နဲ႔သုံးရင္ေတာ့aoeထိလဲမရပ္ပါဘူး။");
    }

    public static void unicode()
    {
        txt1.setText("cross fire ကတော့ magic arrow ပုံစံအကွင်းကြီးတေထွက်လာပီးပစ်တာပါ။သူကနှစ်ခါသုံးလို့ရပါတယ်။ပထမတခါသုံးတာက buff ဖြစ်ပီး နောက်တခေါက်ထပ်သုံးမှ ပစ်တာပါ။ stack စုပီးပစ်ရသလိုမျိုးပါ။ buff ဝင်ပီဆိုရင် stack စစုပါတယ်။ lvl 10 မှာMax က 5 ပါ။ stackစုတာဟာ အခုတ်ခံရရင်ရပ်ပါတယ်။ရပ်သွားရင်လက်ထဲမှာအနီလေးပေါ်မာပါ။နောက်တခေါက်ထပ်သုံးရင်ထွက်တဲ့ DMG က stack အပေါ်မှာမူတည်ပါတယ်။ဒါ့အပြင် stack တစ်ခုကို additional hit တစ်ခုတိုးပေးပါတယ်။DMG ထွက်တာတော်တော်ကြမ်းပီး weapon တေအားလုံးထဲမှာအများဆုံးလို့ပြောလို့ရပါတယ်။main DPS skillလဲဖြစ်ပါတယ်။Aoe effect ပါပါပါတယ်။ ပစ်တဲ့သူရဲ့ရှေ့ ကနေ 100m အထိထိနိုင်ပါတယ်။decoy shot သုံးထားရင်လဲ decoy ကနေနောက်တချက်ထပ်ပစ်ပါတယ်။combo ထဲမှာထည့်သုံးရင်တော့ ပထမအချက် သုံးတဲ့အခါပါတဲ့ combo tag effect ရယ် ဒုတိယတခါသုံးတဲ့အခါပါတဲ့tag effect ရယ်ရောပီးသက်ရောက်မှာပါ။tag effect တူနေရင်တော့ ပစ်တဲ့အခါကဟာကိုထည့်မတွက်ပါဘူး။placed skill ဖြစ်ပါတယ်။mp cost ကတော့ ပထမတခါသုံးရင် 400mp ပါနောက်ပစ်တဲ့အခါသုံးရင်တော့ 0 mpပါ။ cast range 12m ရှိပါတယ်။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ ပထမဆုံးပစ်တဲ့အချက် main hit ရဲ့ DMG ကိုတိုးပေးမှာပါ။Aoe လဲနဲနဲကျယ်ပေးပါတယ်။\n" +
                "bowgun နဲ့သုံးရင်တော့ additional hit တေရဲ့ DMG ကိုတိုးပေးမှာပါ။\n" +
                "\n");
        txt2.setText("\n" +
                "arm break ကတော့ ရန်သူရဲ့လက်ကိုချိန်ပီးပစ်တာပါ။ရန်သူရဲ့ DMG ကိုလျော့ပေးတဲ့ lethargy ailmentဝင်အောင်လုပ်နိုင်ပါတယ်။DMG လဲအနဲငယ်ထွက်ပါတယ်။\n" +
                "lethargy chance 50+(2*skill lvl) % ရှိပါတယ်။တခြားထွေထွေထူးထူးမရှိပါဘူး။ mp cost 700 ဖြစ်ပီး aggro လဲထွက်တဲ့ skill ဖြစ်လို့ bowgun tank တေအဓိကသုံးကြပါတယ်။cast range ကတော့ 14m ပါ။\n" +
                "\n" +
                "bow နဲ့သုံးရင်တော့ lethargy chance 20%တိုးပေးပီး DMG တိုးပေးမှာပါ။\n" +
                "bowgun နဲ့ဆိုရင်တော့ lethargy chance  20%လျော့ပေးမှာပါ။DMG လဲများများတိုးပေးပါတယ်။\n");
        txt3.setText("\n" +
                "decoy shot ကတော့ကိုယ်ပွားခွဲတာပါ။ကိုယ်ပွားက မရွေ့ပါဘူး။သူ့နားကပ်ရင်တော့ချပါတယ်။ကိုယ်ချနေတဲ့ကောင်ကိုပဲလိုက်ချတာပါ။ကိုယ်ပွားက ကိုယ်ရဲ့ stat တေအကုန်ရပါတယ်။ aspd,atk တေရပါတယ်။ဒါ့အပြင် ကိုယ်ပွားချရင်ကိုယ့်စီမှာ ampr effect ဝင်ပါတယ်။(mpပြန်ပြည့်တာပါ)ကိုယ်ပွားချတဲ့ atkဟာ proration မရှိပါဘူး။ဒါ့အပြင် ကိုယ်ပွားထုတ်တဲ့အခါသုံးတဲ့ combo tag ရဲ့ dmg multiplierကလဲ ကိုယ်ပွားမှာeffect ဝင်ပါတယ်။ cast time ကတော့ 1sec ဖြစ်ပီး motion speed မြန်ရင်မြန်သလိုပိုပီးမြန်မြန်ပီးပါတယ်။\n" +
                "ကိုယ်ပွား duration ကတော့ lvl 10မှာ 60sec ပါ။boss Aoe မိရင်တော့ 1sec ရပ်နေပါတယ်။atk range ကတော့သုံးတဲ့ weapon ပေါ်လိုက်ပီးကွာပါတယ်။power wave effect မဝင်ပါဘူး။\n" +
                "လူသုံးများတဲ့ skill ဖြစ်ပါတယ်။ mp cost 400ဖြစ်ပါတယ်။placed skill ပါ။\n" +
                "\n" +
                "bow / bowgun နဲ့သုံးရင်တော့aoeထိလဲမရပ်ပါဘူး။");
    }

}
