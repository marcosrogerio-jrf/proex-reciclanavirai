package com.reciclanavirai.web.services;

import java.util.List;

import com.reciclanavirai.web.domain.Agendamento;

public interface AgendamentoService {
	void save(Agendamento agendamento);

	void update(Agendamento agendamento);

	void delete(Long id);

	Agendamento findById(Long id);

	List<Agendamento> findAll();
}
