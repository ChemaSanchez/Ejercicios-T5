/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paqueteria;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chema
 */
public class Transportista{
    private List<Paquete> paquetes;
    private long tiempoEntrega;

    public Transportista(long te) {
        paquetes = new ArrayList<>();
        this.tiempoEntrega = te;
    }
    
    public void subirCamion(Paquete p){
        paquetes.add(p);
    }

    public long getTiempoEntrega() {
        return tiempoEntrega;
    }
    
    public void enviar(){
        System.out.println(paquetes.size());
        
        for (int i = 0; i < paquetes.size(); i++){

            try {
                Paquete SelectPaquete = paquetes.get(i);
                Thread.sleep(tiempoEntrega);
                System.out.println("El paquete "+SelectPaquete.getProducto()+" con prioridad "+SelectPaquete.getPrioridad()+" ha llegado a: "+SelectPaquete.getDireccionDestino()+".");
            } catch (InterruptedException ex) {
                Logger.getLogger(Transportista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        paquetes.clear();
    }
    
}
