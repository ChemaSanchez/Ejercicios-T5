/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paqueteria;

import java.util.Objects;

/**
 *
 * @author Chema
 */
public class Paquete implements Comparable<Paquete>{
    public static final int ALTA = 1;
    public static final int MEDIA = 2;
    public static final int BAJA = 3;
    
    private String producto;
    private String direccionDestino;
    private int prioridad;

    public Paquete(String pro, String dd, int pri) {
        this.producto = pro;
        this.direccionDestino = dd;
        
        
        if(pri != ALTA && pri != MEDIA && pri != BAJA){
            throw new IllegalArgumentException("El numero de prioridad no es valido; Prioridad = [ 1, 2, 3 ] ");
        }

        this.prioridad = pri;
    }

    public String getProducto() {
        return producto;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paquete other = (Paquete) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.direccionDestino, other.direccionDestino)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.producto);
        hash = 79 * hash + Objects.hashCode(this.direccionDestino);
        return hash;
    }
    
    public int compareTo(Paquete p) {
        //Integer prioridadp = p.getPrioridad();
        //return prioridadp.compareTo(this.prioridad);
        return this.prioridad - p.getPrioridad();
    } 
    
}
