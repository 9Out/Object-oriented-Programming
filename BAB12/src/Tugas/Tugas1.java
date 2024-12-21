/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author NIROT
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Tugas1 {
    private String ans[] = {"Sangat tidak setuju", "Tidak setuju", "Kurang setuju", "Setuju", "Sangat setuju"};
    JPanel panel;
    JPanel panel1;
    JPanel panel2;
//    JPanel panel3;
    JMenu warna;
    public Tugas1() {
        //\ Buat Frame //\
        JFrame frame = new JFrame();
        //\ Buat Panel //\
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
//        panel3 = new JPanel();
        //\ Buat Label //\
        JLabel label = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek Jelas dan Mudah.");
        //\ Buat ComboBox //\
        JComboBox cbox = new JComboBox(ans);
        //\ Buat Menu //\
        JMenuBar menu = new JMenuBar();
        warna = new JMenu("Ubah Warna");
        JMenuItem mitem1 = new JMenuItem("Default");
        JMenuItem mitem2 = new JMenuItem("Merah");
        JMenuItem mitem3 = new JMenuItem("Kuning");
        JMenuItem mitem4 = new JMenuItem("Hijau");

        
        //\ Atur Frame //\
        frame.setTitle("  Tugas 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //\ Ganti Logo //\
        ImageIcon img = new ImageIcon(getClass().getResource("java.png"));
        frame.setIconImage(img.getImage());
        //\ Atur Panel //\
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridLayout(2, 1));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
//        panel.setLayout(new FlowLayout());
//        panel1.setBorder(BorderFactory.createLineBorder(Color.cyan, 3, true));
        //\ Atur Label //\
//        label.setBorder(BorderFactory.createLineBorder(Color.cyan, 3, true));
        //\ Atur MenuBar //\
        menu.setBorder(BorderFactory.createEtchedBorder(null, Color.LIGHT_GRAY));
        //\ Atur Menu //\
        warna.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        //\ Add to Panel //\
        panel.add(panel1);
        panel.add(panel2);
//        panel.add(panel3);
        panel1.add(label);
        panel2.add(cbox);
//        panel3.add(menu);
        
        //\ Add to Frame //\
        frame.add(panel, BorderLayout.CENTER);
        frame.setJMenuBar(menu);
        //\ Menu Add //\
        menu.add(warna);
        warna.add(mitem2);
        warna.add(mitem3);
        warna.add(mitem4);
        warna.addSeparator();
        warna.add(mitem1);
        
        //\ Action Listener //\
        MenuItemListener menuItemListener = new MenuItemListener();
        mitem1.addActionListener(menuItemListener);
        mitem2.addActionListener(menuItemListener);
        mitem3.addActionListener(menuItemListener);
        mitem4.addActionListener(menuItemListener);

        //\ Visible //\
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    
    public static void main(String[] args) {
        Tugas1 tugas = new Tugas1();
    }
    
    class MenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {            
            if (e.getActionCommand() == "Default") {
                panel.setBackground(null);
                panel1.setBackground(null);
                panel2.setBackground(null);
                //panel3.setBackground(null);
            }else if (e.getActionCommand() == "Merah") {
                panel.setBackground(Color.red);
                panel1.setBackground(Color.red);
                panel2.setBackground(Color.red);
                //panel3.setBackground(Color.red);
            }else if ("Kuning".equals(e.getActionCommand())) {
                panel.setBackground(Color.yellow);
                panel1.setBackground(Color.yellow);
                panel2.setBackground(Color.yellow);
                //panel3.setBackground(Color.yellow);
            }else if ("Hijau".equals(e.getActionCommand())) {
                panel.setBackground(Color.green);
                panel1.setBackground(Color.green);
                panel2.setBackground(Color.green);
                //panel3.setBackground(Color.green);
            }
            
        }    
    }
}
