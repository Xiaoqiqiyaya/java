package com.kuang.demo1;

public class TestThrea3 implements  Runnable {
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("1-"+i);
        }
    }

    public static void main(String[] args) {
        TestThrea3 testThread = new TestThrea3();
        Thread thread = new Thread(testThread);
        thread.start();

        for(int i=0;i<20;i++){
            System.out.println("2-"+i);
        }
    }
}
