package com.thymeleaf.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargosController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/cargo/cadastro";
	}

	@GetMapping("/listar")
	public String lista() {
		return "/cargo/lista";

	}

}
