
package CapaLogica;
import java.util.*;

/*Hebert */
public class Pedido {

    private static int numero;
    private static Date fecha;
    private static float precio;
    private static TipoEstado estado;
    //Privete Cliente cliente;
    //Private Rrestaurante restaurante;
    LinkedList Productos ;
    
    public Pedido(int numero, Date fecha, float precio, TipoEstado estado/*, Privete Cliente, Private Rrestaurante*/) {
        Pedido.numero = numero;
        this.fecha = fecha;
        Pedido.precio = precio;
        Pedido.estado = estado;
        //this.Cliente = Cliente;
        //this.Rrestaurante = Rrestaurante;
        Productos = new LinkedList();
    }
    
    public static void setNumero(int numero) {
        Pedido.numero = numero;
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

    public void setProductos(LinkedList Producto) {
        this.Productos = Producto;
    }

    public int getNumero() {
        return numero;
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

    public LinkedList getProductos() {
        return Productos;
    }
    
    
}