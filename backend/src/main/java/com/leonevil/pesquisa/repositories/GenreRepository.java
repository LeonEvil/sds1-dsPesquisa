package com.leonevil.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonevil.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
}