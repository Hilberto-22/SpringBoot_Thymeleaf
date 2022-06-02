package com.thymeleaf.curso.boot.web.conversor;

import com.thymeleaf.curso.boot.domain.Departamento;
import com.thymeleaf.curso.boot.service.DepartamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {

    @Autowired
    private DepartamentoService service;

    @Override
    public Departamento convert(String text) {
        if(text.isEmpty()){
            return null;
        }
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    } 
    
}
