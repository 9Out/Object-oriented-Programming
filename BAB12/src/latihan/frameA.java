/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NIROT
 */
import java.awt.Container;
import javax.swing.JButton;
public class frameA extends javax.swing.JFrame{
    public frameA(){
        super("Frame and Button");
        setSize(100,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        frameA f = new frameA();
        Container kon = f.getContentPane();
        JButton jb = new JButton("OK");
        kon.add(jb);
    }
            
    
}
