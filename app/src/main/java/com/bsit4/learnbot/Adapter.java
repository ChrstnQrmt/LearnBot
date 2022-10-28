package com.bsit4.learnbot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<ModelClass> arrayList;
    Context context;


    public Adapter(ArrayList<ModelClass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_design, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.t_title.setText(arrayList.get(position).title);
        holder.t_desc.setText(arrayList.get(position).description);

        holder.t_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arrayList.get(position).isVisible)
                {
                    holder.t_desc.setVisibility(View.GONE);
                    holder.rl_desc_line.setVisibility(View.GONE);
                    holder.rl_title_line.setVisibility(View.VISIBLE);
                    arrayList.get(position).isVisible=false;
                }
                else
                {
                    holder.t_desc.setVisibility(View.VISIBLE);
                    holder.rl_desc_line.setVisibility(View.VISIBLE);
                    holder.rl_title_line.setVisibility(View.GONE);
                    arrayList.get(position).isVisible=true;

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView t_title;
        TextView t_desc;
        RelativeLayout rl_title_line;
        RelativeLayout rl_desc_line;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t_title=itemView.findViewById(R.id.t_title);
            t_desc=itemView.findViewById(R.id.t_desc);
            rl_desc_line=itemView.findViewById(R.id.rl_desc_line);
            rl_title_line=itemView.findViewById(R.id.rl_title_line);

        }
    }
}
