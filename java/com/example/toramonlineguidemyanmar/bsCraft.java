package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bsCraft extends Fragment {

    static TextView txt1,txt2,txt3;
    public bsCraft()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.bs_craft,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtbscraft1);
        txt2=v.findViewById(R.id.txtbscraft2);
        txt3=v.findViewById(R.id.txtbscraft3);
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

    public static void unicode()
    {
        txt1.setText("Equipment တွေ craft မယ်ဆိုရင်တော့ ကိုယ် craft လို့ထွက်လာမဲ့ equip ရဲ့ atk(or)def,potential တွေဟာများမှ (ဒါမှမဟုတ်) သတ်မှတ်ထားတာပြည့်မှ ရမာပါ။success ဖြစ်ရင်တော့ atk , def တွေကိုအပြည့်ရမာဖြစ်ပီး pot ကတော့ ကိုယ့် character ရဲ့ stat ပေါ်မူတည်ပီးထပ်ပြောင်းလဲသွားပါတယ်။craft တဲ့အခါထွက်လာမဲ့ pot ကတော့ base potential နဲ့ stat ကရတဲ့pot နဲ့ပေါင်းပီးထွက်လာတာပါ။");
        txt2.setText("equip type ပေါ်မူတည်ပီး character statကနေ ရနိုင်တဲ့ potential တွေကတော့\n" +
                "One hand sword > pot=(dex+str)/20\n" +
                "Two hand sword > pot= str/10\n" +
                "Bow > pot = (dex+str)/20\n" +
                "Bowgun > pot = dex/10\n" +
                "Staff > pot = int/10\n" +
                "Magic device > pot = (int+agi)20\n" +
                "Knuckle > pot = agi/10\n" +
                "Halberd > pot = (str + agi)/20\n" +
                "Katana > pot = (dex + agi)/20\n" +
                "Armor > pot = vit / 10\n" +
                "\n" +
                "Potတွက်တဲ့ stat ဟာ equipment တေက statတေကိုထည့်မတွက်ပါဘူး\n" +
                "\n" +
                "ဟုတ်ပီ အ့တာဆို ဘယ် equipment ကိုလုပ်မှာလဲဘာstatယူသင့်လဲဆိုတာတော့သိလောက်ပါပီ ။\n" +
                "\n" +
                "ဒါပေမဲ့ item craft တဲ့အပိူင်းမှာအရေးကြီးတာကျန်ပါသေးတယ်။\nအ့ တာက  blacksmith proficiency lvl နဲ့ difficulty ပါ။");
        txt3.setText("proficieny lvl ကတော့ ကိုယ့် prof lvl ထက် 11 ခုနဲတဲ့ equip တေအထိ craft ရင် တက်ပါတယ်။ difficulty ကတော့ ခက်ခဲမှုကိုပြောတာပါ။ဘာကိုဆိုလိုလဲဆိုတော့ ကိုယ်လုပ်မဲ့ item ရဲ့ difficulty ဟာ ကိုယ် တတ်နိုင်တာထက်ပိုနေရင် craft လို့မရတာကိုပြောတာပါ ။\n" +
                "Difficulty ဘလိုရလဲ။\n" +
                "Proficiency lvl တခုတက်တိုင်း difficulty တခုတက်ပါတယ်\n" +
                "Personal stat ထဲက tech ကလဲ difficultyတိုးပေးပါတယ် difficulty = tech/2\n" +
                "Dex ဟာလဲ difficulty တိုးပေးပါတယ် \n" +
                "Difficulty = dex /6\n" +
                "Item craft တဲ့အပိုင်းကတော့ ဒီလောက်သိထားရင်လုံလောက်ပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("Equipment ေတြ craft မယ္ဆိုရင္ေတာ့ ကိုယ္ craft လို႔ထြက္လာမဲ့ equip ရဲ႕ atk(or)def,potential ေတြဟာမ်ားမွ (ဒါမွမဟုတ္) သတ္မွတ္ထားတာျပည့္မွ ရမာပါ။success ျဖစ္ရင္ေတာ့ atk , def ေတြကိုအျပည့္ရမာျဖစ္ပီး pot ကေတာ့ ကိုယ့္ character ရဲ႕ stat ေပၚမူတည္ပီးထပ္ေျပာင္းလဲသြားပါတယ္။craft တဲ့အခါထြက္လာမဲ့ pot ကေတာ့ base potential နဲ႔ stat ကရတဲ့pot နဲ႔ေပါင္းပီးထြက္လာတာပါ။");
        txt2.setText("equip type ေပၚမူတည္ပီး character statကေန ရႏိုင္တဲ့ potential ေတြကေတာ့\n" +
                "One hand sword > pot=(dex+str)/20\n" +
                "Two hand sword > pot= str/10\n" +
                "Bow > pot = (dex+str)/20\n" +
                "Bowgun > pot = dex/10\n" +
                "Staff > pot = int/10\n" +
                "Magic device > pot = (int+agi)20\n" +
                "Knuckle > pot = agi/10\n" +
                "Halberd > pot = (str + agi)/20\n" +
                "Katana > pot = (dex + agi)/20\n" +
                "Armor > pot = vit / 10\n" +
                "\n" +
                "Potတြက္တဲ့ stat ဟာ equipment ေတက statေတကိုထည့္မတြက္ပါဘူး\n" +
                "\n" +
                "ဟုတ္ပီ အ့တာဆို ဘယ္ equipment ကိုလုပ္မွာလဲဘာstatယူသင့္လဲဆိုတာေတာ့သိေလာက္ပါပီ ။\n" +
                "\n" +
                "ဒါေပမဲ့ item craft တဲ့အပိူင္းမွာအေရးႀကီးတာက်န္ပါေသးတယ္ ။အ့ တာက  blacksmith proficiency lvl နဲ႔ difficulty ပါ။");
        txt3.setText("proficieny lvl ကေတာ့ ကိုယ့္ prof lvl ထက္ 11 ခုနဲတဲ့ equip ေတအထိ craft ရင္ တက္ပါတယ္။ difficulty ကေတာ့ ခက္ခဲမႈကိုေျပာတာပါ။ဘာကိုဆိုလိုလဲဆိုေတာ့ ကိုယ္လုပ္မဲ့ item ရဲ႕ difficulty ဟာ ကိုယ္ တတ္ႏိုင္တာထက္ပိုေနရင္ craft လို႔မရတာကိုေျပာတာပါ ။\n" +
                "Difficulty ဘလိုရလဲ။\n" +
                "Proficiency lvl တခုတက္တိုင္း difficulty တခုတက္ပါတယ္\n" +
                "Personal stat ထဲက tech ကလဲ difficultyတိုးေပးပါတယ္ difficulty = tech/2\n" +
                "Dex ဟာလဲ difficulty တိုးေပးပါတယ္ \n" +
                "Difficulty = dex /6\n" +
                "Item craft တဲ့အပိုင္းကေတာ့ ဒီေလာက္သိထားရင္လုံေလာက္ပါတယ္");
    }

}
