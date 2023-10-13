package com.rishabh.dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewActivity extends AppCompatActivity {

    ListView userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        userList = this.findViewById(R.id.user_list);

        DbHandler handler = new DbHandler(getApplicationContext());
        ArrayList<HashMap<String, String>> userList = handler.GetUsers();
        ListView lv = (ListView) findViewById(R.id.user_list);
        ListAdapter adapter = new SimpleAdapter(
                getApplicationContext(),
                userList,
                R.layout.list_row,
                new String[]{"name","country","city"},
                new int[]{R.id.name_text, R.id.country_text, R.id.city_text});
        lv.setAdapter(adapter);

        this.findViewById(R.id.btnBack).setOnClickListener(
                view -> finish());

    }
}