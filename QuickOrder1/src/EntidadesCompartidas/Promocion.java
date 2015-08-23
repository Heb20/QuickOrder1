
package EntidadesCompartidas;

//Alejandra

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("Promocion")
public class Promocion extends Producto{

    
        private boolean activa;
        private float descuento;
        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        private ArrayList<Individual> ListaproductosPromo;

    public Promocion() {
    }
                
                  
        public Promocion(String nombre,String descripcion,float precio,String imagen,boolean activa,float descuento){
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
        
        public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public ArrayList<Individual> getListaproductosPromo() {
        return ListaproductosPromo;
    }

    public void setListaproductosPromo(ArrayList<Individual> ListaproductosPromo) {
        this.ListaproductosPromo = ListaproductosPromo;
    }
}
