package com.example.recyclerinkotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //write something here
        Toast.makeText(this, "HelloWorld", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "HelloWorld", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "HelloWorld", Toast.LENGTH_SHORT).show();
    }
}