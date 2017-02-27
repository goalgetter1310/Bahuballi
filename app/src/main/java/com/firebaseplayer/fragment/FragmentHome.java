package com.firebaseplayer.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
import com.firebaseplayer.databinding.FrgHomeBinding;
import com.firebaseplayer.model.ModelVideoItem;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

/**
 * Created by Yudiz on 10/01/17.
 */

public class FragmentHome extends Fragment {
    private FrgHomeBinding mBinding;
    private ArrayList<ModelVideoItem> videoItems;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.frg_home, container, false);
        init();
        return mBinding.getRoot();
    }

    private void init() {
        videoItems = new ArrayList<>();
        videoItems.add(new ModelVideoItem(R.drawable.image1, "AAA","AAhvhghghhgh hghghhjh hghghghghghgjg jgjhghjgh hjgjhghgj jgjhghjghg ghA"));
        videoItems.add(new ModelVideoItem(R.drawable.image1, "BBB","hello all"));
        videoItems.add(new ModelVideoItem(R.drawable.image1, "CCC","hello all"));
        videoItems.add(new ModelVideoItem(R.drawable.image1, "DDD","hello all"));

        mBinding.title.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(getActivity());
                TextView textView = (TextView) inflater.inflate(R.layout.item_title, null);
                return textView;
            }
        });
        Animation in = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_out_bottom);
        mBinding.title.setInAnimation(in);
        mBinding.title.setOutAnimation(out);

        mBinding.coverflow.setAdapter(new AdapterVideoItem(getActivity(), videoItems));
        mBinding.coverflow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),
                        videoItems.get(position).titleResId,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mBinding.coverflow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                Log.d("TAG", "set title " + videoItems.get(position).titleResId);
                mBinding.title.setText(videoItems.get(position).titleResId);
            }

            @Override
            public void onScrolling() {
                mBinding.title.setText("");
            }
        });
    }
}
