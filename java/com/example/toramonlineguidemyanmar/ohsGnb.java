package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class ohsGnb extends Fragment {

    static TextView txt1;
    public ohsGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.ohs_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbOhs);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်ကတော့ playstyle များတာရယ် aggro များများထုတ်ပေးနိုင်တာကြောင့် shield နဲ့တွဲပီး tank လိုဆော့နိုင်တာရယ် ရှိပါတယ် DMG လဲကောင်းကောင်းထုတ်နိုင်လို့ တော်တော် ကောင်းတဲ့ class  ပါ newbie တေနဲ့သင့်တော်ပါတယ်\n" +
                "\n" +
                "အားနည်းချက်ကတော့ ကိုယ်က အမာမသွားထားရင် aggro မိပီးသေနိုင်ပါတယ် dmg ကလဲ skill spam  နိုင်မှထွက်တာမို့လို့ mp လဲလိုပါတယ် ampr ကတော့ စိတ်ပူစရာမလိုပါဘူး");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ကေတာ့ playstyle မ်ားတာရယ္ aggro မ်ားမ်ားထုတ္ေပးႏိုင္တာေၾကာင့္ shield နဲ႔တြဲပီး tank လိုေဆာ့ႏိုင္တာရယ္ ရွိပါတယ္ DMG လဲေကာင္းေကာင္းထုတ္ႏိုင္လို႔ ေတာ္ေတာ္ ေကာင္းတဲ့ class  ပါ newbie ေတနဲ႔သင့္ေတာ္ပါတယ္\n" +
                "\n" +
                "အားနည္းခ်က္ကေတာ့ ကိုယ္က အမာမသြားထားရင္ aggro မိပီးေသႏိုင္ပါတယ္ dmg ကလဲ skill spam  ႏိုင္မွထြက္တာမို႔လို႔ mp လဲလိုပါတယ္ ampr ကေတာ့ စိတ္ပူစရာမလိုပါဘူး");
    }
}
