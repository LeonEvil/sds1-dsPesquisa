package com.leonevil.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonevil.pesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
}