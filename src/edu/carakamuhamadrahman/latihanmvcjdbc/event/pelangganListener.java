/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carakamuhamadrahman.latihanmvcjdbc.event;

import edu.carakamuhamadrahman.latihanmvcjdbc.entity.Pelanggan;
import edu.carakamuhamadrahman.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Administrator
 * NIM : 10119058
 * NAMA : Caraka Muhamad Rahman
 * KELAS : IF - 2
 */
public interface pelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);

   

    

   
}
