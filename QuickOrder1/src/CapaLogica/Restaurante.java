/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import EntidadesCompartidas.Categoria;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Romina
 */
public class Restaurante implements IRestaurante{

    public Restaurante() {
    }

    @Override
    public void AltaCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> ListaCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EntidadesCompartidas.Restaurante> ListaRestaurantePorCategoria(String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RegistrarRestaurante(String nickname, String email, String nombre, String direccion, ArrayList<String> ListaImagenes, ArrayList<Categoria> ListaCategorias) {
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuickOrder1");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        
        EntidadesCompartidas.Restaurante restaurante = new EntidadesCompartidas.Restaurante();
        restaurante.setNickname(nickname);
        //FALTA Agregar verificacion nickname
        restaurante.setEmail(email);
        //FALTA Agregar verificacion email
        restaurante.setNombre(nombre);
        restaurante.setDireccion(direccion);
        //FALTA validar formato de todos los campos
        restaurante.setCategorias(ListaCategorias);
        restaurante.setImagenes(ListaImagenes);
        
        em.persist(restaurante);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
       System.out.println("Alta efectuada");
    }

    @Override
    public ArrayList<Categoria> SeleccionarCategorias(ArrayList<Categoria> categorias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> SeleccionarImagenes(ArrayList<String> imagenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
