//Natalie

package CapaLogica;

import java.util.ArrayList;


public class Restaurante extends Usuario{ 
    
    //Array que contiene las categorias que registra el restaurante
    private ArrayList<Categoria> ListaCategorias;
    //Array que contiene las URL de las imagenes
    private ArrayList<String> ListaImagenes;
    
     //Constructor
    
   public Restaurante() {
       
       super();
   }
   
   public Restaurante (String nickname, String nombre, String email, String direccion){
   
      super(nickname, nombre, email, direccion); 
      ListaCategorias = new ArrayList();
      ListaImagenes = new ArrayList();
           
   }
   
   //Setters
   
   public void setCategorias(ArrayList ListaCategorias) {
        this.ListaCategorias = ListaCategorias;
    }

    public void setImagenes(ArrayList Imagenes) {
        this.ListaImagenes = Imagenes;
    }
   
   //Getters

    public ArrayList<Categoria> getListaCategorias(){
       
        return ListaCategorias;
    }
    
    public ArrayList<String> getListaImagenes(){
                
        return ListaImagenes;
    }

    @Override
    public boolean registrarUsuario() {
        return true;
    }
    
}
