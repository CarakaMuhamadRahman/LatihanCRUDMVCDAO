/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carakamuhamadrahman.latihanmvcjdbc.main;

import edu.carakamuhamadrahman.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.carakamuhamadrahman.latihanmvcjdbc.entity.Pelanggan;
import edu.carakamuhamadrahman.latihanmvcjdbc.error.PelangganException;
import edu.carakamuhamadrahman.latihanmvcjdbc.service.PelangganDao;
import edu.carakamuhamadrahman.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrator
 * NIM : 10119058
 * NAMA : Caraka Muhamad Rahman
 * KELAS : IF - 2
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.carakamuhamadrahman.latihanmvcjdbc.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override                                    
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         
    }
    
}
