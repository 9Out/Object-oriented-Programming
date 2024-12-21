/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NIROT
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
public class frameB extends javax.swing.JFrame {
    public frameB(){
        super("Frame dan Button");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        frameB b =new frameB();
        JPanel panel = new JPanel();
        URL img = frameB.class.getResource("shakehand.png");
        JButton ok = new JButton("OK");
        JButton ji = new JButton(new ImageIcon(img));
        panel.add(ok);
        panel.add(ji);
        b.add(panel);
        b.setVisible(true);
    }
}
