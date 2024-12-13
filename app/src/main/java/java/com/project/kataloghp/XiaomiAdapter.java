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
import com.project.kataloghp.Xiaomi;

import java.util.ArrayList;

public class XiaomiAdapter extends RecyclerView.Adapter<XiaomiAdapter.ListViewHolder> {
    private ArrayList<Xiaomi> listXiaomi;

    private XiaomiAdapter.OnItemClickCallback onItemClickCallback;

    public XiaomiAdapter(ArrayList<Xiaomi> list){
        this.listXiaomi = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_xiaomi, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Xiaomi xiaomi = listXiaomi.get(position);
        Glide.with(holder.itemView.getContext())
                .load(xiaomi.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(xiaomi.getName());
//        holder.prosesor.setText(xiaomi.getProsesor());
//        holder.camera.setText(xiaomi.getCamera());
//        holder.ram.setText(xiaomi.getRam());
//        holder.rom.setText(xiaomi.getRom());
//        holder.tvDetail.setText(xiaomi.getDetail());
//klikked
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listXiaomi.get(holder.getAdapterPosition()));
            }
        });
    }

    private void into(ImageView imgPhoto) {
    }

    @Override
    public int getItemCount() {
        return listXiaomi.size();
    }
    //   Klikked
    public void setOnItemClickCallback(XiaomiAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Xiaomi data);
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
            imgPhoto = itemview.findViewById(R.id.img_item_xiaomi);
            tvName = itemview.findViewById(R.id.tv_item_name);
//            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}