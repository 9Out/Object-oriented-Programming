/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author NIROT
 */
public class ParamConstructor {
    String nama, nim ;
    int semester;
    
    public ParamConstructor(String nama, int semester, String nim) {
    this.nama = nama;
    this.semester = semester;
    this.nim = nim;
    }
    public void info(){
        System.out.println("Nama : "+ nama + "\nNim : "+ nim + "\nSemester : "+ semester);
    }
}
