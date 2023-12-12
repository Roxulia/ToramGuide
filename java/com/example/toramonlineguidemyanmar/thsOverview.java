package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.MainActivity;
import com.example.toramonlineguidemyanmar.R;

public class thsOverview extends Fragment {

    static TextView txt1;
    public thsOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.ths_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvThs);
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
        txt1.setText("Ths (Two Handed Sword) က Sword Class ကေနခြဲထြက္လာတဲ့ Damage output မ်ားတဲ့ Class တစ္ခုပါပဲ။\n" +
                "Combo skill spam ေကာင္းတဲ့ Class တစ္ခုျဖစ္ၿပီးေတာ့ Damage ကလဲ Play Style တစ္ခုခ်င္းစီအလိုက္ output လုပ္ႏိုင္တဲ့အေနထားခ်င္းလဲကြာပါတယ္။\n" +
                "Aggro generate လဲေကာင္းတဲ့အျပင္ တျခားေသာ Class ေတြထက္လဲ ပိုအမာခံႏိုင္တာေၾကာင့္ Tank မပါတဲ့ Party ေတြမွာ Semi Tank အေနနဲ႔လဲ Team ကလူေတြကို ကာေပးလို႔ရပါေသးတယ္။\n" +
                "ဒါ့အျပင္ Mercenary အသုံး၀င္မႈမွာလဲ Ths Class ေတြက လူေခၚမ်ားတဲ့ Most Useful class တစ္ခုျဖစ္ေနတဲ့အတြက္ Ths player ေတြအခ်င္းခ်င္း ဘယ္သူက Mercenary Power ပိုမ်ားလဲၿပိဳင္ၾကတာက အစဥ္လာတစ္ခုလိုပါပဲ။");
    }

    public static void unicode()
    {
        txt1.setText("Ths (Two Handed Sword) က Sword Class ကနေခွဲထွက်လာတဲ့ Damage output များတဲ့ Class တစ်ခုပါပဲ။\n" +
                "Combo skill spam ကောင်းတဲ့ Class တစ်ခုဖြစ်ပြီးတော့ Damage ကလဲ Play Style တစ်ခုချင်းစီအလိုက် output လုပ်နိုင်တဲ့အနေထားချင်းလဲကွာပါတယ်။\n" +
                "Aggro generate လဲကောင်းတဲ့အပြင် တခြားသော Class တွေထက်လဲ ပိုအမာခံနိုင်တာကြောင့် Tank မပါတဲ့ Party တွေမှာ Semi Tank အနေနဲ့လဲ Team ကလူတွေကို ကာပေးလို့ရပါသေးတယ်။\n" +
                "ဒါ့အပြင် Mercenary အသုံး၀င်မှုမှာလဲ Ths Class တွေက လူခေါ်များတဲ့ Most Useful class တစ်ခုဖြစ်နေတဲ့အတွက် Ths player တွေအချင်းချင်း ဘယ်သူက Mercenary Power ပိုများလဲပြိုင်ကြတာက အစဉ်လာတစ်ခုလိုပါပဲ။");
    }
}
