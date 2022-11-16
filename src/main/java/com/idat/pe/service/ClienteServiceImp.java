package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.model.Cliente;
import com.idat.pe.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
	private ClienteRepository repositorio;
	

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
