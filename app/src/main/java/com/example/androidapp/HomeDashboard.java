package com.example.androidapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeDashboard extends AppCompatActivity {

    //Khai báo biến
    EditText edtsearch;

    Button btnsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homedashboard);

        // Ánh xạ id cho các biến giao diện
        // Search
        btnsearch = findViewById(R.id.btnsearch);

        // Xử lý tương tác với người dùng
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeDashboard.this, "Bạn đã nhấn vào nút tìm kiếm!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
