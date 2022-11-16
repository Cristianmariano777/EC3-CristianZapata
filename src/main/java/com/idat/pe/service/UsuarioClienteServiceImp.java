package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.model.UsuarioCliente;
import com.idat.pe.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImp implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepository repositorio;
	
	@Override
	public void guardar(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UsuarioCliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioCliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
