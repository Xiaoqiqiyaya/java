package com.net.lesson2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSeviceDemon01 {
        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(9999);
                Socket socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                ByteArrayOutputStream baos =  new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                boolean flasg=true;
                while((len=is.read(buffer))!=-1){
                    baos.write(buffer,0,len);
                }
                System.out.println(baos.toString());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
