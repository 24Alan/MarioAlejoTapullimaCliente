package com.idat.MarioAlejoTapullimaCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MarioAlejoTapullimaCliente.modelo.Cliente;
import com.idat.MarioAlejoTapullimaCliente.service.ClienteService;


@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {
	@Autowired
	private ClienteService servicio;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Cliente>listar(){
		return servicio.listar();
	}
}
