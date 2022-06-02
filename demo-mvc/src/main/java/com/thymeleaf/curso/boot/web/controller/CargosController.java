package com.thymeleaf.curso.boot.web.controller;

import java.util.List;

import com.thymeleaf.curso.boot.domain.Cargo;
import com.thymeleaf.curso.boot.domain.Departamento;
import com.thymeleaf.curso.boot.service.CargoService;
import com.thymeleaf.curso.boot.service.DepartamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/cargos")
public class CargosController {
	@Autowired
	private CargoService cargoService;

	@Autowired
	private DepartamentoService departamentoService;

	@GetMapping("/cadastrar")
	public String cadastrar(Cargo cargo) {
		return "/cargo/cadastro";
	}

	@GetMapping("/listar")
	public String lista() {
		return "/cargo/lista";

	}
	@PostMapping("/salvar")
	public String salvar(Cargo cargo, RedirectAttributes attr){
		cargoService.salvar(cargo);
		attr.addFlashAttribute("sucsess", "Cargo inserido com sucesso!!!");
		return "redirect:/cargos/cadastrar";
	}
	//metodo responsavel para enviar lista de departamentos
	@ModelAttribute("departamentos")
	public List<Departamento> listaDeDepartamentos(){
		return departamentoService.buscarTodos();
	}
}
