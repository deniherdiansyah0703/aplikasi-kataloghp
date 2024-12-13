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
import com.project.kataloghp.Vivo;

import java.util.ArrayList;

public class VivoAdapter extends RecyclerView.Adapter<VivoAdapter.ListViewHolder> {
    private ArrayList<Vivo> listVivo;

    private VivoAdapter.OnItemClickCallback onItemClickCallback;

    public VivoAdapter(ArrayList<Vivo> list){
        this.listVivo = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_vivo, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Vivo vivo = listVivo.get(position);
        Glide.with(holder.itemView.getContext())
                .load(vivo.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(vivo.getName());
//        holder.prosesor.setText(vivo.getProsesor());
//        holder.camera.setText(vivo.getCamera());
//        holder.ram.setText(vivo.getRam());
//        holder.rom.setText(vivo.getRom());
//        holder.tvDetail.setText(vivo.getDetail());
//klikked
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listVivo.get(holder.getAdapterPosition()));
            }
        });
    }

    private void into(ImageView imgPhoto) {
    }

    @Override
    public int getItemCount() {
        return listVivo.size();
    }
    //   Klikked
    public void setOnItemClickCallback(VivoAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Vivo data);
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
            imgPhoto = itemview.findViewById(R.id.img_item_vivo);
            tvName = itemview.findViewById(R.id.tv_item_name);
//            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}