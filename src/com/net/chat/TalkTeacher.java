package com.net.chat;

import java.net.SocketException;

public class TalkTeacher {
        public static void main(String[] args) throws SocketException {
            new Thread(new Talksend(5555,"localhost",8888)).start();
            new Thread(new Talkreceive(9999,"学生")).start();
        }
}
