package com.reciclanavirai.web.repositories;

import java.util.List;

import com.reciclanavirai.web.domain.Agendamento;

public interface AgendamentoDAO {

	void save(Agendamento agendamento);

	void update(Agendamento agendamento);

	void delete(Long id);

	Agendamento findById(Long id);

	List<Agendamento> findAll();
}
