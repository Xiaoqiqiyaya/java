package com.net.lesson3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UdpClientDemon1 {
        public static void main(String[] args) throws IOException {
            DatagramSocket socket = new DatagramSocket();

            String message = "ni hao a ";

            InetAddress localhost = InetAddress.getByName("127.0.0.1");
            int port = 9090;

            DatagramPacket packet = new DatagramPacket(message.getBytes(StandardCharsets.UTF_8),0,message.getBytes(StandardCharsets.UTF_8).length,localhost,port);
            socket.send(packet);

            socket.close();


        }
}
