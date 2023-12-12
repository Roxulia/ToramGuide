package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptTHS extends FragmentPagerAdapter{
    private Context thsContext;
    int totaltab;

    public adaptTHS(Context c, FragmentManager f,int n)
    {
        super(f);
        thsContext=c;
        totaltab=n;
    }
    @Override
    public Fragment getItem(int p)
    {
        switch(p)
        {
            case 0:
                thsOverview thsOverview=new thsOverview();
                return thsOverview;
            case 1:
                thsStat thsStat=new thsStat();
                return thsStat;
            case 2:
                thsEq thsEq=new thsEq();
                return thsEq;
            case 3:
                thsGnB thsGnB=new thsGnB();
                return thsGnB;
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return totaltab;
    }
}
