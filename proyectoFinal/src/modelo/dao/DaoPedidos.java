package modelo.dao;

import java.util.List;

import entidades.Pedido;
import entidades.Producto;

public interface DaoPedidos {
	
	List<Producto> obtenerProductos();
	
	List<Pedido> obtenerPedidosCliente(int idCliente);

}
