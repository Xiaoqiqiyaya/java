package com.kuang.demo4;

import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;

public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("/////////");
        });
        thread.start();
        Thread.State state = thread.getState();
        state = thread.getState();
        System.out.println(state);
        while(state!=Thread.State.TERMINATED){
            Thread.sleep(1000);
            state = thread.getState();
            System.out.println(state);
        }
    }
}
