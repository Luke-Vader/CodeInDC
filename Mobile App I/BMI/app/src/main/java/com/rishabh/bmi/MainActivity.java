package com.rishabh.bmi;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText height;
    EditText mass;

    Button calculate;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = this.findViewById(R.id.height);
        mass = this.findViewById(R.id.bodyMass);
        result = this.findViewById(R.id.resultBMI);
        calculate = this.findViewById(R.id.calculateBMI);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float lengthSquared = Integer.parseInt(height.getText().toString()) * Integer.parseInt(height.getText().toString());
                float weight = Integer.parseInt(mass.getText().toString());
                float bmi = weight/lengthSquared;
                result.setText("" + bmi);
            }
        });



    }
}