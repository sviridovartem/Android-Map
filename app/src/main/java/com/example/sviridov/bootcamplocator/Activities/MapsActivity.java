package com.example.sviridov.bootcamplocator.Activities;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.sviridov.bootcamplocator.R;
import com.example.sviridov.bootcamplocator.fragments.MainFragment;

public class MapsActivity extends FragmentActivity implements MainFragment.OnMainFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.container_main, mainFragment).commit();
        }


    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }
}
