package com.reciclanavirai.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reciclanavirai.web.domain.Bairro;
import com.reciclanavirai.web.repositories.BairroDAO;
@Service @Transactional(readOnly = false)
public class BairroServiceImpl implements BairroService {
	@Autowired
	private BairroDAO dao;

	@Override
	public void save(Bairro bairro) {
		dao.save(bairro);
		
	}

	@Override
	public void update(Bairro bairro) {
		dao.update(bairro);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Bairro findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Bairro> findAll() {
		return dao.findAll();
	}

}
