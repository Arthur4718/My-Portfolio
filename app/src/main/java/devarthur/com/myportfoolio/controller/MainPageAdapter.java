package devarthur.com.myportfoolio.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import devarthur.com.myportfoolio.views.AboutFragment;
import devarthur.com.myportfoolio.views.ContactFragment;
import devarthur.com.myportfoolio.views.SkillsFragment;
import devarthur.com.myportfoolio.views.WorkFragment;

public class MainPageAdapter extends FragmentPagerAdapter {
    public MainPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0: return "About";
            case 1: return "Work";
            case 2: return "Skills";
            case 3: return "Contact";



        }
        return null;
    }
}
