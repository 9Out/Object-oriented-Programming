/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author NIROT
 */
public class LocalVariable {
    int umur = 20;
    public void beratBadan() {
            int beratLahir = 3;
            int beratBadan;
        
            beratBadan = beratLahir + (umur/2);
        
            System.out.println("Berat saya : " + beratBadan);
        }
        
    public static void main(String[] args) {
        LocalVariable nirot2 = new LocalVariable();
        nirot2.beratBadan();

    }
}