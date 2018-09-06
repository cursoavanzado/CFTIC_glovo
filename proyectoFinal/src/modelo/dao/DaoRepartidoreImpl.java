package modelo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import bean.Coordenadas;
import entidades.Repartidore;
import modelo.utilidades.Operativa;

@Repository("DaoRepartidores")
public class DaoRepartidoreImpl implements DaoRepartidores {
	private double distancia;
	Repartidore posibleElegido=null;
	@PersistenceContext(unitName="proyectoFinal")
	EntityManager em;
	
	@Override
	public void altaRepartidor(Repartidore r) {
		em.persist(r);

	}

	@Override
	public Coordenadas getLocalizacion(int idRepartidor) {
		Repartidore r=em.find(Repartidore.class, idRepartidor);
		Coordenadas loca=new Coordenadas(r.getLatitud(),r.getLongitud());
		return loca;
	}

	@Override
	public void actualizaLocalizacion(int idRepartidor, double lat, double lon) {
		Repartidore r=em.find(Repartidore.class, idRepartidor);
		r.setLatitud(lat);
		r.setLongitud(lon);
		em.merge(r);
	}

	@Override
	public void actualizaEstado(int idRepartidor, String estado) {
		Repartidore r=em.find(Repartidore.class, idRepartidor);
		r.setEstado(estado);
		em.merge(r);
	}
	
	@Override
	public Repartidore getRepartidoresLibres(Coordenadas c){
		String jpql="select r from Repartidore r where r.estado='libre'";
		Repartidore elegido=selectRepartidor(c,em.createQuery(jpql,Repartidore.class).getResultList());
		return elegido;
	}
	
	@Override
	public Repartidore selectRepartidor(Coordenadas c,List<Repartidore> libres) {
		
		distancia=30000;
		Map<Repartidore,Double> repartidores=new HashMap<>();
		for(Repartidore r:libres) {
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
