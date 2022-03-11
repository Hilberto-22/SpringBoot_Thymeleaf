package com.thymeleaf.curso.boot.dao;


import org.springframework.stereotype.Repository;

import com.thymeleaf.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImp extends AbstractDao<Cargo, Long> implements CargoDao {

}
