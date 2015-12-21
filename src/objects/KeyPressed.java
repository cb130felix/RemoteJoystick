package objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renan
 */
public class KeyPressed {
    
    public int commandId;
    public char key, playerId;
    public boolean state;

    public KeyPressed(int commandId, char key, char playerId, boolean state) {
        this.commandId = commandId;
        this.key = key;
        this.playerId = playerId;
        this.state = state;
    }
    
    
    
}
