/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author NIROT
 */
public class Buku {
    String namaPengarang = "Nirot";
    String judulBuku = "Default judul";
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
    }
    public Buku(int cetakanKe, int hargaJual) {
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;       
    }
    public Buku(String judulBuku, int tahunTerbit, int cetakanKe) {
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
    }
    public void info(){
        System.out.println("Nama Pengarang : "+ namaPengarang + "\nJudul Buku : "+ judulBuku + "\nTahun Terbit : "+ tahunTerbit 
                + "\nCetakan Ke : " + cetakanKe + "\nHarga Jual : " + hargaJual +"\n");
    }
}
