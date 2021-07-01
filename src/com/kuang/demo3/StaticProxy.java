package com.kuang.demo3;

public class StaticProxy {

        public static void main(String[] args) {
            YOU you = new YOU();
            Weddingcompay weddingcompay = new Weddingcompay(you);
            weddingcompay.HappyMarry();
        }

}


interface  Marry{

    void HappyMarry();
}


class  YOU implements  Marry{

    @Override
    public void HappyMarry() {
        System.out.println("超开心");
    }
}


class  Weddingcompay implements  Marry{

    private  Marry target;

    public Weddingcompay(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("之后");
    }

    private void before() {
        System.out.println("之前");
    }
}