package com.idat.edu.EFDianaLachapelleCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.EFDianaLachapelleCliente.model.cliente;

@Repository
public interface clienteRepository  extends JpaRepository<cliente, Integer>{

}
