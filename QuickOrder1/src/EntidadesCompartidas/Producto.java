
package EntidadesCompartidas;

//Alejandra
public class Producto{
    protected String nombre;
    protected String descripcion;
    protected float precio;
    protected String imagen;
    
    
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
    
}
