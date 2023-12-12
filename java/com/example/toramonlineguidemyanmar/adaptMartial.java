package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptMartial extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptMartial(Context c, FragmentManager f, int n)
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
                martialT1 bladeT1=new martialT1();
                return bladeT1;
            case 1:
                martialT2 bladeT2=new martialT2();
                return  bladeT2;
            case 2:
                martialT3 bladeT3=new martialT3();
                return bladeT3;
            case 3:
                martialT4 bladeT4=new martialT4();
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
