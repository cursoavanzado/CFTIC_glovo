package modelo.dao;

import java.util.List;

import bean.Coordenadas;
import entidades.Repartidor;

public interface DaoRepartidores {
	public void altaRepartidor(Repartidor r);
	public Coordenadas getLocalizacion(int idRepartidor);
	public void actualizaLocalizacion(int idRepartidor,double lat,double lon);
	public void actualizaEstado(int idRepartidor,String estado);
	
	Repartidor selectRepartidor(Coordenadas c, List<Repartidor> libres);
	Repartidor getRepartidoresLibres(Coordenadas c);
}
