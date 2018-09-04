package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the repartidores database table.
 * 
 */
@Entity
@Table(name="repartidores")
@NamedQuery(name="Repartidore.findAll", query="SELECT r FROM Repartidore r")
public class Repartidore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRepartidor;

	private String estado;

	private double latitud;

	private double longitud;

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="repartidore")
	private List<Pedido> pedidos;

	public Repartidore() {
	}

	public int getIdRepartidor() {
		return this.idRepartidor;
	}

	public void setIdRepartidor(int idRepartidor) {
		this.idRepartidor = idRepartidor;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Pedido addPedido(Pedido pedido) {
		getPedidos().add(pedido);
		pedido.setRepartidore(this);

		return pedido;
	}

	public Pedido removePedido(Pedido pedido) {
		getPedidos().remove(pedido);
		pedido.setRepartidore(null);

		return pedido;
	}

}