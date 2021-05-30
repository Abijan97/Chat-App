package com.company.client;

import java.io.*;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) throws IOException {


        Client client = new Client();
        client.start();

        client.sendMessage("Hello from the client");
        client.sendMessage("How are you?");
        client.sendMessage("Im fine");
        client.sendMessage("Thank you!");

        Scanner scanner = new Scanner(System.in);
        String clientMessage = "";

        while (clientMessage != "exit") {
            clientMessage = scanner.nextLine();
            client.sendMessage(clientMessage);
        }

        System.out.println("Client finished Execution");

    }
}
