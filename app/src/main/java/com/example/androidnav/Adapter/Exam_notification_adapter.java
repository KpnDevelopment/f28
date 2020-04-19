package com.example.androidnav.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidnav.R;

public class Exam_notification_adapter extends RecyclerView.Adapter<Exam_notification_adapter.Hold> {
    LayoutInflater inflater;
    public Exam_notification_adapter(Context context){
        this.context=context;
    }
    Context context;
    @NonNull
    @Override
    public Hold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.adapter_examnotification,parent,false);
        Hold hold=new Hold(view);
        return hold;
    }

    @Override
    public void onBindViewHolder(@NonNull Hold hold, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class Hold extends RecyclerView.ViewHolder {
        public Hold(@NonNull View itemView) {
            super(itemView);
        }
    }
}
