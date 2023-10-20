package com.rishabh.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean guessed = false;
    final static String TAG = "MainActivity";
    EditText name;
    EditText guessValue;
    int randomNumber = 10;          //initializing to 10 so that it can be checked if the random number is generated or not
    int attempts = 0;               //initializing to 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = this.findViewById(R.id.et_name);
        guessValue = this.findViewById(R.id.et_user_guess);

        /**
         * method to generate random number and begin game
         */
        this.findViewById(R.id.btn_generate).setOnClickListener(view -> {
            randomNumber = new Random().nextInt(9);
            if (randomNumber == 0) randomNumber++;                      //setting the value to 1 if random number is 0
            Log.i(TAG, "onCreate: Random Number: " + randomNumber);
        });

        /**
         * method to submit the guess
         */
        this.findViewById(R.id.btn_submit).setOnClickListener(view -> {

            if (randomNumber == 10){
                Toast.makeText(getApplicationContext(),
                        "Please generate a random number first",
                        Toast.LENGTH_SHORT).show();
            } else if (guessValue.getText().toString().trim().equals("")) {
                Toast.makeText(getApplicationContext(),
                        "Please enter a guess",
                        Toast.LENGTH_SHORT).show();
            } else {
                attempts++;
                int userGuess = Integer.parseInt(guessValue.getText().toString());
                if (userGuess == randomNumber) {
                    Toast.makeText(getApplicationContext(),
                            "It is correct!",
                            Toast.LENGTH_SHORT).show();
                    guessed = true;
                } else if (userGuess > randomNumber) {
                    Toast.makeText(getApplicationContext(),
                            "Guess number too large",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Guess number too small",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        /**
         * method to switch to Summary Activity and pass data
         */
        this.findViewById(R.id.btn_summary).setOnClickListener(view -> {

            //validating if the random number is generated and name is entered
            if (randomNumber == 10){
                Toast.makeText(getApplicationContext(),
                        "Please generate a random number first",
                        Toast.LENGTH_SHORT).show();
            } else if (name.getText().toString().trim().equals("")){
                Toast.makeText(getApplicationContext(),
                        "Please enter your name",
                        Toast.LENGTH_SHORT).show();
            } else if (!guessed && randomNumber != 10) {     //if the random number is generated but not guessed
                Toast.makeText(getApplicationContext(),
                        "Please Guess the number before going to the Summary",
                        Toast.LENGTH_SHORT).show();
            } else {        //if both the conditions are satisfied, switch to Summary Activity
                Intent intent = new Intent(this, SummaryActivity.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("randomNumber", randomNumber);
                intent.putExtra("attempts", attempts);
                startActivity(intent);
            }

        });


        /**
         * method to reset the game
         */
        this.findViewById(R.id.btn_reset).setOnClickListener(view -> {
            name.setText("");
            guessValue.setText("");
            randomNumber = 10;
            attempts = 0;
            guessed = false;
        });

    }
}