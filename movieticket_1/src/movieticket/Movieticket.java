/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class Movieticket extends JFrame {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     f obj=new f();
     	
     
        
    }
    
}
class f extends JFrame{
 
    f(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Buttonhandlerf bl=new Buttonhandlerf(this);
        setSize(600,600);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        JButton btn=new JButton("START");
        btn.setBounds(200, 200, 150, 50);
        btn.setFont(new Font("sanserif",Font.BOLD,30));
        btn.addActionListener(bl);
        add(btn);
        
    }
    
}
class Buttonhandlerf implements ActionListener{

f ref;
	Buttonhandlerf(f temp){
		ref=temp;
	}
	public void actionPerformed(ActionEvent ae) 
	{
          //   new Info().setVisible(true);
              new LOGIN().setVisible(true);
           ref.dispose();
             
            
        }
}