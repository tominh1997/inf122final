package gameenvironmentplugin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public abstract class Game {

    public List<GamePiece> gamePieces;          // The list of game pieces and locations
    public String currentMove;                  // Whose move it is
    public String winner;                       //THE CURRENT WINNER

    void myRules() {
        //FORGOT TO CREATE METHOD FOR RULES
    }

    public abstract GameBoard createGameBoard(); //CREATE METHOD

    boolean switchTurn(boolean moved) {
        //FORGOT TO CREATE THE METHOD FOR MOVED
        return moved;
    }

    public String getWinner() {
        //FORGOT TO IMPLEMENT THE METHOD FOR WINNER
        return winner;
    }
    
    public boolean isDone()
    {
        //CREATE METHOD
        return false;
    }
    
    public boolean isLegalMove(int x, int y) 
    {
        //CREATE METHOD
        return false;
    }
}