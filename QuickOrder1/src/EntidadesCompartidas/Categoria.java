package EntidadesCompartidas;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**/
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {

    @Id
    @Column(name="nombre", nullable=false)
    private String nombre;
    
    //Constructor
    public  Categoria() {
        
            }

    public Categoria(String nombre){
        this.nombre = nombre;
            }

    //Get
    
    public String getNombre() {
        return nombre;
    }

    //Set
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

        @Override
    public String toString() {
        return "Categoria{" + "nombre=" + nombre + '}';
    }
    
}