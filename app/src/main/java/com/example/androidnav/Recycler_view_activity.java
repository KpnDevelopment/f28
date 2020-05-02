package com.example.androidnav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recycler_view_activity extends AppCompatActivity {
RecyclerView exam;
Exam_adapter exm;
List<Exam_model> listexm=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        exam=findViewById(R.id.recycler_exam);
        listexm.add(new Exam_model("01/01/2020","computer"));
        listexm.add(new Exam_model("01/02/2020","computer1"));
        listexm.add(new Exam_model("01/03/2020","computer2"));

        LinearLayoutManager lnr=new LinearLayoutManager(getApplicationContext());
        RecyclerView.LayoutManager lay=lnr;
        exam.setLayoutManager(lay);
        exm=new Exam_adapter(getApplicationContext(),listexm);
        exam.setAdapter(exm);
    }
}
