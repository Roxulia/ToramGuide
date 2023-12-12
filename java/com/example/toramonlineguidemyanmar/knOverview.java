package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class knOverview extends Fragment {

    static TextView txt1;
    public knOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.kn_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvKn);
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
        txt1.setText("knuckle ကေတာ့ toramထဲမွာ အနိမ္ခံရဆုံး class ပါ။သူကေတာ့အနီးကပ္ထိုးရတာျဖစ္ပီး DMG အေနနဲ႔လဲ နဲနဲပဲထြက္တာပါ။stat တခုထဲကေနပဲ dmg ရပီး skill ေတဟာလဲ DMG output နဲတဲ့အထဲပါပါတယ္။ ဒါေပမဲ့ stun,flinch,tumble စတဲ့ ailment ေတအကုန္ cast လို႔ရတာေၾကာင့္ tank အေနနဲ႔အသုံးဝင္ပါတယ္။ knuckle ကလဲ magic device,arrow,shield,dagger ေတကိုsub အျဖစ္ကိုင္လို႔ရပါတယ္။ knuckle + shield ဟာ tank အေနနဲ႔သြားလို႔ရသလို DPS လဲသြားလို႔ရပါတယ္။ magic device နဲ႔တြဲလို႔ရေသာ္လည္း side effect ေတမ်ားပါတယ္။ knuckle ဟာ အေပ်ာ္ေဆာ့လို႔ေကာင္းတဲ့ class ထဲမာပါပါတယ္ aspd လဲျမန္ပါတယ္ safe လဲျဖစ္ပါတယ္။ skill spam ႏိုင္ရင္ေတာ့ rank 1 ကိုယူလို႔ရပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("knuckle ကတော့ toramထဲမှာ အနိမ်ခံရဆုံး class ပါ။သူကတော့အနီးကပ်ထိုးရတာဖြစ်ပီး DMG အနေနဲ့လဲ နဲနဲပဲထွက်တာပါ။stat တခုထဲကနေပဲ dmg ရပီး skill တေဟာလဲ DMG output နဲတဲ့အထဲပါပါတယ်။ ဒါပေမဲ့ stun,flinch,tumble စတဲ့ ailment တေအကုန် cast လို့ရတာကြောင့် tank အနေနဲ့အသုံးဝင်ပါတယ်။ knuckle ကလဲ magic device,arrow,shield,dagger တေကိုsub အဖြစ်ကိုင်လို့ရပါတယ်။ knuckle + shield ဟာ tank အနေနဲ့သွားလို့ရသလို DPS လဲသွားလို့ရပါတယ်။ magic device နဲ့တွဲလို့ရသော်လည်း side effect တေများပါတယ်။ knuckle ဟာ အပျော်ဆော့လို့ကောင်းတဲ့ class ထဲမာပါပါတယ် aspd လဲမြန်ပါတယ် safe လဲဖြစ်ပါတယ်။ skill spam နိုင်ရင်တော့ rank 1 ကိုယူလို့ရပါတယ်။");
    }

}
