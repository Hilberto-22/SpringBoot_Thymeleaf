package com.thymeleaf.curso.boot.dao;

import java.util.List;

import com.thymeleaf.curso.boot.domain.Departamento;

public interface DeparmentoDao {


    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
	
	
}
