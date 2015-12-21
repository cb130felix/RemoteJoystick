/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotejoystick.Client;

import java.net.SocketException;
import middleware.Middleware;
import middleware.client.ClientHandler;
import objects.KeyPressed;
import objects.KeyResponse;

/**
 *
 * @author renan
 */
public class RJClientHandler implements ClientHandler{

    @Override
    public void handler(int i, Object o) {

        System.out.println("teste2");
        
    }
    
    
    
}
