package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptDW extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptDW(Context c, FragmentManager f, int n)
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
                dwOverview dwOverview=new dwOverview();
                return dwOverview;
            case 1:
                dwStat dwStat=new dwStat();
                return  dwStat;
            case 2:
                dwEq dwEq=new dwEq();
                return dwEq;
            case 3:
                dwGnb dwGnb=new dwGnb();
                return dwGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
