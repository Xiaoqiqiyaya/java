package com.net.lesson2;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemon02 {
        public static void main(String[] args) throws IOException {
            Socket socket =  new Socket(InetAddress.getByName("127.0.0.1"),9000);
            OutputStream os = socket.getOutputStream();

            FileInputStream fis = new FileInputStream(new File("1.jpg"));
            byte[] buffer = new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                os.write(buffer,0,len);
            }

            socket.shutdownOutput();

            InputStream inputStream = socket.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer2 = new byte[1024];
            int len1;
            while((len1=inputStream.read(buffer2))!=-1){
                baos.write(buffer2,0,len1);
            }
            System.out.println(baos.toString());

            fis.close();
            os.close();
            socket.close();
        }
}
