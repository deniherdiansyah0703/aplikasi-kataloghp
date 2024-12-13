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
import com.project.kataloghp.Samsung;

import java.util.ArrayList;

public class SamsungAdapter extends RecyclerView.Adapter<SamsungAdapter.ListViewHolder> {
    private ArrayList<Samsung> listSamsung;

    private SamsungAdapter.OnItemClickCallback onItemClickCallback;

    public SamsungAdapter(ArrayList<Samsung> list){
        this.listSamsung = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_samsung, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Samsung samsung = listSamsung.get(position);
        Glide.with(holder.itemView.getContext())
                .load(samsung.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(samsung.getName());
//        holder.prosesor.setText(samsung.getProsesor());
//        holder.camera.setText(samsung.getCamera());
//        holder.ram.setText(samsung.getRam());
//        holder.rom.setText(samsung.getRom());
//        holder.tvDetail.setText(samsung.getDetail());
//klikked
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listSamsung.get(holder.getAdapterPosition()));
            }
        });
    }

    private void into(ImageView imgPhoto) {
    }

    @Override
    public int getItemCount() {
        return listSamsung.size();
    }
    //   Klikked
    public void setOnItemClickCallback(SamsungAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Samsung data);
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
            imgPhoto = itemview.findViewById(R.id.img_item_samsung);
            tvName = itemview.findViewById(R.id.tv_item_name);
//            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}