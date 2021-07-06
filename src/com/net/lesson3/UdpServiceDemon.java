package com.net.lesson3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServiceDemon {
        public static void main(String[] args) throws IOException {
            DatagramSocket socket = new DatagramSocket(9090);

            byte[] buffer = new byte[1024];

            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
            socket.receive(packet);
            socket.close();
            System.out.println(new String(packet.getData(),0,packet.getLength()));

        }
}
