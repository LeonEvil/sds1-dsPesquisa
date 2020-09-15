package com.leonevil.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonevil.pesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{
}