package com.fabrizio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabrizio.dsmovie.entities.Score;
import com.fabrizio.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
