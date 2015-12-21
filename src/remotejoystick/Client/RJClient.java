/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotejoystick.Client;

import java.net.SocketException;
import java.util.Scanner;
import middleware.Middleware;
import objects.KeyPressed;
import objects.KeyResponse;

/**
 *
 * @author renan
 */
public class RJClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException{
        
        Middleware md = new Middleware();
        Scanner reader = new Scanner(System.in);

        md.client.startClient();
        char c = 0;
        while(c != 'q'){
            System.out.println("Esperando tecla...5");
            c = reader.next().charAt(0);
            md.client.sendMessage(new KeyPressed(1, c, '1', true), "", new RJClientHandler() , KeyResponse.class);
        
        }
        md.client.stopClient();
        
        
    }
    
}
