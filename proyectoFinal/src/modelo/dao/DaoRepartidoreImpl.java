package modelo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import bean.Coordenadas;
import entidades.Repartidor;
import modelo.utilidades.Operativa;

@Repository("DaoRepartidores")
public class DaoRepartidoreImpl implements DaoRepartidores {
	private double distancia;
	Repartidor posibleElegido=null;
	@PersistenceContext(unitName="proyectoFinal")
	EntityManager em;
	
	@Override
	public void altaRepartidor(Repartidor r) {
		em.persist(r);

	}

	@Override
	public Coordenadas getLocalizacion(int idRepartidor) {
		Repartidor r=em.find(Repartidor.class, idRepartidor);
		Coordenadas loca=new Coordenadas(r.getLatitud(),r.getLongitud());
		return loca;
	}

	@Override
	public void actualizaLocalizacion(int idRepartidor, double lat, double lon) {
		Repartidor r=em.find(Repartidor.class, idRepartidor);
		r.setLatitud(lat);
		r.setLongitud(lon);
		em.merge(r);
	}

	@Override
	public void actualizaEstado(int idRepartidor, String estado) {
		Repartidor r=em.find(Repartidor.class, idRepartidor);
		r.setEstado(estado);
		em.merge(r);
	}
	
	@Override
	public Repartidor getRepartidoresLibres(Coordenadas c){
		String jpql="select r from Repartidore r where r.estado='libre'";
		Repartidor elegido=selectRepartidor(c,em.createQuery(jpql,Repartidor.class).getResultList());
		return elegido;
	}
	
	@Override
	public Repartidor selectRepartidor(Coordenadas c,List<Repartidor> libres) {
		
		distancia=30000;
		Map<Repartidor,Double> repartidores=new HashMap<>();
		for(Repartidor r:libres) {
			repartidores.put(r, Operativa.dameDistancia(c,new Coordenadas(r.getLatitud(),r.getLongitud())));
		}
		repartidores.forEach((r,d)->{
			if(d<distancia) {
			distancia=d;
			posibleElegido=r;
			}
		});
		return posibleElegido;
		
		
		
		
		
	}

	
}
