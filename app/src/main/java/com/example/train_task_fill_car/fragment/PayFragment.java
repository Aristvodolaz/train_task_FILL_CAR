package com.example.train_task_fill_car.fragment;

import android.os.Bundle;

public class PayFragment extends BaseFragment{

    private String colonka;

    public PayFragment(String colonka) {
        this.colonka = colonka;
    }

    public static PayFragment newInstance(String colonka) {
        PayFragment fragment = new PayFragment(colonka);
        return fragment;
    }
    @Override
    protected int layoutId() {
        return 0;
    }
}
