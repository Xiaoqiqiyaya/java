package com.net.lesson1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
        public static void main(String[] args) throws UnknownHostException {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress);
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);

            InetAddress inetAddress3 = InetAddress.getLoopbackAddress();
            System.out.println(inetAddress3);
        }
}
