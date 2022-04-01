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
        Paquete p = new Paquete("Tela", "Camino Escuzar 1 3D", 1);
        Paquete p2 = new Paquete("Rueda", "Camino Escuzar 1 3D", 2);
        Paquete p3 = new Paquete("Cuerda", "Camino Escuzar 1 3D", 1);
        Paquete p4 = new Paquete("Cuerda", "Camino Escuzar 1 3D", 3);
        
        //System.out.println(p.compareTo(p3));
        
        TransportistaOrdenado t = new TransportistaOrdenado(1000);
        t.subirCamion(p);
        t.subirCamion(p2);
        //t.subirCamion(p3);
        //t.subirCamion(p4);
        t.enviar();
       
    }
}
