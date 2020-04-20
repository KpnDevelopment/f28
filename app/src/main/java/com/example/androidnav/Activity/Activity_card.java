package com.example.androidnav.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidnav.R;

public class Activity_card extends AppCompatActivity {
CardView assignment_card,exam_card,academy_card,add_card,settings_card,extra_card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        assignment_card=findViewById(R.id.assigment_btn);
        exam_card=findViewById(R.id.exam_btn);
        academy_card=findViewById(R.id.acadamy_btn);
        add_card=findViewById(R.id.insert_profile);
        settings_card=findViewById(R.id.settings_btn);
        extra_card=findViewById(R.id.extra_btn);


        assignment_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),assingment_view_activity.class));
            }
        });
        exam_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),exam_view_activity.class));
            }
        });
        academy_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),academy_view_activity.class));
            }
        });
        add_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),add_view_activity.class));
            }
        });
        settings_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),settings_view_activity.class));
            }
        });
        extra_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),extra_view_activity.class));
            }
        });
    }
}
