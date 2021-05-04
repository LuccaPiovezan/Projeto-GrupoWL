package luccaPiovezan.grupo.wl.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import luccaPiovezan.grupo.wl.domain.colaborador.Colaborador;

@Controller
@RequestMapping(path = "/public")
public class PublicController {
	
	@GetMapping("/colaborador/new")
	public String newCliente(Model model) {
		
		model.addAttribute("colaborador", new Colaborador());
		
		return "colaborador";
	}
}
