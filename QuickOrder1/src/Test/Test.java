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
    
        
        public void test(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuickOrder1");
            EntityManager em = emf.createEntityManager();
        
            /*Categoria cat = new Categoria();
            cat.setNombre("Pizeria");
            
            em.getTransaction().begin();
            em.persist(cat);
            em.getTransaction().commit();
                    */
        }

}
