package com.kuang.lambda;

public class TestLambda2 {
        public static void main(String[] args) {

             class Love2 implements  Ilova{

                @Override
                public void love(String a) {
                    System.out.println(a);
                }
            }
            Ilova ilova = new Love2();
            ilova.love("hjdf");
            ilova=(String a)->{
                System.out.println("");};
        }




    }


interface  Ilova{
    void love(String a);
}

class Love implements  Ilova{

    @Override
    public void love(String a) {
        System.out.println(a);
    }
}