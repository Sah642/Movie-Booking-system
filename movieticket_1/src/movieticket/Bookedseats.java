/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import javafx.scene.paint.Color;
import javax.swing.JToggleButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author DELL
 */
public class Bookedseats extends javax.swing.JFrame {
JToggleButton tbtn[][] = new JToggleButton[11][11];
static int id=1;
int x,y;
String q,r;
char z1,z2;
String[] S1=new String[30];
 String[] S2=new String[30];
  File myObj,myObj2;
    /**
     * Creates new form Bookedseats
     */
    public Bookedseats(int d) {
        id=d;
        
        initComponents();

       Cstring();
        intcomponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl2 = new javax.swing.JPanel();
        btnbk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnbk1 = new javax.swing.JButton();
        lblsc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        pnl2.setBackground(new java.awt.Color(255, 255, 204));

        btnbk.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnbk.setText("BOOK");
        btnbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbkActionPerformed(evt);
            }
        });

        jLabel1.setText("           1                     2                       3                        4                       5                      6                      7                     8");

        jLabel2.setText("A");

        jLabel3.setText("B");

        jLabel4.setText("C");

        jLabel5.setText("D");

        jLabel6.setText("E");

        jLabel7.setText("F");

        btnbk1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnbk1.setText("BACK");
        btnbk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbk1ActionPerformed(evt);
            }
        });

        lblsc.setBackground(new java.awt.Color(102, 255, 255));
        lblsc.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblsc.setText("                                                                 SCREEN");
        lblsc.setOpaque(true);

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel4))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel6))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel7))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblsc, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(694, 694, 694)
                        .addComponent(btnbk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(569, 569, 569)
                        .addComponent(btnbk1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(lblsc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(625, 625, 625)
                        .addComponent(btnbk, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel5))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl2Layout.createSequentialGroup()
                        .addGap(625, 625, 625)
                        .addComponent(btnbk1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void Cstring(){
           
      myObj2 = new File("Database2.txt");
    myObj = new File("Database.txt");
        try {
 
       
      if (myObj.createNewFile() &myObj2.createNewFile()) {
           
        System.out.println("File created: " + myObj.getName());
    System.out.println("File created: " + myObj2.getName());
      } else {
        System.out.println("File already exists.");
        
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
   //   e.printStackTrace();
    }
        
     
     
    
 
}

    void intcomponents(){
       
        
           setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
           setTitle("BookSeats");
           ImageIcon img=new ImageIcon("chair.png");
           Image im=img.getImage().getScaledInstance(60, 60,Image.SCALE_SMOOTH);
           ImageIcon ic=new ImageIcon(im);
        ImageIcon img2=new ImageIcon("src\\images\\chair2.png");
           Image im2=img2.getImage().getScaledInstance(60, 60,Image.SCALE_SMOOTH);
           ImageIcon ic2=new ImageIcon(im2);
           for (int i = 1; i < 11; i++) {
              for (int j = 1; j < 11; j++) {
                           tbtn[i][j] = new  javax.swing.JToggleButton("");
              }
              }
          for (int i = 1; i < 9; i++) {
              for (int j = 1; j < 7; j++) {
           
                    tbtn[i][j].setSize(60,60);
                    tbtn[i][j].setBackground(java.awt.Color.CYAN);
                    tbtn[i][j].setBorder(null);
                tbtn[i][j].setLocation(75+i*75,35+ j*65);
                    tbtn[i][j].setIcon(ic);
                    tbtn[i][j].setOpaque(true);
                    tbtn[i][j].addActionListener(new e());
                    pnl2.add(tbtn[i][j]);
            

            }
       
          
          } 
          S1=readStr();
          S2=readStry();
      
            q = S1[id];
            r = S2[id];
            for (int i = 0; i < q.length(); i++) {
                z1 = q.charAt(i);
                z2 = r.charAt(i);
                x = Integer.parseInt(z1 + "");
                y = Integer.parseInt(z2 + "");
                System.out.println(z1 + "  " + x + "  " + z2 + "  " + y);
                tbtn[x][y].setBackground(java.awt.Color.red);
              //  tbtn[x][y].setIcon(ic2);
                tbtn[x][y].setEnabled(false);
            }

        
          
       
    }
      public class e implements ActionListener {


    public void actionPerformed(ActionEvent e) {
       
        for(int i=1;i<9;i++){
            for(int j=1;j<7;j++)
           if(tbtn[i][j].isSelected()){
            tbtn[i][j].setBackground(java.awt.Color.BLUE);
        }
           else if(!tbtn[i][j].isEnabled()){
               tbtn[i][j].setBackground(java.awt.Color.red);
           }
            else{
               tbtn[i][j].setBackground(java.awt.Color.cyan);
           }
        }
    }

}
      
      void writeString(String[] ss,String[] ss2){
          
            try(FileOutputStream f = new FileOutputStream("Database.txt");
    ObjectOutput s = new ObjectOutputStream(f)) {
    s.writeObject(ss);
  
    
    
}
       catch(Exception e){
           System.out.println("error write obj"+e);
       }
             try(FileOutputStream f = new FileOutputStream("Database2.txt");
    ObjectOutput s = new ObjectOutputStream(f)) {
   s.writeObject(ss2);
    
    
}
       catch(Exception e){
           System.out.println("error write obj"+e);
       }
      }  
      
      
      
      String[] readStr(){
          String[] a=new String[30];
            try(FileInputStream in = new FileInputStream("Database.txt");
    ObjectInputStream s = new ObjectInputStream(in)) {
    a = (String[]) s.readObject();
 for(int i=1;i<a.length;i++){
     System.out.println("read data--"+a[i]);
 }
   
}
       catch(Exception e){
           System.out.println(e+"eee");
           
       }
          
          
          return a;
      }
        
    String[] readStry(){
          String[] a1=new String[30];
            try(FileInputStream in = new FileInputStream("Database2.txt");
    ObjectInputStream s = new ObjectInputStream(in)) {
    a1 = (String[]) s.readObject();
 for(int i=1;i<a1.length;i++){
     System.out.println("read data--"+a1[i]);
 }
   
}
       catch(Exception e){
           System.out.println(e+"eee");
           
       }
          
          
          return a1;
      }


      


    private void btnbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbkActionPerformed
        // TODO add your handling code here
        try {
            S1 = readStr();
            S2 = readStry();
            q = S1[id];
            r = S2[id];
        } catch (Exception e) {
            System.out.println("array index not found");
        }
       for(int i=1;i<9;i++){
            for(int j=1;j<7;j++){
           if(tbtn[i][j].isSelected()){
                    System.out.println(""+ i+""+j);
                tbtn[i][j].setEnabled(false);
          q=q+""+i;
          r=r+""+j;
       
                     
            }
            }
        }
       S1[id]=q;
       S2[id]=r;
        System.out.println(S1[id]+"           "+S2[id]);
          
        try {
            myObj.delete();
       myObj = new File("Database.txt");
       myObj2.delete();
       myObj2 = new File("Database2.txt");
     
      if (myObj.createNewFile() & myObj2.createNewFile()) {
        System.out.println("File updated " + myObj.getName());
            System.out.println("File updated " + myObj2.getName());
      } else {
        System.out.println("update error");
        
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
   //   e.printStackTrace();
    }
        writeString(S1,S2);
        System.out.println("File updated " + myObj.getName());
                System.out.println("File updated " + myObj2.getName());
                    JOptionPane.showMessageDialog(null, "Booked");
           
    }//GEN-LAST:event_btnbkActionPerformed

    private void btnbk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbk1ActionPerformed
        // TODO add your handling code here:
        
       this.dispose();
        new Info().setVisible(true);
    }//GEN-LAST:event_btnbk1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        int idd=1;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bookedseats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookedseats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookedseats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookedseats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          Bookedseats obj;
                obj = new Bookedseats(id);
                      obj.setVisible(true);
                 obj.addWindowListener(new WindowCloser(obj));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbk;
    private javax.swing.JButton btnbk1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblsc;
    private javax.swing.JPanel pnl2;
    // End of variables declaration//GEN-END:variables
}
