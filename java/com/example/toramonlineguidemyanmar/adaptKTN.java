package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptKTN extends FragmentPagerAdapter {

    private Context context;
    int totaltab;

    public adaptKTN(Context c, FragmentManager f, int n)
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
                ktnOverview ktnOverview=new ktnOverview();
                return ktnOverview;
            case 1:
                ktnStat ktnStat=new ktnStat();
                return  ktnStat;
            case 2:
                ktnEq ktnEq=new ktnEq();
                return ktnEq;
            case 3:
                ktnGnb ktnGnb=new ktnGnb();
                return ktnGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
