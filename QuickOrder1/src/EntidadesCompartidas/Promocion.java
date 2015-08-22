
package EntidadesCompartidas;

//Alejandra

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="nombre")
public class Promocion extends Producto{
        private boolean activa;
        private float descuento;
        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        private ArrayList<Producto> ListaproductosPromo;

    public Promocion() {
    }
                
                  
        public Promocion(String nombre,String descripcion,float precio,String imagen,boolean activa,float descuento,String imagenPromocion){
        super(nombre, descripcion,precio,imagen); 
        this.activa=activa;
        this.descuento=descuento;
        } 
        
        public boolean getActiva(){
            return activa;
        }
        
        public float getDescuento(){
            return descuento;
        }
        
        public void SetActiva(boolean activa){
            this.activa=activa;
        }
        
        public void SetDescuento(float descuento){
            this.descuento=descuento;
        }    
}
