/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author NIROT
 */
public class pegawai {
    String nama;
    int nip;
    double gaji;
    public String setNama(String nama){
        System.out.println("Nama saya : " + nama);
        return this.nama = nama;
    }
    public int setNip(int nip){
        System.out.println("NIP : " + nip);
        return this.nip = nip;
    }
    public double setGaji(double gaji){
        System.out.println("Besar Gaji : " + gaji);
        return this.gaji = gaji;
    }
}
