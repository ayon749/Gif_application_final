package com.example.mushf.final_app;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabAdapter extends FragmentStatePagerAdapter {

    Integer mcounter=3;
    public tabAdapter(FragmentManager fm) {
        super(fm);

    }



    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return  new recent_fragment();

            case 1:
                return new popular_fragment();

            case 2:
                return new favoritfinal();


        }
        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            //
            //Your tab titles
            //
            case 0:return "recent";
            case 1:return "popular";
            case 2: return "favorite";
            default:return null;
        }
    }
}
