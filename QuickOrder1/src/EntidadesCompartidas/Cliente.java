
//Natalie

package EntidadesCompartidas;

import java.util.Date;


public class Cliente extends Usuario{
    
    private String apellido;
    private Date fechaNac;
    private String imagen;
    
    //Constructor
    
   public Cliente() {
       
       super();
   }
   
   public Cliente (String nickname, String nombre, String email, String direccion, String apellido, Date fechaNac, String imagen){
   
      super(nickname, nombre, email, direccion); 
      this.apellido=apellido;
      this.fechaNac=fechaNac;
      this.imagen=imagen;
           
   }

   //Setters
   
   public void setApellido(String apellido){
       
       this.apellido=apellido;
   
   }
   
   public void setFechaNac(Date fechaNac){
       
       this.fechaNac=fechaNac;
   
   }
   
   public void setImagen(String imagen){
       
       this.imagen=imagen;
   
   }
   
   
   //Getters
   
   public String getApellido(){
       
       return apellido;
   }
   
   
   public Date getFechaNac(){
       
       return fechaNac;
   }
   
   
   public String getImagen(){
       return imagen;
   }

    @Override
    public boolean registrarUsuario() {
        return true;
    }
   


    
}
