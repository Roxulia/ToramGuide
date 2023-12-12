package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptDual extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptDual(Context c, FragmentManager f, int n)
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
                dualT1 bladeT1=new dualT1();
                return bladeT1;
            case 1:
                dualT2 bladeT2=new dualT2();
                return  bladeT2;
            case 2:
                dualT3 bladeT3=new dualT3();
                return bladeT3;
            case 3:
                dualT4 bladeT4=new dualT4();
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
