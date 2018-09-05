package modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import bean.Coordenadas;
import entidades.Repartidore;

@Repository("DaoRepartidores")
public class DaoRepartidoreImpl implements DaoRepartidores {
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

}
