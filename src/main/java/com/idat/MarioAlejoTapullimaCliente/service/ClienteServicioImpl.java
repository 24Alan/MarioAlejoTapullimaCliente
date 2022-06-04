package com.idat.MarioAlejoTapullimaCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.MarioAlejoTapullimaCliente.modelo.Cliente;
import com.idat.MarioAlejoTapullimaCliente.repository.ClienteRepository;

public class ClienteServicioImpl implements ClienteService {
	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
