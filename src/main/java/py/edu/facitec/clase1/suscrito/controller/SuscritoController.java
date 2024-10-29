package py.edu.facitec.clase1.suscrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import py.edu.facitec.clase1.model.Suscrito;
import py.edu.facitec.clase1.repository.SuscritoRepository;

//clase para atender solicitudes
@Controller
public class SuscritoController {
	
	
	//inicializar en el contexto de spring
	@Autowired
	private SuscritoRepository suscritoRepository;
	
	
	//URL
	@GetMapping("/form")
	public String cargarFormulario() {
		System.out.print("cargar formulario");
		
		return "suscrito/form";
	}
	

				//URL
	// Get visible los parametros en el navegador 
	@GetMapping("/registrar")
	public String RegistrarSuscrito(Suscrito suscrito) {
		System.out.print("Llegue p/ registrar"+suscrito);
		
		suscritoRepository.save(suscrito);
		
					//pagina
				//defecto ap.pro (controller) ap.pro
				//static/archivo/suscrito/form.html
		return "suscrito/form";
	}
	
	
	
	
	
}

