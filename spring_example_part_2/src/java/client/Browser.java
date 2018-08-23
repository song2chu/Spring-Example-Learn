/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import protocol.HttpProtocol;
import server.Application;
/**
 *
 * @author safev
 */
public class Browser {
    public static void main(String[] args) {
        HttpProtocol protocol = new Application();
        System.out.println("Google");
    }
}
