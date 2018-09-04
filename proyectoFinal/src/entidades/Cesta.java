package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cesta database table.
 * 
 */
@Entity
@NamedQuery(name="Cesta.findAll", query="SELECT c FROM Cesta c")
public class Cesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CestaPK id;

	private String unidades;

	//bi-directional many-to-one association to Pedido
	@ManyToOne
	@JoinColumn(name="idPedido")
	private Pedido pedido;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="idProducto")
	private Producto producto;

	public Cesta() {
	}

	public CestaPK getId() {
		return this.id;
	}

	public void setId(CestaPK id) {
		this.id = id;
	}

	public String getUnidades() {
		return this.unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}