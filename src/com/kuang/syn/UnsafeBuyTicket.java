package com.kuang.syn;

import java.sql.Struct;

public class UnsafeBuyTicket {
        public static void main(String[] args) {
            BuyTicket station = new BuyTicket();
            new Thread(station,"kubidewo").start();
            new Thread(station,"niubidewo").start();
            new Thread(station,"huanniu").start();
        }
}




class BuyTicket implements  Runnable{

    private  int ticketnum = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {

            }
        }
    }

    private synchronized void buy() throws InterruptedException {
        if (ticketnum<=0){
            return;
        }
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"na dao "+ticketnum--);

    }
}