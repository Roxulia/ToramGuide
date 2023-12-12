package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.MainActivity;
import com.example.toramonlineguidemyanmar.R;

public class ohsOverview extends Fragment {

    static TextView txt1;
    public ohsOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.ohs_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvOhs);
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
        txt1.setText("ohs (one handed sword) ဟာ sword class ထဲမာ play style မ်ားမ်ားနဲ႔ေဆာ့လို႔ရတဲ့ class ပါ။\n" +
                "sub weapon ေနရာမာ shield,magic device,knuckle,dagger,arrow အျပင္ ေနာက္ထပ္ ohs တေခ်ာင္းတပ္ပီး dual sword  class အေနနဲ႔သြားလို႔ရပါတယ္ \n" +
                "ပုံမွန္အားျဖင့္ ohs ကို shield နဲ႔တြဲပီး tank အေနနဲ႔ေဆာ့ၾကတာမ်ားပါတယ္ ohs skill ေတာ္ေတာ္မ်ားမ်ားဟာ aggro မ်ားမ်ားထုတ္ေပးႏိုင္လို႔ပါ\n" +
                "ဒါ့အျပင္ dagger,knuckle ေတနဲ႔တြဲပီးလဲ သူတိူ႔နဲ႔ဆိုင္တဲ့ DPS skill ေတကိုပါ spam ႏိုင္တာေၾကာင့္ dmg outputမ်ားမ်ားထြက္ေအာင္လဲေဆာ့လို႔ရပါတယ္\n" +
                "lvl ပိုမ်ားလာေလပိုၾကမ္းလာေလပါ stability လဲ အျပည့္ရွိတာမို႔ DMG နဲသြားမာလဲစိုးရမ္စရာမလိုပါဘူး\n" +
                "magic device နဲ႔တြဲပီးေတာ့လဲ magic swordman ပုံစံသြားလို႔ရပါေသးတယ္");
    }

    public static void unicode()
    {
        txt1.setText("ohs (one handed sword) ဟာ sword class ထဲမာ play style များများနဲ့ဆော့လို့ရတဲ့ class ပါ။\n" +
                "sub weapon နေရာမာ shield,magic device,knuckle,dagger,arrow အပြင် နောက်ထပ် ohs တချောင်းတပ်ပီး dual sword  class အနေနဲ့သွားလို့ရပါတယ် \n" +
                "ပုံမှန်အားဖြင့် ohs ကို shield နဲ့တွဲပီး tank အနေနဲ့ဆော့ကြတာများပါတယ် ohs skill တော်တော်များများဟာ aggro များများထုတ်ပေးနိုင်လို့ပါ\n" +
                "ဒါ့အပြင် dagger,knuckle တေနဲ့တွဲပီးလဲ သူတိူ့နဲ့ဆိုင်တဲ့ DPS skill တေကိုပါ spam နိုင်တာကြောင့် dmg outputများများထွက်အောင်လဲဆော့လို့ရပါတယ်\n" +
                "lvl ပိုများလာလေပိုကြမ်းလာလေပါ stability လဲ အပြည့်ရှိတာမို့ DMG နဲသွားမာလဲစိုးရမ်စရာမလိုပါဘူး\n" +
                "magic device နဲ့တွဲပီးတော့လဲ magic swordman ပုံစံသွားလို့ရပါသေးတယ်");
    }
}
