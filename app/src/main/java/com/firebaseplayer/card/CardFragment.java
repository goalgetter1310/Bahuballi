package com.firebaseplayer.card;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebaseplayer.R;
import com.firebaseplayer.model.CardDataItem;


/**
 * 卡片Fragment
 *
 * @author xmuSistone
 */
@SuppressLint({"HandlerLeak", "NewApi", "InflateParams"})
public class CardFragment extends Fragment {

    private CardSlidePanel.CardSwitchListener cardSwitchListener;

    private String imagePaths[] = {"abc", "abc", "abc", "abc", "abc", "abc", "abc",
            "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc"}; // 24个图片资源名称

    private String names[] = {"abc", "abc", "abc", "abc", "abc", "abc", "abc",
            "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc", "abc"};
    private List<CardDataItem> dataList = new ArrayList<CardDataItem>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_layout, null);
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        CardSlidePanel slidePanel = (CardSlidePanel) rootView
                .findViewById(R.id.image_slide_panel);
        cardSwitchListener = new CardSlidePanel.CardSwitchListener() {

            @Override
            public void onShow(int index) {
                Log.d("CardFragment",   dataList.get(index).userName);
            }

            @Override
            public void onCardVanish(int index, int type) {
                Log.d("CardFragment",  dataList.get(index).userName + " type=" + type);
            }

            @Override
            public void onItemClick(View cardView, int index) {
                Log.d("CardFragment",  dataList.get(index).userName);
            }
        };
        slidePanel.setCardSwitchListener(cardSwitchListener);

        prepareDataList();
        slidePanel.fillData(dataList);
    }

    private void prepareDataList() {
        int num = imagePaths.length;

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < num; i++) {
                CardDataItem dataItem = new CardDataItem();
                dataItem.userName = names[i];
                dataItem.imagePath = imagePaths[i];
                dataItem.likeNum = (int) (Math.random() * 10);
                dataItem.imageNum = (int) (Math.random() * 6);
                dataList.add(dataItem);
            }
        }
    }

}
