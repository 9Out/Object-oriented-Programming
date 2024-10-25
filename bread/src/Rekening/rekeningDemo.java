/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rekening;

/**
 *
 * @author NIROT
 */
public class rekeningDemo {
    public static void main(String[] args) {
        rekening nirot = new rekening ();
        nirot.menabung(2000);
        nirot.cek_saldo();
        nirot.menabung(5000);
        nirot.cek_saldo();

        nirot.transfer(234515653);
        nirot.menarik(500);
        nirot.cek_saldo();
    }
}
