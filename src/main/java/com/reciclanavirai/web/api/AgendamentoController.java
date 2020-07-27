package com.reciclanavirai.web.api;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.reciclanavirai.web.domain.Agendamento;
import com.reciclanavirai.web.domain.dto.AgendamentoDTO;
import com.reciclanavirai.web.services.AgendamentoService;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {
	@Autowired
	private AgendamentoService service;
	
	@GetMapping()
	public ResponseEntity<List<AgendamentoDTO>> getAgendamento(){
		return ResponseEntity.ok(service.getAgendamentos());
	}
	@GetMapping("/{id}")
	public ResponseEntity<AgendamentoDTO> getAgendamento(@PathVariable("id") Long id){
		Optional<AgendamentoDTO> agendamento = service.getAgendamentoPorId(id);
		if(agendamento.isPresent()) {
			return ResponseEntity.ok(agendamento.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<AgendamentoDTO> saveAgendamento(@RequestBody Agendamento agendamento){
		try {
			AgendamentoDTO x = service.saveAgendamento(agendamento);
			URI location = getUri(x.getId());
			return ResponseEntity.created(location).build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	private URI getUri(Long id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AgendamentoDTO> updateAgendamento(@PathVariable("id") Long id, @RequestBody Agendamento agendamento){
		agendamento.setId(id);
		AgendamentoDTO x = service.updateAgendamento(id, agendamento);
		if(x != null) {
			return ResponseEntity.ok(x);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping
	public ResponseEntity<AgendamentoDTO> deleteAgendamento(@PathVariable("id") Long id){
		if(service.deleteAgendamento(id)) {
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
