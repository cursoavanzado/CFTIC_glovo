package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Cliente;
import modelo.service.ServicePedido;

@Controller
public class ClienteController {

	@Autowired
	ServicePedido servicepedido;
	
	@RequestMapping("/login")
	public String autenticar(HttpServletRequest request,@RequestParam("user") String u,@RequestParam("pwd") String p ) {
		Cliente c=servicepedido.autenticar(u, p);
		if(c!=null) {
			request.getSession().setAttribute("usuario", c);
			return "bienvenida";
		} 
			return "error";
	}
	
	@RequestMapping("/registrar")
	public String registrar(HttpServletRequest request,@RequestParam("edad") int e,@RequestParam("nombre") String n,@RequestParam("pwd") String p,
			@RequestParam("tarjeta") String t,@RequestParam("telefono") String te,@RequestParam("user") String u) {
		Cliente c=servicepedido.altaCliente(e, n, p, t, te, u);
		request.getSession().setAttribute("usuario", c);
			return "bienvenida";
		
	}
	@RequestMapping("/cambioTarjeta")
	public String CambioTarjeta(HttpServletRequest request,@RequestParam("tarjeta") String t) {
		Cliente c=(Cliente) request.getSession().getAttribute("usuario");
		servicepedido.cambioTarjeta(c.getIdcliente(), t);
		c.setTarjeta(t);
		request.getSession().setAttribute("usuario", c);
			return "bienvenida";
		
	}
	
	
}
