package com.kuang.demo4;


class TestSleep  implements  Runnable{

    private  int ticketnums =10;

    @Override
    public void run() {
        while (true){
            if(ticketnums<=0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketnums--+"票");
        }
    }

    public static void main(String[] args) {
        com.kuang.demo1.TestThread4 ticket = new com.kuang.demo1.TestThread4();
        new Thread(ticket,"小米").start();
        new Thread(ticket,"小名").start();
        new Thread(ticket,"小铭").start();
    }
}
