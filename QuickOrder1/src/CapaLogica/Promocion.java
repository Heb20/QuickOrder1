
package CapaLogica;

//Alejandra
public class Promocion extends Productos{
        private boolean activa;
        private float descuento;
      //  private Set ProductosPromocion; ver lo de la coleccion 
        private String imagenPromocion;
                
                  
        public Promocion(String nombre,String descripcion,float precio,String imagen,boolean activa,float descuento,String imagenPromocion){
        super(nombre, descripcion,precio,imagen); 
        this.activa=activa;
        this.descuento=descuento;
        this.imagenPromocion=imagenPromocion;
        } 
        
        public boolean getActiva(){
            return activa;
        }
        
        public float getDescuento(){
            return descuento;
        }    
            
        public String getImagenPromocion(){
            return imagenPromocion;
        }
        
    
        
        public void SetActiva(boolean activa){
            this.activa=activa;
        }
        
        public void SetDescuento(float descuento){
            this.descuento=descuento;
        }    
            
        public void SetImagenPromocion(String imagenPromocion){
            this.imagenPromocion=imagenPromocion;
        }
}
