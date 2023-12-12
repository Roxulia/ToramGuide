package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptSTF extends FragmentPagerAdapter {

    private Context context;
    int totaltab;

    public adaptSTF(Context c, FragmentManager f, int n)
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
                stfOverview stfOverview=new stfOverview();
                return stfOverview;
            case 1:
                stfStat stfStat=new stfStat();
                return  stfStat;
            case 2:
                stfEq stfEq=new stfEq();
                return stfEq;
            case 3:
                stfGnb stfGnb=new stfGnb();
                return stfGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
