/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rekening;

/**
 *
 * @author NIROT
 */
public class rekening {
    int saldo;
    int no_rekening;

    void cek_saldo () {
    System.out.println("Saldo : " + "Rp"+ saldo + "\n");
    }

    void menabung (int menabung) {
    saldo = menabung + saldo ;
    System.out.println("menabung : " +"Rp"+ menabung);
    }
    void menarik (int menarik) {
    saldo = saldo - menarik;
    System.out.println("menarik: " + "Rp" + menarik);
    }
    
    void transfer (int noRekening) {
    no_rekening = noRekening ;
    System.out.println("transfer ke nomer rekening = " + no_rekening + "\n");  
    }
    
}