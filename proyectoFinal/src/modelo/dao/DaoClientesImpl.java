package modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entidades.Cliente;
import modelo.utilidades.Operativa;


@Repository("daoClientes")
public class DaoClientesImpl implements DaoClientes{
	@PersistenceContext(unitName="proyectoFinal")
	EntityManager em;
	
	
	@Transactional
	public void altaCliente(Cliente c) {
		em.persist(c);
	}
	@Transactional
	public Cliente altaCliente(int edad, String nombre, String password, String tarjeta, String telefono, String usuario) {
		Cliente c=new Cliente(edad, nombre, Operativa.encriptarSha256Hexadecimal(password), tarjeta, telefono, usuario);
		em.persist(c);
		return c;
	}

	@Transactional
	public void cambioTarjeta(int idCliente, String numTarjeta) {
		Cliente c=em.find(Cliente.class, idCliente);
		c.setTarjeta(numTarjeta);
		em.merge(c);
	}

	@Override
	public Cliente autenticar(String nombre, String password) {
		String jpql="Select c from Cliente c where c.nombre=1? and c.password=2?";
		TypedQuery<Cliente> tp=em.createQuery(jpql, Cliente.class);
		tp.setParameter(1, nombre);
		tp.setParameter(2, Operativa.encriptarSha256Hexadecimal(password) );
		Cliente c=tp.getSingleResult();
		return c;
	}

	

}
