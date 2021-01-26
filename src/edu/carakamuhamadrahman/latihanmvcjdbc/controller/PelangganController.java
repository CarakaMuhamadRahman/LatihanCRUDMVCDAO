/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carakamuhamadrahman.latihanmvcjdbc.controller;

import edu.carakamuhamadrahman.latihanmvcjdbc.model.PelangganModel;
import edu.carakamuhamadrahman.latihanmvcjdbc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 * NIM : 10119058
 * NAMA : Caraka Muhamad Rahman
 * KELAS : IF - 2
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetPelanggan(PelangganView view) {
        model.resetPelanggan(); 
    }
    
     public void insertPelanggan(PelangganView view) {
       String nama    = view.getTxtNama().getText();
       String alamat  = view.getTxtAlamat().getText();
       String telepon = view.getTxtTelepon().getText();
       String email   = view.getTxtEmail().getText();
       
         if (nama.trim().equals("")) {
             JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
         } else if (nama.length()>225) {
             JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter");
         } else if (telepon.length()>12) {
             JOptionPane.showMessageDialog(view, "Nomer telepon tidak boleh lebih dari 12 digit");
         } else if (!email.contains("@")|| !email.contains(".")) {
             JOptionPane.showMessageDialog(view, "Email tidak valid");
         } else {
             
             model.setNama(nama);
             model.setAlamat(alamat);
             model.setTelepon(telepon);
             model.setEmail(email);
             
             try {
                 model.insertPelangggan();
                 JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Ditambahkan");
                 model.resetPelanggan();
             } catch (Throwable throwable) {
                 JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan", throwable.getMessage()});
             }
             
         }         
    }
     
     public void updatePelanggan(PelangganView view) {
         
         if (view.getTablePelanggan().getSelectedRowCount()==0) {
             
             JOptionPane.showMessageDialog(view, "Silahkan Seleksi baris data yang akan diubah");
             return;
         }
         
       Integer id = Integer.parseInt(view.getTxtId().getText());
       
       String nama    = view.getTxtNama().getText();
       String alamat  = view.getTxtAlamat().getText();
       String telepon = view.getTxtTelepon().getText();
       String email   = view.getTxtEmail().getText();
       
         if (nama.trim().equals("")) {
             JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
         } else if (nama.length()>225) {
             JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter");
         } else if (telepon.length()>12) {
             JOptionPane.showMessageDialog(view, "Nomer telepon tidak boleh lebih dari 12 digit");
         } else if (!email.contains("@")||!email.contains(".")) {
             JOptionPane.showMessageDialog(view, "Email tidak valid");
         } else {
             
             model.setId(id);
             model.setNama(nama);
             model.setAlamat(alamat);
             model.setTelepon(telepon);
             model.setEmail(email);
             
             try {
                 model.updatePelangggan();
                 JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Ubah");
                 model.resetPelanggan();
             } catch (Throwable throwable) {
                 JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan", throwable.getMessage()});
             }
             
         }   
    }
    
     public void deletePelanggan(PelangganView view) {
         
         if (view.getTablePelanggan().getSelectedRowCount()==0) {
             
             JOptionPane.showMessageDialog(view, "Silahkan Seleksi baris data yang akan dihapus");
             return;
         }
         
         if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus?")==JOptionPane.OK_OPTION) {
             Integer id = Integer.parseInt(view.getTxtId().getText());
             model.setId(id);
             
             
             try {
                 model.deletePelangggan();
                 JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Hapus");
                 model.resetPelanggan();
             } catch (Throwable throwable) {
                 JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan", throwable.getMessage()});
             }
             
         }
       
    }
    
    
}
