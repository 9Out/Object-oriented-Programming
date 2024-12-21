/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author NIROT
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class demoText {
    public static void main(String[] args) {
        Utama u = new Utama();
        JLabel nama = new JLabel("Nama :");
        JLabel password = new JLabel ("Password :");
        JTextField inputNama = new JTextField(15);
        JPasswordField inputpw = new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputpw);
        u.add(panel);
    }
}
