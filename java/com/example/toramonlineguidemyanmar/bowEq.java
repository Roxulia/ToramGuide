package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class bowEq extends Fragment {

    static TextView txt1;
    public bowEq()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.bow_eq,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtEqBow);

        return v;
    }

    public static void unicode()
    {
        txt1.setText("equipment  အနေနဲ့ကတော့\n" +
                "\n" +
                "bow stat မှာ acccd(or) acdcd ထည့်ပီးဆော့ကြတာများပါတယ် ဒါမဲ့ bow + KTN ဆိုရင်ကတော့ ele bow ကိုင်နိုင်မှကြမ်းမာပါ arrow ဆိုရင်တော့မလိုပါဘူး arrow က element ပေးလို့ပါ\n" +
                "\n" +
                "sub -> ele arrow 6 ချောင်းစုပါ , KTN ဆိုရင်တော့ဘာဖြစ်ဖြစ်အဆင်ပြေပါတယ်\n" +
                "\n" +
                "armor ကတော့ထုံးစံအတိုင်း full CRT ပါ\n" +
                "\n" +
                "additional gear  ကတော့ bear hat,tyrant mask,shaved ice hat,ghost zipper  အသုံးများပါတယ်\n" +
                "\n" +
                "ring အနေနဲ့ကတော့ muscle (or) Dex talisman V,IV သုံးစေချင်ပါတယ်");
    }
    public static void zawgyi()
    {
        txt1.setText("equipment  အေနနဲ႔ကေတာ့\n" +
                "\n" +
                "bow stat မွာ acccd(or) acdcd ထည့္ပီးေဆာ့ၾကတာမ်ားပါတယ္ ဒါမဲ့ bow + KTN ဆိုရင္ကေတာ့ ele bow ကိုင္ႏိုင္မွၾကမ္းမာပါ arrow ဆိုရင္ေတာ့မလိုပါဘူး arrow က element ေပးလို႔ပါ\n" +
                "\n" +
                "sub -> ele arrow 6 ေခ်ာင္းစုပါ , KTN ဆိုရင္ေတာ့ဘာျဖစ္ျဖစ္အဆင္ေျပပါတယ္\n" +
                "\n" +
                "armor ကေတာ့ထုံးစံအတိုင္း full CRT ပါ\n" +
                "\n" +
                "additional gear  ကေတာ့ bear hat,tyrant mask,shaved ice hat,ghost zipper  အသုံးမ်ားပါတယ္\n" +
                "\n" +
                "ring အေနနဲ႔ကေတာ့ muscle (or) Dex talisman V,IV သုံးေစခ်င္ပါတယ္");
    }
}
