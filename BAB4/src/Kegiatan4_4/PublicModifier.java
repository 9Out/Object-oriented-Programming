/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kegiatan4_4;

/**
 *
 * @author NIROT
 */
public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;
    
    public void kali() {
        int d = a*b*c;
        System.out.println("Hasil kali= " +d);
    }
    
    public void tambah(){
        int e = a + b + c ;
        System.out.println("Hasil tambah= " +e);
    }
    
    public void kurang(){
        int d = a - b - c;
        System.out.println("Hasil kurang= " +d);
    }
    
    public void bagi(){
        int e = a / b / c;
        System.out.println("Hasil bagi= " +e); 
    }
            
    public void rata_rata(){
        int d = a + b + c ;
        int e = d/3;
        System.out.println("Hasil rata_rata= " +e);
    }
}
