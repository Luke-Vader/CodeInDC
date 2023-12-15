package com.rishabh.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Locale;

public class AppointmentSummaryActivity extends AppCompatActivity {


    TextView name, email, startTime, duration, professorName, courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_summary);

        Intent intent = getIntent();

        HashMap<String, String> appointmentDetails = (HashMap<String, String>) intent.getSerializableExtra("appointmentDetails");

        name = findViewById(R.id.tvName);
        email = findViewById(R.id.tvEmail);
        startTime = findViewById(R.id.tvStartTime);
        duration = findViewById(R.id.tvDuration);
        professorName = findViewById(R.id.tvProfessorName);
        courses = findViewById(R.id.tvCourses);

        assert appointmentDetails != null;
        name.setText(String.format("Name: %s", appointmentDetails.get("name")));
        email.setText(String.format("Email: %s", appointmentDetails.get("email")));
        startTime.setText(String.format("Start time: %s at %s",appointmentDetails.get("date"), appointmentDetails.get("start_time")));
        duration.setText(String.format(Locale.getDefault(), "Duration: %s minutes", appointmentDetails.get("duration")));
        professorName.setText(String.format("With Prof: %s", appointmentDetails.get("professor")));
        courses.setText(String.format("About courses: CSIS %s", appointmentDetails.get("courses")));


        this.findViewById(R.id.btnChangeAppointment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
