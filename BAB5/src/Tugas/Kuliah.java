/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author NIROT
 */
public class Kuliah {
    String nama = "As'ad Nirot A";
    String nim = "L200220155";
    int angkatan = 2022;
    String fakultas;
    String prodi;
    
    public Kuliah (){
        System.out.println("Nama : "+ nama + "\nNim : "+ nim + "\nAngkatan : "+angkatan);
    }
    
    public Kuliah(String fakultas, String prodi, int angkatan){
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.angkatan = angkatan;
    }
 
    public void info(){
        System.out.println("Fakultas : "+ fakultas + "\nProdi : "+ prodi + "\nAngkatan : "+ angkatan);
    }
}
