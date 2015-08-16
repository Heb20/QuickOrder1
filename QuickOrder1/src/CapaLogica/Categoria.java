package CapaLogica;


public class Categoria {
    
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