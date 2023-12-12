package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bsStat extends Fragment {

    static TextView txt1;
    public bsStat()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.bs_stat,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtbsstat1);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("Stat fill ကတော့ player craft ထားတဲ့ equipment တွေထဲကို stat တွေလိုက်ထည့်တာဖြစ်ပါတယ်။stat fill တဲ့အခါ equip တွေမာပါတဲ့ potential အရေးတကြီးလိုအပ်ပါတယ်။\n" +
                "Stat fill တဲ့အခါ limit ရှိပါတယ် ဘလောက်ထိ + ထည့်လို့ရလဲဆိုတာပေါ့ ဥပမာ character ရဲ့ lvl က 100 ဆိုပါစို့ stat ကို dex ထည့်မယ်ဆိုရင် 10ခုထိပဲ ထည့်လို့ရပါတယ် limit ကတော့ lvl ကို 10 နဲ့စားလို့ရတဲ့ဟာပါပဲ stat ကို + stat ထည့်ရင်တော့ pot ကုန်ပီး - stat ထည့်ရင်တော့ ပြန်ရပါတယ် ကြန်ရတဲ့ပမာဏကtechအပေါ်မူတည်ပါတယ် အ့တာကြောင့် refineနဲ့stat fillကိုတခုထဲနဲ့ပေါင်းလုပ်လို့ရပါတယ်။\n" +
                "Stat fillတဲ့အခါမှာဘလို fillရမလဲဆိုတဲ့formulaလိုပါတယ်။အ့တာကတော့ကွကိုယ်ရှာရမှာဖြစ်ပါတယ်။ထို့အပြင် equip  မာပါတဲ့ potential အပေါ်လိုက်ပီး formula တွေပြောင်းသွားပါတယ်။\n" +
                "Stat fill တဲ့ကောင်လုပ်မယ်ဆိုရင်တော့ lvl cap အထိအမြဲတင်ထားမှရမာပါ။");
    }
    public static void zawgyi()
    {
        txt1.setText("Stat fill ကေတာ့ player craft ထားတဲ့ equipment ေတြထဲကို stat ေတြလိုက္ထည့္တာျဖစ္ပါတယ္။stat fill တဲ့အခါ equip ေတြမာပါတဲ့ potential အေရးတႀကီးလိုအပ္ပါတယ္။\n" +
                "Stat fill တဲ့အခါ limit ရွိပါတယ္ ဘေလာက္ထိ + ထည့္လို႔ရလဲဆိုတာေပါ့ ဥပမာ character ရဲ႕ lvl က 100 ဆိုပါစို႔ stat ကို dex ထည့္မယ္ဆိုရင္ 10ခုထိပဲ ထည့္လို႔ရပါတယ္ limit ကေတာ့ lvl ကို 10 နဲ႔စားလို႔ရတဲ့ဟာပါပဲ stat ကို + stat ထည့္ရင္ေတာ့ pot ကုန္ပီး - stat ထည့္ရင္ေတာ့ ျပန္ရပါတယ္ ၾကန္ရတဲ့ပမာဏကtechအေပၚမူတည္ပါတယ္ အ့တာေၾကာင့္ refineနဲ႔stat fillကိုတခုထဲနဲ႔ေပါင္းလုပ္လို႔ရပါတယ္။\n" +
                "Stat fillတဲ့အခါမွာဘလို fillရမလဲဆိုတဲ့formulaလိုပါတယ္။အ့တာကေတာ့ကြကိုယ္ရွာရမွာျဖစ္ပါတယ္။ထို႔အျပင္ equip  မာပါတဲ့ potential အေပၚလိုက္ပီး formula ေတြေျပာင္းသြားပါတယ္။\n" +
                "Stat fill တဲ့ေကာင္လုပ္မယ္ဆိုရင္ေတာ့ lvl cap အထိအၿမဲတင္ထားမွရမာပါ။");
    }

}
