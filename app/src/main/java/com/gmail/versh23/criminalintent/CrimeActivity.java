package com.gmail.versh23.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fr = fm.findFragmentById(R.id.fragment_container);

        if(fr == null) {
            fr = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fr)
                    .commit();
        }
    }
}
