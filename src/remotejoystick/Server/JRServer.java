/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotejoystick.Server;

import objects.KeyPressed;
import java.net.SocketException;
import java.util.Scanner;
import middleware.Middleware;

/**
 *
 * @author renan
 */
public class JRServer {
    
    public static void main(String args[]) throws SocketException{
    
        
        Middleware m = new Middleware();
        
        Scanner scan  = new Scanner(System.in);
        
        System.out.println("Entre com um nome para o servidor: ");

        String service = scan.nextLine();
        
        m.server.addService(service, new JRServerHandler(), KeyPressed.class);
        m.server.setPort(24240);
        m.server.startServer();
        
        
        
    }
    
    
}
