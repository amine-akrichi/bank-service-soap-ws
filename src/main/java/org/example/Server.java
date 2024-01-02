package org.example;

import org.example.service.BankService;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8585/",new BankService());
        System.out.println("Server Running");
    }
}