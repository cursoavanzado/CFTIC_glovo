package servicio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entidades.Cesta;

@CrossOrigin
@RestController
@RequestMapping("/modificarcarrito")
public class AdministradorCarritoServicio {
	
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cesta> agregarProducto(@RequestBody Cesta c,HttpServletRequest request){
		List<Cesta> cesta = (List<Cesta>)request.getSession().getAttribute("carrito");
		cesta.add(c);
		return cesta;
	}
	
	@GetMapping(value="/{idProducto}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cesta> eliminarProducto(@RequestAttribute int idProducto,HttpServletRequest request){
		List<Cesta> cesta = (List<Cesta>)request.getSession().getAttribute("carrito");
		for(Cesta c:cesta) {
			if(c.getProducto().getIdProducto() == idProducto) {
				cesta.remove(c);
				break;
			}
		}
		return cesta;
	}
	
	
	
	
	

}
