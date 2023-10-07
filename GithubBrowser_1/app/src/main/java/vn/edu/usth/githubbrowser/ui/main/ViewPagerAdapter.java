package vn.edu.usth.githubbrowser.ui.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import vn.edu.usth.githubbrowser.fragment.main.ExploreFragment;
import vn.edu.usth.githubbrowser.fragment.main.HomeFragment;
import vn.edu.usth.githubbrowser.fragment.subs.NotificationFragment;
import vn.edu.usth.githubbrowser.fragment.main.ProfileFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new NotificationFragment();
            case 2: return new ExploreFragment();
            case 3: return new ProfileFragment();
            default: return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
