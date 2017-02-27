package com.firebaseplayer.activity;

import android.Manifest;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import com.example.frisson.FrissonView;
import com.firebaseplayer.R;
import com.firebaseplayer.baseclass.BaseAppCompactActivity;
import com.firebaseplayer.databinding.ActivityProfileBinding;


import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Yudiz on 22/11/16.
 */
public class ProfileActivity extends BaseAppCompactActivity {
    private ActivityProfileBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile);
        ButterKnife.bind(this);
        FrissonView frissonView=new FrissonView(this);


    }










}
