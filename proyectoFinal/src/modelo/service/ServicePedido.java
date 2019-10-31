package modelo.service;

import java.util.List;

import bean.Coordenadas;
import entidades.Cliente;
import entidades.Pedido;
import entidades.Producto;
import entidades.Repartidor;

public interface ServicePedido {
	
	List<Producto> listarProductos();
	
	List<Pedido> listarPedidosCliente(int idCliente);
	
	public Cliente altaCliente(int edad, String nombre, String password, String tarjeta, String telefono, String usuario);
	
	public Cliente autenticar(String nombre, String password);
	
	public void cambioTarjeta(int idCliente, String numTarjeta);

	

}
