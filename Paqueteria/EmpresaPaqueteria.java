/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paqueteria;

import java.util.List;

/**
 *
 * @author Chema
 */
public interface EmpresaPaqueteria {
    
    public void registrarPedido(Paquete p);
    public List<Transportista> getTransportistas();
    public default void enviarPaquetes(){
        for (int i = 0; i < getTransportistas().size(); i++){
            //Enviar Paquete 
        }
    }
    
}
