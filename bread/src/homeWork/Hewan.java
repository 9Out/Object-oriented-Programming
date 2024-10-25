/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeWork;

/**
 *
 * @author NIROT
 */
public class Hewan {
    String Hewan;
    String Makanan;
    int jmlKaki;
    String type;
    
    void namaHewan (String namaHewan) {
        Hewan = namaHewan; 
    }
    
    void jenisMakanan (String jenisMakanan) {
        Makanan = jenisMakanan;
    }
    
    void jumlahKaki (int jumlahKaki) {
        jmlKaki = jumlahKaki;
    }
    
    void typeHewan (String typeHewan) {
        type = typeHewan;
    }
    
    void detailHewan() {
        System.out.println(
      "Nama Hewan : " + Hewan + "\n"+
      "Jumlah Kaki : " + jmlKaki + "\n" +
      "Makanan : " + Makanan + "\n" +
      "Type Hewan : " + type + "\n"
        );
    }
}
