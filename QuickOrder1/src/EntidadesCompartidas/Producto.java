
package EntidadesCompartidas;

//Alejandra

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Tipo_Producto")
public class Producto implements Serializable{

    @Id
    @Column(name="nombre", nullable=false)
    private String nombre;
    @Column(name="descripcion", nullable=false)
    private String descripcion;
    @Column(name="precio", nullable=false)
    private float precio;
    @Column(name="imagen", nullable=false)
    private String imagen;
    @ManyToOne
    @JoinColumn(name="nickname")
    private Restaurante restaurante;
    
    //CONSTRUCTORES
    
    public Producto(){
    }
    
    public Producto(String nombre,String descripcion, float precio, String imagen){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.imagen=imagen;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public String getImagen(){
        return imagen;
    }
    
    
    
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void SetDescripcion(String description){
        this.descripcion=descripcion;
    }
    
    public void SetPrecio(float Precio){
        this.precio= precio;
    }
    
    public void SetImagen(String imagen){
        this.imagen=imagen;
    }
    
    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
