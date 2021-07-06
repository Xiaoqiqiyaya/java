package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveDemo {
        public static void main(String[] args) throws IOException {
            DatagramSocket socket = new DatagramSocket(6666);
            while (true){
                byte[] container = new byte[1024];

                DatagramPacket packet = new DatagramPacket(container,0,container.length);
                socket.receive(packet);
                byte[] data = packet.getData();
                String receivedata = new String(data,0,data.length);
                System.out.println(receivedata);
                if(receivedata.equals("bye")){
                    break;
                }
            }
        }
}
