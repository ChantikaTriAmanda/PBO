/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Lenovo
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PeminjamanExample {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Peminjaman data = new Peminjaman();
        String nama_nasabah, tgl_pinjam;
        int kode_pinjam, jum_pinjam, lama_pinjam, bunga, angsuran;
        
        System.out.println("\n==== INPUT DATA ====\n");
        System.out.print("Masukkan Kode Pinjam = ");
        try{
            kode_pinjam = Integer.parseInt(in.readLine());
            System.out.print("Masukkan Nama Nasabah = ");
            nama_nasabah = in.readLine();
            System.out.print("Masukkan Tanggal Pinjaman = ");
            tgl_pinjam = in.readLine();
            System.out.print("Masukkan Jumlah Pinjaman = ");
            jum_pinjam = Integer.parseInt(in.readLine());
            System.out.print("Masukkan Lama Pinjaman = ");
            lama_pinjam = Integer.parseInt(in.readLine());
            
            bunga = ((jum_pinjam * 10) / 100) / lama_pinjam;
            angsuran = (jum_pinjam / lama_pinjam) + bunga;
            
            data.setNilai(nama_nasabah, kode_pinjam, tgl_pinjam, jum_pinjam, lama_pinjam, bunga, angsuran);
        }catch(IOException ex){
            System.out.println("Program ada yang ERROR!!!");
        }
        
    }
}
