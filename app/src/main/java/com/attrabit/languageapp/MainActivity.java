package com.attrabit.languageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbarID);
//        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.profileID){

//            Toast.makeText(this, "Create a new group", Toast.LENGTH_SHORT).show();
//            getMenuInflater().inflate(R.layout.fragment_profile, this, false);


//            Fragment fragment = new  HomeFragment();
//            FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
//            transaction.replace(R.id.fragmentContainerView, fragment).commit();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentContainerView, new ProfileFragment(), null).commit();
        }
        return true;
//        return super.onOptionsItemSelected(item);
    }
}