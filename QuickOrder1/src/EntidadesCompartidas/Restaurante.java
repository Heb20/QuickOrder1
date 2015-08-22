//Natalie

package EntidadesCompartidas;

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
      ListaCategorias = new ArrayList<Categoria>();
      ListaImagenes = new ArrayList<String>();
           
   }
   
   //Setters
   
   public void setCategorias(ArrayList<Categoria> ListaCategorias) {
        this.ListaCategorias = ListaCategorias;
    }

    public void setImagenes(ArrayList<String> ListaImagenes) {
        this.ListaImagenes = ListaImagenes;
    }
   
   //Getters

    public ArrayList<Categoria> getListaCategorias(){
       
        return ListaCategorias;
    }
    
    public ArrayList<String> getListaImagenes(){
                
        return ListaImagenes;
    }

    
}
