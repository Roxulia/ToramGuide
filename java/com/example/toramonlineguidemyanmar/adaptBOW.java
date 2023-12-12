package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptBOW extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptBOW(Context c, FragmentManager f, int n)
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
                bowOverview bowOverview=new bowOverview();
                return bowOverview;
            case 1:
                bowStat bowStat=new bowStat();
                return  bowStat;
            case 2:
                bowEq bowEq=new bowEq();
                return bowEq;
            case 3:
                bowGnb bowGnb=new bowGnb();
                return bowGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }
}
