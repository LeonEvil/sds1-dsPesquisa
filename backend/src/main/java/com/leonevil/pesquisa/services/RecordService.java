package com.leonevil.pesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leonevil.pesquisa.dto.RecordDTO;
import com.leonevil.pesquisa.dto.RecordInsertDTO;
import com.leonevil.pesquisa.entities.Game;
import com.leonevil.pesquisa.entities.Record;
import com.leonevil.pesquisa.repositories.GameRepository;
import com.leonevil.pesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}