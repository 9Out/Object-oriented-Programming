/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeWork;

/**
 *
 * @author NIROT
 */
public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;
    
    void beriNama (String Nama) {
        nama = Nama;
    }
     void beriAlamat (String Alamat) {
         alamat = Alamat;
    }
    void nimMahasiswa (String NIM) {
        nim = NIM;
    }
    void Semester (int Semester) {
        semester = Semester;
    }
    
    
    void tampilkanNama() {
        System.out.println("Nama : " + nama);
    }
    void tampilkanNim() {
        System.out.println("NIM Mahasiswa : " + nim);
    }
    
    void tampilkanAlamat() {
        System.out.println("Alamat Mahasiswa : " + alamat);
    }
    
    void tampilkanSemester() {
        System.out.println("Mahasiswa Semester : " + semester);
    }
           
}
