
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
    private static Date fecha;
    private static float precio;
    @Column(name="estado", nullable=false)
    @Enumerated(EnumType.STRING)
    private static TipoEstado estado;
    @OneToOne
    Cliente cliente;
    @OneToOne
    Restaurante restaurante;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ArrayList<Producto> ListaProductos;
    

    public Pedido() {
    }
    
    
    public Pedido(Date fecha, float precio, TipoEstado estado, Cliente cliente, Restaurante restaurante) {
        Pedido.fecha = fecha;
        Pedido.precio = precio;
        Pedido.estado = estado;
        this.cliente = cliente;
        this.restaurante = restaurante;
    }

    public static void setFecha(Date fecha) {
        Pedido.fecha = fecha;
    }

    public static void setPrecio(float precio) {
        Pedido.precio = precio;
    }

    public static void setEstado(TipoEstado estado) {
        Pedido.estado = estado;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
