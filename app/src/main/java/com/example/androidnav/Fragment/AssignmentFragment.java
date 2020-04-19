package com.example.androidnav.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.androidnav.Adapter.Assignment_notification_adapter;
import com.example.androidnav.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AssignmentFragment extends Fragment {
    private RecyclerView assignmentnotify;
    LinearLayout assignlayout;
    Assignment_notification_adapter adapter_assgn;

    public AssignmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_assignment, container, false);
        assignmentnotify= view.findViewById(R.id.assignmentrecycler);
        assignlayout=view.findViewById(R.id.assignmentlenear);
        LinearLayoutManager lmgr = new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager recyclerlmg=lmgr;
        assignmentnotify.setLayoutManager(recyclerlmg);
        adapter_assgn=new Assignment_notification_adapter(getContext());
        assignmentnotify.setAdapter(adapter_assgn);
        return view;


    }
}
