package com.example.thredinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ThreadDemo ref=new ThreadDemo();// creating reference of class ThreadDemo
        Thread t=new Thread(ref);// creating reference of Thread class(inbuilt)& passing reference of ThreadDemo class.
        t.start();//now calling start method by Thread class reference
    }
}
