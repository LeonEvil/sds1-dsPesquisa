package com.leonevil.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonevil.pesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{
}