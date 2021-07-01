package com.kuang.demo2;

import com.kuang.demo1.TestThread2;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

public class TestCallable implements Callable<Boolean> {

    private  String url;
    private  String name;

    public TestCallable(String url ,String name){
        this.url = url;
        this.name = name;
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable testThread1= new TestCallable("https://img0.baidu.com/it/u=3612597965,1770541226&fm=26&fmt=auto&gp=0.jpg","0.jpg");
        TestCallable testThread2= new TestCallable("https://img2.baidu.com/it/u=4192675994,3627584716&fm=26&fmt=auto&gp=0.jpg","00.jpg");
        TestCallable testThread3= new TestCallable("https://img0.baidu.com/it/u=1575628056,3609016870&fm=26&fmt=auto&gp=0.jpg","000.jpg");
        ExecutorService ser = Executors.newFixedThreadPool(3);
        Future<Boolean> r1 = ser.submit(testThread1);
        Future<Boolean> r2 = ser.submit(testThread2);
        Future<Boolean> r3 = ser.submit(testThread3);
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();
        ser.shutdown();
    }


    @Override
    public Boolean call() throws Exception {
        try {
            WebDownloader webDownloader = new WebDownloader();
            webDownloader.downloader(this.url,this.name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("下载了文件:"+this.name);
        return true;
    }
}





class WebDownloader{
    public void downloader(String url,String name) throws IOException {
        FileUtils.copyURLToFile(new URL(url),new File(name));
    }
}
