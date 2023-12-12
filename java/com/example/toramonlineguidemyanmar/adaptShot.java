package com.example.toramonlineguidemyanmar;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adaptShot extends FragmentPagerAdapter {
    private Context context;
    int totaltab;

    public adaptShot(Context c, FragmentManager f, int n)
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
                shotT1 bladeT1=new shotT1();
                return bladeT1;
            case 1:
                shotT2 bladeT2=new shotT2();
                return  bladeT2;
            case 2:
                shotT3 bladeT3=new shotT3();
                return bladeT3;
            case 3:
                shotT4 bladeT4=new shotT4();
                return bladeT4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }

}
