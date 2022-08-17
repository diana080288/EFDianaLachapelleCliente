package com.idat.edu.EFDianaLachapelleCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.edu.EFDianaLachapelleCliente.model.cliente;
import com.idat.edu.EFDianaLachapelleCliente.repository.clienteRepository;
@Service
public class clienteServiceImpl implements clienteService {
	
	@Autowired
	private clienteRepository repository;

	@Override
	public List<cliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public cliente obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);

	}

}
