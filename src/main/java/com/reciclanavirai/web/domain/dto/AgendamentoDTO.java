package com.reciclanavirai.web.domain.dto;

import org.modelmapper.ModelMapper;

import com.reciclanavirai.web.domain.Agendamento;

import lombok.Data;

@Data
public class AgendamentoDTO {
	private Long id;
	private String horario;
	private Integer tipoColeta;
	private Integer diaSemana;

	public static AgendamentoDTO create(Agendamento a) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(a, AgendamentoDTO.class);
	}
}
