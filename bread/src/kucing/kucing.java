/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kucing;

/**
 *
 * @author NIROT
 */
public class kucing {
    int umur;
    String warnaBulu;
       
    void umurKucing (int umurKucing) {
    umur = umurKucing;
    }
    
    void beriWarna (String warnaCat) {
    warnaBulu = warnaCat;
    }
    
    void meong () {
    System.out.println(
    "Umur Kucing : " + umur + " Bulam" + "\n" +
    "warna bulu : " + warnaBulu + "\n");
    }
}
