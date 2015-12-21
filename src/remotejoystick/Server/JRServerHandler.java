/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotejoystick.Server;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_0;
import static java.awt.event.KeyEvent.VK_1;
import static java.awt.event.KeyEvent.VK_2;
import static java.awt.event.KeyEvent.VK_3;
import static java.awt.event.KeyEvent.VK_4;
import static java.awt.event.KeyEvent.VK_5;
import static java.awt.event.KeyEvent.VK_6;
import static java.awt.event.KeyEvent.VK_7;
import static java.awt.event.KeyEvent.VK_8;
import static java.awt.event.KeyEvent.VK_9;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_AMPERSAND;
import static java.awt.event.KeyEvent.VK_ASTERISK;
import static java.awt.event.KeyEvent.VK_AT;
import static java.awt.event.KeyEvent.VK_B;
import static java.awt.event.KeyEvent.VK_BACK_QUOTE;
import static java.awt.event.KeyEvent.VK_BACK_SLASH;
import static java.awt.event.KeyEvent.VK_C;
import static java.awt.event.KeyEvent.VK_CIRCUMFLEX;
import static java.awt.event.KeyEvent.VK_CLOSE_BRACKET;
import static java.awt.event.KeyEvent.VK_COLON;
import static java.awt.event.KeyEvent.VK_COMMA;
import static java.awt.event.KeyEvent.VK_D;
import static java.awt.event.KeyEvent.VK_DOLLAR;
import static java.awt.event.KeyEvent.VK_E;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_EQUALS;
import static java.awt.event.KeyEvent.VK_EXCLAMATION_MARK;
import static java.awt.event.KeyEvent.VK_F;
import static java.awt.event.KeyEvent.VK_G;
import static java.awt.event.KeyEvent.VK_H;
import static java.awt.event.KeyEvent.VK_I;
import static java.awt.event.KeyEvent.VK_J;
import static java.awt.event.KeyEvent.VK_K;
import static java.awt.event.KeyEvent.VK_L;
import static java.awt.event.KeyEvent.VK_LEFT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_M;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_N;
import static java.awt.event.KeyEvent.VK_NUMBER_SIGN;
import static java.awt.event.KeyEvent.VK_O;
import static java.awt.event.KeyEvent.VK_OPEN_BRACKET;
import static java.awt.event.KeyEvent.VK_P;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_PLUS;
import static java.awt.event.KeyEvent.VK_Q;
import static java.awt.event.KeyEvent.VK_QUOTE;
import static java.awt.event.KeyEvent.VK_QUOTEDBL;
import static java.awt.event.KeyEvent.VK_R;
import static java.awt.event.KeyEvent.VK_RIGHT_PARENTHESIS;
import static java.awt.event.KeyEvent.VK_S;
import static java.awt.event.KeyEvent.VK_SEMICOLON;
import static java.awt.event.KeyEvent.VK_SHIFT;
import static java.awt.event.KeyEvent.VK_SLASH;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_T;
import static java.awt.event.KeyEvent.VK_TAB;
import static java.awt.event.KeyEvent.VK_U;
import static java.awt.event.KeyEvent.VK_UNDERSCORE;
import static java.awt.event.KeyEvent.VK_V;
import static java.awt.event.KeyEvent.VK_W;
import static java.awt.event.KeyEvent.VK_X;
import static java.awt.event.KeyEvent.VK_Y;
import static java.awt.event.KeyEvent.VK_Z;
import middleware.server.ServerHandler;
import objects.KeyPressed;
import objects.KeyResponse;

/**
 *
 * @author renan
 */
public class JRServerHandler implements ServerHandler{

       Robot robot;

    public JRServerHandler() {
        try{
        robot = new Robot();
        }catch(Exception ex){
            
        }
    }
       
       
       
       
     private void doType(int keyCodes, boolean state) {
         try{
         Thread.sleep(3000);
         }catch(Exception ex){
         
         }
         if(state){
            robot.keyPress(keyCodes);
         }else{
             robot.keyRelease(keyCodes);
         }
         
         
    }
    
