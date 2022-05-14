package com.abcode.dsmovie.repositories;

import com.abcode.dsmovie.entities.Score;
import com.abcode.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
