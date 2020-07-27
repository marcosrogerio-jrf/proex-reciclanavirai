package com.reciclanavirai.web.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.reciclanavirai.web.domain.Bairro;
import com.reciclanavirai.web.domain.dto.BairroDTO;
import com.reciclanavirai.web.repositories.BairroRepository;
@Service
public class BairroService {
	@Autowired
	private BairroRepository repo;

	public List<BairroDTO> getBairros() {
		return repo.findAll().stream().map(BairroDTO::create).collect(Collectors.toList());
	}

	public Optional<BairroDTO> getBairroPorId(Long id) {
		return repo.findById(id).map(BairroDTO::create);
	}

	public BairroDTO saveBairro(Bairro bairro) {
		Assert.isNull(bairro.getId(), "Não foi possivel salvar o bairro");
		return BairroDTO.create(repo.save(bairro));
	}

	public BairroDTO updateBairro(Long id, Bairro bairro) {
		Assert.isNull(id, "Não foi possivel alterar o bairro");
		Optional<Bairro> optional = repo.findById(id);
		if (optional.isPresent()) {
			Bairro b = optional.get();
			b.setNome(bairro.getNome());
			return BairroDTO.create(repo.save(b));
		} else {
			return null;
		}
	}

	public boolean deleteBairro(Long id) {
		if (getBairroPorId(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}
}
