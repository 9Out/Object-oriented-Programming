/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeWork;

import java.util.Date;

/**
 *
 * @author NIROT
 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    Date tglLahir;
    
    void namaDosen (String Nama) {
        nama = Nama;
    }
     void pendidikanTerakhir (String pendidikanTerakhir) {
         pendidikan = pendidikanTerakhir;
    }
    void nikDosen (int NIK) {
        nik = NIK;
    }
    void beriTglLahir (String Lahir) throws Exception{
        Date tgl = new SimpleDateFormat("dd-MM-yyyy").parse(Lahir);
        tglLahir = tgl;
    }
    

    void tampilkanNama() {
        System.out.println("Nama : " + nama);
    }
         
    void tampilkanTglLahir() {
        SimpleDateFormat lahir = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("Tanggal Lahir : " + lahir.format(tglLahir));
    }
            
    void tampilkanNik() {
        System.out.println("NIK Dosen: " + nik);
    }       
}
