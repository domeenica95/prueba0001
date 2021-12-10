package salmantino.es.controlador.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Pedidos", schema="GestionPedidosBD")
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPedido")
	private int idPedido;
	
	@Column(name="numpedido")
	private int numpedido;
	
	@Column(name="fecha")
	java.util.Date fecha = new java.util.Date();
	
	@Column(name="importe")
	private float importe;
	
	@Column(name="descuento")
	private float descuento;
	
	@Column(name="idcliente")
	private int idcliente;
	/**
	 * 
	 */
	public Pedido() {
		
	}
	
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getNumpedido() {
		return numpedido;
	}
	public void setNumpedido(int numpedido) {
		this.numpedido = numpedido;
	}
	public java.util.Date getFecha() {
		return fecha;
	}
	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", numpedido=" + numpedido + ", fecha=" + fecha + ", importe=" + importe
				+ ", descuento=" + descuento + ", idcliente=" + idcliente + "]";
	}
	
}
