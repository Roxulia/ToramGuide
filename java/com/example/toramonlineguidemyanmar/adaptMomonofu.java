package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptMomonofu extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptMomonofu(Context c, FragmentManager f, int n)
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
                momonofuT1 bladeT1=new momonofuT1();
                return bladeT1;
            case 1:
                momonofuT2 bladeT2=new momonofuT2();
                return  bladeT2;
            case 2:
                momonofuT3 bladeT3=new momonofuT3();
                return bladeT3;
            case 3:
                momonofuT4 bladeT4=new momonofuT4();
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
