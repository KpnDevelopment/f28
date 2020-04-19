package com.example.androidnav.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.androidnav.Adapter.Exam_notification_adapter;
import com.example.androidnav.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExamFragment extends Fragment {
private RecyclerView examnotify;
private LinearLayout examlayout;
Exam_notification_adapter adapter_ex;

    public ExamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_exam, container,false);
        examnotify=view.findViewById(R.id.examrecyclerview);
        examlayout=view.findViewById(R.id.fragexamlinear);
        LinearLayoutManager lmgr =new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager recyclerlmg=lmgr;
        examnotify.setLayoutManager(recyclerlmg);
        adapter_ex=new Exam_notification_adapter(getContext());
        examnotify.setAdapter(adapter_ex);
        return view;


    }
}
