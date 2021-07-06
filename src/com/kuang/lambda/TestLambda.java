package com.kuang.lambda;

public class TestLambda {

    static class Like2 implements  ILike{

        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }


    public static void main(String[] args) {
        ILike likes2 = new Like2();
        likes2.lambda();
        //局部内部类
        class Like3 implements  ILike{
            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }
        ILike likes3 = new Like3();
        likes3.lambda();

        likes3 = new ILike(){
            public void lambda() {
                System.out.println("I like lambda3");
            }
        };
        likes3 = ()->{
            System.out.println("lambda");
        };
    }

}

interface  ILike{
    void lambda();
}


class Like implements  ILike{

    @Override
    public void lambda() {
        System.out.println("I like lambda");
    }
}
