/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author NIROT
 */
public class LocalVariable {
       public void hitungUsia() {
        int usia ;
        int tahunSekarang = 2023;
        int tahunLahir = 2004;
      
        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia saya : " + usia);
    }
        public void beratBadan() {
            int beratLahir = 3;
            int umur = 20;
            int beratBadan;
        
            beratBadan = beratLahir + (umur/2);
        
            System.out.println("Usia saya : " + beratBadan);
        }
        
    public static void main(String[] args) {
        LocalVariable nirot = new LocalVariable();
        LocalVariable nirot2 = new LocalVariable();
        nirot2.beratBadan();
        nirot.hitungUsia();
    }
}
