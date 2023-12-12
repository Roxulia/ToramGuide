package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptKN extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptKN(Context c, FragmentManager f, int n)
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
                knOverview knOverview=new knOverview();
                return knOverview;
            case 1:
                knStat knStat=new knStat();
                return  knStat;
            case 2:
                knEq knEq=new knEq();
                return knEq;
            case 3:
                knGnb knGnb=new knGnb();
                return knGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
