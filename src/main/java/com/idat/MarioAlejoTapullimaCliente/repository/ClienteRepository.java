package com.idat.MarioAlejoTapullimaCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MarioAlejoTapullimaCliente.modelo.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Integer>{

}
