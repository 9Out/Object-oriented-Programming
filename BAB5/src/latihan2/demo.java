/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author NIROT
 */
public class demo {
    public static void main(String[] args) {
        Buku a = new Buku("Nirot", "bunga mimpi", 2024);
        Buku b = new Buku(2,50000);
        Buku c = new Buku("Booy", "satria mimpi", 2004);
        Buku d = new Buku("Baja HItam", 1982, 3);
        Buku e = new Buku("torwa", "jalan hati", 1983);
        Buku f = new Buku(5,210000);
        Buku g = new Buku("Peraih mimpi", 2003, 5);
        Buku h = new Buku("bintang tersembunyi", 2000, 19);
        Buku i = new Buku("koala", "lone", 2014);
        Buku j = new Buku("Nirot", "mimpi indah",2025);
        Buku k = new Buku(10, 100000); 
        
        a.info();
        b.info();
        c.info();
        d.info();
        e.info();
        f.info();
        g.info();
        h.info();
        i.info();
        j.info();
        k.info();
    }
}
