package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <=5 ; i++) {

            RunnerThread rt = new RunnerThread();
            rt.start();
            rt.join();
            break;
        }




    }
}
