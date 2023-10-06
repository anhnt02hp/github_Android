package vn.edu.usth.githubbrowser.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import vn.edu.usth.githubbrowser.R;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mNavigationView;
    private ViewPager mViewPager;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        // ánh xạ
        mViewPager = findViewById(R.id.view_pager);
        mNavigationView = findViewById(R.id.bottom_nav);

        setUpViewPager();

        mNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            // tab process
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.action_home:
                        mViewPager.setCurrentItem(0);
                        break;

                    case R.id.action_notification:
                        mViewPager.setCurrentItem(1);
                        break;

                    case R.id.action_explore:
                        mViewPager.setCurrentItem(2);
                        break;
                    case R.id.action_profile:
                        mViewPager.setCurrentItem(3);
                        break;

                }
                return true;
            }
        });

    }

    // Vuốt
    private void setUpViewPager(){

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            //  event processed
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case  0:
                        mNavigationView.getMenu().findItem(R.id.action_home).setChecked(true);
                        break;
                    case  1:
                        mNavigationView.getMenu().findItem(R.id.action_notification).setChecked(true);
                        break;
                    case  2:
                        mNavigationView.getMenu().findItem(R.id.action_explore).setChecked(true);
                        break;
                    case  3:
                        mNavigationView.getMenu().findItem(R.id.action_profile).setChecked(true);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}