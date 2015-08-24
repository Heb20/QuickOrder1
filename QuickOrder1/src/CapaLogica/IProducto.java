/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import EntidadesCompartidas.Producto;
import java.util.ArrayList;

/**
 *
 * @author Romina
 */
public interface IProducto {
    public void AltaProducto(Producto producto);
    
    //Devuelve una lista de los productos de un restaurante
    public ArrayList<Producto> ListarProductosPorRestaurante(EntidadesCompartidas.Restaurante restaurante);
}
