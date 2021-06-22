package com.muc;

public class ServerMain {
    public static void main(String[] args) {
        int port = 8818;
        Server server = new Server(port);//set server port
        server.start();//start thread
    }
}
