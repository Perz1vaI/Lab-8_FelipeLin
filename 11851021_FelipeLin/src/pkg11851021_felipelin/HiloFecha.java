/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11851021_felipelin;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author felipelinzhao
 */
public class HiloFecha implements Runnable {
    
    private JLabel fecha;
    
    public HiloFecha() {
    }
    
    public HiloFecha(JLabel fecha) {
        this.fecha = fecha;
    }
    
    public JLabel getFecha() {
        return fecha;
    }
    
    public void setFecha(JLabel fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public void run() {
        
        Date h = new Date();
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        fecha.setText(f.format(h));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
