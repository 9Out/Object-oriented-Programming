/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NIROT
 */
import javax.swing.*;
import java.net.URL;
public class demoLabel {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(500,500);
        URL img = frameB.class.getResource("shakehand.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        u.add(panel);
    }
}
