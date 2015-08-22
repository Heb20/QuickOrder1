/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import EntidadesCompartidas.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Romina
 */
public interface IRestaurante {
    
    public void AltaCategoria(Categoria categoria);
    
    //Naty
    public boolean RegistrarRestaurante(String nickname, String email, String nombre, String direccion, ArrayList<String> ListaImagenes, ArrayList<Categoria> ListaCategorias); 
    //Naty
    public ArrayList<Categoria> SeleccionarCategorias(ArrayList<Categoria> categorias);
    //Naty
    public ArrayList<String> SeleccionarImagenes(ArrayList<String> imagenes);
}
