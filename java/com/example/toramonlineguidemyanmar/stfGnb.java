package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class stfGnb extends Fragment {

    static TextView txt1;
    public stfGnb()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.stf_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbStf);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်တွေကတော့ dmg များများထုတ်ပေးနိုင်တာပါထို့အပြင် support ဘက်ကနေလဲအထောက်အကူပြုပေးနိုင်တာပါ။ mp လဲစိတ်ပူစရာမလိုတာကြောင့်သေသွားတဲ့သူတေကို revive လို့အဆင်ပြေပါတယ်။party ထဲက physical ကောင်တေကိုလဲ dmg တိုးအောင်လုပ်ပေးနိုင်ပါတယ်။magic atk တေကmiss မထတဲ့အတွက် ဘလိုသုံးသုံးထိပါတယ်။\n" +
                "\n" +
                "အားနည်းချက်တေကတော့ spell cast ရင် အထိမခံတာပါ။boss တချက်ရိုက်တာနဲ့ spell ပျက်ပါတယ်။aggro ကလဲများလို့ အရမ်းသတိထားရပါတယ်။ampr သိပ်မရှိပါဘူး။ mp charge ကိုပဲ ဦးစားပေးရပါတယ်။ lvl အနိမ့်ပိုင်းမာ boss ကိုအနီးကပ်ဝင်ရိုက်ရတာတေလဲရှိလို့ အသေကြမ်းပါတယ်။");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္ေတြကေတာ့ dmg မ်ားမ်ားထုတ္ေပးႏိုင္တာပါထို႔အျပင္ support ဘက္ကေနလဲအေထာက္အကူျပဳေပးႏိုင္တာပါ။ mp လဲစိတ္ပူစရာမလိုတာေၾကာင့္ေသသြားတဲ့သူေတကို revive လို႔အဆင္ေျပပါတယ္။party ထဲက physical ေကာင္ေတကိုလဲ dmg တိုးေအာင္လုပ္ေပးႏိုင္ပါတယ္။magic atk ေတကmiss မထတဲ့အတြက္ ဘလိုသုံးသုံးထိပါတယ္။\n" +
                "\n" +
                "အားနည္းခ်က္ေတကေတာ့ spell cast ရင္ အထိမခံတာပါ။boss တခ်က္႐ိုက္တာနဲ႔ spell ပ်က္ပါတယ္။aggro ကလဲမ်ားလို႔ အရမ္းသတိထားရပါတယ္။ampr သိပ္မရွိပါဘူး။ mp charge ကိုပဲ ဦးစားေပးရပါတယ္။ lvl အနိမ့္ပိုင္းမာ boss ကိုအနီးကပ္ဝင္႐ိုက္ရတာေတလဲရွိလို႔ အေသၾကမ္းပါတယ္။");
    }

}
