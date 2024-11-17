package com.example.navigationborjaag;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.navigationborjaag.databinding.ActivityBottomBinding;

public class BottomActivity extends AppCompatActivity {

    ActivityBottomBinding bindingB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((bindingB = ActivityBottomBinding.inflate(getLayoutInflater())).getRoot());

        setSupportActionBar(bindingB.toolbar);

        NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        NavigationUI.setupWithNavController(bindingB.bottomNavView, navController);
        NavigationUI.setupWithNavController(bindingB.toolbar, navController);
    }
}