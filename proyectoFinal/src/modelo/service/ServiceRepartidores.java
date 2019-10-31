package modelo.service;

import java.util.List;

import bean.Coordenadas;
import entidades.Cliente;
import entidades.Pedido;
import entidades.Producto;
import entidades.Repartidor;

public interface ServiceRepartidores {
	
	void actualizaLocalizacion(int idRepartidor, double lat, double lon);

	void actualizaEstado(int idRepartidor, String estado);

	Coordenadas getLocalizacion(int idRepartidor);

	void altaRepartidor(Repartidor r);

	void actualizaUbicacion(int idRepartidor, Coordenadas coords);

}
