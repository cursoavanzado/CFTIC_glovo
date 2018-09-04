package modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;



import entidades.Cliente;
import entidades.Pedido;
import entidades.Producto;

@Repository
public class DaoPedidosImp implements DaoPedidos {

	@PersistenceContext(unitName="proyectoFinal")
	EntityManager em;
	
	@Override
	public List<Producto> obtenerProductos() {
		return em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
	}

	@Override
	public List<Pedido> obtenerPedidosCliente(int idCliente) {
		return em.find(Cliente.class,idCliente).getPedidos();
	}

}
