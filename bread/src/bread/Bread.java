/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bread;

/**
 *
 * @author RPL-11-PC
 */
public class Bread {
    String warna;
    String rasa;
    int berat;
    double harga;

    void beriWarna (String warnaRoti) {
    warna = warnaRoti;
    }
    
    void beriRasa (String rasaRoti) {
    rasa = rasaRoti;
    }
    
    void timbangBerat (int beratRoti) {
    berat = beratRoti;
    }
    
    void hargaJual (double hargaRoti) {
    harga = hargaRoti;
    }
    
    void infoRoti () {
        System.out.println(
        "warna Roti : " + warna + "\n" +
        "Rasa Roti : " + rasa + "\n" +
        "Berat Roti : " + berat + "gr" + "\n"  +
        "Harga Roti : Rp. " + harga + "\n");
    }
}
    
    /**
     * @param args the command line arguments
     */
