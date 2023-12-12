package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptBlade extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptBlade(Context c, FragmentManager f, int n)
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
                bladeT1 bladeT1=new bladeT1();
                return bladeT1;
            case 1:
                bladeT2 bladeT2=new bladeT2();
                return  bladeT2;
            case 2:
                bladeT3 bladeT3=new bladeT3();
                return bladeT3;
            case 3:
                bladeT4 bladeT4=new bladeT4();
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
