package com.example.administrator.demosqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySqliye mySqliye=new MySqliye(MainActivity.this);
        mySqliye.addStudent(new Student(1,"nguyen xuan duc","dhhf","hhfhf","hhfhfhf"));
    }
}
