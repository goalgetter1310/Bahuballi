package com.firebaseplayer.baseclass;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Yudiz on 22/11/16.
 */
public class BaseFragment extends Fragment {
    BaseAppCompactActivity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (BaseAppCompactActivity) getActivity();
    }


    protected void log(String msg) {
        activity.log(msg);
    }

    protected void toast(String msg) {
        activity.toast(msg);
    }

//    protected void showDialog() {
//        activity.showDialog();
//    }
//
//
//    protected void dismissDialog() {
//        activity.dismissDialog();
//    }

    protected void replaceFragment(Fragment fragment, String title) {
        activity.replaceFragment(fragment, title);
    }

    protected void addFragment(Fragment fragment, String title) {
        activity.addFragment(fragment, title);
    }
    protected void replaceSharedFragment(Fragment first, Fragment second, String title, String[] transiton, View... view) {
        activity.replaceSharedFragment(first,second,title,transiton,view);
    }
}
