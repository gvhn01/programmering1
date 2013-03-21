/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap0;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gvhn01
 */
public class MyFrame extends JFrame {
    
    
    JLabel lbl;
    
    public MyFrame() {
    this.setLayout(new FlowLayout()); lbl = new JLabel("Java forever!");
    this.add(lbl);
    }
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(300, 300);
        f.setLocation(100,100);
        f.setTitle("Min GUI-applikation");
        f.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    
}//end class
