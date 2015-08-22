
//Natalie

package EntidadesCompartidas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;

/**
 *
 * @author heb
 */
@Entity
@PrimaryKeyJoinColumn(name="Usuario_nickname")
public class Cliente extends Usuario implements Serializable {
    
    @Column(name="apellido", nullable=false)
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNac;
    @Column(name="imagen", nullable=false)
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
}
