package com.net.lesson2;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class TcpClientDemon01 {
        public static void main(String[] args) {
                try {
                        InetAddress serverIp = InetAddress.getByName("127.0.0.1");
                        int port = 9999;
                        Socket socket = new Socket(serverIp,port);
                        OutputStream os =  socket.getOutputStream();
                        os.write("kaishhfkshfsdkfsiba ".getBytes());
                        socket.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }

        }
}
