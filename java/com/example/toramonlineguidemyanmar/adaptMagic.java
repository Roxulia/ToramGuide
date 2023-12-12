package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptMagic extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptMagic(Context c, FragmentManager f, int n)
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
                magicT1 bladeT1=new magicT1();
                return bladeT1;
            case 1:
                magicT2 bladeT2=new magicT2();
                return  bladeT2;
            case 2:
                magicT3 bladeT3=new magicT3();
                return bladeT3;
            case 3:
                magicT4 bladeT4=new magicT4();
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
