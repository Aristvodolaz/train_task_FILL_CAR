package com.example.train_task_fill_car.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.train_task_fill_car.R;
import com.example.train_task_fill_car.fragment.InfoFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.code) ImageView code;
    @BindView(R.id.info) ImageView info;
    @BindView(R.id.person) ImageView person;
    @Override
    protected void initViews(@Nullable Bundle saveInstanceState) {
        code.setOnClickListener(l->{startActivity(new Intent(this, CameraActivity.class));});
        info.setOnClickListener(l->{replaceFragment(InfoFragment.newInstance(), true);});
        person.setOnClickListener(l->{});
    }

    @Override
    protected int layoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected int titleResId() {
        return 0;
    }

    public void replaceFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, fragment, fragment.getClass().getSimpleName());
        if (addToBackStack) fragmentTransaction.addToBackStack(fragment.getClass().getName());
        fragmentTransaction.commit();
    }
}