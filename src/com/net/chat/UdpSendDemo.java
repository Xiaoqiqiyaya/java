package com.net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UdpSendDemo {
        public static void main(String[] args) throws IOException {
            DatagramSocket socket = new DatagramSocket(8888);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                String data = reader.readLine();
                byte[] datas = data.getBytes(StandardCharsets.UTF_8);
                DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("127.0.0.1",6666));
                socket.send(packet);
            }
        }
}
