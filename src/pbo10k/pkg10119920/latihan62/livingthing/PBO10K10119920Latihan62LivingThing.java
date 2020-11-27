/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class PBO10K10119920Latihan62LivingThing {

    public static void main(String[] args) {
        
        Human h = new Human();
        h.setNama("Rizki Adam Kurniawan");
        
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
}
