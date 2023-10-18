package com.rishabh.viewsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(R.id.btnClick).setOnClickListener(view ->
                Toast.makeText(
                        MainActivity.this,
                        "So Sleepy",
                        Toast.LENGTH_SHORT)
                        .show()
        );

        addKeyListener();

    }

    //method to handle activity on the play button
    public void play(View view){
        Toast.makeText(this, "Don't Play", Toast.LENGTH_SHORT).show();
    }

    public void addKeyListener() {
        EditText field = this.findViewById(R.id.edittext);
        field.setOnKeyListener((view, i, keyEvent) -> {
            if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN)
                && (i == KeyEvent.KEYCODE_ENTER)){
                Toast.makeText(this, field.getText(), Toast.LENGTH_SHORT).show();
                return true;
            } else if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN)
                && (i == KeyEvent.KEYCODE_9)){
                Toast.makeText(this, field.getText(), Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });
    }

}