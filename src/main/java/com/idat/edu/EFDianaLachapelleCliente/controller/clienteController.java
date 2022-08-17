package com.idat.edu.EFDianaLachapelleCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.edu.EFDianaLachapelleCliente.model.cliente;
import com.idat.edu.EFDianaLachapelleCliente.service.clienteService;

@Controller
@RequestMapping(path = "api/cliente/v1")

public class clienteController {
	
	@Autowired
	private clienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<cliente> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody cliente obtener(@PathVariable Integer id){
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody cliente cliente){
		service.guardar(cliente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody cliente cliente) {
		service.actualizar(cliente);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}


	

}
