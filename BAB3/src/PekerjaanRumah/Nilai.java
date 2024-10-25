/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PekerjaanRumah;

/**
 *
 * @author NIROT
 */
public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    double nilaiTotal;
    double UTS = nilaiUTS;
    double UAS = nilaiUAS;
    double Tugas = nilaiTugas;
    
    public void setNilai(int nilaiUTS, int nilaiUAS, int nilaiTugas){
        UTS = nilaiUTS;
        UAS = nilaiUAS;
        Tugas = nilaiTugas;
        
        this.nilaiTotal = (UTS + UAS + Tugas) / 3.0;

    }
    public void tampilkanInfo() {
        System.out.println("UTS : " + UTS);
        System.out.println("UAS : " + UAS);
        System.out.println("Total : " + nilaiTotal);
        System.out.println("tugas : " + Tugas);
    }
     public double getNilaiTotal() {
        return nilaiTotal;
    }

    public static void main(String[] args) {
        // Membuat objek Nilai dengan data yang berbeda
        Nilai nilai1 = new Nilai();
        nilai1.setNilai(90, 80, 90);
        Nilai nilai2 = new Nilai();
        nilai2.setNilai(70, 78, 90);

        // Menampilkan informasi masing-masing nilai
        System.out.println("Informasi Nilai 1:");
        nilai1.tampilkanInfo();

        System.out.println("\nInformasi Nilai 2:");
        nilai2.tampilkanInfo();

        // Menggunakan method getNilaiTotal() untuk mendapatkan nilai total
        double total1 = nilai1.getNilaiTotal();
        double total2 = nilai2.getNilaiTotal();

        System.out.println("\nNilai Total 1: " + total1);
        System.out.println("Nilai Total 2: " + total2);
    }
}
