package com.example.androidnav.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.androidnav.Adapter.Acdmynotification;
import com.example.androidnav.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AcademyFragment extends Fragment {
    private RecyclerView acdamynotify;
    private LinearLayout acadmylayout;
    private Acdmynotification adapter_ac;

    public AcademyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//     Inflate the layout for this fragment;
        View view= inflater.inflate(R.layout.fragment_academy, container, false);
        acdamynotify=view.findViewById(R.id.academyrecycler);
        acadmylayout=view.findViewById(R.id.acdamylenear);
        LinearLayoutManager Lmgr = new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager recylmgr=Lmgr;
        acdamynotify.setLayoutManager(recylmgr);
        adapter_ac=new Acdmynotification(getContext());
        acdamynotify.setAdapter(adapter_ac);
        return view;

    }
}
