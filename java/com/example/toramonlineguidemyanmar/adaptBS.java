package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptBS extends FragmentPagerAdapter {

    private Context context;
    int totaltab;

    public adaptBS(Context c, FragmentManager f, int n)
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
                bsCraft bsCraft=new bsCraft();
                return bsCraft;
            case 1:
                bsRef bsRef=new bsRef();
                return  bsRef;
            case 2:
                bsStat bsStat=new bsStat();
                return bsStat;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
