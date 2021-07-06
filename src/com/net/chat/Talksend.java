package com.net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class Talksend implements  Runnable{
    DatagramSocket socket =null;
    BufferedReader reader =null;
    private int fromIP;
    private String toIP;
    private int toPort;

    public Talksend( int fromport, String toIP, int toPort) throws SocketException {
        this.fromIP = fromIP;
        this.toIP = toIP;
        this.toPort = toPort;
        socket = new DatagramSocket(fromport);
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        while(true){
            String data = null;
            try {
                data = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] datas = data.getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(toIP,toPort));
            try {
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
