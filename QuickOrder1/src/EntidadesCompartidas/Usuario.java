//Natalie

package EntidadesCompartidas;

public class Usuario{

   
   private String nickname;    
   private String nombre;
   private String email;
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
}