    public void type(char character, boolean state) {
        switch (character) {
        case 'a': doType(VK_A, state); break;
        case 'b': doType(VK_B, state); break;
        case 'c': doType(VK_C, state); break;
        case 'd': doType(VK_D, state); break;
        case 'e': doType(VK_E, state); break;
        case 'f': doType(VK_F, state); break;
        case 'g': doType(VK_G, state); break;
        case 'h': doType(VK_H, state); break;
        case 'i': doType(VK_I, state); break;
        case 'j': doType(VK_J, state); break;
        case 'k': doType(VK_K, state); break;
        case 'l': doType(VK_L, state); break;
        case 'm': doType(VK_M, state); break;
        case 'n': doType(VK_N, state); break;
        case 'o': doType(VK_O, state); break;
        case 'p': doType(VK_P, state); break;
        case 'q': doType(VK_Q, state); break;
        case 'r': doType(VK_R, state); break;
        case 's': doType(VK_S, state); break;
        case 't': doType(VK_T, state); break;
        case 'u': doType(VK_U, state); break;
        case 'v': doType(VK_V, state); break;
        case 'w': doType(VK_W, state); break;
        case 'x': doType(VK_X, state); break;
        case 'y': doType(VK_Y, state); break;
        case 'z': doType(VK_Z, state); break;
        case '`': doType(VK_BACK_QUOTE, state); break;
        case '0': doType(VK_0, state); break;
        case '1': doType(VK_1, state); break;
        case '2': doType(VK_2, state); break;
        case '3': doType(VK_3, state); break;
        case '4': doType(VK_4, state); break;
        case '5': doType(VK_5, state); break;
        case '6': doType(VK_6, state); break;
        case '7': doType(VK_7, state); break;
        case '8': doType(VK_8, state); break;
        case '9': doType(VK_9, state); break;
        case '-': doType(VK_MINUS, state); break;
        case '=': doType(VK_EQUALS, state); break;
        case '!': doType(VK_EXCLAMATION_MARK, state); break;
        case '@': doType(VK_AT, state); break;
        case '#': doType(VK_NUMBER_SIGN, state); break;
        case '$': doType(VK_DOLLAR, state); break;
        case '^': doType(VK_CIRCUMFLEX, state); break;
        case '&': doType(VK_AMPERSAND, state); break;
        case '*': doType(VK_ASTERISK, state); break;
        case '(': doType(VK_LEFT_PARENTHESIS, state); break;
        case ')': doType(VK_RIGHT_PARENTHESIS, state); break;
        case '_': doType(VK_UNDERSCORE, state); break;
        case '+': doType(VK_PLUS, state); break;
        case '\t': doType(VK_TAB, state); break;
        case '\n': doType(VK_ENTER, state); break;
        case '[': doType(VK_OPEN_BRACKET, state); break;
        case ']': doType(VK_CLOSE_BRACKET, state); break;
        case '\\': doType(VK_BACK_SLASH, state); break;
        case ';': doType(VK_SEMICOLON, state); break;
        case ':': doType(VK_COLON, state); break;
        case '\'': doType(VK_QUOTE, state); break;
        case '"': doType(VK_QUOTEDBL, state); break;
        case ',': doType(VK_COMMA, state); break;
        case '.': doType(VK_PERIOD, state); break;
        case '/': doType(VK_SLASH, state); break;
        case ' ': doType(VK_SPACE, state); break;
        default:
            throw new IllegalArgumentException("Cannot type character " + character);
        }
    }
    
    @Override
    public Object handler(Object o) {
        
        
        
        KeyPressed kp = (KeyPressed) o;
        
        System.out.println("Ahoy! - (up)" + kp.key);
        type(kp.key, kp.state);
         
        
        KeyResponse kr = new KeyResponse();
        
        
        return kr;
        
    }
    
}
