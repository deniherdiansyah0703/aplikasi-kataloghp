package com.project.kataloghp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.project.kataloghp.Realme;

import java.util.ArrayList;

public class RealmeAdapter extends RecyclerView.Adapter<RealmeAdapter.ListViewHolder> {
    private ArrayList<Realme> listRealme;

    private RealmeAdapter.OnItemClickCallback onItemClickCallback;

    public RealmeAdapter(ArrayList<Realme> list){
        this.listRealme = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_realme, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Realme realme = listRealme.get(position);
        Glide.with(holder.itemView.getContext())
                .load(realme.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(realme.getName());
//        holder.prosesor.setText(realme.getProsesor());
//        holder.camera.setText(realme.getCamera());
//        holder.ram.setText(realme.getRam());
//        holder.rom.setText(realme.getRom());
//        holder.tvDetail.setText(realme.getDetail());
//klikked
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listRealme.get(holder.getAdapterPosition()));
            }
        });
    }

    private void into(ImageView imgPhoto) {
    }

    @Override
    public int getItemCount() {
        return listRealme.size();
    }
    //   Klikked
    public void setOnItemClickCallback(RealmeAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Realme data);
    }
    //   Klikked
    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
//        TextView prosesor;
//        TextView camera;
//        TextView ram;
//        TextView rom;
//        TextView tvDetail;


        public ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_realme);
            tvName = itemview.findViewById(R.id.tv_item_name);
//            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}