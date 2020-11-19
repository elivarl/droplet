package com.example.droplet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {
	
	@GetMapping("/")
	public  String saludo() {
		return "Hola mundo......";
	}
	
	@GetMapping
	public String despedida() {
		return "Adiós mundo.....";
	}

}
