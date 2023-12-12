package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptBWG extends FragmentPagerAdapter {

    private Context context;
    int totaltab;

    public adaptBWG(Context c, FragmentManager f, int n)
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
                bwgOverview bwgOverview=new bwgOverview();
                return bwgOverview;
            case 1:
                bwgStat bwgStat=new bwgStat();
                return  bwgStat;
            case 2:
                bwgEq bwgEq=new bwgEq();
                return bwgEq;
            case 3:
                bwgGnb bwgGnb=new bwgGnb();
                return bwgGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }
}
