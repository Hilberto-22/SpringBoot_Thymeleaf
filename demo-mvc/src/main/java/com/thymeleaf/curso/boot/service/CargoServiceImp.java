package com.thymeleaf.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thymeleaf.curso.boot.dao.CargoDao;
import com.thymeleaf.curso.boot.domain.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImp implements CargoService {

	@Autowired
	private CargoDao dao;
	
	
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		
		return dao.findAll();
	}

}
