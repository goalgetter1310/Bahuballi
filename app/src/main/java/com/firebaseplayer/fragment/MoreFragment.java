package com.firebaseplayer.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.firebaseplayer.R;
import com.firebaseplayer.adapter.AdapterVideoItem;
import com.firebaseplayer.adapter.MoreAdapter;
import com.firebaseplayer.databinding.FrgHomeBinding;
import com.firebaseplayer.databinding.FrgMoreBinding;
import com.firebaseplayer.model.ModelVideoItem;
import com.firebaseplayer.model.MoreItem;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

/**
 * Created by Yudiz on 10/01/17.
 */

public class MoreFragment extends Fragment implements View.OnClickListener {
    private FrgMoreBinding mBinding;
    private ArrayList<MoreItem> moreItems;
    private MoreAdapter moreAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.frg_more, container, false);
        init();
        return mBinding.getRoot();
    }

    private void init() {
        moreItems=new ArrayList<>();
        moreItems.add(new MoreItem("Share The App",R.drawable.ic_share_white));
        moreItems.add(new MoreItem("About Us",R.drawable.ic_people));
        moreItems.add(new MoreItem("Contact Us",R.drawable.ic_phone));
        moreItems.add(new MoreItem("Rate The App",R.drawable.ic_star_white));
        moreItems.add(new MoreItem("Copyright",R.drawable.ic_copyright));
        moreAdapter=new MoreAdapter(getActivity(),moreItems,this);
        mBinding.fragmentMoreRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mBinding.fragmentMoreRv.setAdapter(moreAdapter);

    }


    @Override
    public void onClick(View v) {

    }
}
