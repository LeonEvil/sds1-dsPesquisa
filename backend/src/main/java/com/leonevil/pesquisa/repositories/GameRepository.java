package com.leonevil.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonevil.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
}