/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeWork;

/**
 *
 * @author NIROT
 */
public class Demo {
   /*  public static void main(String[] args) {
         Karyawan nirot = new Karyawan ();
         nirot.beriNama("Nirot");
         nirot.jabatanKaryawan("Manager");
         nirot.nominalGaji(500000);

         nirot.tampilkanNama();
         nirot.tampilkanJabatan();
         nirot.tampilkanGaji();
     }*/
     
     
     public static void main(String[] args) {
         Mahasiswa nirot = new Mahasiswa ();
         nirot.beriNama("Nirot");
         nirot.nimMahasiswa("L200");
         nirot.Semester(3);

         nirot.tampilkanNama();
         nirot.tampilkanNim();
         nirot.tampilkanSemester();
     }
     
     
//     public static void main(String[] args) throws Exception{
//         Dosen nirot = new Dosen ();
//         nirot.namaDosen("Nirot");
//         nirot.nikDosen(200220);
//         nirot.beriTglLahir("04-04-2004");
//
//         nirot.tampilkanNama();
//         nirot.tampilkanNik();
//         nirot.tampilkanTglLahir();
//     }
}
