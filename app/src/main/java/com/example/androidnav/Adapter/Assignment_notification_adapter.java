package com.example.androidnav.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidnav.R;

public class Assignment_notification_adapter extends RecyclerView.Adapter<Assignment_notification_adapter.Holder> {
    LayoutInflater inflater;
    public Assignment_notification_adapter(Context context) {
        this.context = context;
    }

    Context context;
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(context);
    View view=inflater.inflate(R.layout.adapter_assigment_notification,parent,false);
    Holder holder=new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class Holder extends RecyclerView.ViewHolder {
        public Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
