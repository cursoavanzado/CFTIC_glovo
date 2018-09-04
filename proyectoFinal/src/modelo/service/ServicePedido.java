package modelo.service;

import java.util.List;

import entidades.Cliente;
import entidades.Pedido;
import entidades.Producto;

public interface ServicePedido {
	
	List<Producto> listarProductos();
	
	List<Pedido> listarPedidosCliente(int idCliente);
	
	public void altaCliente(int edad, String nombre, String password, String tarjeta, String telefono, String usuario);
	
	public Cliente autenticar(String nombre, String password);
	
	public void cambioTarjeta(int idCliente, String numTarjeta);

}
