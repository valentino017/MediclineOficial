package com.pe.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/app") 
public class HomeController {

	
	
	
	@GetMapping({"/home"}) 
	public String InicioVistaDoctor(){
		return "Home";	
	}
	
	@GetMapping({"/form1"}) 
	public String FormularioDatosDoctor(){
		return "FormularioDatosDoctor";	
	}
	
	@GetMapping({"/form2"}) 
	public String FormularioHorariosDoctor(){
		return "FormularioHorarios";	
	}
	
	@GetMapping({"/reportes"}) 
	public String Reportes(){
		return "Reportes";	
	}

}
