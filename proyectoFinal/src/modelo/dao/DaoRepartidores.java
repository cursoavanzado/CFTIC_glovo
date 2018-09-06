package modelo.dao;

import java.util.List;

import bean.Coordenadas;
import entidades.Repartidore;

public interface DaoRepartidores {
	public void altaRepartidor(Repartidore r);
	public Coordenadas getLocalizacion(int idRepartidor);
	public void actualizaLocalizacion(int idRepartidor,double lat,double lon);
	public void actualizaEstado(int idRepartidor,String estado);
	
	Repartidore selectRepartidor(Coordenadas c, List<Repartidore> libres);
	Repartidore getRepartidoresLibres(Coordenadas c);
}
