package CapaLogica;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Categoria {
    @Id
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

}