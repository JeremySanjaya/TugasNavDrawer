
package com.example.tugasnavdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasnavdrawer.ListData;
import com.example.tugasnavdrawer.fragment.makanan_khas;
import com.example.tugasnavdrawer.fragment.minuman_khas;
import com.example.tugasnavdrawer.R;

import java.util.List;

public class Adapterlist extends RecyclerView.Adapter<Adapterlist.ViewHolder> {

    private List<ListData> datalist;
    private Context context;
    private ItemClickListener mClickListener;

    public Adapterlist(List<ListData> datalist, Context context) {
        this.datalist = datalist;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapterlist.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyle_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterlist.ViewHolder holder, int position) {
        ListData ListData = datalist.get(position);
        holder.textNama.setText(ListData.getNama());
        holder.imageGambar.setImageResource(ListData.getGambar());
    }


    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textNama;
        ImageView imageGambar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textNama = itemView.findViewById(R.id.Textnama);
            imageGambar = itemView.findViewById(R.id.gambar);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    ListData getItem(int id) {
        return datalist.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}