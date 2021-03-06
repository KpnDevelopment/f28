package com.example.androidnav.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import com.example.androidnav.R;
import com.example.androidnav.Recycler_view_activity;

public class Activity_card extends AppCompatActivity {
    CardView assignment_card, exam_card, material_card, add_card, settings_card, academy_card, manage, add_admin;
    String[] Permissions = {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
    int permisson_all = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        assignment_card = findViewById(R.id.assigment_btn);
        exam_card = findViewById(R.id.exam_btn);
        material_card = findViewById(R.id.studybtn);
        add_card = findViewById(R.id.insert_profile);
        settings_card = findViewById(R.id.settings_btn);
        academy_card = findViewById(R.id.academy_btn);
        add_admin = findViewById(R.id.manage_Btn);
        manage = findViewById(R.id.Adadmin_btn);


        assignment_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), assingment_view_activity.class));
            }
        });
        exam_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(),exam_view_activity.class));
                startActivity(new Intent(getApplicationContext(), Recycler_view_activity.class));
            }
        });
        material_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), material_view_activity.class));
            }
        });
        add_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), add_view_activity.class));
            }
        });
        settings_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), settings_view_activity.class));
            }
        });
        add_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), manage_activity.class));
            }
        });
        academy_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), academy_activity.class));
            }
        });
        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), admin_manage.class));
            }
        });

        if (!reqperm(this,Permissions)){
            ActivityCompat.requestPermissions(this,Permissions,permisson_all);
        }
    }

    public static boolean reqperm(Context ctxt, String... permissions) {
        if (ctxt != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(ctxt, permission) != PackageManager.PERMISSION_GRANTED)
                    return false;

            }
        }

        return true;
    }
}
