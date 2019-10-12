package com.example.thredinterface;

public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("This is thread creation using runnable interface");
    }
}
