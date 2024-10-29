package py.edu.facitec.clase1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//Anotacion@: Provee informacion adicional a una clase, atributo o metodo 

//Un elemento que atienda peticiones y envie respuestas, necesitamos indicar @Controller

//Peticiones ---> reaquest lo que viene del cliente
//Respuestas ---> response lo que sale del servidor 

@Controller
public class HomeController {
	//puede existir varios metodos
	//para atender determinada peticiones/...
	
	
	//Get--> se visualiza la escritura en el navegador.
	
	@GetMapping("/home")
	public String home() {
		System.out.println("llegue hasta el controlador");
		
		
		//static  /archivo/  index    .html
		//defecto ap.proper controller  ap.proper
		
		return "index";
		
	}
	
}
