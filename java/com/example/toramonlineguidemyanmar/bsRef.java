package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bsRef extends Fragment {

    static TextView txt1,txt2;
    public bsRef()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.bs_refine,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtref1);
        txt2=v.findViewById(R.id.txtref2);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("Refine ကတော့ successrateနဲ့ဆိုင်တာပါ stage က 15ဆင့်ရှိပီး တဆင့်စီဟာ atk ကိုတိုးသွားစေပါတယ် (weapon ဆိုရင်ပေါ့) DMG reduce % ကိုတိုးစေပါတယ် (def item ဆိုရင်ပေါ့) တဆင့်ထက်တဆင့်ပိုပိုခက်လာပါတယ်။ ပြန်ကျတာလဲရှိပါတယ် အ့တာကြောင့် refine ဟာ ငွေလိုပါတယ်။\n" +
                "\n" +
                "Refine အပေါ်တက်ရောက်နေတဲ့ stat နှစ်ခုရှိပါတယ် tech နဲ့ luk ပါ\n" +
                "Tech က successrate ကိုတိုးပေးပီး luk ကတော့ ပြန်ကျတဲ့ rate ကိုလျော့ပေးပါတယ်။\n" +
                "Refine အဆင့်တေက 1 ကနေ 9 ပီးရင် E>D>C>B>A>S ဆိုပီးရှိပါတယ် \n" +
                "1 ကနေ 5 အထိကို hematite \n" +
                "5 ကနေ 7 အထိကို dusmascus\n" +
                "7 ကနေ 9အထိကို mithril ore\n" +
                "9 ကနေ B အထိကို orichalum");
        txt2.setText("Tech နဲ့ ဆိုရင်တော့အ့လောက်ထိ ရောက်နိုင်ပါတယ်။အ့ထက်များလာရင်ပြန်ကျတာနဲ့မကာမိနိုင်ပါဘူးအ့တော့ luk char ပြောင်းပီး \n" +
                "B to S ကို hematite + antideg နဲ့လုပ်\n" +
                "ကြပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("Refine ကေတာ့ successrateနဲ႔ဆိုင္တာပါ stage က 15ဆင့္ရွိပီး တဆင့္စီဟာ atk ကိုတိုးသြားေစပါတယ္ (weapon ဆိုရင္ေပါ့) DMG reduce % ကိုတိုးေစပါတယ္ (def item ဆိုရင္ေပါ့) တဆင့္ထက္တဆင့္ပိုပိုခက္လာပါတယ္။ ျပန္က်တာလဲရွိပါတယ္ အ့တာေၾကာင့္ refine ဟာ ေငြလိုပါတယ္။\n" +
                "\n" +
                "Refine အေပၚတက္ေရာက္ေနတဲ့ stat ႏွစ္ခုရွိပါတယ္ tech နဲ႔ luk ပါ\n" +
                "Tech က successrate ကိုတိုးေပးပီး luk ကေတာ့ ျပန္က်တဲ့ rate ကိုေလ်ာ့ေပးပါတယ္။\n" +
                "Refine အဆင့္ေတက 1 ကေန 9 ပီးရင္ E>D>C>B>A>S ဆိုပီးရွိပါတယ္ \n" +
                "1 ကေန 5 အထိကို hematite \n" +
                "5 ကေန 7 အထိကို dusmascus\n" +
                "7 ကေန 9အထိကို mithril ore\n" +
                "9 ကေန B အထိကို orichalum");
        txt2.setText("Tech နဲ႔ ဆိုရင္ေတာ့အ့ေလာက္ထိ ေရာက္ႏိုင္ပါတယ္။အ့ထက္မ်ားလာရင္ျပန္က်တာနဲ႔မကာမိႏိုင္ပါဘူးအ့ေတာ့ luk char ေျပာင္းပီး \n" +
                "B to S ကို hematite + antideg နဲ႔လုပ္\n" +
                "ၾကပါတယ္");
    }

}
