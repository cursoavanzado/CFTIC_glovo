package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProducto;

	private String nombre;

	private double precio;

	//bi-directional many-to-one association to Cesta
	@OneToMany(mappedBy="producto")
	private List<Cesta> cestas;

	public Producto() {
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Cesta> getCestas() {
		return this.cestas;
	}

	public void setCestas(List<Cesta> cestas) {
		this.cestas = cestas;
	}

	public Cesta addCesta(Cesta cesta) {
		getCestas().add(cesta);
		cesta.setProducto(this);

		return cesta;
	}

	public Cesta removeCesta(Cesta cesta) {
		getCestas().remove(cesta);
		cesta.setProducto(null);

		return cesta;
	}

}