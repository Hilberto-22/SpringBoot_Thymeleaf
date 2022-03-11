package com.thymeleaf.curso.boot.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
//import nonapi.io.github.classgraph.json.Id;

/*Super classe para as outras classes*/

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class Enttity <ID extends Serializable> implements Serializable{
	

	@javax.persistence.Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "id =" + id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false; 
		if (getClass() != obj.getClass())
			return false;
		Enttity<?> other = (Enttity<?>) obj;
		return Objects.equals(id, other.id);
	}
	
	 
	
}
