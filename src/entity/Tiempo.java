/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 19 jun 2023                        *
 * Fecha de actualización: 19 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package entity;


public class Tiempo {
    private int hora;
    private int minuto; 
    private int segundo;

    public Tiempo(int hora,int minuto,int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }    
        
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
