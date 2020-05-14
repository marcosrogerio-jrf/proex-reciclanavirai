package com.reciclanavirai.web.services;

import java.util.List;

import com.reciclanavirai.web.domain.Bairro;

public interface BairroService {
	void save(Bairro Bairro);

	void update(Bairro Bairro);

	void delete(Long id);

	Bairro findById(Long id);

	List<Bairro> findAll();
}
