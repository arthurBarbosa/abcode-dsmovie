package com.abcode.dsmovie.services;

import com.abcode.dsmovie.dto.MovieDTO;
import com.abcode.dsmovie.entities.Movie;
import com.abcode.dsmovie.repositories.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> movies = movieRepository.findAll(pageable);
        return movies.map(MovieDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        return new MovieDTO(movieRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
