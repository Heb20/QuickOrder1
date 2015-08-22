//Natalie

package EntidadesCompartidas;


import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="nickname")
public class Restaurante extends Usuario implements Serializable{ 
    
    //Array que contiene las categorias que registra el restaurante
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ArrayList<Categoria> ListaCategorias;
    //Array que contiene las URL de las imagenes
    @Basic
    private ArrayList<String> ListaImagenes;
    
     //Constructor
    
   public Restaurante() {
       
       super();
   }
   
   public Restaurante (String nickname, String nombre, String email, String direccion){
   
      super(nickname, nombre, email, direccion); 
      ListaCategorias = new ArrayList<>();
      ListaImagenes = new ArrayList<>();
           
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
