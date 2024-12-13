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
import com.project.kataloghp.Oppo;

import java.util.ArrayList;

public class OppoAdapter extends RecyclerView.Adapter<OppoAdapter.ListViewHolder> {
    private ArrayList<Oppo> listOppo;

    private OppoAdapter.OnItemClickCallback onItemClickCallback;

    public OppoAdapter(ArrayList<Oppo> list){
        this.listOppo = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_oppo, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Oppo oppo = listOppo.get(position);
        Glide.with(holder.itemView.getContext())
                .load(oppo.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(oppo.getName());
//        holder.prosesor.setText(oppo.getProsesor());
//        holder.camera.setText(oppo.getCamera());
//        holder.ram.setText(oppo.getRam());
//        holder.rom.setText(oppo.getRom());
//        holder.tvDetail.setText(oppo.getDetail());
//klikked
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listOppo.get(holder.getAdapterPosition()));
            }
        });
    }

    private void into(ImageView imgPhoto) {
    }

    @Override
    public int getItemCount() {
        return listOppo.size();
    }
    //   Klikked
    public void setOnItemClickCallback(OppoAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Oppo data);
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
            imgPhoto = itemview.findViewById(R.id.img_item_oppo);
            tvName = itemview.findViewById(R.id.tv_item_name);
//            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}