package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptHalberd extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptHalberd(Context c, FragmentManager f, int n)
    {
        super(f);
        context =c;
        totaltab=n;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                halberdT1 bladeT1=new halberdT1();
                return bladeT1;
            case 1:
                halberdT2 bladeT2=new halberdT2();
                return  bladeT2;
            case 2:
                halberdT3 bladeT3=new halberdT3();
                return bladeT3;
            case 3:
                halberdT4 bladeT4=new halberdT4();
                return bladeT4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
