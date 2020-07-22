package com.example.appbanhang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appbanhang.R;
import com.example.appbanhang.model.Loaisp;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LoaiSpAdapter extends BaseAdapter {
    ArrayList<Loaisp> arrayListLoaiSp;
    Context context;

    public LoaiSpAdapter(ArrayList<Loaisp> arrayListLoaiSp, Context context) {
        this.arrayListLoaiSp = arrayListLoaiSp;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayListLoaiSp.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListLoaiSp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public class ViewHolder{
        TextView txtLoaiSp;
        ImageView imgloaiSp;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_loaisp,null);
            viewHolder.txtLoaiSp = convertView.findViewById(R.id.tvLoaisp);
            viewHolder.imgloaiSp = convertView.findViewById(R.id.imgLoaiSp);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Loaisp loaisp = (Loaisp) getItem(position);
        viewHolder.txtLoaiSp.setText(loaisp.getTenLoaiSp());
        Picasso.with(context).load(loaisp.getHinhanhSp() )
                .placeholder(R.drawable.ic_baseline_error_outline_24)
                .error(R.drawable.ic_baseline_error_outline_24)
                .into(viewHolder.imgloaiSp);
        viewHolder.txtLoaiSp.setText(loaisp.getTenLoaiSp());
        return convertView;
    }
}

