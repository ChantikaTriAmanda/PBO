/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;


public class Peminjaman {
    public String nama_nasabah;
    private int kode_pinjam;
    private String tgl_pinjam;
    private int jum_pinjam;
    private int lama_pinjam;
    private int bunga;
    private int angsuran;
    
    public int getKode(){
        return kode_pinjam;
    }
    public String getName(){
        return nama_nasabah;
    }
    public String getTgl(){
        return tgl_pinjam;
    }
    public int getJml(){
        return jum_pinjam;
    }
    public int getLama(){
        return lama_pinjam;
    }
    
    public void setNilai(String nama_nasabah, int kode_pinjam, String tgl_pinjam, int jum_pinjam, int lama_pinjam, int bunga, int angsuran){
        System.out.println("\n\n==== DATA PEMINJAMAN ====\n");
        System.out.println("Kode Pinjam = "+kode_pinjam);
        System.out.println("Nama Nasabah = "+nama_nasabah);
        System.out.println("Tanggal Pinjaman = "+tgl_pinjam);
        System.out.println("Jumlah Pinjaman = "+jum_pinjam);
        System.out.println("Lama Pinjaman = "+lama_pinjam);
        System.out.println("Bunga = "+bunga);
        System.out.println("Angsuran = "+angsuran);
        System.out.println("\n===================================\n");
        
        
        
        
    }
    
    
    
    
    
}
