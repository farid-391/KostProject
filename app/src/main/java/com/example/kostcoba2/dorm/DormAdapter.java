package com.example.kostcoba2.dorm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kostcoba2.R;

import java.util.ArrayList;

public class DormAdapter extends ArrayAdapter<DormModel> implements View.OnClickListener{
    private ArrayList<DormModel> dataSet;
    private final Context mContext;

    public static class ViewHolder {
        public TextView txtDormName;
        public TextView txtDormLocation;
        public ImageView imgDorm;
    }

    public DormAdapter(ArrayList<DormModel> data, Context context) {
        super(context, -1, data);
        this.dataSet = data;
        this.mContext=context;
    }

    @Override
    public void onClick(View v) {
        int position=(Integer) v.getTag();
        final Object object= getItem(position);
        final DormModel dataModel = (DormModel)object;
    }

    @Override
    public int getViewTypeCount() {
        return super.getCount();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final DormModel dataModel = getItem(position);
        final DormAdapter.ViewHolder viewHolder;
        final LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final View result;
        String desc = dataModel.getLocation();

        if (convertView == null) {
            viewHolder = new DormAdapter.ViewHolder();
            convertView = inflater.inflate(R.layout.list_dorm, parent, false);
            viewHolder.txtDormName = (TextView) convertView.findViewById(R.id.firstLine);
            viewHolder.txtDormLocation = (TextView) convertView.findViewById(R.id.secondLine);
            viewHolder.imgDorm = (ImageView) convertView.findViewById(R.id.image_dorm);
            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (DormAdapter.ViewHolder) convertView.getTag();
            result = convertView;
        }

        lastPosition = position;
        viewHolder.txtDormName.setText(dataModel.getDormName());
        viewHolder.txtDormLocation.setText(dataModel.getLocation());
        viewHolder.imgDorm.setImageResource(dataModel.getImage());
        viewHolder.imgDorm.setOnClickListener(this);
        viewHolder.imgDorm.setTag(position);

        return convertView;
    }
}