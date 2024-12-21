/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author NIROT
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class coba {
    public static void main(String[] args) {
        // Create a new JFrame container.
        JFrame frame = new JFrame("Tugas 1");
        JPanel panel = new JPanel();
        JLabel JUDUL = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah.");
        panel.add(JUDUL);
        frame.add(panel);

        JMenuBar menu = new JMenuBar();
        JMenu warna = new JMenu("Ubah Warna");
        JMenuItem mitem1 = new JMenuItem("Default");
        JMenuItem mitem2 = new JMenuItem("Merah");
        JMenuItem mitem3 = new JMenuItem("Kuning");
        JMenuItem mitem4 = new JMenuItem("Hijau");
        
        // Specify FlowLayout for the layout manager.
        frame.setLayout(new FlowLayout());

        // Give the frame an initial size.
        frame.setSize(400, 200);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setJMenuBar(menu);
        
        menu.add(warna);
        warna.add(mitem2);
        warna.add(mitem3);
        warna.add(mitem4);
        warna.addSeparator();
        warna.add(mitem1);

        // Terminate the program when the user closes the application.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an array of strings to be used as items for the combo box.
        String[] pernyataan = { "Sangat Tidak Setuju", "Tidak Setuju", "Kurang Setuju", "Setuju", "Kurang Setuju" };

        // Create a new JComboBox.
        JComboBox<String> jcb = new JComboBox<>(pernyataan);

        // Add the combo box to the content pane.
        frame.add(jcb);

        // Display the frame.
        frame.setVisible(true);
        
      mitem1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              frame.getContentPane().setBackground(null);
          }
      });
      mitem2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              frame.getContentPane().setBackground(Color.RED);
          }
      });
      mitem3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              frame.getContentPane().setBackground(Color.YELLOW);
          }
      });
      mitem4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              frame.getContentPane().setBackground(Color.GREEN);
          }
      });
    }
}
