package com.gmail.versh23.criminalintent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fr = fm.findFragmentById(R.id.fragment_container);

        if(fr == null) {
            fr = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fr)
                    .commit();
        }
    }
}
