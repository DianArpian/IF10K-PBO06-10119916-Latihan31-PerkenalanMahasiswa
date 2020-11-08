/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program :Perkenalan Mahasiswa
 */

public class PBO0610119916Latihan31PerkenalanMahasiswa {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10110269";
        mhs.nama = "Rizki Adam Kurniawan";
        mhs.perkenalkanDiri();
        System.out.println();
        
        mhs.nim = "10110270";
        mhs.nama = "Indra Tiola";
        mhs.perkenalkanDiri();
        System.out.println();
        
        mhs.nim = "10110271";
        mhs.nama = "Robi Tanzil Ganefi";
        mhs.perkenalkanDiri();
        System.out.println();
        
        mhs.nim = "10110269";
        mhs.nama = "Muhammad Nur Awaludin";
        mhs.perkenalkanDiri();
        System.out.println();
        }
    }
