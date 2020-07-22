package com.example.appbanhang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appbanhang.R;
import com.example.appbanhang.model.Sanpham;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SanphamAdapter extends RecyclerView.Adapter<SanphamAdapter.ViewHolderSanpham> {
    Context context;
    ArrayList<Sanpham> arrayListSanpham;

    public SanphamAdapter(Context context, ArrayList<Sanpham> arrayListSanpham) {
        this.context = context;
        this.arrayListSanpham = arrayListSanpham;
    }

    @NonNull
    @Override
    public ViewHolderSanpham onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sanpham_moinhat,null);
        ViewHolderSanpham viewHolderSanpham = new ViewHolderSanpham(v);
        return viewHolderSanpham;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSanpham holder, int position) {
        Sanpham sanpham = arrayListSanpham.get(position);
        holder.txttensanpham.setText(sanpham.getTensanpham());
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        holder.txtgiasanpham.setText("Giá: "+decimalFormat.format(sanpham.getGiasanpham())+"VND");
        Picasso.with(context).load(sanpham.getHinhsanpham())
                .placeholder(R.drawable.ic_baseline_error_outline_24)
                .error(R.drawable.ic_baseline_error_outline_24)
                .into(holder.imghinhSanpham);

    }

    @Override
    public int getItemCount() {
            return arrayListSanpham.size();
    }

    public class ViewHolderSanpham extends RecyclerView.ViewHolder {
        public ImageView imghinhSanpham;
        public TextView txttensanpham, txtgiasanpham;
        public ViewHolderSanpham(@NonNull View itemView) {
            super(itemView);
            imghinhSanpham = itemView.findViewById(R.id.imageviewsanpham);
            txttensanpham = itemView.findViewById(R.id.tvTensanpham);
            txtgiasanpham = itemView.findViewById(R.id.tvGiasanpham);
        }
    }
}
