package com.idat.pe.service;

import java.util.List;

import com.idat.pe.model.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardar(UsuarioCliente usuarioCliente);
	void actualizar(UsuarioCliente usuarioCliente);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);

}
