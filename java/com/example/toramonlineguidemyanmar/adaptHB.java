package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptHB extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptHB(Context c, FragmentManager f, int n)
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
                hbOverview hbOverview=new hbOverview();
                return hbOverview;
            case 1:
                hbStat hbStat=new hbStat();
                return  hbStat;
            case 2:
                hbEq hbEq=new hbEq();
                return hbEq;
            case 3:
                hbGnb hbGnb=new hbGnb();
                return hbGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
