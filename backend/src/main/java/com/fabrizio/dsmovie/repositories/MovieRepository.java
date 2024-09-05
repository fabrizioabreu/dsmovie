package com.fabrizio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabrizio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
