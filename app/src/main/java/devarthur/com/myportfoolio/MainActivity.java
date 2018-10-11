package devarthur.com.myportfoolio;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import devarthur.com.myportfoolio.controller.MainPageAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TextView getInTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MainPageAdapter(getSupportFragmentManager()));

        TabLayout tabs = (TabLayout) findViewById(R.id.tabLayoutID);
        tabs.setupWithViewPager(viewPager);

        getInTouch = (TextView) findViewById(R.id.getInTouch);

        getInTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dial = "tel:" + getString(R.string.mynumber);
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
            }
        });
    }
}
