package modelo.dao;

import entidades.Cliente;

public interface DaoClientes {

	public void altaCliente(Cliente c);
	public void altaCliente(int edad, String nombre, String password, String tarjeta, String telefono, String usuario);
	public Cliente autenticar(String nombre, String password);
	public void cambioTarjeta(int idCliente, String numTarjeta);
}
