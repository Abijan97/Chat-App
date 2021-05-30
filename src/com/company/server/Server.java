package com.company.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
	    System.out.println("Server is running on 6000");
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server Socket Created");

        while (true) {

            Socket client = serverSocket.accept(); //wait until a client connect
            System.out.println("Server accepted client.");
            ClientHandler clientHandler = new ClientHandler(client);
            Thread thread = new Thread(clientHandler);
            thread.start();

        }
    }
}