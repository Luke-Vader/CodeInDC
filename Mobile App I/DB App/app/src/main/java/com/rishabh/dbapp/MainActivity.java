package com.rishabh.dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText name, city, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //user data inputs
        name = this.findViewById(R.id.name_text);
        city = this.findViewById(R.id.city);
        country = this.findViewById(R.id.country);

        this.findViewById(R.id.save).setOnClickListener(
                view -> {
                    DbHandler handler = new DbHandler(getApplicationContext());

                    //insert data into the table
                    handler.insertUserDetails(
                            name.getText().toString(),
                            city.getText().toString(),
                            country.getText().toString()
                    );

                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                });

        //display stored data in table
        this.findViewById(R.id.view).setOnClickListener(
                view -> {
                    startActivity(new Intent(getApplicationContext(), ViewActivity.class));
                    name.setText("");
                    city.setText("");
                    country.setText("");
                });
    }
}