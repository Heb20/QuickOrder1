
package EntidadesCompartidas;

//Alejandra

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="nombre")
public class Individual extends Producto{

    public Individual() {
    }
    
    public Individual(String nombre,String descripcion,float precio,String imagen){
        super(nombre, descripcion,precio,imagen); 
        
    }
    
}
