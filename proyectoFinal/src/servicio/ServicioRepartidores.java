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

import bean.Coordenadas;
import entidades.Repartidor;
import modelo.service.ServiceRepartidores;

@CrossOrigin
@RestController
@RequestMapping("/repartidor")
public class ServicioRepartidores {
	@Autowired
	ServiceRepartidores servicio;
	
	
	@PostMapping(value="alta",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void registrar(@RequestBody Repartidor r) {
		servicio.altaRepartidor(r);
	}
	
	@GetMapping(value="/{idRepartidor}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Coordenadas ubicar(@RequestAttribute int idRepartidor,HttpServletRequest request){
				return servicio.getLocalizacion(idRepartidor);
	}
	
	
	@PostMapping(value="/{idRepartidor}/coords/{latitud}/{longitud}")
	public void cambiarLocalizacion(@RequestAttribute int idRepartidor,@RequestAttribute int lat,@RequestAttribute int lon){
				servicio.actualizaLocalizacion(idRepartidor, lat, lon);
	}
	
	@PostMapping(value="/{idRepartidor}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void cambiarUbicacion(@RequestAttribute int idRepartidor,@RequestBody Coordenadas coords){
				servicio.actualizaUbicacion(idRepartidor, coords);
	}
	
	@PostMapping(value="/{idRepartidor}/estado/{state}")
	public void cambiarEstado(@RequestAttribute int idRepartidor,@RequestAttribute String estado){
				servicio.actualizaEstado(idRepartidor, estado);
	}
	
	
	

}
