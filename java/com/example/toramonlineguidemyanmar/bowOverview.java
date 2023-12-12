package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.MainActivity;
import com.example.toramonlineguidemyanmar.R;

public class bowOverview extends Fragment {

    static TextView txt1;
    public bowOverview()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle savedInstanceState)
    {
        View v= lif.inflate(R.layout.bow_overview,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtOvBow);
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
        txt1.setText("bow ကေတာ့ ေတာ္ေတာ္မ်ားမ်ားကိုင္ၾကတဲ့ class ပါ။ အေဝးကေနေညႇာ္လို႔ရလို႔ပါ ။DMG output လဲ အေကာင္းဆုံး class ျဖစ္ပါတယ္ skill တေခါက္သုံးရင္ mini boss တေကာင္ေပ်ာက္ေလာက္ေအာင္ထိၾကမ္းပါတယ္။ bow ကို ပုံမွန္အားျဖင့္ arrow ကို sub ထည့္ပီးေဆာ့ၾကပါတယ္ တခ်ိဳ႕ကေတာ့ katana ထည့္ပီး ML ထဲက YSS လိုေဆာ့ၾကပါတယ္။\n" +
                "bow က arrow ကေန buff အျပည့္ရပါတယ္။ bow ရဲ႕ skill ေတကလဲ aggro ထြက္တာမ်ားပါတယ္ သို႔ေသာ္ aggro ေဖ်ာက္ေပးတဲ့ skill လဲထည့္ေပးထားတာေၾကာင့္ အဆင္ေျပပါတယ္။ bow + arrow ကေတာ့ burst DMG type ျဖစ္ပီး bow + KTN ကေတာ့ burst/ reap ပါ ။ party ေတမွာလူေခၚမ်ားတဲ့ေကာင္လဲျဖစ္ပါတယ္ ထို႔အျပင္ အေဝးမွာေနရတာဆိုေတာ့ safe လဲျဖစ္ပါတယ္ ။ပုံမွန္ oldie ေတrecommend ေပးေလ့ရွိတဲ့ class လဲျဖစ္ပါတယ္။");
    }

    public static void unicode()
    {
        txt1.setText("bow ကတော့ တော်တော်များများကိုင်ကြတဲ့ class ပါ။ အဝေးကနေညှော်လို့ရလို့ပါ ။DMG output လဲ အကောင်းဆုံး class ဖြစ်ပါတယ် skill တခေါက်သုံးရင် mini boss တကောင်ပျောက်လောက်အောင်ထိကြမ်းပါတယ်။ bow ကို ပုံမှန်အားဖြင့် arrow ကို sub ထည့်ပီးဆော့ကြပါတယ် တချို့ကတော့ katana ထည့်ပီး ML ထဲက YSS လိုဆော့ကြပါတယ်။\n" +
                "bow က arrow ကနေ buff အပြည့်ရပါတယ်။ bow ရဲ့ skill တေကလဲ aggro ထွက်တာများပါတယ် သို့သော် aggro ဖျောက်ပေးတဲ့ skill လဲထည့်ပေးထားတာကြောင့် အဆင်ပြေပါတယ်။ bow + arrow ကတော့ burst DMG type ဖြစ်ပီး bow + KTN ကတော့ burst/ reap ပါ ။ party တေမှာလူခေါ်များတဲ့ကောင်လဲဖြစ်ပါတယ် ထို့အပြင် အဝေးမှာနေရတာဆိုတော့ safe လဲဖြစ်ပါတယ် ။ပုံမှန် oldie တေrecommend ပေးလေ့ရှိတဲ့ class လဲဖြစ်ပါတယ်။");
    }
}
