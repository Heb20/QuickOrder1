/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import CapaLogica.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author heb
 */
public class Test {
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cattest");
        EntityManager em = emf.createEntityManager();
        
        Categoria cat = new Categoria();
        public void test(){
            cat.setNombre("Cat1");
            
            em.getTransaction().begin();
            em.persist(cat);
            em.getTransaction().commit();
        }

}
