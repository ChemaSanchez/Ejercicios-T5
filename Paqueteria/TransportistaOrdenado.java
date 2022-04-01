/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paqueteria;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Chema
 */
public class TransportistaOrdenado{
    private List<Paquete> paquetes;
    private long tiempoEntrega;

    public TransportistaOrdenado(long te) {
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
        
    }
    
}
