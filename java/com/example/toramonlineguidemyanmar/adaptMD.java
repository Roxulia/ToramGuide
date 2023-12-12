package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptMD extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptMD(Context c, FragmentManager f, int n)
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
                mdOverview mdOverview=new mdOverview();
                return mdOverview;
            case 1:
                mdStat mdStat=new mdStat();
                return  mdStat;
            case 2:
                mdEq mdEq=new mdEq();
                return mdEq;
            case 3:
                mdGnb mdGnb=new mdGnb();
                return mdGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }
}
