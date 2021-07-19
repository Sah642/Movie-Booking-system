/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author DELL
 */
public class WindowCloser extends WindowAdapter
{
    
    private final Frame ref;
        
        public WindowCloser(Frame temp){
            ref=temp;
        }
        public void windowClosing(WindowEvent we){
            ref.dispose();
        }
    
    
}
