package com.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.model.Hospital;
import com.idat.pe.repository.HospitalRepository;

@Service
public class HospitalServiceImp implements HospitalService {

	@Autowired
	private HospitalRepository repositorio;
	
	@Override
	public void guardar(Hospital hospital) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Hospital hospital) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Hospital> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hospital obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
