package controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import entidades.Cliente;
import modelo.service.ServicePedido;

@Controller
public class PedidosController {

	@Autowired
	ServicePedido servicepedido;
	
	@RequestMapping(path="/historicocliente")
	public String pedidoCliente(HttpServletRequest request,@SessionAttribute("usuario") Cliente c) {
	request.setAttribute("historico",servicepedido.listarPedidosCliente(c.getIdcliente()));
		return "historico";
	}
	
	@RequestMapping(path="/obtenerProductos")
	public String obtenerProductos(HttpServletRequest request) {
		request.setAttribute("productos", servicepedido.listarProductos());
		return "pedidos";
		
	}
}
