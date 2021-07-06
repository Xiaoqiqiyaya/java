package com.kuang.Lock;

import java.util.List;

public class Deadlock {
        public static void main(String[] args) {
                Makeup G1 = new Makeup(0,"A");
                Makeup G2 = new Makeup(1,"B");

                G1.start();
                G2.start();
            }
}

class Lipstick{

}

class Mirro{

}

class  Makeup extends  Thread{
    static Lipstick lipstick = new Lipstick();
    static  Mirro mirro = new Mirro();
    int choice ;
    String  girlName;

    Makeup(int choice ,String girlName){
        this.choice =choice;
        this.girlName= girlName;
    }

    @Override
    public void run() {
        super.run();
        if(choice==0){
            synchronized (lipstick){
                System.out.println(this.girlName+"suo kouhong");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (mirro){
                System.out.println(this.girlName+"jingzi");
            }
        }else{
            synchronized (lipstick){
                System.out.println(this.girlName+"suo kouhong");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (mirro){
                System.out.println(this.girlName+"jingzi");
        }
    }

}

    private  void makeup(){

    }
}