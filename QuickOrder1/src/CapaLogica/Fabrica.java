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
    
    public IUsuario GetUsuario(){
        return new Usuario();
    }
    
    public IPedido GetPedido(){
        return new Pedido();
    }
    
    public IProducto GetProducto(){
        return new Producto();
    }
    
    public IRestaurante GetRestaurante(){
        return new Restaurante();
    }
}
