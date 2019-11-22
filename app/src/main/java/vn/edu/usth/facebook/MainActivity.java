package vn.edu.usth.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private TabItem tbHomePage,tbFriend,tbMessenger,tbNotification,tbMore;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tablayout);
        TabItem tbHomePage = findViewById(R.id.tbHomePage);
        TabItem tbFriend = findViewById(R.id.tbFriend);
        TabItem tbMessenger = findViewById(R.id.tbMessenger);
        TabItem tbNotification = findViewById(R.id.tbNotification);
        TabItem tbMore = findViewById(R.id.tbMore);
        ViewPager viewPager = findViewById(R.id.viewPager);
        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(),1, tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

}
