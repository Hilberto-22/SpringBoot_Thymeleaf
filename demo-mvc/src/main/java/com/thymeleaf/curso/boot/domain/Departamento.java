package com.thymeleaf.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*Anotações para mapeamento*/

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends Enttity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	String nome;

	//cargo é o lado forte do relacionamento pois contém a chave estrangeira
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
}
