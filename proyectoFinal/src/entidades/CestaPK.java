package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cesta database table.
 * 
 */
@Embeddable
public class CestaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idPedido;

	@Column(insertable=false, updatable=false)
	private int idProducto;

	public CestaPK() {
	}
	public int getIdPedido() {
		return this.idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdProducto() {
		return this.idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CestaPK)) {
			return false;
		}
		CestaPK castOther = (CestaPK)other;
		return 
			(this.idPedido == castOther.idPedido)
			&& (this.idProducto == castOther.idProducto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPedido;
		hash = hash * prime + this.idProducto;
		
		return hash;
	}
}