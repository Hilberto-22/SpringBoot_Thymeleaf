package com.thymeleaf.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.thymeleaf.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImp extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
