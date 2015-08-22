/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import EntidadesCompartidas.Cliente;
import EntidadesCompartidas.Usuario;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Romina
 */
public interface IUsuario {
    
    //Naty
    public boolean RegistrarCliente(String nickname, String email, String nombre, String direccion, String apellido, Date fechaNac, String Imagen);

    //Devuelve una lista con todos los clientes del sistema
    public ArrayList<Cliente> ListarClientes();

}




