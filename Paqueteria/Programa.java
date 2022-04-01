/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paqueteria;

/**
 *
 * @author Chema
 */
public class Programa {
    public static void main (String args[]){
        Paquete p = new Paquete("Rueda", "Camino Escuzar 1 3D", 1);
        Paquete p2 = new Paquete("Rueda", "Camino Escuzar 1 3D", 1);
        Paquete p3 = new Paquete("Cuerda", "Camino Escuzar 1 3D", 3);
        
        System.out.println(p.compareTo(p3));
        
        Transportista t = new Transportista(1000);
        t.subirCamion(p);
        t.subirCamion(p3);
        t.enviar();
    }
}
