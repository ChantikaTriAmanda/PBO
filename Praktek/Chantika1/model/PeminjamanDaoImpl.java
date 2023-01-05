/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chantika1.model;
import Chantika1.model.Peminjaman;
import Chantika1.model.PeminjamanDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class PeminjamanDaoImpl {
    List<Peminjaman> data = new ArrayList<>();
    
    
    public PeminjamanDaoImpl(){
        data.add(new Peminjaman("2101092046","B001","2023-11-24","2023-12-24"));
    }
    
    void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    void delete (int index){
        data.remove(index);
    }
    Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    List<Peminjaman> getAllPeminjaman(){
        return data;
    }
}
