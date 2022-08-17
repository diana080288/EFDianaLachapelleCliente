package com.idat.edu.EFDianaLachapelleCliente.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")

public class cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcliente;
	private String Nombrecliente;
	private String Apellidocliente;
	private String NroCelular;
	private String direccion;
	
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombrecliente() {
		return Nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		Nombrecliente = nombrecliente;
	}
	public String getApellidocliente() {
		return Apellidocliente;
	}
	public void setApellidocliente(String apellidocliente) {
		Apellidocliente = apellidocliente;
	}
	public String getNroCelular() {
		return NroCelular;
	}
	public void setNroCelular(String nroCelular) {
		NroCelular = nroCelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

	



}
