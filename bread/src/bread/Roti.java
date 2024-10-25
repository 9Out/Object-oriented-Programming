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
public class Roti {
    public static void main(String[] args) {
        Bread roti = new Bread ();
        roti.beriWarna("Hijau");
        roti.beriRasa("pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();
        
        Bread rotiTawar = new Bread ();
        rotiTawar.beriWarna("COKLAT");
        rotiTawar.beriRasa("Gurih");
        rotiTawar.timbangBerat(25);
        rotiTawar.hargaJual(10000);
        rotiTawar.infoRoti();
        
        Bread rotiSus = new Bread ();
        rotiSus.beriWarna("Putih");
        rotiSus.beriRasa("Manis");
        rotiSus.timbangBerat(5);
        rotiSus.hargaJual(5000);
        rotiSus.infoRoti();
        
        Bread Sandwich = new Bread ();
        Sandwich.beriWarna("Warna-warni");
        Sandwich.beriRasa("Asin");
        Sandwich.timbangBerat(40);
        Sandwich.hargaJual(20000);
        Sandwich.infoRoti();
    }
}
