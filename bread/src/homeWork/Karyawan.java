/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeWork;

/**
 *
 * @author NIROT
 */
public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;
    
    void beriNama (String Nama) {
        nama = Nama;
    }
     void beriAlamat (String Alamat) {
         alamat = Alamat;
    }
    void jabatanKaryawan (String Jabatan) {
        jabatan = Jabatan;
    }
    void nominalGaji (double Gaji) {
        gaji = Gaji;
    }
    
    
    void tampilkanNama(){
        System.out.println("Nama : " + nama);
    }
            
    void tampilkanJabatan() {
        System.out.println("Jabatan : "+jabatan);
    }
        
    void tampilkanALamat(){
        System.out.println("Alamat Rumah : "+ alamat);        
    }

    void tampilkanGaji(){
        System.out.println("Gaji Karyawan : "+ "$"+ gaji);
    }
           
}
