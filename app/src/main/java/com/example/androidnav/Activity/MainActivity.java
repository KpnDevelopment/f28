package com.example.androidnav.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.androidnav.Fragment.AcademyFragment;
import com.example.androidnav.Fragment.AssignmentFragment;
import com.example.androidnav.Fragment.Settingsfragment;
import com.example.androidnav.Fragment.ExamFragment;
import com.example.androidnav.Fragment.ProfileFragment;
import com.example.androidnav.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
//interface declaration

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener
{
    BottomNavigationView bottomnav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize & assign variables
        bottomnav = findViewById(R.id.bottomnav);
        //set home select
        bottomnav.setSelectedItemId(R.id.academy);
        loadFragment(new AcademyFragment());
        bottomnav.setOnNavigationItemSelectedListener(this);
        //perform item selector;
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frag_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.profile:
                fragment = new ProfileFragment();
                break;
            case R.id.settings:
                fragment = new Settingsfragment();
                break;
            case R.id.academy:
                fragment = new AcademyFragment();
                break;
            case R.id.assignment:
                fragment = new AssignmentFragment();
                break;
            case R.id.exam:
                fragment = new ExamFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
