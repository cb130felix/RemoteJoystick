/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.net.SocketException;
import middleware.Middleware;

/**
 *
 * @author renan
 */
public class Proxy {
    
    public static void main(String[] args) throws SocketException {
        
        Middleware mid = new Middleware();
        
        mid.proxy.startProxy();
        
    }
    
}
