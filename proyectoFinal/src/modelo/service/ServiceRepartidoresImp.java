package modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Coordenadas;
import entidades.Cliente;
import entidades.Pedido;
import entidades.Producto;
import entidades.Repartidor;
import modelo.dao.DaoClientes;
import modelo.dao.DaoPedidos;
import modelo.dao.DaoRepartidores;

@Service
public class ServiceRepartidoresImp implements ServiceRepartidores {

	
	@Autowired
	DaoRepartidores daorepartidores;
	
	
	@Override
	public void altaRepartidor(Repartidor r) {
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
	public void actualizaUbicacion(int idRepartidor, Coordenadas coords) {
		daorepartidores.actualizaLocalizacion(idRepartidor, coords.getLatitud(), coords.getLongitud());
	}

	@Override
	public void actualizaEstado(int idRepartidor, String estado) {
		daorepartidores.actualizaEstado(idRepartidor, estado);
	}


}
