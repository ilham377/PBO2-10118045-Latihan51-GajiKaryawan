/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan51gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : Program Gaji Karyawan
 */
public class PBO10118045Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager manager = new Manager();
        System.out.println("===Program Pergitungan Gaji Karyawan===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nik : ");
        manager.setNik(scanner.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (manager/kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t: "+manager.getNik());
        System.out.println("Nama\t: "+manager.getNama());
        System.out.println("Golongan: "+manager.getGolongan());
        System.out.println("Jabatan\t: "+manager.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN\t: "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: "+manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL\t: "+manager.gajiTotal());
              
        
    }
    
}
