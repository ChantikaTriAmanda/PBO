/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chantika1.controller;
import Chantika1.model.*;
import Chantika1.view.FormPeminjaman;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private BukuDao bukuDao;
    private AnggotaDao anggotaDao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        bukuDao = new BukuDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxttglpinjam().setText("");
        formPeminjaman.getTxttglkembali().setText("");
    }
    
    public void setCbonobp(){
        formPeminjaman.getCbonobp().removeAllItems();
        List<Anggota> list = anggotaDao.getAll();
        for(Anggota anggota : list){
            formPeminjaman.getCbonobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
                    
        }
    }
    
    public void setCbokode(){
        formPeminjaman.getCbokode().removeAllItems();
        List <Buku> list = bukuDao.getAll();
        for(Buku buku : list){
            formPeminjaman.getCbokode().
                    addItem(buku.getKodebuku());
                    
        }
    }
    
    public void save(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getCbonobp().
                getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodebuku(formPeminjaman.getCbokode().
                getSelectedItem().toString().split("-")[0]);
        peminjaman.setTglpinjam(formPeminjaman.getTxttglpinjam().toString());
        peminjaman.setTglkembali(formPeminjaman.getTxttglkembali().toString());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Ok");
        
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblpinjam().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAll();
            for(Anggota anggota : listAnggota){
                if(anggota.getNobp() == peminjaman.getNobp()){
                    formPeminjaman.getCbonobp().setSelectedItem(anggota.getNobp()+" - "+anggota.getNama());
                    break;
                }
            }
            formPeminjaman.getCbokode().setSelectedItem(peminjaman.getKodebuku());
            formPeminjaman.getTxttglpinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxttglkembali().setText(peminjaman.getTglkembali());
        }
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPeminjaman.getTblpinjam().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali(),
            };
            tabelModel.addRow(data);
        }
    }
    
}
