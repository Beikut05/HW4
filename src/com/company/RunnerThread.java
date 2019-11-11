package com.company;

public class RunnerThread extends Thread {

        public synchronized void run() {
            try {
                for (int i = 1; i <5;) {
                    System.out.println("Runner " + i + " берет палочку");
                    System.out.println("Runner " + i + " бежит к " + "Runner " + ++i);
                    sleep(500);
                }
                for (int i = 5; i>1;) {
                    System.out.println("Runner " + i + " берет палочку");
                    System.out.println("Runner " + i + " бежит к " + "Runner " + --i);
                    sleep(500);
                }
                System.out.println("Runner 1 "+" берет палочку");
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

