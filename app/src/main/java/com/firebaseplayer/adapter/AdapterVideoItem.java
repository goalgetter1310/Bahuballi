package com.firebaseplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebaseplayer.R;
import com.firebaseplayer.model.ModelVideoItem;

import java.util.ArrayList;

public class AdapterVideoItem extends BaseAdapter {

//	private ArrayList<ModelVideoItem> mData = new ArrayList<>(0);
	private Context mContext;
	private ArrayList<ModelVideoItem> videoItems;

	public AdapterVideoItem(Context context, ArrayList<ModelVideoItem> videoItems) {
		mContext = context;
        this.videoItems=videoItems;
	}
	
//	public void setData(ArrayList<ModelVideoItem> data) {
//		mData = data;
//	}
	
	@Override
	public int getCount() {
		return videoItems.size();
	}

	@Override
	public Object getItem(int pos) {
		return pos;
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.row_videos_list, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = (TextView) rowView.findViewById(R.id.label);
            viewHolder.image = (ImageView) rowView
                    .findViewById(R.id.image);
            rowView.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) rowView.getTag();

        holder.image.setImageResource(videoItems.get(position).imageResId);
        holder.text.setText(videoItems.get(position).desc);

		return rowView;
	}


    static class ViewHolder {
        public TextView text;
        public ImageView image;
    }
}