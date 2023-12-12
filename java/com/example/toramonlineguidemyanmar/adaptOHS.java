package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptOHS extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptOHS(Context c, FragmentManager f,int n)
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
                ohsOverview ohsOverview=new ohsOverview();
                return ohsOverview;
            case 1:
                ohsStat ohsStat=new ohsStat();
                return  ohsStat;
            case 2:
                ohsEq ohsEq=new ohsEq();
                return ohsEq;
            case 3:
                ohsGnb ohsGnb=new ohsGnb();
                return ohsGnb;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }
}
