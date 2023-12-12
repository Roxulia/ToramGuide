package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bwgGnb extends Fragment {

    static TextView txt1;
    public bwgGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.bwg_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbBwg);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်တေကတော့ bowgunဟာ lvlအနိမ့်ပိုင်းမှာ ကြမ်းလို့ newbie တေနဲ့သင့်တော်ပါတယ်။ sub တေအများကြီးသုံးလို့ရတာကြောင့် playstyle တေလဲများများဆော့လို့ရပါတယ် animationလဲမြန်ပါတယ် bow လိုသိပ်စောင့်စရာမလိုပါဘူး ။ ampr လဲကောင်းပါတယ်။ aggro လဲတော်တော်ထွက်တာမို့ tank ဆော့လို့လဲရပါတယ်\n" +
                "\n" +
                "အားနည်းချက်ကတော့ stat တမျိုးထဲကပဲ DMG ရတာမို့ lvl. အမြင့်ပိုင်းမှာသိပ်မကြမ်းပါဘူး။ crit rate လဲ reduce တာတေရှိပါတယ်။ ပစ်တဲ့ range ကလဲနဲနဲကျဉ်းပါတယ်။");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ေတကေတာ့ bowgunဟာ lvlအနိမ့္ပိုင္းမွာ ၾကမ္းလို႔ newbie ေတနဲ႔သင့္ေတာ္ပါတယ္။ sub ေတအမ်ားႀကီးသုံးလို႔ရတာေၾကာင့္ playstyle ေတလဲမ်ားမ်ားေဆာ့လို႔ရပါတယ္ animationလဲျမန္ပါတယ္ bow လိုသိပ္ေစာင့္စရာမလိုပါဘူး ။ ampr လဲေကာင္းပါတယ္။ aggro လဲေတာ္ေတာ္ထြက္တာမို႔ tank ေဆာ့လို႔လဲရပါတယ္\n" +
                "\n" +
                "အားနည္းခ်က္ကေတာ့ stat တမ်ိဳးထဲကပဲ DMG ရတာမို႔ lvl. အျမင့္ပိုင္းမွာသိပ္မၾကမ္းပါဘူး။ crit rate လဲ reduce တာေတရွိပါတယ္။ ပစ္တဲ့ range ကလဲနဲနဲက်ဥ္းပါတယ္။");
    }

}
