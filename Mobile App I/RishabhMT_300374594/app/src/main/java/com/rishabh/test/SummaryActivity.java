package com.rishabh.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class SummaryActivity extends AppCompatActivity {

    TextView name;
    TextView attempts;
    TextView probability;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        name = this.findViewById(R.id.tv_user_name);
        attempts = this.findViewById(R.id.tv_attempts);
        probability = this.findViewById(R.id.tv_probability);

        this.name.setText(this.getIntent().getStringExtra("name"));
        int attempts = this.getIntent().getIntExtra("attempts", 0);
        this.attempts.setText(String.valueOf(attempts));
        this.probability.setText(String.format(Locale.CANADA, "%.1f", 100.0/attempts) + "%");
        this.findViewById(R.id.btn_back).setOnClickListener(view -> finish());
    }
}