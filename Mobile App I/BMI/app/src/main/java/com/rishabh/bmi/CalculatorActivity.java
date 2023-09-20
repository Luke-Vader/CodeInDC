package com.rishabh.bmi;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText weightInput;
    EditText heightInput;
    TextView result;

//    SwitchCompat unitSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        weightInput = this.findViewById(R.id.weight_input);
        heightInput = this.findViewById(R.id.height_input);
        result = this.findViewById(R.id.resultBMI);

        this.findViewById(R.id.calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                weightInput.onEditorAction(EditorInfo.IME_ACTION_DONE);

                if (heightInput.getText() == null)
                    heightInput.setError("Required Value");
                else if (weightInput.getText() == null)
                    weightInput.setError("Required Value");
                else{
                    float lengthSquared = Float.parseFloat(heightInput.getText().toString()) * Float.parseFloat(heightInput.getText().toString());
                    float weight = Float.parseFloat(weightInput.getText().toString());
                    float bmi = weight/lengthSquared;
                    result.setText("BMI: " + String.format("%.2f", bmi));
                }
            }
        });
    }
}