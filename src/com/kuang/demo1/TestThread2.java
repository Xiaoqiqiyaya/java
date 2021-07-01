package com.kuang.demo1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import java.net.URL;

public class TestThread2 extends  Thread{
    private  String url;
    private  String name;

    public TestThread2(String url ,String name){
        this.url = url;
        this.name = name;
    }

    public void run(){
        WebDownloader webDownloader =new WebDownloader();
        try {
            webDownloader.downloader(this.url,this.name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("下载了文件:"+this.name);

    }



    public static void main(String[] args) {
        TestThread2 testThread1= new TestThread2("https://img0.baidu.com/it/u=3612597965,1770541226&fm=26&fmt=auto&gp=0.jpg","0.jpg");
        TestThread2 testThread2= new TestThread2("https://img2.baidu.com/it/u=4192675994,3627584716&fm=26&fmt=auto&gp=0.jpg","00.jpg");
        TestThread2 testThread3= new TestThread2("https://img0.baidu.com/it/u=1575628056,3609016870&fm=26&fmt=auto&gp=0.jpg","000.jpg");
        testThread1.start();
        testThread2.start();
        testThread3.start();
    }
}


class WebDownloader{
    public void downloader(String url,String name) throws IOException {
        FileUtils.copyURLToFile(new URL(url),new File(name));
    }
}
