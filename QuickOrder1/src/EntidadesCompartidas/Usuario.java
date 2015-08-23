//Natalie

package EntidadesCompartidas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable{

   @Id
   @Column(name="nickname", nullable=false)
   private String nickname;    
   @Column(name="email", nullable=false)
   private String email;
   @Column(name="nombre", nullable=false)
   private String nombre;
   @Column(name="direccion", nullable=false)
   private String direccion;
   
   //Constructor
   public Usuario(){
   }
   
   public Usuario (String nickname, String nombre, String email, String direccion){
      
      this.nickname= nickname;
      this.nombre=nombre;
      this.email=email;
      this.direccion=direccion;
      
   }


   //Setters
   
   public void setNickname(String nickname){
       
       this.nickname=nickname;
   
   }
   
   public void setNombre(String nombre){
       
       this.nombre=nombre;
   
   }
   
   public void setEmail(String email){
       
       this.email=email;
   
   }
   
   public void setDireccion(String direccion){
       
       this.direccion=direccion;
   
   }
   
   //Getters
   
   public String getNickname(){
       return nickname;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public String getEmail(){
       return email;
   }
   
   public String getDireccion(){
       return direccion;
   }
   
    @Override
    public String toString() {
        return "Usuario{" + "nickname=" + nickname + ", email=" + email + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}
