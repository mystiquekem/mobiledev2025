package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        ViewPager viewPager = findViewById(R.id.view_pager);
        Adapter adapter = new Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherAct", "Destroy called. ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherAct", "Resume called. ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherAct", "Pause called. ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherAct", "Stop called. ");
    }
}
