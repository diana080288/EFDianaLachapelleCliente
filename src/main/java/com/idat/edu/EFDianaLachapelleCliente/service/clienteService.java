package com.idat.edu.EFDianaLachapelleCliente.service;

import java.util.List;

import com.idat.edu.EFDianaLachapelleCliente.model.cliente;

public interface clienteService {
	
	List<cliente> listar();
	cliente obtenerId(Integer id);
	void guardar(cliente cliente);
	void eliminar(Integer id);
	void actualizar(cliente cliente);


}
