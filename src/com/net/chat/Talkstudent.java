package com.net.chat;

import java.net.SocketException;

public class Talkstudent {
        public static void main(String[] args) throws SocketException {
                new Thread(new Talksend(7777,"localhost",9999)).start();
                new Thread(new Talkreceive(8888,"老师")).start();
            }
}
