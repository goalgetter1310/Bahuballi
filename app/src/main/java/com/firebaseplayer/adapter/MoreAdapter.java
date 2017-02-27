package com.firebaseplayer.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebaseplayer.R;
import com.firebaseplayer.databinding.RowMoreItemBinding;
import com.firebaseplayer.databinding.RowNavItemBinding;
import com.firebaseplayer.model.MoreItem;
import com.firebaseplayer.model.NavItem;

import java.util.List;


/**
 * Created by Yudiz on 20/06/16.
 */
public class MoreAdapter extends RecyclerView.Adapter<MoreAdapter.ViewHolder> {

    private Context context;
    private List<MoreItem> moreItems;
    private View.OnClickListener onClickListener;

    public MoreAdapter(Context context, List<MoreItem> moreItems, View.OnClickListener onClickListener) {
        this.context = context;
        this.moreItems = moreItems;
        this.onClickListener = onClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.row_more_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.mBinding.llClick.setTag(position);
        holder.mBinding.llClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickListener != null)
                    onClickListener.onClick(v);
            }
        });
        holder.mBinding.icIcon.setImageResource(moreItems.get(position).getSelectedImageId());
        holder.mBinding.tvTextTitle.setText(moreItems.get(position).getTitle());

    }


    @Override
    public int getItemCount() {
        return moreItems.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        private RowMoreItemBinding mBinding;

        public ViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }
    }


}
