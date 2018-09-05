package modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Coordenadas;
import entidades.Cliente;
import entidades.Pedido;
import entidades.Producto;
import entidades.Repartidore;
import modelo.dao.DaoClientes;
import modelo.dao.DaoPedidos;
import modelo.dao.DaoRepartidores;

@Service
public class ServicePedidoImp implements ServicePedido {

	@Autowired
	DaoPedidos daopedidos; 
	@Autowired
	DaoClientes daoclientes;
	@Autowired
	DaoRepartidores daorepartidores;
	
	@Override
	public List<Producto> listarProductos() {
		return daopedidos.obtenerProductos();
	}

	@Override
	public List<Pedido> listarPedidosCliente(int idCliente) {
		return daopedidos.obtenerPedidosCliente(idCliente);
	}

	@Override
	public void altaCliente(int edad, String nombre, String password, String tarjeta, String telefono, String usuario) {
		daoclientes.altaCliente(edad, nombre, password, tarjeta, telefono, usuario);
		
	}

	@Override
	public Cliente autenticar(String nombre, String password) {
		return daoclientes.autenticar(nombre, password);
		
	}

	@Override
	public void cambioTarjeta(int idCliente, String numTarjeta) {
		daoclientes.cambioTarjeta(idCliente, numTarjeta);
		
	}
	@Override
	public void altaRepartidor(Repartidore r) {
		daorepartidores.altaRepartidor(r);
	}
	@Override
	public Coordenadas getLocalizacion(int idRepartidor) {
		return daorepartidores.getLocalizacion(idRepartidor);
	}

	@Override
	public void actualizaLocalizacion(int idRepartidor, double lat, double lon) {
		daorepartidores.actualizaLocalizacion(idRepartidor, lat, lon);
	}

	@Override
	public void actualizaEstado(int idRepartidor, String estado) {
		daorepartidores.actualizaEstado(idRepartidor, estado);
	}


}
