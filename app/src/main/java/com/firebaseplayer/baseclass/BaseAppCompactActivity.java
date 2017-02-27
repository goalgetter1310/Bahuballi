package com.firebaseplayer.baseclass;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.firebaseplayer.utility.Utility;


/**
 * Created by Yudiz on 22/11/16.
 */
public class BaseAppCompactActivity extends AppCompatActivity {
//    private ProgressBarDialog progressBarDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        progressBarDialog = new ProgressBarDialog(this);
    }

    protected void log(String msg) {
        Utility.log(msg);
    }

    protected void toast(String msg) {
        Utility.toast(getApplicationContext(), msg);
    }

//    public void showDialog() {
//        progressBarDialog.showDialog();
//    }
//
//    public void dismissDialog() {
//        progressBarDialog.dismissDialog();
//    }

    protected void replaceFragment(Fragment mFragment, String title) {
    }


    protected void addFragment(Fragment mFragment, String title) {
    }



    protected void replaceSharedFragment(Fragment first, Fragment second, String title, String[] transiton, View... view) {
    }

}
