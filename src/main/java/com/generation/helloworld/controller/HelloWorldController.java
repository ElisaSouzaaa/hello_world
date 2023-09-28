package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World!!!";
	}

	@GetMapping ("/BSM-Generation")
	public String bsmGeneration() {
		return "Persistência,\n"
				+ "Mentalidade de crescimento,\n"
				+ "Orientação ao futuro,\n"
				+ "Responsabilidade pessoal,\n"
				+ "Trabalho em Equipe,\n"
				+ "Comunicação,\n"
				+ "Orientação ao Detalhes,\n"
				+ "Proatividade.";
	}
	
	@GetMapping ("/objetivos-aprendizagem")
	public String objetivosAprendizagem() {
		return "Melhorar a gestão de tempo,\n"
				+ "Criar um road map mais objetivo para conseguir um estágio,\n"
				+ "Continuar trabalhando na comunicação,\n"
				+ "Melhorar minha atenção aos detalhes";
	}
}