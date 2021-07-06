package com.net.lesson1;

import java.net.InetSocketAddress;

public class TestInetSocketAdress {
        public static void main(String[] args) {
            InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
            System.out.println(socketAddress);
            socketAddress.getAddress();
            socketAddress.getHostName();
            socketAddress.getPort();
            }
}
