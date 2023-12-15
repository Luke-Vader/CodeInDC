package com.rishabh.afinal;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 * MainActivity is the entry point for the application where the user can input appointment details,
 * such as date, start time, end time, and course selection.
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    CheckBox cb3175, cb3276, cb3377;
    ArrayList<String> courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize checkboxes for course selection.
        cb3175 = findViewById(R.id.chk_3175);
        cb3276 = findViewById(R.id.chk_3276);
        cb3377 = findViewById(R.id.chk_3377);

        // Initialize the list to keep track of selected courses.
        courses = new ArrayList<>();

        // Set up a listener for the date input button.
        this.findViewById(R.id.btnDateIn).setOnClickListener(v -> {
            // Get the current date as the default.
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

            // Show a date picker dialog to the user.
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    MainActivity.this,
                    (view, year1, monthOfYear, dayOfMonth1) -> {
                        // Format and set the chosen date in the date EditText field.
                        String date = dayOfMonth1 + "/" + (monthOfYear + 1) + "/" + year1;
                        ((EditText) MainActivity.this.findViewById(R.id.date)).setText(date);
                    }, year, month, dayOfMonth);
            datePickerDialog.show();
        });

        // Set up a listener for the start time input button.
        this.findViewById(R.id.btn_start_time).setOnClickListener(v -> {
            // Get the current time as the default.
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);

            // Show a time picker dialog to the user.
            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    MainActivity.this,
                    (view, hourOfDay, minuteOfHour) -> {
                        // Format and set the chosen time in the start time EditText field.
                        String time = hourOfDay + ":" + (minuteOfHour < 10 ? "0" + minuteOfHour : minuteOfHour);
                        ((EditText) MainActivity.this.findViewById(R.id.start_time)).setText(time);
                    }, hour, minute, true);
            timePickerDialog.show();
        });

        // Set up a listener for the end time input button.
        this.findViewById(R.id.btn_end_time).setOnClickListener(v -> {
            // Similar setup as the start time picker dialog.
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);

            // Show a time picker dialog to the user.
            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    MainActivity.this,
                    (view, hourOfDay, minuteOfHour) -> {
                        // Format and set the chosen time in the end time EditText field.
                        String time = hourOfDay + ":" + (minuteOfHour < 10 ? "0" + minuteOfHour : minuteOfHour);
                        ((EditText) MainActivity.this.findViewById(R.id.end_time)).setText(time);
                    }, hour, minute, true);
            timePickerDialog.show();
        });

        // Set up a listener for the submit button.
        this.findViewById(R.id.btn_submit).setOnClickListener(v -> {

            // Prepare a HashMap to hold the appointment details.
            HashMap<String, String> appointmentDetails = new HashMap<>();
            boolean isDataComplete = true;

            // Check which course checkboxes are checked and add them to the courses list.
            if (cb3175.isChecked()) {
                courses.add("3175");
            }
            if (cb3276.isChecked()) {
                courses.add("3276");
            }
            if (cb3377.isChecked()) {
                courses.add("3377");
            }

            // Retrieve the start and end times from the EditText fields.
            String startTimeStr = ((EditText) MainActivity.this.findViewById(R.id.start_time)).getText().toString();
            String endTimeStr = ((EditText) MainActivity.this.findViewById(R.id.end_time)).getText().toString();
            long duration = 0;

            // Calculate the duration in minutes if the Android version is Oreo or higher.
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                LocalTime startTime = LocalTime.parse(startTimeStr);
                LocalTime endTime = LocalTime.parse(endTimeStr);

                // Ensure the start time is before the end time.
                if (startTime.isBefore(endTime)) {
                    duration = ChronoUnit.MINUTES.between(startTime, endTime);
                } else {
                    // Show a toast message if the start time is not before the end time.
                    Toast.makeText(MainActivity.this, "Start time must be before end time.", Toast.LENGTH_SHORT).show();
                }
                appointmentDetails.put("duration", String.valueOf(duration));
            }

            // Put all appointment details into the HashMap.
            appointmentDetails.put("date", ((EditText) MainActivity.this.findViewById(R.id.date)).getText().toString());
            appointmentDetails.put("start_time", startTimeStr);
            appointmentDetails.put("end_time", endTimeStr);
            appointmentDetails.put("name", ((EditText) MainActivity.this.findViewById(R.id.user_name)).getText().toString());
            appointmentDetails.put("email", ((EditText) MainActivity.this.findViewById(R.id.user_email)).getText().toString());
            appointmentDetails.put("professor", ((EditText) MainActivity.this.findViewById(R.id.prof_name)).getText().toString());
            appointmentDetails.put("courses", String.join(",", courses));

            // Log the appointment details for debugging purposes.
            Log.i(TAG, "Appointment Details: " + appointmentDetails.toString());

            // Loop through the HashMap to ensure all data has been filled in.
            for (HashMap.Entry<String, String> entry : appointmentDetails.entrySet()) {
                if (entry.getValue() == null || entry.getValue().isEmpty()) {
                    // Show a Toast message prompting the user to fill in the missing data.
                    Toast.makeText(MainActivity.this, "Please fill in data for " + entry.getKey(), Toast.LENGTH_SHORT).show();
                    isDataComplete = false;
                    // Break out of the loop after finding the first incomplete data entry.
                    break;
                }
            }

            // If all data is complete, proceed to start the next activity and pass the appointment details.
            if (isDataComplete) {
                Intent intent = new Intent(MainActivity.this, AppointmentSummaryActivity.class);
                intent.putExtra("appointmentDetails", appointmentDetails);
                startActivity(intent);
            }

        });

    }
}
