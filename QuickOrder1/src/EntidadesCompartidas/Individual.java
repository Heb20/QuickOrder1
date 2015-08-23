
package EntidadesCompartidas;

//Alejandra


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Individual")
public class Individual extends Producto{

    public Individual() {
    }
    
    public Individual(String nombre,String descripcion,float precio,String imagen){
        super(nombre, descripcion,precio,imagen); 
        
    }
    
}
