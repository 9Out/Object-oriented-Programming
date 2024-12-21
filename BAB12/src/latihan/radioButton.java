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
public class radioButton {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(1000,100);
        
        JRadioButton[] teams = new JRadioButton [4];
        teams [0] = new JRadioButton("Sangat tidak setuju");
        teams [1] = new JRadioButton("Tidak Setuju");
        teams [2] = new JRadioButton("Kurang Setuju");
        teams [3] = new JRadioButton("Setuju", true);
        teams [3] = new JRadioButton("Sangat Setuju");
        JPanel panel = new JPanel ();
        JLabel Pernyataan = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah.");
        panel.add(Pernyataan);
        
        ButtonGroup group = new ButtonGroup();
        for(int i = 0; i<teams.length; i++){
            group.add(teams[i]);
            panel.add(teams[i]);
        }
        u.add(panel);
        u.setVisible(true);
    }
}
