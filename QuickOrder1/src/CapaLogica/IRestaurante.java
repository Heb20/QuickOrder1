/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import EntidadesCompartidas.Categoria;
import EntidadesCompartidas.Restaurante;
import java.util.ArrayList;

/**
 *
 * @author Romina
 */
public interface IRestaurante {
    
    public void AltaCategoria(Categoria categoria);
    
    //Naty-Da de alta un nuevo restaurante en el sistema
    public boolean RegistrarRestaurante(String nickname, String email, String nombre, String direccion, ArrayList<String> ListaImagenes, ArrayList<Categoria> ListaCategorias); 
    //Naty-Devuelve una lista con categorías seleccionadas de entre todas las categorías existentes en el Sistema
    public ArrayList<Categoria> SeleccionarCategorias(ArrayList<Categoria> categorias);
    //Naty-Devuelve una lista de imagenes
    public ArrayList<String> SeleccionarImagenes(ArrayList<String> imagenes);
    
    
    //Devuelve una lista con todas las categorias
    public ArrayList<Categoria> ListaCategorias();
    
    //Devuelve una lista con todos los restaurantes asociados a esa categoria
    public ArrayList<Restaurante> ListaRestaurantePorCategoria(String categoria);
}
