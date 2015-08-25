/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import EntidadesCompartidas.Cliente;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Romina
 */
public class Usuario implements IUsuario{

    public Usuario() {
    }

    @Override
    public ArrayList<Cliente> ListarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RegistrarCliente(String nickname, String email, String nombre, String direccion, String apellido, Date fechaNac, String Imagen) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuickOrder1");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        EntidadesCompartidas.Cliente cliente = new EntidadesCompartidas.Cliente();
        cliente.setNickname(nickname);
        //FALTA Agregar verificacion nickname
        cliente.setEmail(email);
        //FALTA Agregar verificacion email
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setApellido(apellido);
        cliente.setFechaNac(fechaNac);
        cliente.setImagen(Imagen);
        //FALTA validar formato de todos los campos
        
        em.persist(cliente);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
       System.out.println("Alta efectuada");
        
    }

    @Override
    public void VerInformacionCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> ListarNickEmailCte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente ListarDatosClienteSeleccionado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pedido> ListarPedidosCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
