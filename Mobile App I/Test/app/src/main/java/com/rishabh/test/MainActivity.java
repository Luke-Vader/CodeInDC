package com.rishabh.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = this.findViewById(R.id.editTextText);

        this.findViewById(R.id.button).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Activity2.class);
            intent.putExtra("yash", editText.getText().toString());
            editText.setText("");
            startActivity(intent);
        });

    }
}