/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Ilvi Yahya
 */
public class main {
    private static Object a;
            
        public static void main(String[] args) {
            Manusia m = new Manusia();
            m.setMata("Biru");
            System.out.println("Manusia itu memiliki mata " + m.getMata());
                
            Pesawat_Telepon p = new Pesawat_Telepon();
            p.setKabel("Hitam");
            System.out.println("Warna kabel telepon itu adalah " +  p.getKabel());
        }
}
