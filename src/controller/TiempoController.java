/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 19 jun 2023                        *
 * Fecha de actualización: 19 jun 2023                   *
 * Descripción: Clase para
 **************************************************** */
package controller;

import entity.Tiempo;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class TiempoController implements Runnable {

    private boolean estado = false;
    private Tiempo tiempo;
    private Thread hilo;
    private JLabel label;
    private DecimalFormat formato = new DecimalFormat("00");

    public TiempoController(JLabel label) {
        this.tiempo = new Tiempo(0, 0, 0);
        this.label = label;
    }

    public void iniciar() {
        estado = true;
        hilo = new Thread(this);
        hilo.start();
    }

    public void parar() {
        estado = false;
        hilo.interrupt();
    }

    private void setTiempos() {        
        label.setText(formato.format(tiempo.getHora()) + ":"
                + formato.format(tiempo.getMinuto()) + ":"
                + formato.format(tiempo.getSegundo()));
    }

    @Override
    public void run() {
        while (estado) {
            tiempo.setSegundo(tiempo.getSegundo() + 1);
            
            if (tiempo.getSegundo() == 60) {
                tiempo.setSegundo(0);
                tiempo.setMinuto(tiempo.getMinuto() + 1);
            } else if (tiempo.getMinuto() == 60) {
                tiempo.setMinuto(0);
                tiempo.setHora(tiempo.getHora() + 1);
            } else if (tiempo.getHora() == 24) {
                tiempo.setHora(0);
            }
            setTiempos();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TiempoController.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }
}
