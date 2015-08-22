/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

/**
 *
 * @author Romina
 */
public class Fabrica {

    public Fabrica() {
    }
    
    IUsuario GetUsuario(){
        return new Usuario();
    }
    
    IPedido GetPedido(){
        return new Pedido();
    }
    
    IProducto GetProducto(){
        return new Producto();
    }
    
    IRestaurante GetRestaurante(){
        return new Restaurante();
    }
}
