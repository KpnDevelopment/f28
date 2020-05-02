package com.example.androidnav;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Exam_adapter extends RecyclerView.Adapter<Exam_adapter.Holder> {
    private Context context_local;
    List<Exam_model> list;

    public Exam_adapter(Context context,List<Exam_model> list) {
        this.context_local = context;
        this.list=list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_examnotification,parent,false);
        return new Holder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull Holder holder, int position) {
    final Exam_model exmmdl=list.get(position);
    holder.name.setText(exmmdl.getName());
    holder.date.setText(exmmdl.getDate());
    }

    @Override
public int getItemCount() {
        return list.size();
        }

public class Holder extends RecyclerView.ViewHolder {
        TextView date,name;
    public Holder(@NonNull View itemView) {
        super(itemView);
        date=itemView.findViewById(R.id.dateexam);
        name=itemView.findViewById(R.id.examdetails);
    }
}
}
