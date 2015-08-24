
package EntidadesCompartidas;

import java.io.Serializable;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/*Hebert */

@Entity
@Table(name="Pedidos")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="fecha", nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private float precio;
    @Column(name="estado", nullable=false)
    @Enumerated(EnumType.STRING)
    private TipoEstado estado;
    @OneToOne
    Cliente cliente;
    @OneToOne
    Restaurante restaurante;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ArrayList<Producto> ListaProductos;
    

    public Pedido() {
    }
    
    
    public Pedido(Date fecha, float precio, TipoEstado estado, Cliente cliente, Restaurante restaurante) {
        this.fecha = fecha;
        this.precio = precio;
        this.estado = estado;
        this.cliente = cliente;
        this.restaurante = restaurante;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public TipoEstado getEstado() {
        return estado;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
        public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public ArrayList<Producto> getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(ArrayList<Producto> ListaProductos) {
        this.ListaProductos = ListaProductos;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", fecha=" + fecha + ", precio=" + precio + ", estado=" + estado + ", cliente=" + cliente + ", restaurante=" + restaurante + '}';
    }
}
