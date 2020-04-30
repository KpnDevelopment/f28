package com.example.androidnav.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidnav.R;

public class Admin_academy_adapter extends RecyclerView.Adapter<Admin_academy_adapter.Holder> {
    LayoutInflater inflater;
    public Admin_academy_adapter(Context context){
        this.context=context;
    }
    Context context;
    @NonNull
    @Override
    public Admin_academy_adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.admin_academy_adapter,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Admin_academy_adapter.Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class Holder extends RecyclerView.ViewHolder {
        public Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
