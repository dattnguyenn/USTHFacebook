package vn.edu.usth.facebook;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;
    PageAdapter(@NonNull FragmentManager fm, int behavior ,int numOfTabs)
    {
        super(fm, behavior);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new HomeFragment();
            case 1:
                return new FriendFragment();
            case 2:
                return new MessengerFragment();
            case 3:
                return new NotificationFragment();
            case 4:
                return new MoreFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return numOfTabs;
    }

}
