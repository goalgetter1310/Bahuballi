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
import com.firebaseplayer.databinding.RowNavItemBinding;
import com.firebaseplayer.model.NavItem;

import java.util.List;


/**
 * Created by Yudiz on 20/06/16.
 */
public class NavItemAdapter extends RecyclerView.Adapter<NavItemAdapter.ViewHolder> {

    private Context context;
    private List<NavItem> navItems;
    private View.OnClickListener onClickListener;
    private int selector = -1;

    public NavItemAdapter(Context context, List<NavItem> navItems, View.OnClickListener onClickListener) {
        this.context = context;
        this.navItems = navItems;
        this.onClickListener = onClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.row_nav_item, parent, false);
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
        holder.mBinding.icIcon.setImageResource(navItems.get(position).getSelectedImageId());
        holder.mBinding.tvTextTitle.setText(navItems.get(position).getTitle());
        if (selector == position) {
            holder.mBinding.llClick.setBackgroundColor(context.getResources().getColor(R.color.lightcolorPrimary));

            holder.mBinding.tvTextTitle.setTextColor(ContextCompat.getColor(context,R.color.colorPrimary));
            holder.mBinding.icIcon.setColorFilter(ContextCompat.getColor(context,R.color.colorPrimary));

        } else {
            holder.mBinding.tvTextTitle.setTextColor(Color.GRAY);
            holder.mBinding.icIcon.setColorFilter(Color.GRAY);
            holder.mBinding.llClick.setBackgroundColor(Color.TRANSPARENT);

        }
    }


    @Override
    public int getItemCount() {
        return navItems.size();
    }

    public void setSelector(int selector) {
        this.selector = selector;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private RowNavItemBinding mBinding;

        public ViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }
    }


}
