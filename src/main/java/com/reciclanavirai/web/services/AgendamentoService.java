package com.reciclanavirai.web.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.reciclanavirai.web.domain.Agendamento;
import com.reciclanavirai.web.domain.dto.AgendamentoDTO;
import com.reciclanavirai.web.repositories.AgendamentoRepository;
@Service
public class AgendamentoService {
	
	@Autowired
	private AgendamentoRepository repo;

	public List<AgendamentoDTO> getAgendamentos() {
		return repo.findAll().stream().map(AgendamentoDTO::create).collect(Collectors.toList());
	}

	public Optional<AgendamentoDTO> getAgendamentoPorId(Long id) {
		return repo.findById(id).map(AgendamentoDTO::create);
	}

	public AgendamentoDTO saveAgendamento(Agendamento agendamento) {
		Assert.isNull(agendamento.getId(), "Não foi possivel salvar o agendamento");
		return AgendamentoDTO.create(repo.save(agendamento));
	}

	public AgendamentoDTO updateAgendamento(Long id, Agendamento agendamento) {
		Assert.isNull(id, "Não foi possivel alterar o agendamento");
		Optional<Agendamento> optional = repo.findById(id);
		if (optional.isPresent()) {
			Agendamento a = optional.get();
			a.setHorario(agendamento.getHorario());
			a.setTipoColeta(agendamento.getTipoColeta());
			a.setDiaSemana(agendamento.getDiaSemana());
			repo.save(a);
			return AgendamentoDTO.create(a);
		} else {
			return null;
		}
	}

	public boolean deleteAgendamento(Long id) {
		if (getAgendamentoPorId(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}
}
