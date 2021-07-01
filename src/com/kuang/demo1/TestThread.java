package com.kuang.demo1;

public class TestThread extends  Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("1-"+i);
        }
    }

    public static void main(String[] args) {
       TestThread testThread = new TestThread();
       testThread.start();
        for(int i=0;i<20;i++){
            System.out.println("2-"+i);
        }
    }
}
