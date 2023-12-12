package com.example.toramonlineguidemyanmar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.toramonlineguidemyanmar.R;

public class thsGnB extends Fragment {

    static TextView txt1;
    public thsGnB()
    {

    }

    @Override
    public View onCreateView(LayoutInflater lif, ViewGroup vg, Bundle b)
    {
        View v= lif.inflate(R.layout.ths_gnb,vg,false);
        txt1=(TextView)v.findViewById(R.id.txtGnbThs);
        return v;
    }


    public static void unicode()
    {
        txt1.setText("အားသာချက်အနေနဲ့ကတော့ ပြောခဲ့ပြီးသလိုပါပဲ Damage output ကလဲ 300k ကနေ 1m, 1.2m အစရှိတဲ့ Damage တွေထိထုတ်နိုင်သလို၊ Skill Animation ကလဲ တခြား Weapon class တွေလိုအချိန်စောင့်စရာမလို ဆက်တိုက် Spam နိုင်ပါတယ်။ Aggro generate လဲကောင်းတဲ့အတွက် Semi Tank ဆော့နိုင်ပြီး Team အတွက် Tank လိုအသုံး၀င်တဲ့ Class ဖြစ်ပြီး AOE Damage တချို့ကိုလဲ အတော်အတန်ခံနိုင်ပါသေးတယ်။ (Venena လေဆာတန်းလို၊ Blue AoE လိုခေါင်းခွဲခံရတာတွေတော့ မပါဘူးပေါ့)\n" +
                "\n" +
                "အားနည်းချက်အနေနဲ့ကတော့ Light Armor(Remodel) တောင်မှ Aspd မရှိတာပါ။ အဲ့အတွက် MP recover လုပ်ဖို့ အနည်းငယ်ခက်ပါတဲ့အတွက် Giga speed potion လို Aspd buff ကိုတွဲရပါတယ်။ (မတွဲသုံးလဲ ရပါတယ်)");
    }

    public static void zawgyi()
    {
        txt1.setText("အားသာခ်က္အေနနဲ႔ကေတာ့ ေျပာခဲ့ၿပီးသလိုပါပဲ Damage output ကလဲ 300k ကေန 1m, 1.2m အစရွိတဲ့ Damage ေတြထိထုတ္ႏိုင္သလို၊ Skill Animation ကလဲ တျခား Weapon class ေတြလိုအခ်ိန္ေစာင့္စရာမလို ဆက္တိုက္ Spam ႏိုင္ပါတယ္။ Aggro generate လဲေကာင္းတဲ့အတြက္ Semi Tank ေဆာ့ႏိုင္ၿပီး Team အတြက္ Tank လိုအသုံး၀င္တဲ့ Class ျဖစ္ၿပီး AOE Damage တခ်ိဳ႕ကိုလဲ အေတာ္အတန္ခံႏိုင္ပါေသးတယ္။ (Venena ေလဆာတန္းလို၊ Blue AoE လိုေခါင္းခြဲခံရတာေတြေတာ့ မပါဘူးေပါ့)\n" +
                "\n" +
                "အားနည္းခ်က္အေနနဲ႔ကေတာ့ Light Armor(Remodel) ေတာင္မွ Aspd မရွိတာပါ။ အဲ့အတြက္ MP recover လုပ္ဖို႔ အနည္းငယ္ခက္ပါတဲ့အတြက္ Giga speed potion လို Aspd buff ကိုတြဲရပါတယ္။ (မတြဲသုံးလဲ ရပါတယ္)");
    }
}
