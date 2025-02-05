package com.example.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class OnboardingActivity extends AppCompatActivity {

    ImageView imageView;

    TextView description;

    View dot_active, dot_inactive_1, dot_inactive_2;
    Button btnnext;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onboarding);

        imageView = findViewById(R.id.imageView);
        description = findViewById(R.id.description);
        dot_active = findViewById(R.id.dot_active);
        dot_inactive_1 = findViewById(R.id.dot_inactive_1);
        dot_inactive_2 = findViewById(R.id.dot_inactive_2);

        btnnext = findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                updateOnboardingUI();
            }
        });
    }

    private void updateOnboardingUI() {
        switch (count) {
            case 1:
                imageView.setImageResource(R.drawable.onboarding_2);
                description.setText("Connecting NGOs, Social \nEnterprises with Communities");

                // swap dot_active và dot_active_1
                dot_active.setBackgroundResource(R.drawable.dot_inactive);
                dot_inactive_1.setBackgroundResource(R.drawable.dot_active);
                break;
            case 2:
                imageView.setImageResource(R.drawable.onboarding_finish);
                description.setText("Donate, Invest & Support \ninfrastructure projects");
                
                // swap dot_active_1 và dot_active_2
                dot_inactive_1.setBackgroundResource(R.drawable.dot_inactive);
                dot_inactive_2.setBackgroundResource(R.drawable.dot_active);
                btnnext.setText("Finish");
                break;
            case 3:
                startActivity(new Intent(OnboardingActivity.this, HomeDashboard.class));
                finish();
                break;
        }
    }
}
