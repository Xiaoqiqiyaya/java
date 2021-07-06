package com.net.lesson4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLdemo {
        public static void main(String[] args) throws IOException {
                URL url = new URL("http://localhost:8080/helloworld/index.jsp?username=zhongqi&password=123");
                System.out.println(url.getProtocol());
                System.out.println(url.getHost());
                System.out.println(url.getPort());
                System.out.println(url.getFile());
                System.out.println(url.getQuery());

                URL url1 = new URL("https://himg.bdimg.com/sys/portraitn/item/dd3348687a686f6e67716979114d");

                HttpURLConnection urlConnection =(HttpURLConnection) url1.openConnection();
                InputStream inputStream =  urlConnection.getInputStream();

                FileOutputStream fileOutputStream = new FileOutputStream("index.txt");
                byte[] buffer = new byte[1024];
                int len;
                while ((len=inputStream.read(buffer))!=-1){
                    fileOutputStream.write(buffer,0,len);
                }

                fileOutputStream.close();

        }
}
