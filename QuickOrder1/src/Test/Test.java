/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import EntidadesCompartidas.*;
import static EntidadesCompartidas.TipoEstado.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Table;


/**
 *
 * @author heb
 */
public class Test {
    
        
        public void test() throws ParseException{
            /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuickOrder1");
            EntityManager em = emf.createEntityManager();
            FechaADate fecha = new FechaADate();
            Date fech = fecha.safecha("20/02/1991");
            Date fech1 = fecha.safecha("23/08/2015");
            String imagen = "URL";
            em.getTransaction().begin();
            Categoria cat, cat1;
            cat = new Categoria("Pizza");
            cat1 = new Categoria("Hamburgesa");
            em.persist(cat);
            em.persist(cat1);
            
            Cliente cli;
            cli = new Cliente("heb20", "Hebert", "hebver20@gmail.com", "Calle 31", "apellido", fech, "url");
            em.persist(cli);
            
            ArrayList<Categoria> ListaCategorias = new ArrayList<Categoria>();
            ArrayList<String> ListaImagenes = new ArrayList<String>();
            ListaImagenes.add(imagen);
            ListaCategorias.add(cat);
            ListaCategorias.add(cat1);
            Restaurante res;
            res = new Restaurante("platoveloz", "Pizzeria Plato Veloz", "ppveloz@email.com", "Av. Italia 2222");
            res.setCategorias(ListaCategorias);
            res.setImagenes(ListaImagenes);
            em.persist(res);
            
            Individual ind, ind1, ind2, ind3;
            ind = new Individual("Pizza", "Es una pizza, si no sabes que es sos un gil", 90, "URL1");
            ind1 = new Individual("Hamburgesa", "Es una carne entre panes", 40, "URL2");
            ind2 = new Individual("CocaCola", "Es para tomar", 80, "URL3");
            ind3 = new Individual("Faina", "Se come junto con la pizza", 70, "URL4");
            ind.setRestaurante(res);
            ind1.setRestaurante(res);
            ind2.setRestaurante(res);
            ind3.setRestaurante(res);
            em.persist(ind);
            em.persist(ind1);
            em.persist(ind2);
            em.persist(ind3);
            
            
            Promocion prom;
            ArrayList<Individual> ListaproductosPromo = new ArrayList<Individual>();
            ListaproductosPromo.add(ind);
            ListaproductosPromo.add(ind2);
            ListaproductosPromo.add(ind3);
            prom = new Promocion("El2x1", "La super promo, la pizza el faina y la coca mas barato", 120, "URL1", true, 50);
            prom.setListaproductosPromo(ListaproductosPromo);
            prom.setRestaurante(res);
            em.persist(prom);
            
            Pedido ped;
            ArrayList<Object[]> ListaProductos = new ArrayList<>();
            
            Object[] arrayProd = {prom, 1}; 
            ListaProductos.add(arrayProd);
            
            Object[] arrayProd2 = {ind1, 1}; 
            ListaProductos.add(arrayProd2);
            
            ped = new Pedido(fech1, 160, Recibido, cli, res);
            ped.setListaProductos(ListaProductos);
            em.persist(ped);
            
            em.getTransaction().commit();*/
        }


}
