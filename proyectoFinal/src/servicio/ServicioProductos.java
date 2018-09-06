package servicio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entidades.Producto;
import modelo.service.ServicePedido;


@CrossOrigin
@RestController
@RequestMapping("/listadoproductos")
public class ServicioProductos {
	@Autowired
	ServicePedido servicio;
	
	
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> productos() {
		return servicio.listarProductos();
	}
	
	
	

}
