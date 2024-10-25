/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeWork;

/**
 *
 * @author NIROT
 */
public class hewanDemo {
    public static void main(String[] args) {
        Hewan Harimau = new Hewan ();
        Harimau.namaHewan("Harimau");
        Harimau.jenisMakanan("Daging");
        Harimau.jumlahKaki(4);
        Harimau.typeHewan("Karnivora");
        Harimau.detailHewan();
        
        Hewan Kerbau = new Hewan ();
        Kerbau.namaHewan("Kerbau");
        Kerbau.jenisMakanan("Rumput");
        Kerbau.jumlahKaki(4);
        Kerbau.typeHewan("Herbivora");
        Kerbau.detailHewan();
        
        Hewan Elang = new Hewan ();
        Elang.namaHewan("Elang");
        Elang.jenisMakanan("Daging");
        Elang.jumlahKaki(2);
        Elang.typeHewan("Karnivora");
        Elang.detailHewan();
    }
}
