package com.reciclanavirai.web.repositories;

import java.util.List;

import com.reciclanavirai.web.domain.Bairro;

public interface BairroDAO {
	
	void save(Bairro bairro);
	void update(Bairro bairro);
	void delete(Long id);
	Bairro findById(Long id);
	List<Bairro> findAll();
	
}
